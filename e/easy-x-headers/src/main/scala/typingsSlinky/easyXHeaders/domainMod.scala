package typingsSlinky.easyXHeaders

import typingsSlinky.easyXHeaders.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("domain", JSImport.Namespace)
@js.native
object domainMod extends js.Object {
  
  def create(): Domain = js.native
  
  @js.native
  class Domain () extends EventEmitter {
    
    def add(emitter: EventEmitter): Unit = js.native
    
    def bind(cb: js.Function2[/* err */ js.Error, /* data */ js.Any, _]): js.Any = js.native
    
    def dispose(): Unit = js.native
    
    def intercept(cb: js.Function1[/* data */ js.Any, _]): js.Any = js.native
    
    def remove(emitter: EventEmitter): Unit = js.native
    
    def run(fn: js.Function): Unit = js.native
  }
}
