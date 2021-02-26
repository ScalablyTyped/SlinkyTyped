package typingsSlinky.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccessControlList extends StObject {
  
  /**
    * Specifies whether the ACL grants the general public with read access permissions for the bucket.
    */
  var allowsPublicReadAccess: js.UndefOr[boolean] = js.native
  
  /**
    * Specifies whether the ACL grants the general public with write access permissions for the bucket.
    */
  var allowsPublicWriteAccess: js.UndefOr[boolean] = js.native
}
object AccessControlList {
  
  @scala.inline
  def apply(): AccessControlList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessControlList]
  }
  
  @scala.inline
  implicit class AccessControlListMutableBuilder[Self <: AccessControlList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowsPublicReadAccess(value: boolean): Self = StObject.set(x, "allowsPublicReadAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowsPublicReadAccessUndefined: Self = StObject.set(x, "allowsPublicReadAccess", js.undefined)
    
    @scala.inline
    def setAllowsPublicWriteAccess(value: boolean): Self = StObject.set(x, "allowsPublicWriteAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowsPublicWriteAccessUndefined: Self = StObject.set(x, "allowsPublicWriteAccess", js.undefined)
  }
}
