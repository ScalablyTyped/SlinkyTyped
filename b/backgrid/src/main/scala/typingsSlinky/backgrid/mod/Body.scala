package typingsSlinky.backgrid.mod

import typingsSlinky.backbone.mod.Collection
import typingsSlinky.backbone.mod.Model
import typingsSlinky.backbone.mod.ModelSetOptions
import typingsSlinky.backbone.mod.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("backgrid", "Body")
@js.native
class Body ()
  extends View[Model[js.Any, ModelSetOptions]] {
  
  def initialize(options: js.Any): Unit = js.native
  
  def insertRow(
    model: Model[_, ModelSetOptions],
    collection: Collection[Model[_, ModelSetOptions]],
    options: js.Any
  ): js.Any = js.native
  
  def moveToNextCell(model: Model[_, ModelSetOptions], cell: Column, command: Command): js.Any = js.native
  
  def refresh(): Body = js.native
  
  def removeRow(
    model: Model[_, ModelSetOptions],
    collection: Collection[Model[_, ModelSetOptions]],
    options: js.Any
  ): js.Any = js.native
}
