package typingsSlinky.bitcoinjsLib

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bitcoinjs-lib/types/templates/witnesscommitment/output", JSImport.Namespace)
@js.native
object witnesscommitmentOutputMod extends js.Object {
  
  def decode(buffer: Buffer): Buffer = js.native
  
  def encode(commitment: Buffer): Buffer = js.native
  
  @js.native
  object check extends js.Object {
    
    def apply(script: js.Array[Double | Buffer]): Boolean = js.native
    def apply(script: Buffer): Boolean = js.native
    
    var toJSON: js.Function0[String] = js.native
  }
}
