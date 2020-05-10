package typingsSlinky.jupyterlabAttachments.modelMod.IAttachmentsModel

import typingsSlinky.jupyterlabRendermime.attachmentmodelMod.IAttachmentModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The interface for an attachment content factory.
  */
@js.native
trait IContentFactory extends js.Object {
  /**
    * Create an attachment model.
    */
  def createAttachmentModel(options: typingsSlinky.jupyterlabRendermime.attachmentmodelMod.IAttachmentModel.IOptions): IAttachmentModel = js.native
}

object IContentFactory {
  @scala.inline
  def apply(
    createAttachmentModel: typingsSlinky.jupyterlabRendermime.attachmentmodelMod.IAttachmentModel.IOptions => IAttachmentModel
  ): IContentFactory = {
    val __obj = js.Dynamic.literal(createAttachmentModel = js.Any.fromFunction1(createAttachmentModel))
    __obj.asInstanceOf[IContentFactory]
  }
  @scala.inline
  implicit class IContentFactoryOps[Self <: IContentFactory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateAttachmentModel(
      value: typingsSlinky.jupyterlabRendermime.attachmentmodelMod.IAttachmentModel.IOptions => IAttachmentModel
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createAttachmentModel")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

