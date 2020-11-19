package typingsSlinky.recharts.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.recharts.mod.LabelListProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Support for combinations of intersection and union types not implemented */
object LabelList {
  
  @JSImport("recharts", "LabelList")
  @js.native
  object component extends js.Object
  
  def apply(p: LabelListProps): Default[tag.type, typingsSlinky.recharts.mod.LabelList] = new Default[tag.type, typingsSlinky.recharts.mod.LabelList](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: LabelList.type): Default[tag.type, typingsSlinky.recharts.mod.LabelList] = new Default[tag.type, typingsSlinky.recharts.mod.LabelList](js.Array(this.component, js.Dictionary.empty))()
}
