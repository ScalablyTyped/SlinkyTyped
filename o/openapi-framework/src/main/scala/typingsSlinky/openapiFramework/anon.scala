package typingsSlinky.openapiFramework

import typingsSlinky.openapiDefaultSetter.mod.IOpenAPIDefaultSetter
import typingsSlinky.openapiRequestCoercer.mod.IOpenAPIRequestCoercer
import typingsSlinky.openapiRequestValidator.mod.IOpenAPIRequestValidator
import typingsSlinky.openapiResponseValidator.mod.IOpenAPIResponseValidator
import typingsSlinky.openapiSecurityHandler.mod.IOpenAPISecurityHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Coercer extends StObject {
    
    var coercer: js.UndefOr[IOpenAPIRequestCoercer] = js.native
    
    var defaultSetter: js.UndefOr[IOpenAPIDefaultSetter] = js.native
    
    var requestValidator: js.UndefOr[IOpenAPIRequestValidator] = js.native
    
    var responseValidator: js.UndefOr[IOpenAPIResponseValidator] = js.native
    
    var securityHandler: js.UndefOr[IOpenAPISecurityHandler] = js.native
  }
  object Coercer {
    
    @scala.inline
    def apply(): Coercer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Coercer]
    }
    
    @scala.inline
    implicit class CoercerMutableBuilder[Self <: Coercer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCoercer(value: IOpenAPIRequestCoercer): Self = StObject.set(x, "coercer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoercerUndefined: Self = StObject.set(x, "coercer", js.undefined)
      
      @scala.inline
      def setDefaultSetter(value: IOpenAPIDefaultSetter): Self = StObject.set(x, "defaultSetter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultSetterUndefined: Self = StObject.set(x, "defaultSetter", js.undefined)
      
      @scala.inline
      def setRequestValidator(value: IOpenAPIRequestValidator): Self = StObject.set(x, "requestValidator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestValidatorUndefined: Self = StObject.set(x, "requestValidator", js.undefined)
      
      @scala.inline
      def setResponseValidator(value: IOpenAPIResponseValidator): Self = StObject.set(x, "responseValidator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseValidatorUndefined: Self = StObject.set(x, "responseValidator", js.undefined)
      
      @scala.inline
      def setSecurityHandler(value: IOpenAPISecurityHandler): Self = StObject.set(x, "securityHandler", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityHandlerUndefined: Self = StObject.set(x, "securityHandler", js.undefined)
    }
  }
  
  @js.native
  trait Enum extends StObject {
    
    var enum: js.Array[String] = js.native
  }
  object Enum {
    
    @scala.inline
    def apply(enum: js.Array[String]): Enum = {
      val __obj = js.Dynamic.literal(enum = enum.asInstanceOf[js.Any])
      __obj.asInstanceOf[Enum]
    }
    
    @scala.inline
    implicit class EnumMutableBuilder[Self <: Enum] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnum(value: js.Array[String]): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnumVarargs(value: String*): Self = StObject.set(x, "enum", js.Array(value :_*))
    }
  }
}
