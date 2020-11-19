package typingsSlinky.materialUiPagination.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.materialUiPagination.mod.PaginationProps
import typingsSlinky.materialUiPagination.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MaterialUiPagination {
  
  @JSImport("material-ui-pagination", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: PaginationProps): Default[tag.type, default] = new Default[tag.type, default](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(current: Double, display: Double, onChange: Double => Unit, total: Double): Default[tag.type, default] = {
    val __props = js.Dynamic.literal(current = current.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), total = total.asInstanceOf[js.Any])
    new Default[tag.type, default](js.Array(this.component, __props.asInstanceOf[PaginationProps]))
  }
}
