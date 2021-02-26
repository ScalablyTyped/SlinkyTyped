package typingsSlinky.fridaGum.Java

import typingsSlinky.fridaGum.NativePointerValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Type extends StObject {
  
  /**
    * Size in bytes.
    */
  var byteSize: Double = js.native
  
  /**
    * Class name, if applicable.
    */
  var className: js.UndefOr[String] = js.native
  
  /**
    * Converts `value` from a JNI value to a JavaScript value.
    */
  var fromJni: js.UndefOr[js.Function1[/* value */ js.Any, _]] = js.native
  
  /**
    * Checks whether a given JavaScript `value` is compatible.
    */
  def isCompatible(value: js.Any): Boolean = js.native
  
  /**
    * VM type name. For example `I` for `int`.
    */
  var name: String = js.native
  
  /**
    * Reads a value from memory.
    */
  var read: js.UndefOr[js.Function1[/* address */ NativePointerValue, _]] = js.native
  
  /**
    * Size in words.
    */
  var size: Double = js.native
  
  /**
    * Converts `value` from a JavaScript value to a JNI value.
    */
  var toJni: js.UndefOr[js.Function1[/* value */ js.Any, _]] = js.native
  
  /**
    * Frida type name. For example `pointer` for a handle.
    */
  var `type`: String = js.native
  
  /**
    * Writes a value to memory.
    */
  var write: js.UndefOr[js.Function2[/* address */ NativePointerValue, /* value */ js.Any, Unit]] = js.native
}
object Type {
  
  @scala.inline
  def apply(byteSize: Double, isCompatible: js.Any => Boolean, name: String, size: Double, `type`: String): Type = {
    val __obj = js.Dynamic.literal(byteSize = byteSize.asInstanceOf[js.Any], isCompatible = js.Any.fromFunction1(isCompatible), name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  
  @scala.inline
  implicit class TypeMutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setByteSize(value: Double): Self = StObject.set(x, "byteSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setFromJni(value: /* value */ js.Any => _): Self = StObject.set(x, "fromJni", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFromJniUndefined: Self = StObject.set(x, "fromJni", js.undefined)
    
    @scala.inline
    def setIsCompatible(value: js.Any => Boolean): Self = StObject.set(x, "isCompatible", js.Any.fromFunction1(value))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRead(value: /* address */ NativePointerValue => _): Self = StObject.set(x, "read", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToJni(value: /* value */ js.Any => _): Self = StObject.set(x, "toJni", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToJniUndefined: Self = StObject.set(x, "toJni", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrite(value: (/* address */ NativePointerValue, /* value */ js.Any) => Unit): Self = StObject.set(x, "write", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWriteUndefined: Self = StObject.set(x, "write", js.undefined)
  }
}
