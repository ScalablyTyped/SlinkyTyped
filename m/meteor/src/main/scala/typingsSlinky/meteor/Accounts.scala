package typingsSlinky.meteor

import typingsSlinky.meteor.Meteor.Connection
import typingsSlinky.meteor.Meteor.Error
import typingsSlinky.meteor.Meteor.User
import typingsSlinky.meteor.anon.Digest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Accounts {
  
  @js.native
  trait IValidateLoginAttemptCbOpts extends StObject {
    
    var allowed: Boolean = js.native
    
    var connection: Connection = js.native
    
    var error: Error = js.native
    
    var methodArguments: js.Array[_] = js.native
    
    var methodName: String = js.native
    
    var `type`: String = js.native
    
    var user: User = js.native
  }
  object IValidateLoginAttemptCbOpts {
    
    @scala.inline
    def apply(
      allowed: Boolean,
      connection: Connection,
      error: Error,
      methodArguments: js.Array[_],
      methodName: String,
      `type`: String,
      user: User
    ): IValidateLoginAttemptCbOpts = {
      val __obj = js.Dynamic.literal(allowed = allowed.asInstanceOf[js.Any], connection = connection.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], methodArguments = methodArguments.asInstanceOf[js.Any], methodName = methodName.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IValidateLoginAttemptCbOpts]
    }
    
    @scala.inline
    implicit class IValidateLoginAttemptCbOptsMutableBuilder[Self <: IValidateLoginAttemptCbOpts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowed(value: Boolean): Self = StObject.set(x, "allowed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnection(value: Connection): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodArguments(value: js.Array[_]): Self = StObject.set(x, "methodArguments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodArgumentsVarargs(value: js.Any*): Self = StObject.set(x, "methodArguments", js.Array(value :_*))
      
      @scala.inline
      def setMethodName(value: String): Self = StObject.set(x, "methodName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LoginMethodOptions extends StObject {
    
    /**
      * The arguments for the method
      */
    var methodArguments: js.UndefOr[js.Array[_]] = js.native
    
    /**
      * The method to call (default 'login')
      */
    var methodName: js.UndefOr[String] = js.native
    
    /**
      * Will be called with no arguments once the user is fully
      * logged in, or with the error on error.
      */
    var userCallback: js.UndefOr[js.Function1[/* err */ js.UndefOr[js.Any], Unit]] = js.native
    
    /**
      * If provided, will be called with the result of the
      * method. If it throws, the client will not be logged in (and
      * its error will be passed to the callback).
      */
    var validateResult: js.UndefOr[js.Function] = js.native
  }
  object LoginMethodOptions {
    
    @scala.inline
    def apply(): LoginMethodOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoginMethodOptions]
    }
    
    @scala.inline
    implicit class LoginMethodOptionsMutableBuilder[Self <: LoginMethodOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMethodArguments(value: js.Array[_]): Self = StObject.set(x, "methodArguments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodArgumentsUndefined: Self = StObject.set(x, "methodArguments", js.undefined)
      
      @scala.inline
      def setMethodArgumentsVarargs(value: js.Any*): Self = StObject.set(x, "methodArguments", js.Array(value :_*))
      
      @scala.inline
      def setMethodName(value: String): Self = StObject.set(x, "methodName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodNameUndefined: Self = StObject.set(x, "methodName", js.undefined)
      
      @scala.inline
      def setUserCallback(value: /* err */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "userCallback", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUserCallbackUndefined: Self = StObject.set(x, "userCallback", js.undefined)
      
      @scala.inline
      def setValidateResult(value: js.Function): Self = StObject.set(x, "validateResult", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidateResultUndefined: Self = StObject.set(x, "validateResult", js.undefined)
    }
  }
  
  type Password = String | Digest
}
