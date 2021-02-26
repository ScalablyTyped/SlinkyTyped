package typingsSlinky.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The access controls set on the resource.
  */
@js.native
trait SchemaResourceAccessControl extends StObject {
  
  /**
    * The GCP IAM Policy to set on the resource.
    */
  var gcpIamPolicy: js.UndefOr[String] = js.native
}
object SchemaResourceAccessControl {
  
  @scala.inline
  def apply(): SchemaResourceAccessControl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourceAccessControl]
  }
  
  @scala.inline
  implicit class SchemaResourceAccessControlMutableBuilder[Self <: SchemaResourceAccessControl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGcpIamPolicy(value: String): Self = StObject.set(x, "gcpIamPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGcpIamPolicyUndefined: Self = StObject.set(x, "gcpIamPolicy", js.undefined)
  }
}
