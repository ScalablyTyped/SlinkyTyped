package typingsSlinky.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
