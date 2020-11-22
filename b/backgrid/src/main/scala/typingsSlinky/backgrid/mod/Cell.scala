package typingsSlinky.backgrid.mod

import typingsSlinky.backbone.mod.Model
import typingsSlinky.backbone.mod.ModelSetOptions
import typingsSlinky.backbone.mod.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("backgrid", "Cell")
@js.native
class Cell ()
  extends View[Model[js.Any, ModelSetOptions, js.Object]] {
  
  var editor: InputCellEditor = js.native
  
  def enterEditMode(): js.Any = js.native
  
  def exitEditMode(): js.Any = js.native
  
  var formatter: CellFormatter = js.native
  
  def renderError(): js.Any = js.native
}
