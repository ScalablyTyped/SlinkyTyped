package typingsSlinky.node

import typingsSlinky.node.NodeJS.Timer
import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.node.eventsMod.EventEmitterOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domainMod {
  
  @JSImport("domain", "Domain")
  @js.native
  class Domain ()
    extends EventEmitter
       with typingsSlinky.node.domainMod.global.NodeJS.Domain {
    def this(options: EventEmitterOptions) = this()
    
    def enter(): Unit = js.native
    
    def exit(): Unit = js.native
    
    var members: js.Array[EventEmitter | Timer] = js.native
  }
  
  @JSImport("domain", "create")
  @js.native
  def create(): Domain = js.native
  
  object global {
    
    object NodeJS {
      
      @js.native
      trait Domain
        extends typingsSlinky.node.eventsMod.global.NodeJS.EventEmitter {
        
        def add(emitter: Timer): Unit = js.native
        def add(emitter: typingsSlinky.node.eventsMod.global.NodeJS.EventEmitter): Unit = js.native
        
        def bind[T /* <: js.Function */](cb: T): T = js.native
        
        def intercept[T /* <: js.Function */](cb: T): T = js.native
        
        def remove(emitter: Timer): Unit = js.native
        def remove(emitter: typingsSlinky.node.eventsMod.global.NodeJS.EventEmitter): Unit = js.native
        
        def run[T](fn: js.Function1[/* repeated */ js.Any, T], args: js.Any*): T = js.native
      }
    }
  }
}
