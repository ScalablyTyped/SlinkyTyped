package typingsSlinky.connectBusboy

import typingsSlinky.busboy.busboy.Busboy
import typingsSlinky.busboy.busboy.BusboyConfig
import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("connect-busboy", JSImport.Namespace)
  @js.native
  def apply(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  @JSImport("connect-busboy", JSImport.Namespace)
  @js.native
  def apply(options: ConnectBusboyOptions): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  
  @js.native
  trait ConnectBusboyOptions extends BusboyConfig {
    
    var immediate: js.UndefOr[Boolean] = js.native
  }
  object ConnectBusboyOptions {
    
    @scala.inline
    def apply(): ConnectBusboyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectBusboyOptions]
    }
    
    @scala.inline
    implicit class ConnectBusboyOptionsMutableBuilder[Self <: ConnectBusboyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setImmediate(value: Boolean): Self = StObject.set(x, "immediate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImmediateUndefined: Self = StObject.set(x, "immediate", js.undefined)
    }
  }
  
  object global {
    
    object Express {
      
      @js.native
      trait Request extends StObject {
        
        var busboy: Busboy = js.native
      }
      object Request {
        
        @scala.inline
        def apply(busboy: Busboy): Request = {
          val __obj = js.Dynamic.literal(busboy = busboy.asInstanceOf[js.Any])
          __obj.asInstanceOf[Request]
        }
        
        @scala.inline
        implicit class RequestMutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setBusboy(value: Busboy): Self = StObject.set(x, "busboy", value.asInstanceOf[js.Any])
        }
      }
    }
  }
}
