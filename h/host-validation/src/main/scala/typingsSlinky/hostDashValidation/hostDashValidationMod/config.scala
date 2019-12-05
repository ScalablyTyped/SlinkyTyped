package typingsSlinky.hostDashValidation.hostDashValidationMod

import typingsSlinky.express.expressMod.NextFunction
import typingsSlinky.express.expressMod.Request
import typingsSlinky.express.expressMod.Response
import typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import typingsSlinky.hostDashValidation.hostDashValidationStrings.both
import typingsSlinky.hostDashValidation.hostDashValidationStrings.either
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait config extends js.Object {
  var fail: js.UndefOr[
    js.Function3[/* req */ Request[ParamsDictionary], /* res */ Response, /* next */ NextFunction, Unit]
  ] = js.undefined
  var hosts: js.UndefOr[js.Array[String | js.RegExp]] = js.undefined
  var mode: js.UndefOr[both | either] = js.undefined
  var referers: js.UndefOr[js.Array[String | js.RegExp]] = js.undefined
}

object config {
  @scala.inline
  def apply(
    fail: (/* req */ Request[ParamsDictionary], /* res */ Response, /* next */ NextFunction) => Unit = null,
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

