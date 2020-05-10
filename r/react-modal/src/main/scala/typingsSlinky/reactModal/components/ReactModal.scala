package typingsSlinky.reactModal.components

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactModal.mod.Aria
import typingsSlinky.reactModal.mod.Classes
import typingsSlinky.reactModal.mod.OnAfterOpenCallbackOptions
import typingsSlinky.reactModal.mod.Props
import typingsSlinky.reactModal.mod.Styles
import typingsSlinky.reactModal.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactModal {
  @JSImport("react-modal", JSImport.Namespace)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, ^] {
    @scala.inline
    def appElementHTMLElement(value: HTMLElement): this.type = set("appElement", value.asInstanceOf[js.Any])
    @scala.inline
    def appElement(value: HTMLElement | js.Object): this.type = set("appElement", value.asInstanceOf[js.Any])
    @scala.inline
    def aria(value: Aria): this.type = set("aria", value.asInstanceOf[js.Any])
    @scala.inline
    def ariaHideApp(value: Boolean): this.type = set("ariaHideApp", value.asInstanceOf[js.Any])
    @scala.inline
    def bodyOpenClassName(value: String): this.type = set("bodyOpenClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def bodyOpenClassNameNull: this.type = set("bodyOpenClassName", null)
    @scala.inline
    def className(value: String | Classes): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def closeTimeoutMS(value: Double): this.type = set("closeTimeoutMS", value.asInstanceOf[js.Any])
    @scala.inline
    def contentLabel(value: String): this.type = set("contentLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def contentRef(value: /* instance */ HTMLDivElement => Unit): this.type = set("contentRef", js.Any.fromFunction1(value))
    @scala.inline
    def data(value: js.Any): this.type = set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def htmlOpenClassName(value: String): this.type = set("htmlOpenClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def htmlOpenClassNameNull: this.type = set("htmlOpenClassName", null)
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def onAfterClose(value: () => Unit): this.type = set("onAfterClose", js.Any.fromFunction0(value))
    @scala.inline
    def onAfterOpen(value: /* obj */ js.UndefOr[OnAfterOpenCallbackOptions] => Unit): this.type = set("onAfterOpen", js.Any.fromFunction1(value))
    @scala.inline
    def onRequestClose(value: /* event */ SyntheticMouseEvent[Element] | SyntheticKeyboardEvent[Element] => Unit): this.type = set("onRequestClose", js.Any.fromFunction1(value))
    @scala.inline
    def overlayClassName(value: String | Classes): this.type = set("overlayClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def overlayRef(value: /* instance */ HTMLDivElement => Unit): this.type = set("overlayRef", js.Any.fromFunction1(value))
    @scala.inline
    def parentSelector(value: () => HTMLElement): this.type = set("parentSelector", js.Any.fromFunction0(value))
    @scala.inline
    def portalClassName(value: String): this.type = set("portalClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def role(value: String): this.type = set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def roleNull: this.type = set("role", null)
    @scala.inline
    def shouldCloseOnEsc(value: Boolean): this.type = set("shouldCloseOnEsc", value.asInstanceOf[js.Any])
    @scala.inline
    def shouldCloseOnOverlayClick(value: Boolean): this.type = set("shouldCloseOnOverlayClick", value.asInstanceOf[js.Any])
    @scala.inline
    def shouldFocusAfterRender(value: Boolean): this.type = set("shouldFocusAfterRender", value.asInstanceOf[js.Any])
    @scala.inline
    def shouldReturnFocusAfterClose(value: Boolean): this.type = set("shouldReturnFocusAfterClose", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: Styles): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def testId(value: String): this.type = set("testId", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(isOpen: Boolean): Builder = {
    val __props = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
}

