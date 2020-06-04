package typingsSlinky.materialUi.MaterialUI

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticTouchEvent
import typingsSlinky.materialUi.materialUiStrings.after
import typingsSlinky.materialUi.materialUiStrings.before
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.MouseEventHandler
import typingsSlinky.react.mod.TouchEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RaisedButtonProps extends SharedEnhancedButtonProps[RaisedButton] {
  // <EnhancedButton/> is the element that get the 'other' properties
  var backgroundColor: js.UndefOr[String] = js.undefined
  var buttonStyle: js.UndefOr[CSSProperties] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var disabledBackgroundColor: js.UndefOr[String] = js.undefined
  var disabledLabelColor: js.UndefOr[String] = js.undefined
  var fullWidth: js.UndefOr[Boolean] = js.undefined
  var icon: js.UndefOr[TagMod[Any]] = js.undefined
  var label: js.UndefOr[TagMod[Any]] = js.undefined
  var labelColor: js.UndefOr[String] = js.undefined
  var labelPosition: js.UndefOr[before | after] = js.undefined
  var labelStyle: js.UndefOr[CSSProperties] = js.undefined
  var linkButton: js.UndefOr[Boolean] = js.undefined
  var onMouseDown: js.UndefOr[MouseEventHandler[js.Object]] = js.undefined
  var onMouseEnter: js.UndefOr[MouseEventHandler[js.Object]] = js.undefined
  var onMouseLeave: js.UndefOr[MouseEventHandler[js.Object]] = js.undefined
  var onMouseUp: js.UndefOr[MouseEventHandler[js.Object]] = js.undefined
  var onTouchEnd: js.UndefOr[TouchEventHandler[js.Object]] = js.undefined
  var onTouchStart: js.UndefOr[TouchEventHandler[js.Object]] = js.undefined
  var overlayStyle: js.UndefOr[CSSProperties] = js.undefined
  var primary: js.UndefOr[Boolean] = js.undefined
  var rippleStyle: js.UndefOr[CSSProperties] = js.undefined
  var secondary: js.UndefOr[Boolean] = js.undefined
}

object RaisedButtonProps {
  @scala.inline
  def apply(): RaisedButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RaisedButtonProps]
  }
  @scala.inline
  implicit class RaisedButtonPropsOps[Self <: RaisedButtonProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setButtonStyle(value: CSSProperties): Self = this.set("buttonStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonStyle: Self = this.set("buttonStyle", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setDisabledBackgroundColor(value: String): Self = this.set("disabledBackgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabledBackgroundColor: Self = this.set("disabledBackgroundColor", js.undefined)
    @scala.inline
    def setDisabledLabelColor(value: String): Self = this.set("disabledLabelColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabledLabelColor: Self = this.set("disabledLabelColor", js.undefined)
    @scala.inline
    def setFullWidth(value: Boolean): Self = this.set("fullWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullWidth: Self = this.set("fullWidth", js.undefined)
    @scala.inline
    def setIconReactElement(value: ReactElement): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def setIcon(value: TagMod[Any]): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setLabelReactElement(value: ReactElement): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: TagMod[Any]): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setLabelColor(value: String): Self = this.set("labelColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelColor: Self = this.set("labelColor", js.undefined)
    @scala.inline
    def setLabelPosition(value: before | after): Self = this.set("labelPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelPosition: Self = this.set("labelPosition", js.undefined)
    @scala.inline
    def setLabelStyle(value: CSSProperties): Self = this.set("labelStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelStyle: Self = this.set("labelStyle", js.undefined)
    @scala.inline
    def setLinkButton(value: Boolean): Self = this.set("linkButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinkButton: Self = this.set("linkButton", js.undefined)
    @scala.inline
    def setOnMouseDown(value: SyntheticMouseEvent[js.Object] => Unit): Self = this.set("onMouseDown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseDown: Self = this.set("onMouseDown", js.undefined)
    @scala.inline
    def setOnMouseEnter(value: SyntheticMouseEvent[js.Object] => Unit): Self = this.set("onMouseEnter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseEnter: Self = this.set("onMouseEnter", js.undefined)
    @scala.inline
    def setOnMouseLeave(value: SyntheticMouseEvent[js.Object] => Unit): Self = this.set("onMouseLeave", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseLeave: Self = this.set("onMouseLeave", js.undefined)
    @scala.inline
    def setOnMouseUp(value: SyntheticMouseEvent[js.Object] => Unit): Self = this.set("onMouseUp", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseUp: Self = this.set("onMouseUp", js.undefined)
    @scala.inline
    def setOnTouchEnd(value: SyntheticTouchEvent[js.Object] => Unit): Self = this.set("onTouchEnd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTouchEnd: Self = this.set("onTouchEnd", js.undefined)
    @scala.inline
    def setOnTouchStart(value: SyntheticTouchEvent[js.Object] => Unit): Self = this.set("onTouchStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTouchStart: Self = this.set("onTouchStart", js.undefined)
    @scala.inline
    def setOverlayStyle(value: CSSProperties): Self = this.set("overlayStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverlayStyle: Self = this.set("overlayStyle", js.undefined)
    @scala.inline
    def setPrimary(value: Boolean): Self = this.set("primary", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimary: Self = this.set("primary", js.undefined)
    @scala.inline
    def setRippleStyle(value: CSSProperties): Self = this.set("rippleStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRippleStyle: Self = this.set("rippleStyle", js.undefined)
    @scala.inline
    def setSecondary(value: Boolean): Self = this.set("secondary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecondary: Self = this.set("secondary", js.undefined)
  }
  
}

