package typingsSlinky.rfc6902

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pointerMod {
  
  @JSImport("rfc6902/pointer", "Pointer")
  @js.native
  class Pointer () extends StObject {
    def this(tokens: js.Array[String]) = this()
    
    /**
      `token` should be a String. It'll be coerced to one anyway.
      
      immutable (shallowly)
      */
    def add(token: String): Pointer = js.native
    
    /**
      Returns an object with 'parent', 'key', and 'value' properties.
      In the special case that this Pointer's path == "",
      this object will be {parent: null, key: '', value: object}.
      Otherwise, parent and key will have the property such that parent[key] == value.
      */
    def evaluate(`object`: js.Any): PointerEvaluation = js.native
    
    def get(`object`: js.Any): js.Any = js.native
    
    def push(token: String): Unit = js.native
    
    def set(`object`: js.Any, value: js.Any): Unit = js.native
    
    var tokens: js.Array[String] = js.native
  }
  /* static members */
  object Pointer {
    
    /**
      `path` *must* be a properly escaped string.
      */
    @JSImport("rfc6902/pointer", "Pointer.fromJSON")
    @js.native
    def fromJSON(path: String): Pointer = js.native
  }
  
  @js.native
  trait PointerEvaluation extends StObject {
    
    var key: String = js.native
    
    var parent: js.Any = js.native
    
    var value: js.Any = js.native
  }
  object PointerEvaluation {
    
    @scala.inline
    def apply(key: String, parent: js.Any, value: js.Any): PointerEvaluation = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[PointerEvaluation]
    }
    
    @scala.inline
    implicit class PointerEvaluationMutableBuilder[Self <: PointerEvaluation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParent(value: js.Any): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
