package typingsSlinky.reactToastify.components

import org.scalajs.dom.raw.Element
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactToastify.reactToastifyBooleans.`false`
import typingsSlinky.reactToastify.typesMod.ClassName
import typingsSlinky.reactToastify.typesMod.Id
import typingsSlinky.reactToastify.typesMod.ToastContent
import typingsSlinky.reactToastify.typesMod.ToastContentProps
import typingsSlinky.reactToastify.typesMod.ToastPosition
import typingsSlinky.reactToastify.typesMod.ToastProps
import typingsSlinky.reactToastify.typesMod.ToastTransition
import typingsSlinky.reactToastify.typesMod.TypeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Toast {
  
  @JSImport("react-toastify/dist/components", "Toast")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def autoClose(value: Double | `false`): this.type = set("autoClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def bodyClassName(value: ClassName): this.type = set("bodyClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def bodyClassNameNull: this.type = set("bodyClassName", null)
    
    @scala.inline
    def bodyStyle(value: CSSProperties): this.type = set("bodyStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def childrenReactElement(value: ReactElement): this.type = set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def childrenFunction1(value: /* props */ ToastContentProps => ReactElement): this.type = set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def children(value: ToastContent): this.type = set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: ClassName): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def classNameNull: this.type = set("className", null)
    
    @scala.inline
    def closeButtonReactElement(value: ReactElement): this.type = set("closeButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def closeButtonFunction1(value: /* props */ js.Any => ReactElement): this.type = set("closeButton", js.Any.fromFunction1(value))
    
    @scala.inline
    def closeButton(value: ReactElement | (js.Function1[/* props */ js.Any, ReactElement]) | Boolean): this.type = set("closeButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def closeOnClick(value: Boolean): this.type = set("closeOnClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def containerId(value: Id): this.type = set("containerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delay(value: Double): this.type = set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def draggable(value: Boolean): this.type = set("draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hideProgressBar(value: Boolean): this.type = set("hideProgressBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def in(value: Boolean): this.type = set("in", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onClick(value: /* event */ SyntheticMouseEvent[Element] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def onClose(value: /* props */ js.Object => Unit): this.type = set("onClose", js.Any.fromFunction1(value))
    
    @scala.inline
    def onOpen(value: /* props */ js.Object => Unit): this.type = set("onOpen", js.Any.fromFunction1(value))
    
    @scala.inline
    def pauseOnFocusLoss(value: Boolean): this.type = set("pauseOnFocusLoss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def pauseOnHover(value: Boolean): this.type = set("pauseOnHover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def progress(value: Double | String): this.type = set("progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def progressClassName(value: ClassName): this.type = set("progressClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def progressClassNameNull: this.type = set("progressClassName", null)
    
    @scala.inline
    def progressStyle(value: CSSProperties): this.type = set("progressStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def role(value: String): this.type = set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rtl(value: Boolean): this.type = set("rtl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def staleId(value: Id): this.type = set("staleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `type`(value: TypeOptions): this.type = set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def updateId(value: Id): this.type = set("updateId", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ToastProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(
    closeToast: () => Unit,
    deleteToast: () => Unit,
    draggablePercent: Double,
    position: ToastPosition,
    toastId: Id,
    transition: ToastTransition
  ): Builder = {
    val __props = js.Dynamic.literal(closeToast = js.Any.fromFunction0(closeToast), deleteToast = js.Any.fromFunction0(deleteToast), draggablePercent = draggablePercent.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], toastId = toastId.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ToastProps]))
  }
}
