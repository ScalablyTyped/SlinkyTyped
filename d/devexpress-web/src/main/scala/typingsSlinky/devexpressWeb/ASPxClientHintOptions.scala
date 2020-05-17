package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The hint control's options.
  */
@js.native
trait ASPxClientHintOptions extends js.Object {
  /**
    * Gets or sets a value that specifies whether to flip the hint to the opposite position relative to the target element.
    */
  var allowFlip: Boolean = js.native
  /**
    * Gets or sets a value that specifies whether to shift a hint if its content and title are hidden outside of the client area.
    */
  var allowShift: Boolean = js.native
  /**
    * Gets or sets whether it should use animation effects when a hint appears.
    */
  var animation: js.Any = js.native
  /**
    * Gets or sets the delay in displaying the hint.
    */
  var appearAfter: Double = js.native
  /**
    * Gets or sets a custom CSS class name that will be assigned to the root ASPxHint element.
    */
  var className: String = js.native
  /**
    * Gets or sets a value that is the HTML DOM-element.
    */
  var container: String = js.native
  /**
    * Gets or sets the hint's content.
    */
  var content: String = js.native
  /**
    * Gets or sets the attribute name.
    */
  var contentAttribute: String = js.native
  /**
    * Gets or sets the duration after which a hint disappears when the mouse pointer is no longer positioned over the target element.
    */
  var disappearAfter: Double = js.native
  /**
    * Gets or sets a value that is the hint's height.
    */
  var height: String = js.native
  /**
    * Specifies whether to hide native tooltips for an item and its nested items.
    */
  var hideNativeTooltipForNestedTitleAttributes: Boolean = js.native
  /**
    * Gets the offset of a hint.
    */
  var offset: Double = js.native
  /**
    * A handler for the ASPxClientHint.Hiding event.
    */
  var onHiding: ASPxClientEvent[ASPxClientHintHidingEventHandler] = js.native
  /**
    * A handler for the ASPxClientHint.Showing event.
    */
  var onShowing: ASPxClientEvent[ASPxClientHintShowingEventHandler] = js.native
  /**
    * Gets or sets where a hint should be positioned.
    */
  var position: String = js.native
  /**
    * Gets or sets a value that specifies whether a hint is displayed in a callout box.
    */
  var showCallout: Boolean = js.native
  /**
    * Gets or sets a value that specifies whether a hint's title is displayed.
    */
  var showTitle: Boolean = js.native
  /**
    * Gets or sets a value that is the hint's title.
    */
  var title: String = js.native
  /**
    * Gets or sets the attribute name.
    */
  var titleAttribute: String = js.native
  /**
    * Gets or sets which user action triggers a hint.
    */
  var triggerAction: String = js.native
  /**
    * Gets or sets a value that is the hint's width.
    */
  var width: String = js.native
  /**
    * Gets or sets the X coordinate.
    */
  var x: Double = js.native
  /**
    * Gets or sets the Y coordinate.
    */
  var y: Double = js.native
}

object ASPxClientHintOptions {
  @scala.inline
  def apply(
    allowFlip: Boolean,
    allowShift: Boolean,
    animation: js.Any,
    appearAfter: Double,
    className: String,
    container: String,
    content: String,
    contentAttribute: String,
    disappearAfter: Double,
    height: String,
    hideNativeTooltipForNestedTitleAttributes: Boolean,
    offset: Double,
    onHiding: ASPxClientEvent[ASPxClientHintHidingEventHandler],
    onShowing: ASPxClientEvent[ASPxClientHintShowingEventHandler],
    position: String,
    showCallout: Boolean,
    showTitle: Boolean,
    title: String,
    titleAttribute: String,
    triggerAction: String,
    width: String,
    x: Double,
    y: Double
  ): ASPxClientHintOptions = {
    val __obj = js.Dynamic.literal(allowFlip = allowFlip.asInstanceOf[js.Any], allowShift = allowShift.asInstanceOf[js.Any], animation = animation.asInstanceOf[js.Any], appearAfter = appearAfter.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], contentAttribute = contentAttribute.asInstanceOf[js.Any], disappearAfter = disappearAfter.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], hideNativeTooltipForNestedTitleAttributes = hideNativeTooltipForNestedTitleAttributes.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], onHiding = onHiding.asInstanceOf[js.Any], onShowing = onShowing.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], showCallout = showCallout.asInstanceOf[js.Any], showTitle = showTitle.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], titleAttribute = titleAttribute.asInstanceOf[js.Any], triggerAction = triggerAction.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientHintOptions]
  }
  @scala.inline
  implicit class ASPxClientHintOptionsOps[Self <: ASPxClientHintOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowFlip(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowFlip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowShift(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowShift")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnimation(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppearAfter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appearAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentAttribute(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentAttribute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisappearAfter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disappearAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHideNativeTooltipForNestedTitleAttributes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideNativeTooltipForNestedTitleAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnHiding(value: ASPxClientEvent[ASPxClientHintHidingEventHandler]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHiding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnShowing(value: ASPxClientEvent[ASPxClientHintShowingEventHandler]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShowing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowCallout(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCallout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowTitle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitleAttribute(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleAttribute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTriggerAction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

