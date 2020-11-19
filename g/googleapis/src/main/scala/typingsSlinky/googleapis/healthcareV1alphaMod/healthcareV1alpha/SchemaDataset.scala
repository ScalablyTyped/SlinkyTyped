package typingsSlinky.googleapis.healthcareV1alphaMod.healthcareV1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A message representing a health dataset.  A health dataset represents a
  * collection of healthcare data pertaining to one or more patients. This may
  * include multiple modalities of healthcare data, such as electronic medical
  * records or medical imaging data.
  */
@js.native
trait SchemaDataset extends js.Object {
  
  /**
    * Output only. Resource name of the dataset, of the form
    * `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}`.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The default timezone used by this dataset. Must be a either a valid IANA
    * time zone name such as &quot;America/New_York&quot; or empty, which
    * defaults to UTC. This is used for parsing times in resources (e.g., HL7
    * messages) where no explicit timezone is specified.
    */
  var timeZone: js.UndefOr[String] = js.native
}
object SchemaDataset {
  
  @scala.inline
  def apply(): SchemaDataset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDataset]
  }
  
  @scala.inline
  implicit class SchemaDatasetOps[Self <: SchemaDataset] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setTimeZone(value: String): Self = this.set("timeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeZone: Self = this.set("timeZone", js.undefined)
  }
}
