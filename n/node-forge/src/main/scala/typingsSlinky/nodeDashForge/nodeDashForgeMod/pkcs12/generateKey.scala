package typingsSlinky.nodeDashForge.nodeDashForgeMod.pkcs12

import typingsSlinky.nodeDashForge.nodeDashForgeMod.Byte
import typingsSlinky.nodeDashForge.nodeDashForgeMod.md.MessageDigest
import typingsSlinky.nodeDashForge.nodeDashForgeMod.util.ByteBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

