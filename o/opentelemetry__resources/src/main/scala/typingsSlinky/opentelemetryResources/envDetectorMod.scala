package typingsSlinky.opentelemetryResources

import typingsSlinky.opentelemetryResources.configMod.ResourceDetectionConfigWithLogger
import typingsSlinky.opentelemetryResources.resourceMod.Resource
import typingsSlinky.opentelemetryResources.typesMod.Detector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object envDetectorMod {
  
  @JSImport("@opentelemetry/resources/build/src/platform/node/detectors/EnvDetector", "envDetector")
  @js.native
  val envDetector: EnvDetector_ = js.native
  
  /**
    * EnvDetector can be used to detect the presence of and create a Resource
    * from the OTEL_RESOURCE_ATTRIBUTES environment variable.
    */
  @js.native
  trait EnvDetector_ extends Detector {
    
    val _COMMA_SEPARATOR: js.Any = js.native
    
    val _ERROR_MESSAGE_INVALID_CHARS: js.Any = js.native
    
    val _ERROR_MESSAGE_INVALID_VALUE: js.Any = js.native
    
    val _LABEL_KEY_VALUE_SPLITTER: js.Any = js.native
    
    val _MAX_LENGTH: js.Any = js.native
    
    var _isPrintableString: js.Any = js.native
    
    /**
      * Determines whether the given String is a valid printable ASCII string with
      * a length not exceed _MAX_LENGTH characters.
      *
      * @param str The String to be validated.
      * @returns Whether the String is valid.
      */
    var _isValid: js.Any = js.native
    
    /**
      * Determines whether the given String is a valid printable ASCII string with
      * a length greater than 0 and not exceed _MAX_LENGTH characters.
      *
      * @param str The String to be validated.
      * @returns Whether the String is valid and not empty.
      */
    var _isValidAndNotEmpty: js.Any = js.native
    
    /**
      * Creates an attribute map from the OTEL_RESOURCE_ATTRIBUTES environment
      * variable.
      *
      * OTEL_RESOURCE_ATTRIBUTES: A comma-separated list of attributes describing
      * the source in more detail, e.g. “key1=val1,key2=val2”. Domain names and
      * paths are accepted as attribute keys. Values may be quoted or unquoted in
      * general. If a value contains whitespaces, =, or " characters, it must
      * always be quoted.
      *
      * @param rawEnvAttributes The resource attributes as a comma-seperated list
      * of key/value pairs.
      * @returns The sanitized resource attributes.
      */
    var _parseResourceAttributes: js.Any = js.native
  }
  object EnvDetector_ {
    
    @scala.inline
    def apply(
      _COMMA_SEPARATOR: js.Any,
      _ERROR_MESSAGE_INVALID_CHARS: js.Any,
      _ERROR_MESSAGE_INVALID_VALUE: js.Any,
      _LABEL_KEY_VALUE_SPLITTER: js.Any,
      _MAX_LENGTH: js.Any,
      _isPrintableString: js.Any,
      _isValid: js.Any,
      _isValidAndNotEmpty: js.Any,
      _parseResourceAttributes: js.Any,
      detect: ResourceDetectionConfigWithLogger => js.Promise[Resource]
    ): EnvDetector_ = {
      val __obj = js.Dynamic.literal(_COMMA_SEPARATOR = _COMMA_SEPARATOR.asInstanceOf[js.Any], _ERROR_MESSAGE_INVALID_CHARS = _ERROR_MESSAGE_INVALID_CHARS.asInstanceOf[js.Any], _ERROR_MESSAGE_INVALID_VALUE = _ERROR_MESSAGE_INVALID_VALUE.asInstanceOf[js.Any], _LABEL_KEY_VALUE_SPLITTER = _LABEL_KEY_VALUE_SPLITTER.asInstanceOf[js.Any], _MAX_LENGTH = _MAX_LENGTH.asInstanceOf[js.Any], _isPrintableString = _isPrintableString.asInstanceOf[js.Any], _isValid = _isValid.asInstanceOf[js.Any], _isValidAndNotEmpty = _isValidAndNotEmpty.asInstanceOf[js.Any], _parseResourceAttributes = _parseResourceAttributes.asInstanceOf[js.Any], detect = js.Any.fromFunction1(detect))
      __obj.asInstanceOf[EnvDetector_]
    }
    
    @scala.inline
    implicit class EnvDetector_MutableBuilder[Self <: EnvDetector_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set_COMMA_SEPARATOR(value: js.Any): Self = StObject.set(x, "_COMMA_SEPARATOR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_ERROR_MESSAGE_INVALID_CHARS(value: js.Any): Self = StObject.set(x, "_ERROR_MESSAGE_INVALID_CHARS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_ERROR_MESSAGE_INVALID_VALUE(value: js.Any): Self = StObject.set(x, "_ERROR_MESSAGE_INVALID_VALUE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_LABEL_KEY_VALUE_SPLITTER(value: js.Any): Self = StObject.set(x, "_LABEL_KEY_VALUE_SPLITTER", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_MAX_LENGTH(value: js.Any): Self = StObject.set(x, "_MAX_LENGTH", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_isPrintableString(value: js.Any): Self = StObject.set(x, "_isPrintableString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_isValid(value: js.Any): Self = StObject.set(x, "_isValid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_isValidAndNotEmpty(value: js.Any): Self = StObject.set(x, "_isValidAndNotEmpty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_parseResourceAttributes(value: js.Any): Self = StObject.set(x, "_parseResourceAttributes", value.asInstanceOf[js.Any])
    }
  }
}
