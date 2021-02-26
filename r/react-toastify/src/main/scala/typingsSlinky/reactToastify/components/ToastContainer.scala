package typingsSlinky.reactToastify.components

import org.scalajs.dom.raw.Element
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactToastify.anon.DefaultClassName
import typingsSlinky.reactToastify.anon.Position
import typingsSlinky.reactToastify.reactToastifyBooleans.`false`
import typingsSlinky.reactToastify.typesMod.ClassName
import typingsSlinky.reactToastify.typesMod.Id
import typingsSlinky.reactToastify.typesMod.ToastClassName
import typingsSlinky.reactToastify.typesMod.ToastContainerProps
import typingsSlinky.reactToastify.typesMod.ToastPosition
import typingsSlinky.reactToastify.typesMod.ToastTransition
import typingsSlinky.reactToastify.typesMod.ToastTransitionProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ToastContainer {
  
  @JSImport("react-toastify", "ToastContainer")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def autoClose(value: Double | `false`): this.type = set("autoClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def bodyClassName(value: ToastClassName): this.type = set("bodyClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def bodyClassNameFunction1(value: /* context */ js.UndefOr[Position] => String): this.type = set("bodyClassName", js.Any.fromFunction1(value))
    
    @scala.inline
    def bodyStyle(value: CSSProperties): this.type = set("bodyStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: ClassName): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def classNameFunction1(value: /* context */ js.UndefOr[DefaultClassName] => String): this.type = set("className", js.Any.fromFunction1(value))
    
    @scala.inline
    def closeButton(value: ReactElement | (js.Function1[/* props */ js.Any, ReactElement]) | Boolean): this.type = set("closeButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def closeButtonFunction1(value: /* props */ js.Any => ReactElement): this.type = set("closeButton", js.Any.fromFunction1(value))
    
    @scala.inline
    def closeButtonReactElement(value: ReactElement): this.type = set("closeButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def closeOnClick(value: Boolean): this.type = set("closeOnClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def containerId(value: Id): this.type = set("containerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def draggable(value: Boolean): this.type = set("draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def draggablePercent(value: Double): this.type = set("draggablePercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def enableMultiContainer(value: Boolean): this.type = set("enableMultiContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hideProgressBar(value: Boolean): this.type = set("hideProgressBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def limit(value: Double): this.type = set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def newestOnTop(value: Boolean): this.type = set("newestOnTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onClick(value: /* event */ SyntheticMouseEvent[Element] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def pauseOnFocusLoss(value: Boolean): this.type = set("pauseOnFocusLoss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def pauseOnHover(value: Boolean): this.type = set("pauseOnHover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def position(value: ToastPosition): this.type = set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def progressClassName(value: ToastClassName): this.type = set("progressClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def progressClassNameFunction1(value: /* context */ js.UndefOr[Position] => String): this.type = set("progressClassName", js.Any.fromFunction1(value))
    
    @scala.inline
    def progressStyle(value: CSSProperties): this.type = set("progressStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def role(value: String): this.type = set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rtl(value: Boolean): this.type = set("rtl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def toastClassName(value: ToastClassName): this.type = set("toastClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def toastClassNameFunction1(value: /* context */ js.UndefOr[Position] => String): this.type = set("toastClassName", js.Any.fromFunction1(value))
    
    @scala.inline
    def toastStyle(value: CSSProperties): this.type = set("toastStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def transition(value: ToastTransition): this.type = set("transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def transitionComponentClass(value: ReactComponentClass[ToastTransitionProps]): this.type = set("transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def transitionFunctionComponent(value: ReactComponentClass[ToastTransitionProps]): this.type = set("transition", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ToastContainer.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ToastContainerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
