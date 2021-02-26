package typingsSlinky.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Relationship to another action
  */
@js.native
trait RequestGroupActionRelatedAction extends BackboneElement {
  
  /**
    * Contains extended information for property 'actionId'.
    */
  var _actionId: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'relationship'.
    */
  var _relationship: js.UndefOr[Element] = js.native
  
  /**
    * What action this is related to
    */
  var actionId: id = js.native
  
  /**
    * Time offset for the relationship
    */
  var offsetDuration: js.UndefOr[Duration] = js.native
  
  /**
    * Time offset for the relationship
    */
  var offsetRange: js.UndefOr[Range] = js.native
  
  /**
    * before-start | before | before-end | concurrent-with-start | concurrent | concurrent-with-end | after-start | after | after-end
    */
  var relationship: code = js.native
}
object RequestGroupActionRelatedAction {
  
  @scala.inline
  def apply(actionId: id, relationship: code): RequestGroupActionRelatedAction = {
    val __obj = js.Dynamic.literal(actionId = actionId.asInstanceOf[js.Any], relationship = relationship.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestGroupActionRelatedAction]
  }
  
  @scala.inline
  implicit class RequestGroupActionRelatedActionMutableBuilder[Self <: RequestGroupActionRelatedAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionId(value: id): Self = StObject.set(x, "actionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetDuration(value: Duration): Self = StObject.set(x, "offsetDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetDurationUndefined: Self = StObject.set(x, "offsetDuration", js.undefined)
    
    @scala.inline
    def setOffsetRange(value: Range): Self = StObject.set(x, "offsetRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetRangeUndefined: Self = StObject.set(x, "offsetRange", js.undefined)
    
    @scala.inline
    def setRelationship(value: code): Self = StObject.set(x, "relationship", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_actionId(value: Element): Self = StObject.set(x, "_actionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_actionIdUndefined: Self = StObject.set(x, "_actionId", js.undefined)
    
    @scala.inline
    def set_relationship(value: Element): Self = StObject.set(x, "_relationship", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_relationshipUndefined: Self = StObject.set(x, "_relationship", js.undefined)
  }
}
