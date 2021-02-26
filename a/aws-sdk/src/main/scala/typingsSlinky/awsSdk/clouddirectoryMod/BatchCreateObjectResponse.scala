package typingsSlinky.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchCreateObjectResponse extends StObject {
  
  /**
    * The ID that is associated with the object.
    */
  var ObjectIdentifier: js.UndefOr[typingsSlinky.awsSdk.clouddirectoryMod.ObjectIdentifier] = js.native
}
object BatchCreateObjectResponse {
  
  @scala.inline
  def apply(): BatchCreateObjectResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchCreateObjectResponse]
  }
  
  @scala.inline
  implicit class BatchCreateObjectResponseMutableBuilder[Self <: BatchCreateObjectResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObjectIdentifier(value: ObjectIdentifier): Self = StObject.set(x, "ObjectIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdentifierUndefined: Self = StObject.set(x, "ObjectIdentifier", js.undefined)
  }
}
