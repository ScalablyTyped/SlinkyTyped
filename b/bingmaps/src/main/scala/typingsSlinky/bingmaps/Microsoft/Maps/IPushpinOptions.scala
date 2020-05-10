package typingsSlinky.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPushpinOptions extends IPrimitiveOptions {
  /** The point on the pushpin icon, in pixels, which is anchored to the pushpin location. An anchor of (0,0) is the top left corner of the icon. */
  var anchor: js.UndefOr[Point] = js.native
  /** Specifies what color to make the default pushpin. */
  var color: js.UndefOr[String | Color] = js.native
  /** A boolean indicating whether the pushpin can be dragged to a new position with the mouse or by touch. */
  var draggable: js.UndefOr[Boolean] = js.native
  /** Specifies whether to enable the clicked style on the pushpin. */
  var enableClickedStyle: js.UndefOr[Boolean] = js.native
  /** Specifies whether to enable the hover style on the pushpin. */
  var enableHoverStyle: js.UndefOr[Boolean] = js.native
  /**
    * Defines the the icon to use for the pushpin.This can be a URL to an Image or SVG file, an image data URI, or an inline SVG string.
    * Tip: When using inline SVG, you can pass in placeholders `{color}` and `{text}` in your SVG string. This placeholder will be replaced by the pushpins color or text property value when rendered.
    */
  var icon: js.UndefOr[String] = js.native
  /** Whether the clickable area of pushpin should be an ellipse instead of a rectangle. */
  var roundClickableArea: js.UndefOr[Boolean] = js.native
  /**
    * A secondary title label value to display under the pushpin. Uses label collision detection. This label automatically changes color between white
    * and dark grey depending on which map style is selected. Requires the title label to be set.
    */
  var subTitle: js.UndefOr[String] = js.native
  /** A short string of text that is overlaid on top of the pushpin. */
  var text: js.UndefOr[String] = js.native
  /** The amount the text is shifted from the pushpin icon. The default value is (0,5). */
  var textOffset: js.UndefOr[Point] = js.native
  /**
    * The title label value to display under the pushpin. This label automatically changes color between white and dark grey depending on which map
    * style is selected. Pushpin Titles support label collision detection, as described below.
    */
  var title: js.UndefOr[String] = js.native
}

object IPushpinOptions {
  @scala.inline
  def apply(): IPushpinOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPushpinOptions]
  }
  @scala.inline
  implicit class IPushpinOptionsOps[Self <: IPushpinOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnchor(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnchor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchor")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: String | Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withDraggable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDraggable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableClickedStyle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableClickedStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableClickedStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableClickedStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableHoverStyle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableHoverStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableHoverStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableHoverStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.undefined)
        ret
    }
    @scala.inline
    def withRoundClickableArea(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roundClickableArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoundClickableArea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roundClickableArea")(js.undefined)
        ret
    }
    @scala.inline
    def withSubTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withTextOffset(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

