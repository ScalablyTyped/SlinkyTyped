package typingsSlinky.koaWebpack

import typingsSlinky.webpackHotClient.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Close extends StObject {
    
    def close(): Unit = js.native
    
    var options: Options = js.native
    
    var server: js.Any = js.native
  }
  object Close {
    
    @scala.inline
    def apply(close: () => Unit, options: Options, server: js.Any): Close = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), options = options.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any])
      __obj.asInstanceOf[Close]
    }
    
    @scala.inline
    implicit class CloseMutableBuilder[Self <: Close] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServer(value: js.Any): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    }
  }
}
