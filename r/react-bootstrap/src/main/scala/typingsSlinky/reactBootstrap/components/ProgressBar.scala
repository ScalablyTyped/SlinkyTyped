package typingsSlinky.reactBootstrap.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactBootstrap.mod.Sizes
import typingsSlinky.reactBootstrap.progressBarMod.ProgressBarProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ProgressBar {
  
  @JSImport("react-bootstrap", "ProgressBar")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactBootstrap.mod.ProgressBar] {
    
    @scala.inline
    def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def bsClass(value: String): this.type = set("bsClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def bsSize(value: Sizes): this.type = set("bsSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def bsStyle(value: String): this.type = set("bsStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def interpolatedClass(value: js.Any): this.type = set("interpolatedClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def label(value: ReactElement): this.type = set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelReactElement(value: ReactElement): this.type = set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def max(value: Double): this.type = set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def min(value: Double): this.type = set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def now(value: Double): this.type = set("now", value.asInstanceOf[js.Any])
    
    @scala.inline
    def srOnly(value: Boolean): this.type = set("srOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def striped(value: Boolean): this.type = set("striped", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ProgressBar.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ProgressBarProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
