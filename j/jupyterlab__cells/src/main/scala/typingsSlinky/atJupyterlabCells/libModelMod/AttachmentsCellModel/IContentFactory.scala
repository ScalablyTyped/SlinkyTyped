package typingsSlinky.atJupyterlabCells.libModelMod.AttachmentsCellModel

import typingsSlinky.atJupyterlabAttachments.libModelMod.IAttachmentsModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A factory for creating code cell model content.
  */
trait IContentFactory extends js.Object {
  /**
    * Create an output area.
    */
  def createAttachmentsModel(options: typingsSlinky.atJupyterlabAttachments.libModelMod.IAttachmentsModel.IOptions): IAttachmentsModel
}

object IContentFactory {
  @scala.inline
  def apply(
    createAttachmentsModel: typingsSlinky.atJupyterlabAttachments.libModelMod.IAttachmentsModel.IOptions => IAttachmentsModel
  ): IContentFactory = {
    val __obj = js.Dynamic.literal(createAttachmentsModel = js.Any.fromFunction1(createAttachmentsModel))
  
    __obj.asInstanceOf[IContentFactory]
  }
}

