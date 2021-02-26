package typingsSlinky.postmark

import typingsSlinky.postmark.serverMod.Server
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serversMod {
  
  @js.native
  trait Servers extends StObject {
    
    var Servers: js.Array[Server] = js.native
    
    var TotalCount: Double = js.native
  }
  object Servers {
    
    @scala.inline
    def apply(Servers: js.Array[Server], TotalCount: Double): Servers = {
      val __obj = js.Dynamic.literal(Servers = Servers.asInstanceOf[js.Any], TotalCount = TotalCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[Servers]
    }
    
    @scala.inline
    implicit class ServersMutableBuilder[Self <: Servers] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setServers(value: js.Array[Server]): Self = StObject.set(x, "Servers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServersVarargs(value: Server*): Self = StObject.set(x, "Servers", js.Array(value :_*))
      
      @scala.inline
      def setTotalCount(value: Double): Self = StObject.set(x, "TotalCount", value.asInstanceOf[js.Any])
    }
  }
}
