package typingsSlinky.instagramPrivateApi.directThreadRepositoryUpdateTitleResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectThreadRepositoryUpdateTitleResponseActionLog extends js.Object {
  var bold: js.Array[DirectThreadRepositoryUpdateTitleResponseBoldItem] = js.native
  var description: String = js.native
  var text_attributes: js.Array[DirectThreadRepositoryUpdateTitleResponseTextAttributesItem] = js.native
}

object DirectThreadRepositoryUpdateTitleResponseActionLog {
  @scala.inline
  def apply(
    bold: js.Array[DirectThreadRepositoryUpdateTitleResponseBoldItem],
    description: String,
    text_attributes: js.Array[DirectThreadRepositoryUpdateTitleResponseTextAttributesItem]
  ): DirectThreadRepositoryUpdateTitleResponseActionLog = {
    val __obj = js.Dynamic.literal(bold = bold.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], text_attributes = text_attributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectThreadRepositoryUpdateTitleResponseActionLog]
  }
  @scala.inline
  implicit class DirectThreadRepositoryUpdateTitleResponseActionLogOps[Self <: DirectThreadRepositoryUpdateTitleResponseActionLog] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBold(value: js.Array[DirectThreadRepositoryUpdateTitleResponseBoldItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText_attributes(value: js.Array[DirectThreadRepositoryUpdateTitleResponseTextAttributesItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text_attributes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

