package typingsSlinky.googleapis.v3p1beta1Mod.jobsV3p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Input only.  Request for updating a specified company.
  */
@js.native
trait SchemaUpdateCompanyRequest extends StObject {
  
  /**
    * Required.  The company resource to replace the current resource in the
    * system.
    */
  var company: js.UndefOr[SchemaCompany] = js.native
  
  /**
    * Optional but strongly recommended for the best service experience.  If
    * update_mask is provided, only the specified fields in company are
    * updated. Otherwise all the fields are updated.  A field mask to specify
    * the company fields to be updated. Only top level fields of Company are
    * supported.
    */
  var updateMask: js.UndefOr[String] = js.native
}
object SchemaUpdateCompanyRequest {
  
  @scala.inline
  def apply(): SchemaUpdateCompanyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateCompanyRequest]
  }
  
  @scala.inline
  implicit class SchemaUpdateCompanyRequestMutableBuilder[Self <: SchemaUpdateCompanyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompany(value: SchemaCompany): Self = StObject.set(x, "company", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompanyUndefined: Self = StObject.set(x, "company", js.undefined)
    
    @scala.inline
    def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
