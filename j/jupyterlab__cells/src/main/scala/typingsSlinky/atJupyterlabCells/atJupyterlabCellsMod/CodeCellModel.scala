package typingsSlinky.atJupyterlabCells.atJupyterlabCellsMod

import typingsSlinky.atJupyterlabCells.libModelMod.CodeCellModel.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/cells", "CodeCellModel")
@js.native
class CodeCellModel protected ()
  extends typingsSlinky.atJupyterlabCells.libModelMod.CodeCellModel {
  /**
    * Construct a new code cell with optional original cell content.
    */
  def this(options: IOptions) = this()
}

@JSImport("@jupyterlab/cells", "CodeCellModel")
@js.native
object CodeCellModel extends js.Object {
  /**
    * The default implementation of an `IContentFactory`.
    */
  @js.native
  class ContentFactory ()
    extends typingsSlinky.atJupyterlabCells.libModelMod.CodeCellModel.ContentFactory
  
  /**
    * The shared `ContentFactory` instance.
    */
  val defaultContentFactory: typingsSlinky.atJupyterlabCells.libModelMod.CodeCellModel.ContentFactory = js.native
}

