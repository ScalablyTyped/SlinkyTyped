package typingsSlinky.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileManagerMessagesViews extends js.Object {
  var dateCreatedField: js.UndefOr[String] = js.native
  var dateModifiedField: js.UndefOr[String] = js.native
  var items: js.UndefOr[String] = js.native
  var nameField: js.UndefOr[String] = js.native
  var sizeField: js.UndefOr[String] = js.native
  var typeField: js.UndefOr[String] = js.native
}

object FileManagerMessagesViews {
  @scala.inline
  def apply(): FileManagerMessagesViews = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileManagerMessagesViews]
  }
  @scala.inline
  implicit class FileManagerMessagesViewsOps[Self <: FileManagerMessagesViews] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDateCreatedField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateCreatedField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateCreatedField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateCreatedField")(js.undefined)
        ret
    }
    @scala.inline
    def withDateModifiedField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateModifiedField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateModifiedField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateModifiedField")(js.undefined)
        ret
    }
    @scala.inline
    def withItems(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
        ret
    }
    @scala.inline
    def withNameField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNameField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameField")(js.undefined)
        ret
    }
    @scala.inline
    def withSizeField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizeField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeField")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeField")(js.undefined)
        ret
    }
  }
  
}

