package typingsSlinky.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait S3AccessControlList extends StObject {
  
  /**
    * 
    */
  var Grants: js.UndefOr[S3GrantList] = js.native
  
  /**
    * 
    */
  var Owner: S3ObjectOwner = js.native
}
object S3AccessControlList {
  
  @scala.inline
  def apply(Owner: S3ObjectOwner): S3AccessControlList = {
    val __obj = js.Dynamic.literal(Owner = Owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3AccessControlList]
  }
  
  @scala.inline
  implicit class S3AccessControlListMutableBuilder[Self <: S3AccessControlList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGrants(value: S3GrantList): Self = StObject.set(x, "Grants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrantsUndefined: Self = StObject.set(x, "Grants", js.undefined)
    
    @scala.inline
    def setGrantsVarargs(value: S3Grant*): Self = StObject.set(x, "Grants", js.Array(value :_*))
    
    @scala.inline
    def setOwner(value: S3ObjectOwner): Self = StObject.set(x, "Owner", value.asInstanceOf[js.Any])
  }
}
