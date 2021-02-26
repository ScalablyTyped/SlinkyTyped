package typingsSlinky.reactVirtualized.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactVirtualized.anon.SortDirection
import typingsSlinky.reactVirtualized.esTableMod.SortDirectionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SortIndicator {
  
  @JSImport("react-virtualized", "SortIndicator")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def sortDirection(value: SortDirectionType): this.type = set("sortDirection", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: SortIndicator.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SortDirection): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
