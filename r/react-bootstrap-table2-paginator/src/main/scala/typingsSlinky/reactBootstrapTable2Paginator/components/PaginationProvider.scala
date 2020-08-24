package typingsSlinky.reactBootstrapTable2Paginator.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactBootstrapTable2Paginator.anon.Children
import typingsSlinky.reactBootstrapTable2Paginator.anon.PaginationProps
import typingsSlinky.reactBootstrapTable2Paginator.mod.PaginationCtxOptions
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
    def pagination(value: PaginationCtxOptions): this.type = set("pagination", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Children): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(children: PaginationProps => ReactElement | Null): Builder = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new Builder(js.Array(this.component, __props.asInstanceOf[Children]))
  }
}

