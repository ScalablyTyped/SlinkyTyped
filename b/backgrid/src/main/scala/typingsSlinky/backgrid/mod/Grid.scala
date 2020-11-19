package typingsSlinky.backgrid.mod

import typingsSlinky.backbone.mod.Collection
import typingsSlinky.backbone.mod.Model
import typingsSlinky.backbone.mod.ModelSetOptions
import typingsSlinky.backbone.mod.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("backgrid", "Grid")
@js.native
class Grid protected ()
  extends View[Model[js.Any, ModelSetOptions]] {
  def this(options: GridOptions) = this()
  
  var body: Body = js.native
  
  var footer: js.Any = js.native
  
  def getSelectedModels(): js.Array[Model[_, ModelSetOptions]] = js.native
  
  var header: js.Any = js.native
  
  def initialize(options: js.Any): Unit = js.native
  
  def insertColumn(options: js.Any*): Grid = js.native
  
  def insertRow(
    model: Model[_, ModelSetOptions],
    collection: Collection[Model[_, ModelSetOptions]],
    options: js.Any
  ): js.Any = js.native
  
  def removeColumn(options: js.Any*): Grid = js.native
  
  def removeRow(
    model: Model[_, ModelSetOptions],
    collection: Collection[Model[_, ModelSetOptions]],
    options: js.Any
  ): js.Any = js.native
}
