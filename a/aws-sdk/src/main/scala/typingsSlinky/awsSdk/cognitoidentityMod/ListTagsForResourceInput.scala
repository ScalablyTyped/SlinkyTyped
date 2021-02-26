package typingsSlinky.awsSdk.cognitoidentityMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTagsForResourceInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the identity pool that the tags are assigned to.
    */
  var ResourceArn: ARNString = js.native
}
object ListTagsForResourceInput {
  
  @scala.inline
  def apply(ResourceArn: ARNString): ListTagsForResourceInput = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceInput]
  }
  
  @scala.inline
  implicit class ListTagsForResourceInputMutableBuilder[Self <: ListTagsForResourceInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceArn(value: ARNString): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
  }
}
