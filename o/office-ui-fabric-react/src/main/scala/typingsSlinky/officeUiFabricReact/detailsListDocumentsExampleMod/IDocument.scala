package typingsSlinky.officeUiFabricReact.detailsListDocumentsExampleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDocument extends js.Object {
  var dateModified: String = js.native
  var dateModifiedValue: Double = js.native
  var fileSize: String = js.native
  var fileSizeRaw: Double = js.native
  var fileType: String = js.native
  var iconName: String = js.native
  var key: String = js.native
  var modifiedBy: String = js.native
  var name: String = js.native
  var value: String = js.native
}

object IDocument {
  @scala.inline
  def apply(
    dateModified: String,
    dateModifiedValue: Double,
    fileSize: String,
    fileSizeRaw: Double,
    fileType: String,
    iconName: String,
    key: String,
    modifiedBy: String,
    name: String,
    value: String
  ): IDocument = {
    val __obj = js.Dynamic.literal(dateModified = dateModified.asInstanceOf[js.Any], dateModifiedValue = dateModifiedValue.asInstanceOf[js.Any], fileSize = fileSize.asInstanceOf[js.Any], fileSizeRaw = fileSizeRaw.asInstanceOf[js.Any], fileType = fileType.asInstanceOf[js.Any], iconName = iconName.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], modifiedBy = modifiedBy.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDocument]
  }
  @scala.inline
  implicit class IDocumentOps[Self <: IDocument] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDateModified(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateModified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDateModifiedValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateModifiedValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileSizeRaw(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileSizeRaw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIconName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModifiedBy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifiedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

