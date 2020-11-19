package typingsSlinky.reactElemental.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactElemental.anon.Primary
import typingsSlinky.reactElemental.anon.PrimaryDark
import typingsSlinky.reactElemental.mod.ElementalProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Elemental {
  
  @JSImport("react-elemental", "Elemental")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactElemental.mod.Elemental] {
    
    @scala.inline
    def colorOpts(value: PrimaryDark): this.type = set("colorOpts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fontOpts(value: Primary): this.type = set("fontOpts", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ElementalProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Elemental.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
