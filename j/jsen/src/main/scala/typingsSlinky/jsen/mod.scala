package typingsSlinky.jsen

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("jsen", JSImport.Namespace)
  @js.native
  val ^ : JsenMain = js.native
  
  @js.native
  trait JsenBuildSettings extends StObject {
    
    var additionalProperties: js.UndefOr[Boolean] = js.native
    
    var copy: js.UndefOr[Boolean] = js.native
  }
  object JsenBuildSettings {
    
    @scala.inline
    def apply(): JsenBuildSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JsenBuildSettings]
    }
    
    @scala.inline
    implicit class JsenBuildSettingsMutableBuilder[Self <: JsenBuildSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdditionalProperties(value: Boolean): Self = StObject.set(x, "additionalProperties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdditionalPropertiesUndefined: Self = StObject.set(x, "additionalProperties", js.undefined)
      
      @scala.inline
      def setCopy(value: Boolean): Self = StObject.set(x, "copy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCopyUndefined: Self = StObject.set(x, "copy", js.undefined)
    }
  }
  
  type JsenFormats = StringDictionary[String | js.RegExp | js.Function]
  
  @js.native
  trait JsenMain extends StObject {
    
    def apply(): JsenValidator = js.native
    def apply(schema: js.UndefOr[scala.Nothing], options: JsenSettings): JsenValidator = js.native
    def apply(schema: js.Any): JsenValidator = js.native
    def apply(schema: js.Any, options: JsenSettings): JsenValidator = js.native
    
    def clone(data: js.Any): js.Any = js.native
    
    def equal(a: js.Any, b: js.Any): Boolean = js.native
    
    def unique(array: js.Array[_]): Boolean = js.native
    @JSName("unique")
    var unique_Original: JsenUnique = js.native
  }
  
  @js.native
  trait JsenSettings extends StObject {
    
    var formats: js.UndefOr[JsenFormats] = js.native
    
    var greedy: js.UndefOr[Boolean] = js.native
    
    @JSName("missing$Ref")
    var missing$Ref: js.UndefOr[Boolean] = js.native
    
    var schemas: js.UndefOr[js.Any] = js.native
  }
  object JsenSettings {
    
    @scala.inline
    def apply(): JsenSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JsenSettings]
    }
    
    @scala.inline
    implicit class JsenSettingsMutableBuilder[Self <: JsenSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormats(value: JsenFormats): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatsUndefined: Self = StObject.set(x, "formats", js.undefined)
      
      @scala.inline
      def setGreedy(value: Boolean): Self = StObject.set(x, "greedy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGreedyUndefined: Self = StObject.set(x, "greedy", js.undefined)
      
      @scala.inline
      def setMissing$Ref(value: Boolean): Self = StObject.set(x, "missing$Ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMissing$RefUndefined: Self = StObject.set(x, "missing$Ref", js.undefined)
      
      @scala.inline
      def setSchemas(value: js.Any): Self = StObject.set(x, "schemas", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchemasUndefined: Self = StObject.set(x, "schemas", js.undefined)
    }
  }
  
  @js.native
  trait JsenUnique extends StObject {
    
    def apply(array: js.Array[_]): Boolean = js.native
    
    def findIndex(
      array: js.Array[_],
      value: js.Any,
      comparator: js.Function2[/* obj1 */ js.Any, /* obj2 */ js.Any, Boolean]
    ): Double = js.native
  }
  
  @js.native
  trait JsenValidateError extends StObject {
    
    var keyword: String = js.native
    
    var message: js.UndefOr[String] = js.native
    
    var path: String = js.native
  }
  object JsenValidateError {
    
    @scala.inline
    def apply(keyword: String, path: String): JsenValidateError = {
      val __obj = js.Dynamic.literal(keyword = keyword.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[JsenValidateError]
    }
    
    @scala.inline
    implicit class JsenValidateErrorMutableBuilder[Self <: JsenValidateError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKeyword(value: String): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait JsenValidator extends StObject {
    
    def apply(): Boolean = js.native
    def apply(data: js.Any): Boolean = js.native
    
    def build(): js.Any = js.native
    def build(initial: js.UndefOr[scala.Nothing], options: JsenBuildSettings): js.Any = js.native
    def build(initial: js.Any): js.Any = js.native
    def build(initial: js.Any, options: JsenBuildSettings): js.Any = js.native
    
    var errors: js.Array[JsenValidateError] = js.native
  }
  
  type _To = JsenMain
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: JsenMain = ^
}
