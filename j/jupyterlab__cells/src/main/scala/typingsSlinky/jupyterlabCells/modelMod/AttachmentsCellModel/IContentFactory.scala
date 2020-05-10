package typingsSlinky.jupyterlabCells.modelMod.AttachmentsCellModel

import typingsSlinky.jupyterlabAttachments.modelMod.IAttachmentsModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A factory for creating code cell model content.
  */
@js.native
trait IContentFactory extends js.Object {
  /**
    * Create an output area.
    */
  def createAttachmentsModel(options: typingsSlinky.jupyterlabAttachments.modelMod.IAttachmentsModel.IOptions): IAttachmentsModel = js.native
}

object IContentFactory {
  @scala.inline
  def apply(
    createAttachmentsModel: typingsSlinky.jupyterlabAttachments.modelMod.IAttachmentsModel.IOptions => IAttachmentsModel
  ): IContentFactory = {
    val __obj = js.Dynamic.literal(createAttachmentsModel = js.Any.fromFunction1(createAttachmentsModel))
    __obj.asInstanceOf[IContentFactory]
  }
  @scala.inline
  implicit class IContentFactoryOps[Self <: IContentFactory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateAttachmentsModel(
      value: typingsSlinky.jupyterlabAttachments.modelMod.IAttachmentsModel.IOptions => IAttachmentsModel
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createAttachmentsModel")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

