package typingsSlinky.qrcodeReact.mod

import typingsSlinky.qrcodeReact.qrcodeReactStrings.H
import typingsSlinky.qrcodeReact.qrcodeReactStrings.L
import typingsSlinky.qrcodeReact.qrcodeReactStrings.M
import typingsSlinky.qrcodeReact.qrcodeReactStrings.Q
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseQRCodeProps extends js.Object {
  var bgColor: js.UndefOr[String] = js.native
  var fgColor: js.UndefOr[String] = js.native
  var imageSettings: js.UndefOr[ImageSettings] = js.native
  var includeMargin: js.UndefOr[Boolean] = js.native
  var level: js.UndefOr[L | M | Q | H] = js.native
  var size: js.UndefOr[Double] = js.native
  var value: String = js.native
}

object BaseQRCodeProps {
  @scala.inline
  def apply(value: String): BaseQRCodeProps = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseQRCodeProps]
  }
  @scala.inline
  implicit class BaseQRCodePropsOps[Self <: BaseQRCodeProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBgColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBgColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgColor")(js.undefined)
        ret
    }
    @scala.inline
    def withFgColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fgColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFgColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fgColor")(js.undefined)
        ret
    }
    @scala.inline
    def withImageSettings(value: ImageSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeMargin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withLevel(value: L | M | Q | H): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
  }
  
}

