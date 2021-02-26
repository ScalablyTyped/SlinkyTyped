package typingsSlinky.opentelemetryApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exceptionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.opentelemetryApi.exceptionMod.ExceptionWithCode
    - typingsSlinky.opentelemetryApi.exceptionMod.ExceptionWithMessage
    - typingsSlinky.opentelemetryApi.exceptionMod.ExceptionWithName
    - java.lang.String
  */
  type Exception = _Exception | String
  
  @js.native
  trait ExceptionWithCode extends _Exception {
    
    var code: String = js.native
    
    var message: js.UndefOr[String] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var stack: js.UndefOr[String] = js.native
  }
  object ExceptionWithCode {
    
    @scala.inline
    def apply(code: String): ExceptionWithCode = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExceptionWithCode]
    }
    
    @scala.inline
    implicit class ExceptionWithCodeMutableBuilder[Self <: ExceptionWithCode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    }
  }
  
  @js.native
  trait ExceptionWithMessage extends _Exception {
    
    var code: js.UndefOr[String] = js.native
    
    var message: String = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var stack: js.UndefOr[String] = js.native
  }
  object ExceptionWithMessage {
    
    @scala.inline
    def apply(message: String): ExceptionWithMessage = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExceptionWithMessage]
    }
    
    @scala.inline
    implicit class ExceptionWithMessageMutableBuilder[Self <: ExceptionWithMessage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    }
  }
  
  @js.native
  trait ExceptionWithName extends _Exception {
    
    var code: js.UndefOr[String] = js.native
    
    var message: js.UndefOr[String] = js.native
    
    var name: String = js.native
    
    var stack: js.UndefOr[String] = js.native
  }
  object ExceptionWithName {
    
    @scala.inline
    def apply(name: String): ExceptionWithName = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExceptionWithName]
    }
    
    @scala.inline
    implicit class ExceptionWithNameMutableBuilder[Self <: ExceptionWithName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    }
  }
  
  trait _Exception extends StObject
  object _Exception {
    
    @scala.inline
    def ExceptionWithCode(code: String): typingsSlinky.opentelemetryApi.exceptionMod.ExceptionWithCode = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.opentelemetryApi.exceptionMod.ExceptionWithCode]
    }
    
    @scala.inline
    def ExceptionWithMessage(message: String): typingsSlinky.opentelemetryApi.exceptionMod.ExceptionWithMessage = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.opentelemetryApi.exceptionMod.ExceptionWithMessage]
    }
    
    @scala.inline
    def ExceptionWithName(name: String): typingsSlinky.opentelemetryApi.exceptionMod.ExceptionWithName = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.opentelemetryApi.exceptionMod.ExceptionWithName]
    }
  }
}
