package typingsSlinky.openpgp.mod

import typingsSlinky.openpgp.EncryptOptionsarmorfalsed
import typingsSlinky.openpgp.EncryptOptionsarmorfalsedArmor
import typingsSlinky.openpgp.EncryptOptionsarmortruede
import typingsSlinky.openpgp.EncryptOptionsarmortruedeArmor
import typingsSlinky.openpgp.EncryptResultdatastring
import typingsSlinky.openpgp.EncryptResultdatastringRe
import typingsSlinky.openpgp.EncryptResultdatastringsi
import typingsSlinky.openpgp.EncryptResultmessageMessa
import typingsSlinky.openpgp.EncryptResultmessageMessaMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openpgp", "encrypt")
@js.native
object encrypt extends js.Object {
  def apply(options: EncryptOptionsarmorfalsed): js.Promise[EncryptResultmessageMessa] = js.native
  def apply(options: EncryptOptionsarmorfalsedArmor): js.Promise[EncryptResultmessageMessaMessage] = js.native
  def apply(options: EncryptOptionsarmortruede): js.Promise[EncryptResultdatastring] = js.native
  def apply(options: EncryptOptionsarmortruedeArmor): js.Promise[EncryptResultdatastringsi] = js.native
  def apply(options: EncryptOptions): js.Promise[EncryptResultdatastringRe] = js.native
}

