package typingsSlinky.reactElemental.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactElemental.mod.PulsatorProps
import typingsSlinky.reactElemental.mod.PulsatorSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Pulsator {
  
  @JSImport("react-elemental", "Pulsator")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactElemental.mod.Pulsator] {
    
    @scala.inline
    def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inactive(value: Boolean): this.type = set("inactive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def size(value: PulsatorSize): this.type = set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def transparent(value: Boolean): this.type = set("transparent", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Pulsator.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PulsatorProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
