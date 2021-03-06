package typingsSlinky.reactToastify.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactToastify.anon.Position
import typingsSlinky.reactToastify.progressBarMod.ProgressBarProps
import typingsSlinky.reactToastify.typesMod.ToastClassName
import typingsSlinky.reactToastify.typesMod.TypeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ProgressBar {
  
  @scala.inline
  def apply(closeToast: () => Unit, delay: Double, isRunning: Boolean, `type`: TypeOptions): Builder = {
    val __props = js.Dynamic.literal(closeToast = js.Any.fromFunction0(closeToast), delay = delay.asInstanceOf[js.Any], isRunning = isRunning.asInstanceOf[js.Any])
    __props.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ProgressBarProps]))
  }
  
  @JSImport("react-toastify/dist/components", "ProgressBar")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def className(value: ToastClassName): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def classNameFunction1(value: /* context */ js.UndefOr[Position] => String): this.type = set("className", js.Any.fromFunction1(value))
    
    @scala.inline
    def controlledProgress(value: Boolean): this.type = set("controlledProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hide(value: Boolean): this.type = set("hide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isIn(value: Boolean): this.type = set("isIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def progress(value: Double | String): this.type = set("progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rtl(value: Boolean): this.type = set("rtl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ProgressBarProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
