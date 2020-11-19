package typingsSlinky.nodeForge.mod.pkcs12

import typingsSlinky.nodeForge.mod.Byte
import typingsSlinky.nodeForge.mod.md.MessageDigest
import typingsSlinky.nodeForge.mod.util.ByteBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-forge", "pkcs12.generateKey")
@js.native
object generateKey extends js.Object {
  
  def apply(password: js.UndefOr[scala.Nothing], salt: ByteBuffer, id: Byte, iter: Double, n: Double): ByteBuffer = js.native
  def apply(
    password: js.UndefOr[scala.Nothing],
    salt: ByteBuffer,
    id: Byte,
    iter: Double,
    n: Double,
    md: MessageDigest
  ): ByteBuffer = js.native
  def apply(password: String, salt: ByteBuffer, id: Byte, iter: Double, n: Double): ByteBuffer = js.native
  def apply(password: String, salt: ByteBuffer, id: Byte, iter: Double, n: Double, md: MessageDigest): ByteBuffer = js.native
  def apply(password: Null, salt: ByteBuffer, id: Byte, iter: Double, n: Double): ByteBuffer = js.native
  def apply(password: Null, salt: ByteBuffer, id: Byte, iter: Double, n: Double, md: MessageDigest): ByteBuffer = js.native
}
