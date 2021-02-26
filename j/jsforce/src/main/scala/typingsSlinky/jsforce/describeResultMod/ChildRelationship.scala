package typingsSlinky.jsforce.describeResultMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChildRelationship extends StObject {
  
  var cascadeDelete: Boolean = js.native
  
  var childSObject: String = js.native
  
  var deprecatedAndHidden: Boolean = js.native
  
  var field: String = js.native
  
  var junctionIdListNames: js.Array[String] = js.native
  
  var junctionReferenceTo: js.Array[String] = js.native
  
  var relationshipName: js.UndefOr[maybe[String]] = js.native
  
  var restrictedDelete: Boolean = js.native
}
object ChildRelationship {
  
  @scala.inline
  def apply(
    cascadeDelete: Boolean,
    childSObject: String,
    deprecatedAndHidden: Boolean,
    field: String,
    junctionIdListNames: js.Array[String],
    junctionReferenceTo: js.Array[String],
    restrictedDelete: Boolean
  ): ChildRelationship = {
    val __obj = js.Dynamic.literal(cascadeDelete = cascadeDelete.asInstanceOf[js.Any], childSObject = childSObject.asInstanceOf[js.Any], deprecatedAndHidden = deprecatedAndHidden.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], junctionIdListNames = junctionIdListNames.asInstanceOf[js.Any], junctionReferenceTo = junctionReferenceTo.asInstanceOf[js.Any], restrictedDelete = restrictedDelete.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildRelationship]
  }
  
  @scala.inline
  implicit class ChildRelationshipMutableBuilder[Self <: ChildRelationship] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCascadeDelete(value: Boolean): Self = StObject.set(x, "cascadeDelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildSObject(value: String): Self = StObject.set(x, "childSObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeprecatedAndHidden(value: Boolean): Self = StObject.set(x, "deprecatedAndHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJunctionIdListNames(value: js.Array[String]): Self = StObject.set(x, "junctionIdListNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJunctionIdListNamesVarargs(value: String*): Self = StObject.set(x, "junctionIdListNames", js.Array(value :_*))
    
    @scala.inline
    def setJunctionReferenceTo(value: js.Array[String]): Self = StObject.set(x, "junctionReferenceTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJunctionReferenceToVarargs(value: String*): Self = StObject.set(x, "junctionReferenceTo", js.Array(value :_*))
    
    @scala.inline
    def setRelationshipName(value: maybe[String]): Self = StObject.set(x, "relationshipName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelationshipNameNull: Self = StObject.set(x, "relationshipName", null)
    
    @scala.inline
    def setRelationshipNameUndefined: Self = StObject.set(x, "relationshipName", js.undefined)
    
    @scala.inline
    def setRestrictedDelete(value: Boolean): Self = StObject.set(x, "restrictedDelete", value.asInstanceOf[js.Any])
  }
}
