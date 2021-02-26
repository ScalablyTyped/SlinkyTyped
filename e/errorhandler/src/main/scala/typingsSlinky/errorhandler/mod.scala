package typingsSlinky.errorhandler

import typingsSlinky.express.mod.ErrorRequestHandler
import typingsSlinky.express.mod.Request_
import typingsSlinky.express.mod.Response_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Create new middleware to handle errors and respond with content negotiation.
    */
  @JSImport("errorhandler", JSImport.Namespace)
  @js.native
  def apply(): ErrorRequestHandler[ParamsDictionary, _, _, Query] = js.native
  @JSImport("errorhandler", JSImport.Namespace)
  @js.native
  def apply(options: Options): ErrorRequestHandler[ParamsDictionary, _, _, Query] = js.native
  
  /**
    * Template title, framework authors may override this value.
    */
  @JSImport("errorhandler", "title")
  @js.native
  val title: String = js.native
  
  type LoggingCallback = js.Function4[
    /* err */ js.Error, 
    /* str */ String, 
    /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    /* res */ Response_[js.Any], 
    Unit
  ]
  
  @js.native
  trait Options extends StObject {
    
    /**
      * Provide a function to be called with the error and a string representation of the erro
      * Defaults to true.
      *
      * Possible values:
      *   true       : Log errors using console.error(str).
      *   false      : Only send the error back in the response.
      *   A function : pass the error to a function for handling.
      */
    var log: Boolean | LoggingCallback = js.native
  }
  object Options {
    
    @scala.inline
    def apply(log: Boolean | LoggingCallback): Options = {
      val __obj = js.Dynamic.literal(log = log.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLog(value: Boolean | LoggingCallback): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogFunction4(
        value: (/* err */ js.Error, /* str */ String, /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], /* res */ Response_[js.Any]) => Unit
      ): Self = StObject.set(x, "log", js.Any.fromFunction4(value))
    }
  }
}
