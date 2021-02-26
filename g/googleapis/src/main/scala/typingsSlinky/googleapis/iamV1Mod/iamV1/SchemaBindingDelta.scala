package typingsSlinky.googleapis.iamV1Mod.iamV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * One delta entry for Binding. Each individual change (only one member in
  * each entry) to a binding will be a separate entry.
  */
@js.native
trait SchemaBindingDelta extends StObject {
  
  /**
    * The action that was performed on a Binding. Required
    */
  var action: js.UndefOr[String] = js.native
  
  /**
    * Unimplemented. The condition that is associated with this binding. This
    * field is logged only for Cloud Audit Logging.
    */
  var condition: js.UndefOr[SchemaExpr] = js.native
  
  /**
    * A single identity requesting access for a Cloud Platform resource.
    * Follows the same format of Binding.members. Required
    */
  var member: js.UndefOr[String] = js.native
  
  /**
    * Role that is assigned to `members`. For example, `roles/viewer`,
    * `roles/editor`, or `roles/owner`. Required
    */
  var role: js.UndefOr[String] = js.native
}
object SchemaBindingDelta {
  
  @scala.inline
  def apply(): SchemaBindingDelta = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBindingDelta]
  }
  
  @scala.inline
  implicit class SchemaBindingDeltaMutableBuilder[Self <: SchemaBindingDelta] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    @scala.inline
    def setCondition(value: SchemaExpr): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    @scala.inline
    def setMember(value: String): Self = StObject.set(x, "member", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemberUndefined: Self = StObject.set(x, "member", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}
