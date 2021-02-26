package typingsSlinky.bleno

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait TypeofCharacteristic extends StObject {
    
    /* static member */
    val RESULT_ATTR_NOT_LONG: Double = js.native
    
    /* static member */
    val RESULT_INVALID_ATTRIBUTE_LENGTH: Double = js.native
    
    /* static member */
    val RESULT_INVALID_OFFSET: Double = js.native
    
    /* static member */
    val RESULT_SUCCESS: Double = js.native
    
    /* static member */
    val RESULT_UNLIKELY_ERROR: Double = js.native
  }
  object TypeofCharacteristic {
    
    @scala.inline
    def apply(
      RESULT_ATTR_NOT_LONG: Double,
      RESULT_INVALID_ATTRIBUTE_LENGTH: Double,
      RESULT_INVALID_OFFSET: Double,
      RESULT_SUCCESS: Double,
      RESULT_UNLIKELY_ERROR: Double
    ): TypeofCharacteristic = {
      val __obj = js.Dynamic.literal(RESULT_ATTR_NOT_LONG = RESULT_ATTR_NOT_LONG.asInstanceOf[js.Any], RESULT_INVALID_ATTRIBUTE_LENGTH = RESULT_INVALID_ATTRIBUTE_LENGTH.asInstanceOf[js.Any], RESULT_INVALID_OFFSET = RESULT_INVALID_OFFSET.asInstanceOf[js.Any], RESULT_SUCCESS = RESULT_SUCCESS.asInstanceOf[js.Any], RESULT_UNLIKELY_ERROR = RESULT_UNLIKELY_ERROR.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeofCharacteristic]
    }
    
    @scala.inline
    implicit class TypeofCharacteristicMutableBuilder[Self <: TypeofCharacteristic] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRESULT_ATTR_NOT_LONG(value: Double): Self = StObject.set(x, "RESULT_ATTR_NOT_LONG", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRESULT_INVALID_ATTRIBUTE_LENGTH(value: Double): Self = StObject.set(x, "RESULT_INVALID_ATTRIBUTE_LENGTH", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRESULT_INVALID_OFFSET(value: Double): Self = StObject.set(x, "RESULT_INVALID_OFFSET", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRESULT_SUCCESS(value: Double): Self = StObject.set(x, "RESULT_SUCCESS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRESULT_UNLIKELY_ERROR(value: Double): Self = StObject.set(x, "RESULT_UNLIKELY_ERROR", value.asInstanceOf[js.Any])
    }
  }
}
