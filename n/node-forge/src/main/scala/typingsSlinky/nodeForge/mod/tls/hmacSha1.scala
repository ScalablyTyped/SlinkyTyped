package typingsSlinky.nodeForge.mod.tls

import typingsSlinky.nodeForge.mod.Byte
import typingsSlinky.nodeForge.mod.Bytes
import typingsSlinky.nodeForge.mod.util.ByteBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-forge", "tls.hmac_sha1")
@js.native
object hmacSha1 extends js.Object {
  
  def apply(key: String, seqNum: js.Tuple2[Double, Double], record: Record): Bytes = js.native
  def apply(key: js.Array[Byte], seqNum: js.Tuple2[Double, Double], record: Record): Bytes = js.native
  def apply(key: ByteBuffer, seqNum: js.Tuple2[Double, Double], record: Record): Bytes = js.native
}
