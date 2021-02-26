package typingsSlinky.jsmediatags

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stringUtilsMod {
  
  @JSImport("jsmediatags/build2/StringUtils", JSImport.Default)
  @js.native
  class default protected () extends InternalDecodedString {
    def this(value: String, bytesReadCount: Double) = this()
  }
  
  type DecodedString = InternalDecodedString
  
  @js.native
  trait InternalDecodedString extends StObject {
    
    var _value: String = js.native
    
    var bytesReadCount: Double = js.native
    
    var length: Double = js.native
  }
  object InternalDecodedString {
    
    @scala.inline
    def apply(_value: String, bytesReadCount: Double, length: Double): InternalDecodedString = {
      val __obj = js.Dynamic.literal(_value = _value.asInstanceOf[js.Any], bytesReadCount = bytesReadCount.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[InternalDecodedString]
    }
    
    @scala.inline
    implicit class InternalDecodedStringMutableBuilder[Self <: InternalDecodedString] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBytesReadCount(value: Double): Self = StObject.set(x, "bytesReadCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_value(value: String): Self = StObject.set(x, "_value", value.asInstanceOf[js.Any])
    }
  }
}
