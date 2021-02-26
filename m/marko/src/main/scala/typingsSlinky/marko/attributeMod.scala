package typingsSlinky.marko

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object attributeMod {
  
  @JSImport("marko/src/compiler/taglib-loader/Attribute", JSImport.Default)
  @js.native
  class default () extends Attribute
  
  @js.native
  trait Attribute extends StObject {
    
    var allowExpressions: Boolean = js.native
    
    var autocomplete: Boolean = js.native
    
    var defaultValue: String = js.native
    
    var deprecated: js.Any = js.native
    
    var dynamicAttribute: Boolean = js.native
    
    var enum: js.Any = js.native
    
    var filePath: String = js.native
    
    var html: Boolean = js.native
    
    var ignore: Boolean = js.native
    
    var key: String = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var pattern: js.UndefOr[js.Any] = js.native
    
    var preserveName: js.UndefOr[String] = js.native
    
    var ref: js.UndefOr[String] = js.native
    
    var removeDashes: Boolean = js.native
    
    var required: Boolean = js.native
    
    var setContextFlag: String = js.native
    
    var setFlag: String | Null = js.native
    
    var targetProperty: String | Null = js.native
    
    var `type`: String | Null = js.native
  }
  object Attribute {
    
    @scala.inline
    def apply(
      allowExpressions: Boolean,
      autocomplete: Boolean,
      defaultValue: String,
      deprecated: js.Any,
      dynamicAttribute: Boolean,
      enum: js.Any,
      filePath: String,
      html: Boolean,
      ignore: Boolean,
      key: String,
      removeDashes: Boolean,
      required: Boolean,
      setContextFlag: String
    ): Attribute = {
      val __obj = js.Dynamic.literal(allowExpressions = allowExpressions.asInstanceOf[js.Any], autocomplete = autocomplete.asInstanceOf[js.Any], defaultValue = defaultValue.asInstanceOf[js.Any], deprecated = deprecated.asInstanceOf[js.Any], dynamicAttribute = dynamicAttribute.asInstanceOf[js.Any], enum = enum.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], ignore = ignore.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], removeDashes = removeDashes.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], setContextFlag = setContextFlag.asInstanceOf[js.Any])
      __obj.asInstanceOf[Attribute]
    }
    
    @scala.inline
    implicit class AttributeMutableBuilder[Self <: Attribute] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowExpressions(value: Boolean): Self = StObject.set(x, "allowExpressions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutocomplete(value: Boolean): Self = StObject.set(x, "autocomplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeprecated(value: js.Any): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDynamicAttribute(value: Boolean): Self = StObject.set(x, "dynamicAttribute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnum(value: js.Any): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtml(value: Boolean): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnore(value: Boolean): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPattern(value: js.Any): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      @scala.inline
      def setPreserveName(value: String): Self = StObject.set(x, "preserveName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveNameUndefined: Self = StObject.set(x, "preserveName", js.undefined)
      
      @scala.inline
      def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      @scala.inline
      def setRemoveDashes(value: Boolean): Self = StObject.set(x, "removeDashes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetContextFlag(value: String): Self = StObject.set(x, "setContextFlag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetFlag(value: String): Self = StObject.set(x, "setFlag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetFlagNull: Self = StObject.set(x, "setFlag", null)
      
      @scala.inline
      def setTargetProperty(value: String): Self = StObject.set(x, "targetProperty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetPropertyNull: Self = StObject.set(x, "targetProperty", null)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeNull: Self = StObject.set(x, "type", null)
    }
  }
}
