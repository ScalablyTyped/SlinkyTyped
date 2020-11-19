package typingsSlinky.nodegit

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit/buf", JSImport.Namespace)
@js.native
object bufMod extends js.Object {
  
  @js.native
  class Buf () extends js.Object {
    
    var asize: Double = js.native
    
    def containsNul(): Double = js.native
    
    def free(): Unit = js.native
    
    def grow(targetSize: Double): js.Promise[Buf] = js.native
    
    def isBinary(): Double = js.native
    
    var ptr: String = js.native
    
    def set(data: Buffer, datalen: Double): js.Promise[Buf] = js.native
    
    var size: Double = js.native
  }
}
