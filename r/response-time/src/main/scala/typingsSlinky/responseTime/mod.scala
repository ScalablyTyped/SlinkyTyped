package typingsSlinky.responseTime

import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.express.mod.Request_
import typingsSlinky.express.mod.Response_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Response time header for node.js
    * Returns middleware that adds a X-Response-Time header to responses.
    */
  @JSImport("response-time", JSImport.Namespace)
  @js.native
  def apply(): js.Function3[
    /* request */ IncomingMessage, 
    /* response */ ServerResponse, 
    /* callback */ js.Function1[/* err */ js.Any, Unit], 
    _
  ] = js.native
  @JSImport("response-time", JSImport.Namespace)
  @js.native
  def apply(
    fn: js.Function3[
      /* request */ Request_[ParamsDictionary, _, _, Query], 
      /* response */ Response_[_], 
      /* time */ Double, 
      _
    ]
  ): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  @JSImport("response-time", JSImport.Namespace)
  @js.native
  def apply(options: ResponseTimeOptions): js.Function3[
    /* request */ IncomingMessage, 
    /* response */ ServerResponse, 
    /* callback */ js.Function1[/* err */ js.Any, Unit], 
    _
  ] = js.native
  
  type ResponseTimeFunction = js.Function3[
    /* request */ IncomingMessage, 
    /* response */ ServerResponse, 
    /* time */ Double, 
    js.Any
  ]
  
  @js.native
  trait ResponseTimeOptions extends StObject {
    
    var digits: js.UndefOr[Double] = js.native
    
    var header: js.UndefOr[String] = js.native
    
    var suffix: js.UndefOr[Boolean] = js.native
  }
  object ResponseTimeOptions {
    
    @scala.inline
    def apply(): ResponseTimeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResponseTimeOptions]
    }
    
    @scala.inline
    implicit class ResponseTimeOptionsMutableBuilder[Self <: ResponseTimeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDigits(value: Double): Self = StObject.set(x, "digits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDigitsUndefined: Self = StObject.set(x, "digits", js.undefined)
      
      @scala.inline
      def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setSuffix(value: Boolean): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
    }
  }
}
