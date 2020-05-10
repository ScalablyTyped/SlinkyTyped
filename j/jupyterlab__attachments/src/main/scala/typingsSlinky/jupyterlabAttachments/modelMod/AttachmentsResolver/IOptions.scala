package typingsSlinky.jupyterlabAttachments.modelMod.AttachmentsResolver

import typingsSlinky.jupyterlabAttachments.modelMod.IAttachmentsModel
import typingsSlinky.jupyterlabRendermimeInterfaces.mod.IRenderMime.IResolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to create an AttachmentsResolver.
  */
@js.native
trait IOptions extends js.Object {
  /**
    * The attachments model to resolve against.
    */
  var model: IAttachmentsModel = js.native
  /**
    * A parent resolver to use if the URL/path is not for an attachment.
    */
  var parent: js.UndefOr[IResolver] = js.native
}

object IOptions {
  @scala.inline
  def apply(model: IAttachmentsModel): IOptions = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withModel(value: IAttachmentsModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: IResolver): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(js.undefined)
        ret
    }
  }
  
}

