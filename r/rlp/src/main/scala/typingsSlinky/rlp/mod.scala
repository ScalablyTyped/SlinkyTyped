package typingsSlinky.rlp

import typingsSlinky.node.Buffer
import typingsSlinky.rlp.typesMod.Decoded
import typingsSlinky.rlp.typesMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rlp", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def decode(input: js.Array[Buffer]): js.Array[Buffer] = js.native
  def decode(input: js.Array[Buffer], stream: Boolean): js.Array[Buffer] = js.native
  def decode(input: Buffer): Buffer = js.native
  def decode(input: Buffer, stream: Boolean): Buffer = js.native
  def decode(input: Input): js.Array[Buffer] | Buffer | Decoded = js.native
  def decode(input: Input, stream: Boolean): js.Array[Buffer] | Buffer | Decoded = js.native
  
  def encode(input: Input): Buffer = js.native
  
  def getLength(input: Input): Buffer | Double = js.native
}
