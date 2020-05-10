package typingsSlinky.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2UiElementsImage extends js.Object {
  /**
    * A text description of the image to be used for accessibility, e.g. screen
    * readers.
    * Required.
    */
  var accessibilityText: js.UndefOr[String] = js.native
  /**
    * The height of the image in pixels.
    * Optional.
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * The source url of the image. Images can be JPG, PNG and GIF (animated and
    * non-animated). For example,`https://www.agentx.com/logo.png`. Required.
    */
  var url: js.UndefOr[String] = js.native
  /**
    * The width of the image in pixels.
    * Optional.
    */
  var width: js.UndefOr[Double] = js.native
}

object GoogleActionsV2UiElementsImage {
  @scala.inline
  def apply(): GoogleActionsV2UiElementsImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2UiElementsImage]
  }
  @scala.inline
  implicit class GoogleActionsV2UiElementsImageOps[Self <: GoogleActionsV2UiElementsImage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessibilityText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibilityText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessibilityText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibilityText")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

