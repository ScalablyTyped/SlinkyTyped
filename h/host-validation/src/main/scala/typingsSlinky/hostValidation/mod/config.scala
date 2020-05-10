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

@js.native
trait config extends js.Object {
  var fail: js.UndefOr[
    js.Function3[
      /* req */ Request_[ParamsDictionary, _, _, Query], 
      /* res */ Response_[_], 
      /* next */ NextFunction, 
      Unit
    ]
  ] = js.native
  var hosts: js.UndefOr[js.Array[String | js.RegExp]] = js.native
  var mode: js.UndefOr[both | either] = js.native
  var referers: js.UndefOr[js.Array[String | js.RegExp]] = js.native
}

object config {
  @scala.inline
  def apply(): config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[config]
  }
  @scala.inline
  implicit class configOps[Self <: config] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFail(
      value: (/* req */ Request_[ParamsDictionary, _, _, Query], /* res */ Response_[_], /* next */ NextFunction) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fail")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutFail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fail")(js.undefined)
        ret
    }
    @scala.inline
    def withHosts(value: js.Array[String | js.RegExp]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hosts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHosts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hosts")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: both | either): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withReferers(value: js.Array[String | js.RegExp]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referers")(js.undefined)
        ret
    }
  }
  
}

