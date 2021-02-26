package typingsSlinky.googleapis.alphaMod.computeAlpha

import typingsSlinky.googleapis.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaResourcePoliciesScopedList extends StObject {
  
  /**
    * A list of resourcePolicies contained in this scope.
    */
  var resourcePolicies: js.UndefOr[js.Array[SchemaResourcePolicy]] = js.native
  
  /**
    * Informational warning which replaces the list of resourcePolicies when
    * the list is empty.
    */
  var warning: js.UndefOr[Code] = js.native
}
object SchemaResourcePoliciesScopedList {
  
  @scala.inline
  def apply(): SchemaResourcePoliciesScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourcePoliciesScopedList]
  }
  
  @scala.inline
  implicit class SchemaResourcePoliciesScopedListMutableBuilder[Self <: SchemaResourcePoliciesScopedList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourcePolicies(value: js.Array[SchemaResourcePolicy]): Self = StObject.set(x, "resourcePolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcePoliciesUndefined: Self = StObject.set(x, "resourcePolicies", js.undefined)
    
    @scala.inline
    def setResourcePoliciesVarargs(value: SchemaResourcePolicy*): Self = StObject.set(x, "resourcePolicies", js.Array(value :_*))
    
    @scala.inline
    def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
