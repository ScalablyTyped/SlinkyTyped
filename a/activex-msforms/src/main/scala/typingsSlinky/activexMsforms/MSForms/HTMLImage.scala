package typingsSlinky.activexMsforms.MSForms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLImage extends js.Object {
  var Action: String = js.native
  var Encoding: String = js.native
  var HTMLName: String = js.native
  var HTMLType: String = js.native
  @JSName("MSForms.HTMLImage_typekey")
  var MSFormsDotHTMLImage_typekey: HTMLImage = js.native
  var Method: String = js.native
  var Source: String = js.native
}

object HTMLImage {
  @scala.inline
  def apply(
    Action: String,
    Encoding: String,
    HTMLName: String,
    HTMLType: String,
    MSFormsDotHTMLImage_typekey: HTMLImage,
    Method: String,
    Source: String
  ): HTMLImage = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], Encoding = Encoding.asInstanceOf[js.Any], HTMLName = HTMLName.asInstanceOf[js.Any], HTMLType = HTMLType.asInstanceOf[js.Any], Method = Method.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.updateDynamic("MSForms.HTMLImage_typekey")(MSFormsDotHTMLImage_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLImage]
  }
  @scala.inline
  implicit class HTMLImageOps[Self <: HTMLImage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEncoding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Encoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHTMLName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HTMLName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHTMLType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HTMLType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMSFormsDotHTMLImage_typekey(value: HTMLImage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSForms.HTMLImage_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Source")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

