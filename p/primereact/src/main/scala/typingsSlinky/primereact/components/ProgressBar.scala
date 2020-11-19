package typingsSlinky.primereact.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.primereact.progressBarMod.ProgressBarProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ProgressBar {
  
  @JSImport("primereact/progressbar", "ProgressBar")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.primereact.primereactProgressbarMod.ProgressBar] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def displayValueTemplate(value: /* value */ js.Any => ReactElement): this.type = set("displayValueTemplate", js.Any.fromFunction1(value))
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mode(value: String): this.type = set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showValue(value: Boolean): this.type = set("showValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def unit(value: String): this.type = set("unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def value(value: Double): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ProgressBarProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ProgressBar.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
