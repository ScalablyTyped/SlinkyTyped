package typingsSlinky.reactNativeModalPopover.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeModalPopover.popoverGeometryMod.Placement
import typingsSlinky.reactNativeModalPopover.popoverGeometryMod.Rect
import typingsSlinky.reactNativeModalPopover.popoverGeometryMod.Size
import typingsSlinky.reactNativeModalPopover.popoverMod.Orientation
import typingsSlinky.reactNativeModalPopover.reactNativeModalPopoverStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@scala.inline
class SharedBuilder_PopoverProps149441464[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  @scala.inline
  def arrowSize(value: Size): this.type = set("arrowSize", value.asInstanceOf[js.Any])
  @scala.inline
  def arrowStyle(value: StyleProp[ViewStyle]): this.type = set("arrowStyle", value.asInstanceOf[js.Any])
  @scala.inline
  def arrowStyleNull: this.type = set("arrowStyle", null)
  @scala.inline
  def backgroundStyle(value: StyleProp[ViewStyle]): this.type = set("backgroundStyle", value.asInstanceOf[js.Any])
  @scala.inline
  def backgroundStyleNull: this.type = set("backgroundStyle", null)
  @scala.inline
  def contentStyle(value: StyleProp[ViewStyle]): this.type = set("contentStyle", value.asInstanceOf[js.Any])
  @scala.inline
  def contentStyleNull: this.type = set("contentStyle", null)
  @scala.inline
  def displayArea(value: Rect): this.type = set("displayArea", value.asInstanceOf[js.Any])
  @scala.inline
  def duration(value: Double): this.type = set("duration", value.asInstanceOf[js.Any])
  @scala.inline
  def easing(value: /* show */ Boolean => js.Function1[/* value */ Double, Double]): this.type = set("easing", js.Any.fromFunction1(value))
  @scala.inline
  def onClose(value: () => Unit): this.type = set("onClose", js.Any.fromFunction0(value))
  @scala.inline
  def onDismiss(value: () => Unit): this.type = set("onDismiss", js.Any.fromFunction0(value))
  @scala.inline
  def placement(value: Placement | auto): this.type = set("placement", value.asInstanceOf[js.Any])
  @scala.inline
  def popoverStyle(value: StyleProp[ViewStyle]): this.type = set("popoverStyle", value.asInstanceOf[js.Any])
  @scala.inline
  def popoverStyleNull: this.type = set("popoverStyle", null)
  @scala.inline
  def supportedOrientationsVarargs(value: Orientation*): this.type = set("supportedOrientations", js.Array(value :_*))
  @scala.inline
  def supportedOrientations(value: js.Array[Orientation]): this.type = set("supportedOrientations", value.asInstanceOf[js.Any])
  @scala.inline
  def useNativeDriver(value: Boolean): this.type = set("useNativeDriver", value.asInstanceOf[js.Any])
  @scala.inline
  def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
}

