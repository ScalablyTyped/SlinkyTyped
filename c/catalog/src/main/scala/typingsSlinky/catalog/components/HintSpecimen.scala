package typingsSlinky.catalog.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.catalog.catalogNumbers.`1`
import typingsSlinky.catalog.catalogNumbers.`2`
import typingsSlinky.catalog.catalogNumbers.`3`
import typingsSlinky.catalog.catalogNumbers.`4`
import typingsSlinky.catalog.catalogNumbers.`5`
import typingsSlinky.catalog.catalogNumbers.`6`
import typingsSlinky.catalog.mod.HintSpecimenProps
import typingsSlinky.catalog.mod.SpecimenProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object HintSpecimen {
  
  @JSImport("catalog", "HintSpecimen")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.catalog.mod.HintSpecimen] {
    
    @scala.inline
    def directive(value: Boolean): this.type = set("directive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def important(value: Boolean): this.type = set("important", value.asInstanceOf[js.Any])
    
    @scala.inline
    def neutral(value: Boolean): this.type = set("neutral", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rawBody(value: String): this.type = set("rawBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rawOptions(value: String): this.type = set("rawOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def span(value: `1` | `2` | `3` | `4` | `5` | `6`): this.type = set("span", value.asInstanceOf[js.Any])
    
    @scala.inline
    def warning(value: Boolean): this.type = set("warning", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SpecimenProps with HintSpecimenProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: HintSpecimen.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
