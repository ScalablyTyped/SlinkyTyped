package typingsSlinky.jjv

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.jjv.anon.Required
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jjv", JSImport.Namespace)
  @js.native
  def apply(): Env = js.native
  
  @js.native
  trait Env extends StObject {
    
    def addCheck(name: String, check: js.Function2[/* input */ js.Any, /* comparator */ js.Any, _]): Unit = js.native
    
    def addFormat(name: String, parse: js.Function1[/* input */ js.Any, _]): Unit = js.native
    
    def addSchema(name: String, schema: js.Object): Unit = js.native
    
    def addType(name: String, parse: js.Function1[/* input */ js.Any, _]): Unit = js.native
    
    def addTypeCoercion(name: String, coerce: js.Function1[/* input */ js.Any, _]): Unit = js.native
    
    var defaultOptions: Options = js.native
    
    def validate(name: String, `object`: js.Any): Errors = js.native
    def validate(name: String, `object`: js.Any, options: Options): Errors = js.native
    def validate(schema: js.Object, `object`: js.Any): Errors = js.native
    def validate(schema: js.Object, `object`: js.Any, options: Options): Errors = js.native
  }
  
  @js.native
  trait Errors extends StObject {
    
    var validation: StringDictionary[Required] = js.native
  }
  object Errors {
    
    @scala.inline
    def apply(validation: StringDictionary[Required]): Errors = {
      val __obj = js.Dynamic.literal(validation = validation.asInstanceOf[js.Any])
      __obj.asInstanceOf[Errors]
    }
    
    @scala.inline
    implicit class ErrorsMutableBuilder[Self <: Errors] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValidation(value: StringDictionary[Required]): Self = StObject.set(x, "validation", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    var checkRequired: js.UndefOr[Boolean] = js.native
    
    var removeAdditional: js.UndefOr[Boolean] = js.native
    
    var useCoerce: js.UndefOr[Boolean] = js.native
    
    var useDefault: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCheckRequired(value: Boolean): Self = StObject.set(x, "checkRequired", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckRequiredUndefined: Self = StObject.set(x, "checkRequired", js.undefined)
      
      @scala.inline
      def setRemoveAdditional(value: Boolean): Self = StObject.set(x, "removeAdditional", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveAdditionalUndefined: Self = StObject.set(x, "removeAdditional", js.undefined)
      
      @scala.inline
      def setUseCoerce(value: Boolean): Self = StObject.set(x, "useCoerce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseCoerceUndefined: Self = StObject.set(x, "useCoerce", js.undefined)
      
      @scala.inline
      def setUseDefault(value: Boolean): Self = StObject.set(x, "useDefault", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseDefaultUndefined: Self = StObject.set(x, "useDefault", js.undefined)
    }
  }
}
