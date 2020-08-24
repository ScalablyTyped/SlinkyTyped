package typingsSlinky.baseui.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from js.Any because couldn't resolve ClassTree. */
object CustomColumn {
  @JSImport("baseui/data-table", "CustomColumn")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[ValueT, FilterParamsT] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object]
  
  def apply[ValueT, FilterParamsT](p: js.Any): Builder[ValueT, FilterParamsT] = new Builder[ValueT, FilterParamsT](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make[ValueT, FilterParamsT](companion: CustomColumn.type): Builder[ValueT, FilterParamsT] = new Builder[ValueT, FilterParamsT](js.Array(this.component, js.Dictionary.empty))()
}

