package typingsSlinky.cesium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCallbackParameterName extends js.Object {
  var callbackParameterName: js.UndefOr[String] = js.native
  var parameters: js.UndefOr[js.Any] = js.native
  var proxy: js.UndefOr[js.Any] = js.native
}

object AnonCallbackParameterName {
  @scala.inline
  def apply(): AnonCallbackParameterName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonCallbackParameterName]
  }
  @scala.inline
  implicit class AnonCallbackParameterNameOps[Self <: AnonCallbackParameterName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallbackParameterName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbackParameterName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallbackParameterName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbackParameterName")(js.undefined)
        ret
    }
    @scala.inline
    def withParameters(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(js.undefined)
        ret
    }
    @scala.inline
    def withProxy(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProxy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxy")(js.undefined)
        ret
    }
  }
  
}

