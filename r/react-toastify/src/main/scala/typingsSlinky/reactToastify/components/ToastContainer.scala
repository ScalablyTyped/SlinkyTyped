package typingsSlinky.reactToastify.components

import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactToastify.mod.PositionOptions
import typingsSlinky.reactToastify.mod.ToastContainerProps
import typingsSlinky.reactToastify.reactToastifyBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ToastContainer {
  @JSImport("react-toastify", "ToastContainer")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactToastify.mod.ToastContainer] {
    @scala.inline
    def autoClose(value: Double | `false`): this.type = set("autoClose", value.asInstanceOf[js.Any])
    @scala.inline
    def bodyClassName(value: String | js.Object): this.type = set("bodyClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String | js.Object): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def closeButtonReactElement(value: ReactElement): this.type = set("closeButton", value.asInstanceOf[js.Any])
    @scala.inline
    def closeButton(value: TagMod[Any] | Boolean): this.type = set("closeButton", value.asInstanceOf[js.Any])
    @scala.inline
    def closeOnClick(value: Boolean): this.type = set("closeOnClick", value.asInstanceOf[js.Any])
    @scala.inline
    def containerId(value: String | Double): this.type = set("containerId", value.asInstanceOf[js.Any])
    @scala.inline
    def draggable(value: Boolean): this.type = set("draggable", value.asInstanceOf[js.Any])
    @scala.inline
    def draggablePercent(value: Double): this.type = set("draggablePercent", value.asInstanceOf[js.Any])
    @scala.inline
    def enableMultiContainer(value: Boolean): this.type = set("enableMultiContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def hideProgressBar(value: Boolean): this.type = set("hideProgressBar", value.asInstanceOf[js.Any])
    @scala.inline
    def newestOnTop(value: Boolean): this.type = set("newestOnTop", value.asInstanceOf[js.Any])
    @scala.inline
    def onClick(value: js.Function): this.type = set("onClick", value.asInstanceOf[js.Any])
    @scala.inline
    def pauseOnFocusLoss(value: Boolean): this.type = set("pauseOnFocusLoss", value.asInstanceOf[js.Any])
    @scala.inline
    def pauseOnHover(value: Boolean): this.type = set("pauseOnHover", value.asInstanceOf[js.Any])
    @scala.inline
    def position(value: PositionOptions): this.type = set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def progressClassName(value: String | js.Object): this.type = set("progressClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def progressStyle(value: js.Object): this.type = set("progressStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def role(value: String): this.type = set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def rtl(value: Boolean): this.type = set("rtl", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def toastClassName(value: String | js.Object): this.type = set("toastClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def transitionFunctionComponent(value: ReactComponentClass[js.Object]): this.type = set("transition", value.asInstanceOf[js.Any])
    @scala.inline
    def transitionComponentClass(value: ReactComponentClass[js.Object]): this.type = set("transition", value.asInstanceOf[js.Any])
    @scala.inline
    def transition(value: ReactComponentClass[js.Object]): this.type = set("transition", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ToastContainerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ToastContainer.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

