package typingsSlinky.memFs

import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.node.streamMod.Transform
import typingsSlinky.vinyl.mod.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mem-fs", "create")
  @js.native
  def create(): Store = js.native
  
  @js.native
  trait Store extends EventEmitter {
    
    def add(file: File): this.type = js.native
    
    def each(callback: js.Function2[/* file */ File, /* index */ Double, Unit]): this.type = js.native
    
    def get(filepath: String): File = js.native
    
    def stream(): Transform = js.native
  }
}
