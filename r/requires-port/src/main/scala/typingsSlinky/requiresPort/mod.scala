package typingsSlinky.requiresPort

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("requires-port", JSImport.Namespace)
  @js.native
  def apply(port: String, protocol: String): Boolean = js.native
  @JSImport("requires-port", JSImport.Namespace)
  @js.native
  def apply(port: String, protocol: Protocol): Boolean = js.native
  @JSImport("requires-port", JSImport.Namespace)
  @js.native
  def apply(port: Double, protocol: String): Boolean = js.native
  @JSImport("requires-port", JSImport.Namespace)
  @js.native
  def apply(port: Double, protocol: Protocol): Boolean = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.requiresPort.requiresPortStrings.http
    - typingsSlinky.requiresPort.requiresPortStrings.https
    - typingsSlinky.requiresPort.requiresPortStrings.ws
    - typingsSlinky.requiresPort.requiresPortStrings.wss
    - typingsSlinky.requiresPort.requiresPortStrings.ftp
    - typingsSlinky.requiresPort.requiresPortStrings.gopher
    - typingsSlinky.requiresPort.requiresPortStrings.file
  */
  trait Protocol extends StObject
  object Protocol {
    
    @scala.inline
    def file: typingsSlinky.requiresPort.requiresPortStrings.file = "file".asInstanceOf[typingsSlinky.requiresPort.requiresPortStrings.file]
    
    @scala.inline
    def ftp: typingsSlinky.requiresPort.requiresPortStrings.ftp = "ftp".asInstanceOf[typingsSlinky.requiresPort.requiresPortStrings.ftp]
    
    @scala.inline
    def gopher: typingsSlinky.requiresPort.requiresPortStrings.gopher = "gopher".asInstanceOf[typingsSlinky.requiresPort.requiresPortStrings.gopher]
    
    @scala.inline
    def http: typingsSlinky.requiresPort.requiresPortStrings.http = "http".asInstanceOf[typingsSlinky.requiresPort.requiresPortStrings.http]
    
    @scala.inline
    def https: typingsSlinky.requiresPort.requiresPortStrings.https = "https".asInstanceOf[typingsSlinky.requiresPort.requiresPortStrings.https]
    
    @scala.inline
    def ws: typingsSlinky.requiresPort.requiresPortStrings.ws = "ws".asInstanceOf[typingsSlinky.requiresPort.requiresPortStrings.ws]
    
    @scala.inline
    def wss: typingsSlinky.requiresPort.requiresPortStrings.wss = "wss".asInstanceOf[typingsSlinky.requiresPort.requiresPortStrings.wss]
  }
}
