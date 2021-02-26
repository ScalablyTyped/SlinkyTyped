package typingsSlinky.easyXapiSupertest

import typingsSlinky.easyXapiSupertest.netMod.Socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ttyMod {
  
  @JSImport("tty", "isatty")
  @js.native
  def isatty(fd: Double): Boolean = js.native
  
  @js.native
  trait ReadStream extends Socket {
    
    var isRaw: Boolean = js.native
    
    def setRawMode(mode: Boolean): Unit = js.native
  }
  
  @js.native
  trait WriteStream extends Socket {
    
    var columns: Double = js.native
    
    var rows: Double = js.native
  }
}
