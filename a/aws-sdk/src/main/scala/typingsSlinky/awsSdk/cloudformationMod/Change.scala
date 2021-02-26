package typingsSlinky.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Change extends StObject {
  
  /**
    * A ResourceChange structure that describes the resource and action that AWS CloudFormation will perform.
    */
  var ResourceChange: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.ResourceChange] = js.native
  
  /**
    * The type of entity that AWS CloudFormation changes. Currently, the only entity type is Resource.
    */
  var Type: js.UndefOr[ChangeType] = js.native
}
object Change {
  
  @scala.inline
  def apply(): Change = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Change]
  }
  
  @scala.inline
  implicit class ChangeMutableBuilder[Self <: Change] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceChange(value: ResourceChange): Self = StObject.set(x, "ResourceChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceChangeUndefined: Self = StObject.set(x, "ResourceChange", js.undefined)
    
    @scala.inline
    def setType(value: ChangeType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
