package typingsSlinky.awsSdk.wafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateSizeConstraintSetRequest extends StObject {
  
  /**
    * The value returned by the most recent call to GetChangeToken.
    */
  var ChangeToken: typingsSlinky.awsSdk.wafMod.ChangeToken = js.native
  
  /**
    * The SizeConstraintSetId of the SizeConstraintSet that you want to update. SizeConstraintSetId is returned by CreateSizeConstraintSet and by ListSizeConstraintSets.
    */
  var SizeConstraintSetId: ResourceId = js.native
  
  /**
    * An array of SizeConstraintSetUpdate objects that you want to insert into or delete from a SizeConstraintSet. For more information, see the applicable data types:    SizeConstraintSetUpdate: Contains Action and SizeConstraint     SizeConstraint: Contains FieldToMatch, TextTransformation, ComparisonOperator, and Size     FieldToMatch: Contains Data and Type   
    */
  var Updates: SizeConstraintSetUpdates = js.native
}
object UpdateSizeConstraintSetRequest {
  
  @scala.inline
  def apply(ChangeToken: ChangeToken, SizeConstraintSetId: ResourceId, Updates: SizeConstraintSetUpdates): UpdateSizeConstraintSetRequest = {
    val __obj = js.Dynamic.literal(ChangeToken = ChangeToken.asInstanceOf[js.Any], SizeConstraintSetId = SizeConstraintSetId.asInstanceOf[js.Any], Updates = Updates.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSizeConstraintSetRequest]
  }
  
  @scala.inline
  implicit class UpdateSizeConstraintSetRequestMutableBuilder[Self <: UpdateSizeConstraintSetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeToken(value: ChangeToken): Self = StObject.set(x, "ChangeToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeConstraintSetId(value: ResourceId): Self = StObject.set(x, "SizeConstraintSetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdates(value: SizeConstraintSetUpdates): Self = StObject.set(x, "Updates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatesVarargs(value: SizeConstraintSetUpdate*): Self = StObject.set(x, "Updates", js.Array(value :_*))
  }
}
