package typingsSlinky.hostValidation.mod

import typingsSlinky.express.mod.NextFunction
import typingsSlinky.express.mod.Request_
import typingsSlinky.express.mod.Response_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.hostValidation.hostValidationStrings.both
import typingsSlinky.hostValidation.hostValidationStrings.either
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait config extends js.Object {
  var fail: js.UndefOr[
    js.Function3[
      /* req */ Request_[ParamsDictionary, _, _, Query], 
      /* res */ Response_[_], 
      /* next */ NextFunction, 
      Unit
    ]
  ] = js.undefined
  var hosts: js.UndefOr[js.Array[String | js.RegExp]] = js.undefined
  var mode: js.UndefOr[both | either] = js.undefined
  var referers: js.UndefOr[js.Array[String | js.RegExp]] = js.undefined
}

object config {
  @scala.inline
  def apply(
    fail: (/* req */ Request_[ParamsDictionary, _, _, Query], /* res */ Response_[_], /* next */ NextFunction) => Unit = null,
    hosts: js.Array[String | js.RegExp] = null,
    mode: both | either = null,
    referers: js.Array[String | js.RegExp] = null
  ): config = {
    val __obj = js.Dynamic.literal()
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction3(fail))
    if (hosts != null) __obj.updateDynamic("hosts")(hosts.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (referers != null) __obj.updateDynamic("referers")(referers.asInstanceOf[js.Any])
    __obj.asInstanceOf[config]
  }
}

