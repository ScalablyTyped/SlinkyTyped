package typingsSlinky.jupyterlabCells.mod

import typingsSlinky.jupyterlabCells.modelMod.AttachmentsCellModel.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/cells", "AttachmentsCellModel")
@js.native
class AttachmentsCellModel protected ()
  extends typingsSlinky.jupyterlabCells.modelMod.AttachmentsCellModel {
  /**
    * Construct a new cell with optional attachments.
    */
  def this(options: IOptions) = this()
}
@JSImport("@jupyterlab/cells", "AttachmentsCellModel")
@js.native
object AttachmentsCellModel extends js.Object {
  
  /**
    * The shared `ContentFactory` instance.
    */
  val defaultContentFactory: typingsSlinky.jupyterlabCells.modelMod.AttachmentsCellModel.ContentFactory = js.native
  
  /**
    * The default implementation of an `IContentFactory`.
    */
  @js.native
  class ContentFactory ()
    extends typingsSlinky.jupyterlabCells.modelMod.AttachmentsCellModel.ContentFactory
}
