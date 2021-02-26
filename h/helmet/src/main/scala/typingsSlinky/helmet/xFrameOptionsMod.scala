package typingsSlinky.helmet

import typingsSlinky.helmet.anon.ReadonlyXFrameOptionsOpti
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xFrameOptionsMod {
  
  @JSImport("helmet/dist/middlewares/x-frame-options", JSImport.Default)
  @js.native
  def default(): js.Function3[
    /* _req */ IncomingMessage, 
    /* res */ ServerResponse, 
    /* next */ js.Function0[Unit], 
    Unit
  ] = js.native
  @JSImport("helmet/dist/middlewares/x-frame-options", JSImport.Default)
  @js.native
  def default(options: ReadonlyXFrameOptionsOpti): js.Function3[
    /* _req */ IncomingMessage, 
    /* res */ ServerResponse, 
    /* next */ js.Function0[Unit], 
    Unit
  ] = js.native
  
  @js.native
  trait XFrameOptionsOptions extends StObject {
    
    var action: js.UndefOr[String] = js.native
  }
  object XFrameOptionsOptions {
    
    @scala.inline
    def apply(): XFrameOptionsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[XFrameOptionsOptions]
    }
    
    @scala.inline
    implicit class XFrameOptionsOptionsMutableBuilder[Self <: XFrameOptionsOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    }
  }
}
