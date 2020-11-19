package typingsSlinky.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Cloud Healthcare API resource.
  */
@js.native
trait SchemaCloudHealthcareSource extends js.Object {
  
  /**
    * Full path of a Cloud Healthcare API resource.
    */
  var name: js.UndefOr[String] = js.native
}
object SchemaCloudHealthcareSource {
  
  @scala.inline
  def apply(): SchemaCloudHealthcareSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCloudHealthcareSource]
  }
  
  @scala.inline
  implicit class SchemaCloudHealthcareSourceOps[Self <: SchemaCloudHealthcareSource] (val x: Self) extends AnyVal {
    
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
  }
}
