package typingsSlinky.materialUiPagination.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.materialUiPagination.mod.PaginationProps
import typingsSlinky.materialUiPagination.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MaterialUiPagination {
  
  @scala.inline
  def apply(current: Double, display: Double, onChange: Double => Unit, total: Double): Default[tag.type, default] = {
    val __props = js.Dynamic.literal(current = current.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), total = total.asInstanceOf[js.Any])
    new Default[tag.type, default](js.Array(this.component, __props.asInstanceOf[PaginationProps]))
  }
  
  @JSImport("material-ui-pagination", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: PaginationProps): Default[tag.type, default] = new Default[tag.type, default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
