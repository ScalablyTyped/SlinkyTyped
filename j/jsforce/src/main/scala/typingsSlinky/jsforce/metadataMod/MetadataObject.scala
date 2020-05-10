package typingsSlinky.jsforce.metadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetadataObject extends js.Object {
  var childXmlNames: js.UndefOr[js.Array[String]] = js.native
  var directoryName: js.UndefOr[String] = js.native
  var inFolder: js.UndefOr[Boolean] = js.native
  var metaFile: js.UndefOr[Boolean] = js.native
  var suffix: js.UndefOr[String] = js.native
  var xmlName: String = js.native
}

object MetadataObject {
  @scala.inline
  def apply(xmlName: String): MetadataObject = {
    val __obj = js.Dynamic.literal(xmlName = xmlName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetadataObject]
  }
  @scala.inline
  implicit class MetadataObjectOps[Self <: MetadataObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withXmlName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xmlName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildXmlNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childXmlNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildXmlNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childXmlNames")(js.undefined)
        ret
    }
    @scala.inline
    def withDirectoryName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directoryName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectoryName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directoryName")(js.undefined)
        ret
    }
    @scala.inline
    def withInFolder(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inFolder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInFolder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inFolder")(js.undefined)
        ret
    }
    @scala.inline
    def withMetaFile(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metaFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetaFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metaFile")(js.undefined)
        ret
    }
    @scala.inline
    def withSuffix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuffix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suffix")(js.undefined)
        ret
    }
  }
  
}

