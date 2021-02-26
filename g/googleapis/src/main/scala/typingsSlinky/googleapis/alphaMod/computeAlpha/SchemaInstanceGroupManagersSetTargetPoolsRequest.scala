package typingsSlinky.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaInstanceGroupManagersSetTargetPoolsRequest extends StObject {
  
  /**
    * The fingerprint of the target pools information. Use this optional
    * property to prevent conflicts when multiple users change the target pools
    * settings concurrently. Obtain the fingerprint with the
    * instanceGroupManagers.get method. Then, include the fingerprint in your
    * request to ensure that you do not overwrite changes that were applied
    * from another concurrent request.
    */
  var fingerprint: js.UndefOr[String] = js.native
  
  /**
    * The list of target pool URLs that instances in this managed instance
    * group belong to. The managed instance group applies these target pools to
    * all of the instances in the group. Existing instances and new instances
    * in the group all receive these target pool settings.
    */
  var targetPools: js.UndefOr[js.Array[String]] = js.native
}
object SchemaInstanceGroupManagersSetTargetPoolsRequest {
  
  @scala.inline
  def apply(): SchemaInstanceGroupManagersSetTargetPoolsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceGroupManagersSetTargetPoolsRequest]
  }
  
  @scala.inline
  implicit class SchemaInstanceGroupManagersSetTargetPoolsRequestMutableBuilder[Self <: SchemaInstanceGroupManagersSetTargetPoolsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
    
    @scala.inline
    def setTargetPools(value: js.Array[String]): Self = StObject.set(x, "targetPools", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetPoolsUndefined: Self = StObject.set(x, "targetPools", js.undefined)
    
    @scala.inline
    def setTargetPoolsVarargs(value: String*): Self = StObject.set(x, "targetPools", js.Array(value :_*))
  }
}
