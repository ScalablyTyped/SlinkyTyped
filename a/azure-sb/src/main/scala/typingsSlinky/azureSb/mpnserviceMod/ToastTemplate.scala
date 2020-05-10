package typingsSlinky.azureSb.mpnserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToastTemplate extends Template {
  var param: js.UndefOr[String] = js.native
  var text1: String = js.native
  var text2: String = js.native
}

object ToastTemplate {
  @scala.inline
  def apply(text1: String, text2: String): ToastTemplate = {
    val __obj = js.Dynamic.literal(text1 = text1.asInstanceOf[js.Any], text2 = text2.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToastTemplate]
  }
  @scala.inline
  implicit class ToastTemplateOps[Self <: ToastTemplate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withText1(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText2(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParam(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("param")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParam: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("param")(js.undefined)
        ret
    }
  }
  
}

