package typingsSlinky.classValidator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object validationArgumentsMod {
  
  @js.native
  trait ValidationArguments extends StObject {
    
    /**
      * Constraints set by this validation type.
      */
    var constraints: js.Array[_] = js.native
    
    /**
      * Object that is being validated.
      */
    var `object`: js.Object = js.native
    
    /**
      * Name of the object's property being validated.
      */
    var property: String = js.native
    
    /**
      * Name of the target that is being validated.
      */
    var targetName: String = js.native
    
    /**
      * Validating value.
      */
    var value: js.Any = js.native
  }
  object ValidationArguments {
    
    @scala.inline
    def apply(constraints: js.Array[_], `object`: js.Object, property: String, targetName: String, value: js.Any): ValidationArguments = {
      val __obj = js.Dynamic.literal(constraints = constraints.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], targetName = targetName.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValidationArguments]
    }
    
    @scala.inline
    implicit class ValidationArgumentsMutableBuilder[Self <: ValidationArguments] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConstraints(value: js.Array[_]): Self = StObject.set(x, "constraints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConstraintsVarargs(value: js.Any*): Self = StObject.set(x, "constraints", js.Array(value :_*))
      
      @scala.inline
      def setObject(value: js.Object): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetName(value: String): Self = StObject.set(x, "targetName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
