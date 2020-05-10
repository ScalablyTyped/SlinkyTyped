package typingsSlinky.jsforce.metadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileProperties extends js.Object {
  var createdById: String = js.native
  var createdByName: String = js.native
  var createdDate: String = js.native
  var fileName: String = js.native
  var fullName: String = js.native
  var id: String = js.native
  var lastModifiedById: String = js.native
  var lastModifiedByName: String = js.native
  var lastModifiedDate: String = js.native
  var manageableState: js.UndefOr[String] = js.native
  var namespacePrefix: js.UndefOr[String] = js.native
  var `type`: String = js.native
}

object FileProperties {
  @scala.inline
  def apply(
    createdById: String,
    createdByName: String,
    createdDate: String,
    fileName: String,
    fullName: String,
    id: String,
    lastModifiedById: String,
    lastModifiedByName: String,
    lastModifiedDate: String,
    `type`: String
  ): FileProperties = {
    val __obj = js.Dynamic.literal(createdById = createdById.asInstanceOf[js.Any], createdByName = createdByName.asInstanceOf[js.Any], createdDate = createdDate.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastModifiedById = lastModifiedById.asInstanceOf[js.Any], lastModifiedByName = lastModifiedByName.asInstanceOf[js.Any], lastModifiedDate = lastModifiedDate.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileProperties]
  }
  @scala.inline
  implicit class FilePropertiesOps[Self <: FileProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreatedById(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdById")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreatedByName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdByName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreatedDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFullName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastModifiedById(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedById")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastModifiedByName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedByName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastModifiedDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withManageableState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manageableState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManageableState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manageableState")(js.undefined)
        ret
    }
    @scala.inline
    def withNamespacePrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespacePrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamespacePrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespacePrefix")(js.undefined)
        ret
    }
  }
  
}

