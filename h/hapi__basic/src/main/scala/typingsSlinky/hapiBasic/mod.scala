package typingsSlinky.hapiBasic

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.hapiHapi.mod.Plugin
import typingsSlinky.hapiHapi.mod.Request
import typingsSlinky.hapiHapi.mod.ResponseToolkit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("@hapi/basic", JSImport.Namespace)
  @js.native
  val ^ : Plugin[js.Object] = js.native
  
  type Validate = js.Function4[
    /* request */ Request, 
    /* username */ String, 
    /* password */ String, 
    /* h */ ResponseToolkit, 
    js.Promise[ValidateResponse | ValidateCustomResponse]
  ]
  
  @js.native
  trait ValidateCustomResponse extends StObject {
    
    var response: js.Any = js.native
  }
  object ValidateCustomResponse {
    
    @scala.inline
    def apply(response: js.Any): ValidateCustomResponse = {
      val __obj = js.Dynamic.literal(response = response.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValidateCustomResponse]
    }
    
    @scala.inline
    implicit class ValidateCustomResponseMutableBuilder[Self <: ValidateCustomResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setResponse(value: js.Any): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ValidateResponse extends StObject {
    
    var credentials: js.UndefOr[js.Any] = js.native
    
    var isValid: Boolean = js.native
  }
  object ValidateResponse {
    
    @scala.inline
    def apply(isValid: Boolean): ValidateResponse = {
      val __obj = js.Dynamic.literal(isValid = isValid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValidateResponse]
    }
    
    @scala.inline
    implicit class ValidateResponseMutableBuilder[Self <: ValidateResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCredentials(value: js.Any): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
      
      @scala.inline
      def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Plugin[js.Object]
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Plugin[js.Object] = ^
}
