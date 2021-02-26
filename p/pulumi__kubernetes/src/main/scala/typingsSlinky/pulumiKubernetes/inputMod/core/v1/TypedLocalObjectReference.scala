package typingsSlinky.pulumiKubernetes.inputMod.core.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
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
  var apiGroup: js.UndefOr[Input[String]] = js.native
  
  /**
    * Kind is the type of resource being referenced
    */
  var kind: Input[String] = js.native
  
  /**
    * Name is the name of resource being referenced
    */
  var name: Input[String] = js.native
}
object TypedLocalObjectReference {
  
  @scala.inline
  def apply(kind: Input[String], name: Input[String]): TypedLocalObjectReference = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypedLocalObjectReference]
  }
  
  @scala.inline
  implicit class TypedLocalObjectReferenceMutableBuilder[Self <: TypedLocalObjectReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiGroup(value: Input[String]): Self = StObject.set(x, "apiGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiGroupUndefined: Self = StObject.set(x, "apiGroup", js.undefined)
    
    @scala.inline
    def setKind(value: Input[String]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
