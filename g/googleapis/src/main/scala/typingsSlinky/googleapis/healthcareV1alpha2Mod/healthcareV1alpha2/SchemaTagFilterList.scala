package typingsSlinky.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List of tags to be filtered.
  */
@js.native
trait SchemaTagFilterList extends js.Object {
  /**
    * Tags to be filtered. Tags must be DICOM Data Elements, File Meta
    * Elements, or Directory Structuring Elements, as defined at:
    * http://dicom.nema.org/medical/dicom/current/output/html/part06.html#table_6-1,.
    * They may be provided by &quot;Keyword&quot; or &quot;Tag&quot;. For
    * example &quot;PatientID&quot;, &quot;0010,0010&quot;.
    */
  var tags: js.UndefOr[js.Array[String]] = js.native
}

object SchemaTagFilterList {
  @scala.inline
  def apply(): SchemaTagFilterList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTagFilterList]
  }
  @scala.inline
  implicit class SchemaTagFilterListOps[Self <: SchemaTagFilterList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTags(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

