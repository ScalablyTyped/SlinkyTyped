package typingsSlinky.awsSdkHashStreamNode

import typingsSlinky.awsSdkTypes.cryptoMod.Hash
import typingsSlinky.node.Buffer
import typingsSlinky.node.streamMod.Writable
import typingsSlinky.node.streamMod.WritableOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/hash-stream-node/build/hash-calculator", JSImport.Namespace)
@js.native
object hashCalculatorMod extends js.Object {
  
  @js.native
  class HashCalculator protected () extends Writable {
    def this(hash: Hash) = this()
    def this(hash: Hash, options: WritableOptions) = this()
    
    def _write(chunk: Buffer, encoding: String, callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
    
    val hash: Hash = js.native
  }
}
