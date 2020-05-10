package typingsSlinky.reactVirtualized.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactVirtualized.AnonSortDirection
import typingsSlinky.reactVirtualized.esTableMod.SortDirectionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SortIndicator {
  @JSImport("react-virtualized", "SortIndicator")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def sortDirection(value: SortDirectionType): this.type = set("sortDirection", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: AnonSortDirection): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: SortIndicator.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

