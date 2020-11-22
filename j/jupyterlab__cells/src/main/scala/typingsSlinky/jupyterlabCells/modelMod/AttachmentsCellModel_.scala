package typingsSlinky.jupyterlabCells.modelMod

import typingsSlinky.jupyterlabAttachments.modelMod.IAttachmentsModel
import typingsSlinky.jupyterlabCells.modelMod.AttachmentsCellModel.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/cells/lib/model", "AttachmentsCellModel")
@js.native
class AttachmentsCellModel_ protected () extends CellModel {
  /**
    * Construct a new cell with optional attachments.
    */
  def this(options: IOptions) = this()
  
  var _attachments: js.Any = js.native
  
  /**
    * Get the attachments of the model.
    */
  def attachments: IAttachmentsModel = js.native
}
