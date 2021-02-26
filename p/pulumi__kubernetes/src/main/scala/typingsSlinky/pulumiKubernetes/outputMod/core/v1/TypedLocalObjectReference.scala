package typingsSlinky.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * TypedLocalObjectReference contains enough information to let you locate the typed referenced object inside the same namespace.
  */
@js.native
trait TypedLocalObjectReference extends StObject {
  
  /**
    * APIGroup is the group for the resource being referenced. If APIGroup is not specified, the specified Kind must be in the core API group. For any other third-party types, APIGroup is required.
    */
  var apiGroup: String = js.native
  
  /**
    * Kind is the type of resource being referenced
    */
  var kind: String = js.native
  
  /**
    * Name is the name of resource being referenced
    */
  var name: String = js.native
}
object TypedLocalObjectReference {
  
  @scala.inline
  def apply(apiGroup: String, kind: String, name: String): TypedLocalObjectReference = {
    val __obj = js.Dynamic.literal(apiGroup = apiGroup.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypedLocalObjectReference]
  }
  
  @scala.inline
  implicit class TypedLocalObjectReferenceMutableBuilder[Self <: TypedLocalObjectReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiGroup(value: String): Self = StObject.set(x, "apiGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
