package typingsSlinky.awsSdk.ssoadminMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribePermissionSetResponse extends StObject {
  
  /**
    * Describes the level of access on an AWS account.
    */
  var PermissionSet: js.UndefOr[typingsSlinky.awsSdk.ssoadminMod.PermissionSet] = js.native
}
object DescribePermissionSetResponse {
  
  @scala.inline
  def apply(): DescribePermissionSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePermissionSetResponse]
  }
  
  @scala.inline
  implicit class DescribePermissionSetResponseMutableBuilder[Self <: DescribePermissionSetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPermissionSet(value: PermissionSet): Self = StObject.set(x, "PermissionSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionSetUndefined: Self = StObject.set(x, "PermissionSet", js.undefined)
  }
}
