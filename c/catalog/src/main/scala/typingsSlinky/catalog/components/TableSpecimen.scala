package typingsSlinky.catalog.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.catalog.catalogNumbers.`1`
import typingsSlinky.catalog.catalogNumbers.`2`
import typingsSlinky.catalog.catalogNumbers.`3`
import typingsSlinky.catalog.catalogNumbers.`4`
import typingsSlinky.catalog.catalogNumbers.`5`
import typingsSlinky.catalog.catalogNumbers.`6`
import typingsSlinky.catalog.mod.SpecimenProps
import typingsSlinky.catalog.mod.TableSpecimenProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TableSpecimen {
  
  @JSImport("catalog", "TableSpecimen")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.catalog.mod.TableSpecimen] {
    
    @scala.inline
    def columnsVarargs(value: String*): this.type = set("columns", js.Array(value :_*))
    
    @scala.inline
    def columns(value: js.Array[String]): this.type = set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rawBody(value: String): this.type = set("rawBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rawOptions(value: String): this.type = set("rawOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def span(value: `1` | `2` | `3` | `4` | `5` | `6`): this.type = set("span", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SpecimenProps with TableSpecimenProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(rows: js.Array[StringDictionary[ReactElement]]): Builder = {
    val __props = js.Dynamic.literal(rows = rows.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[SpecimenProps with TableSpecimenProps]))
  }
}
