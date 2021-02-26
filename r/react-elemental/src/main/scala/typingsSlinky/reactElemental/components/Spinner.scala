package typingsSlinky.reactElemental.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactElemental.mod.SpinnerProps
import typingsSlinky.reactElemental.mod.SpinnerSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Spinner {
  
  @JSImport("react-elemental", "Spinner")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactElemental.mod.Spinner] {
    
    @scala.inline
    def accentColor(value: String): this.type = set("accentColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def duration(value: Double): this.type = set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def ringColor(value: String): this.type = set("ringColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def size(value: SpinnerSize): this.type = set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def thickness(value: Double): this.type = set("thickness", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Spinner.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SpinnerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
