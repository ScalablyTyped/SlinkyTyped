package typingsSlinky.instagramPrivateApi.directThreadRepositoryAddUserResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectThreadRepositoryAddUserResponseActionLog extends js.Object {
  var bold: js.Array[DirectThreadRepositoryAddUserResponseBoldItem] = js.native
  var description: String = js.native
  var text_attributes: js.Array[DirectThreadRepositoryAddUserResponseTextAttributesItem] = js.native
}

object DirectThreadRepositoryAddUserResponseActionLog {
  @scala.inline
  def apply(
    bold: js.Array[DirectThreadRepositoryAddUserResponseBoldItem],
    description: String,
    text_attributes: js.Array[DirectThreadRepositoryAddUserResponseTextAttributesItem]
  ): DirectThreadRepositoryAddUserResponseActionLog = {
    val __obj = js.Dynamic.literal(bold = bold.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], text_attributes = text_attributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectThreadRepositoryAddUserResponseActionLog]
  }
  @scala.inline
  implicit class DirectThreadRepositoryAddUserResponseActionLogOps[Self <: DirectThreadRepositoryAddUserResponseActionLog] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBold(value: js.Array[DirectThreadRepositoryAddUserResponseBoldItem]): Self = {
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
    def withText_attributes(value: js.Array[DirectThreadRepositoryAddUserResponseTextAttributesItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text_attributes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

