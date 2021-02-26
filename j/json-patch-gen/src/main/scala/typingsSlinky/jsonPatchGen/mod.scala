package typingsSlinky.jsonPatchGen

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("json-patch-gen", JSImport.Namespace)
  @js.native
  def apply(): js.Array[JsonPatch] = js.native
  @JSImport("json-patch-gen", JSImport.Namespace)
  @js.native
  def apply(obj1: js.Object): js.Array[JsonPatch] = js.native
  @JSImport("json-patch-gen", JSImport.Namespace)
  @js.native
  def apply(obj1: js.Object, obj2: js.Object): js.Array[JsonPatch] = js.native
  @JSImport("json-patch-gen", JSImport.Namespace)
  @js.native
  def apply(obj1: Null, obj2: js.Object): js.Array[JsonPatch] = js.native
  
  @js.native
  trait JsonPatch extends StObject {
    
    var op: PatchOperation = js.native
    
    var path: String = js.native
    
    var value: js.Any = js.native
  }
  object JsonPatch {
    
    @scala.inline
    def apply(op: PatchOperation, path: String, value: js.Any): JsonPatch = {
      val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[JsonPatch]
    }
    
    @scala.inline
    implicit class JsonPatchMutableBuilder[Self <: JsonPatch] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOp(value: PatchOperation): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.jsonPatchGen.jsonPatchGenStrings.replace
    - typingsSlinky.jsonPatchGen.jsonPatchGenStrings.add
    - typingsSlinky.jsonPatchGen.jsonPatchGenStrings.remove
  */
  trait PatchOperation extends StObject
  object PatchOperation {
    
    @scala.inline
    def add: typingsSlinky.jsonPatchGen.jsonPatchGenStrings.add = "add".asInstanceOf[typingsSlinky.jsonPatchGen.jsonPatchGenStrings.add]
    
    @scala.inline
    def remove: typingsSlinky.jsonPatchGen.jsonPatchGenStrings.remove = "remove".asInstanceOf[typingsSlinky.jsonPatchGen.jsonPatchGenStrings.remove]
    
    @scala.inline
    def replace: typingsSlinky.jsonPatchGen.jsonPatchGenStrings.replace = "replace".asInstanceOf[typingsSlinky.jsonPatchGen.jsonPatchGenStrings.replace]
  }
}
