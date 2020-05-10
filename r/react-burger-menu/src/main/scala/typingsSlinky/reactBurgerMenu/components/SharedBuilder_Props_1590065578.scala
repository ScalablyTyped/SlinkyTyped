package typingsSlinky.reactBurgerMenu.components

import org.scalajs.dom.raw.Element
import slinky.core.facade.ReactElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactBurgerMenu.PartialStyles
import typingsSlinky.reactBurgerMenu.mod.State
import typingsSlinky.reactBurgerMenu.reactBurgerMenuBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@scala.inline
class SharedBuilder_Props_1590065578[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  @scala.inline
  def bodyClassName(value: String): this.type = set("bodyClassName", value.asInstanceOf[js.Any])
  @scala.inline
  def burgerBarClassName(value: String): this.type = set("burgerBarClassName", value.asInstanceOf[js.Any])
  @scala.inline
  def burgerButtonClassName(value: String): this.type = set("burgerButtonClassName", value.asInstanceOf[js.Any])
  @scala.inline
  def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  @scala.inline
  def crossButtonClassName(value: String): this.type = set("crossButtonClassName", value.asInstanceOf[js.Any])
  @scala.inline
  def crossClassName(value: String): this.type = set("crossClassName", value.asInstanceOf[js.Any])
  @scala.inline
  def customBurgerIconReactElement(value: ReactElement): this.type = set("customBurgerIcon", value.asInstanceOf[js.Any])
  @scala.inline
  def customBurgerIcon(value: ReactElement | `false`): this.type = set("customBurgerIcon", value.asInstanceOf[js.Any])
  @scala.inline
  def customCrossIconReactElement(value: ReactElement): this.type = set("customCrossIcon", value.asInstanceOf[js.Any])
  @scala.inline
  def customCrossIcon(value: ReactElement | `false`): this.type = set("customCrossIcon", value.asInstanceOf[js.Any])
  @scala.inline
  def customOnKeyDown(value: /* event */ SyntheticKeyboardEvent[Element] => Unit): this.type = set("customOnKeyDown", js.Any.fromFunction1(value))
  @scala.inline
  def disableAutoFocus(value: Boolean): this.type = set("disableAutoFocus", value.asInstanceOf[js.Any])
  @scala.inline
  def disableCloseOnEsc(value: Boolean): this.type = set("disableCloseOnEsc", value.asInstanceOf[js.Any])
  @scala.inline
  def disableOverlayClickFunction0(value: () => Boolean): this.type = set("disableOverlayClick", js.Any.fromFunction0(value))
  @scala.inline
  def disableOverlayClick(value: Boolean | js.Function0[Boolean]): this.type = set("disableOverlayClick", value.asInstanceOf[js.Any])
  @scala.inline
  def htmlClassName(value: String): this.type = set("htmlClassName", value.asInstanceOf[js.Any])
  @scala.inline
  def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
  @scala.inline
  def isOpen(value: Boolean): this.type = set("isOpen", value.asInstanceOf[js.Any])
  @scala.inline
  def itemClassName(value: String): this.type = set("itemClassName", value.asInstanceOf[js.Any])
  @scala.inline
  def itemListClassName(value: String): this.type = set("itemListClassName", value.asInstanceOf[js.Any])
  @scala.inline
  def menuClassName(value: String): this.type = set("menuClassName", value.asInstanceOf[js.Any])
  @scala.inline
  def morphShapeClassName(value: String): this.type = set("morphShapeClassName", value.asInstanceOf[js.Any])
  @scala.inline
  def noOverlay(value: Boolean): this.type = set("noOverlay", value.asInstanceOf[js.Any])
  @scala.inline
  def noTransition(value: Boolean): this.type = set("noTransition", value.asInstanceOf[js.Any])
  @scala.inline
  def onStateChange(value: /* state */ State => Unit): this.type = set("onStateChange", js.Any.fromFunction1(value))
  @scala.inline
  def outerContainerId(value: String): this.type = set("outerContainerId", value.asInstanceOf[js.Any])
  @scala.inline
  def overlayClassName(value: String): this.type = set("overlayClassName", value.asInstanceOf[js.Any])
  @scala.inline
  def pageWrapId(value: String): this.type = set("pageWrapId", value.asInstanceOf[js.Any])
  @scala.inline
  def right(value: Boolean): this.type = set("right", value.asInstanceOf[js.Any])
  @scala.inline
  def styles(value: PartialStyles): this.type = set("styles", value.asInstanceOf[js.Any])
  @scala.inline
  def width(value: Double | String): this.type = set("width", value.asInstanceOf[js.Any])
}

