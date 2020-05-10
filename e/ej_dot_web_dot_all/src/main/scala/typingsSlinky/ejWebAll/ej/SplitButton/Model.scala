package typingsSlinky.ejWebAll.ej.SplitButton

import typingsSlinky.ejWebAll.ej.ArrowPosition
import typingsSlinky.ejWebAll.ej.ButtonMode
import typingsSlinky.ejWebAll.ej.ButtonSize
import typingsSlinky.ejWebAll.ej.ContentType
import typingsSlinky.ejWebAll.ej.ImagePosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  /** Specifies the arrowPosition of the Split or Dropdown Button.See arrowPosition
    * @Default {ej.ArrowPosition.Right}
    */
  var arrowPosition: js.UndefOr[String | ArrowPosition] = js.native
  /** Fires before menu of the split button control is opened.
    */
  var beforeOpen: js.UndefOr[js.Function1[/* e */ BeforeOpenEventArgs, Unit]] = js.native
  /** Specifies the buttonMode like Split or Dropdown Button.See ButtonMode
    * @Default {ej.ButtonMode.Split}
    */
  var buttonMode: js.UndefOr[String | ButtonMode] = js.native
  /** Fires when Button control is clicked successfully
    */
  var click: js.UndefOr[js.Function1[/* e */ ClickEventArgs, Unit]] = js.native
  /** Fires before the list content of Button control is closed
    */
  var close: js.UndefOr[js.Function1[/* e */ CloseEventArgs, Unit]] = js.native
  /** Specifies the contentType of the Split Button.See ContentType
    * @Default {ej.ContentType.TextOnly}
    */
  var contentType: js.UndefOr[String | ContentType] = js.native
  /** Fires after Split Button control is created.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.native
  /** Set the root class for Split Button control theme
    */
  var cssClass: js.UndefOr[String] = js.native
  /** Fires when the Split Button is destroyed successfully
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.native
  /** Specifies the enableRTL property for Split Button while initialization.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[Boolean] = js.native
  /** Specifies the disabling of Split Button if enabled is set to false.
    * @Default {true}
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /** Specifies the height of the Split Button.
    * @Default {â€œâ€}
    */
  var height: js.UndefOr[String | Double] = js.native
  /** Specifies the HTML Attributes of the Split Button.
    * @Default {{}}
    */
  var htmlAttributes: js.UndefOr[js.Any] = js.native
  /** Specifies the imagePosition of the Split Button.See imagePositions
    * @Default {ej.ImagePosition.ImageRight}
    */
  var imagePosition: js.UndefOr[String | ImagePosition] = js.native
  /** Fires when a menu item is Hovered out successfully
    */
  var itemMouseOut: js.UndefOr[js.Function1[/* e */ ItemMouseOutEventArgs, Unit]] = js.native
  /** Fires when a menu item is Hovered in successfully
    */
  var itemMouseOver: js.UndefOr[js.Function1[/* e */ ItemMouseOverEventArgs, Unit]] = js.native
  /** Fires when a menu item is clicked successfully
    */
  var itemSelected: js.UndefOr[js.Function1[/* e */ ItemSelectedEventArgs, Unit]] = js.native
  /** Fires before the list content of Button control is opened
    */
  var open: js.UndefOr[js.Function1[/* e */ OpenEventArgs, Unit]] = js.native
  /** Specifies the image content for Split Button while initialization.
    */
  var prefixIcon: js.UndefOr[String] = js.native
  /** Specifies the showRoundedCorner property for Split Button while initialization.
    * @Default {false}
    */
  var showRoundedCorner: js.UndefOr[Boolean] = js.native
  /** Specifies the size of the Button. See ButtonSize
    * @Default {ej.ButtonSize.Normal}
    */
  var size: js.UndefOr[String | ButtonSize] = js.native
  /** Specifies the image content for Split Button while initialization.
    */
  var suffixIcon: js.UndefOr[String] = js.native
  /** Specifies the target of splitbutton menu while initialization with ID or class as a selector.
    */
  var target: js.UndefOr[String] = js.native
  /** Specifies the list content for Split Button while initialization
    */
  var targetID: js.UndefOr[String] = js.native
  /** Specifies the text content for Split Button while initialization.
    */
  var text: js.UndefOr[String] = js.native
  /** Specifies the width of the Split Button.
    * @Default {â€œâ€}
    */
  var width: js.UndefOr[String | Double] = js.native
}

object Model {
  @scala.inline
  def apply(): Model = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Model]
  }
  @scala.inline
  implicit class ModelOps[Self <: Model] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArrowPosition(value: String | ArrowPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrowPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeOpen(value: /* e */ BeforeOpenEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeOpen")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonMode(value: String | ButtonMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonMode")(js.undefined)
        ret
    }
    @scala.inline
    def withClick(value: /* e */ ClickEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(js.undefined)
        ret
    }
    @scala.inline
    def withClose(value: /* e */ CloseEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.undefined)
        ret
    }
    @scala.inline
    def withContentType(value: String | ContentType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(js.undefined)
        ret
    }
    @scala.inline
    def withCreate(value: /* e */ CreateEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.undefined)
        ret
    }
    @scala.inline
    def withCssClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClass")(js.undefined)
        ret
    }
    @scala.inline
    def withDestroy(value: /* e */ DestroyEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDestroy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableRTL(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRTL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableRTL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRTL")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: String | Double): Self = {
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
    def withHtmlAttributes(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtmlAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withImagePosition(value: String | ImagePosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imagePosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImagePosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imagePosition")(js.undefined)
        ret
    }
    @scala.inline
    def withItemMouseOut(value: /* e */ ItemMouseOutEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemMouseOut")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutItemMouseOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemMouseOut")(js.undefined)
        ret
    }
    @scala.inline
    def withItemMouseOver(value: /* e */ ItemMouseOverEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemMouseOver")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutItemMouseOver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemMouseOver")(js.undefined)
        ret
    }
    @scala.inline
    def withItemSelected(value: /* e */ ItemSelectedEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemSelected")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutItemSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemSelected")(js.undefined)
        ret
    }
    @scala.inline
    def withOpen(value: /* e */ OpenEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefixIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefixIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withShowRoundedCorner(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRoundedCorner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowRoundedCorner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRoundedCorner")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: String | ButtonSize): Self = {
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
    @scala.inline
    def withSuffixIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suffixIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuffixIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suffixIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetID")(js.undefined)
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
    def withWidth(value: String | Double): Self = {
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

