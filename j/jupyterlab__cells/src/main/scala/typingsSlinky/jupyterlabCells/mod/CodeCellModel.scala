package typingsSlinky.jupyterlabCells.mod

import typingsSlinky.jupyterlabCells.modelMod.CodeCellModel.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/cells", "CodeCellModel")
@js.native
class CodeCellModel protected ()
  extends typingsSlinky.jupyterlabCells.modelMod.CodeCellModel {
  /**
    * Construct a new code cell with optional original cell content.
    */
  def this(options: IOptions) = this()
}
@JSImport("@jupyterlab/cells", "CodeCellModel")
@js.native
object CodeCellModel extends js.Object {
  
  /**
    * The shared `ContentFactory` instance.
    */
  val defaultContentFactory: typingsSlinky.jupyterlabCells.modelMod.CodeCellModel.ContentFactory = js.native
  
  /**
    * The default implementation of an `IContentFactory`.
    */
  @js.native
  class ContentFactory ()
    extends typingsSlinky.jupyterlabCells.modelMod.CodeCellModel.ContentFactory
}
