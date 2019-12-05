package typingsSlinky.atJupyterlabAttachments.libModelMod.IAttachmentsModel

import typingsSlinky.atJupyterlabRendermime.libAttachmentmodelMod.IAttachmentModel
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
  def createAttachmentModel(options: typingsSlinky.atJupyterlabRendermime.libAttachmentmodelMod.IAttachmentModel.IOptions): IAttachmentModel
}

object IContentFactory {
  @scala.inline
  def apply(
    createAttachmentModel: typingsSlinky.atJupyterlabRendermime.libAttachmentmodelMod.IAttachmentModel.IOptions => IAttachmentModel
  ): IContentFactory = {
    val __obj = js.Dynamic.literal(createAttachmentModel = js.Any.fromFunction1(createAttachmentModel))
  
    __obj.asInstanceOf[IContentFactory]
  }
}

