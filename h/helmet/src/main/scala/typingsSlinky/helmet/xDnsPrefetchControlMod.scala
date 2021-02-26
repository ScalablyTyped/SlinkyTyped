package typingsSlinky.helmet

import typingsSlinky.helmet.anon.ReadonlyXDnsPrefetchContr
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xDnsPrefetchControlMod {
  
  @JSImport("helmet/dist/middlewares/x-dns-prefetch-control", JSImport.Default)
  @js.native
  def default(): js.Function3[
    /* _req */ IncomingMessage, 
    /* res */ ServerResponse, 
    /* next */ js.Function0[Unit], 
    Unit
  ] = js.native
  @JSImport("helmet/dist/middlewares/x-dns-prefetch-control", JSImport.Default)
  @js.native
  def default(options: ReadonlyXDnsPrefetchContr): js.Function3[
    /* _req */ IncomingMessage, 
    /* res */ ServerResponse, 
    /* next */ js.Function0[Unit], 
    Unit
  ] = js.native
  
  @js.native
  trait XDnsPrefetchControlOptions extends StObject {
    
    var allow: js.UndefOr[Boolean] = js.native
  }
  object XDnsPrefetchControlOptions {
    
    @scala.inline
    def apply(): XDnsPrefetchControlOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[XDnsPrefetchControlOptions]
    }
    
    @scala.inline
    implicit class XDnsPrefetchControlOptionsMutableBuilder[Self <: XDnsPrefetchControlOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllow(value: Boolean): Self = StObject.set(x, "allow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowUndefined: Self = StObject.set(x, "allow", js.undefined)
    }
  }
}
