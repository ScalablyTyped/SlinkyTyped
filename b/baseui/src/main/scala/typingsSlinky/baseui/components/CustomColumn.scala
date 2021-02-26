package typingsSlinky.baseui.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from js.Any because couldn't resolve ClassTree. */
object CustomColumn {
  
  def apply[ValueT, FilterParamsT](p: js.Any): Builder[ValueT, FilterParamsT] = new Builder[ValueT, FilterParamsT](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("baseui/data-table", "CustomColumn")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder[ValueT, FilterParamsT] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object]
  
  implicit def make[ValueT, FilterParamsT](companion: CustomColumn.type): Builder[ValueT, FilterParamsT] = new Builder[ValueT, FilterParamsT](js.Array(this.component, js.Dictionary.empty))()
}
