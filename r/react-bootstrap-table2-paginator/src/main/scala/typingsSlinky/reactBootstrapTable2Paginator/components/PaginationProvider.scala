package typingsSlinky.reactBootstrapTable2Paginator.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactBootstrapTable2Paginator.anon.Children
import typingsSlinky.reactBootstrapTableNext.mod.PaginationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PaginationProvider {
  @JSImport("react-bootstrap-table2-paginator", "PaginationProvider")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def pagination(value: PaginationOptions): this.type = set("pagination", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Children): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: PaginationProvider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

