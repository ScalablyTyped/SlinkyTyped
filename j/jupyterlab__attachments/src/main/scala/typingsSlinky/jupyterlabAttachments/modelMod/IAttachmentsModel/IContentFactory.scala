package typingsSlinky.jupyterlabAttachments.modelMod.IAttachmentsModel

import typingsSlinky.jupyterlabRendermime.attachmentmodelMod.IAttachmentModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The interface for an attachment content factory.
  */
trait IContentFactory extends js.Object {
  /**
    * Create an attachment model.
    */
  def createAttachmentModel(options: typingsSlinky.jupyterlabRendermime.attachmentmodelMod.IAttachmentModel.IOptions): IAttachmentModel
}

object IContentFactory {
  @scala.inline
  def apply(
    createAttachmentModel: typingsSlinky.jupyterlabRendermime.attachmentmodelMod.IAttachmentModel.IOptions => IAttachmentModel
  ): IContentFactory = {
    val __obj = js.Dynamic.literal(createAttachmentModel = js.Any.fromFunction1(createAttachmentModel))
  
    __obj.asInstanceOf[IContentFactory]
  }
}

