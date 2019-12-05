package typingsSlinky.bip38.bip38Mod

import typingsSlinky.bip38.Anon_Compressed
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bip38", "decryptECMult")
@js.native
object decryptECMult extends js.Object {
  def apply(buffer: Buffer, passphrase: String): Anon_Compressed = js.native
  def apply(
    buffer: Buffer,
    passphrase: String,
    progressCallback: js.Function1[/* status */ ProgressStatus, Unit]
  ): Anon_Compressed = js.native
  def apply(
    buffer: Buffer,
    passphrase: String,
    progressCallback: js.Function1[/* status */ ProgressStatus, Unit],
    scryptParams: ScryptParams
  ): Anon_Compressed = js.native
}

