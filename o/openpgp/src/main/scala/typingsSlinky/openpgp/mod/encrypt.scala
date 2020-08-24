package typingsSlinky.openpgp.mod

import typingsSlinky.openpgp.anon.EncryptOptionsarmorfalsed
import typingsSlinky.openpgp.anon.EncryptOptionsarmorfalsedArmor
import typingsSlinky.openpgp.anon.EncryptOptionsarmortrueun
import typingsSlinky.openpgp.anon.EncryptOptionsarmortrueunArmor
import typingsSlinky.openpgp.anon.EncryptResultdatastring
import typingsSlinky.openpgp.anon.EncryptResultdatastringRe
import typingsSlinky.openpgp.anon.EncryptResultdatastringsi
import typingsSlinky.openpgp.anon.EncryptResultmessageMessa
import typingsSlinky.openpgp.anon.EncryptResultmessageMessaMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openpgp", "encrypt")
@js.native
object encrypt extends js.Object {
  def apply(options: EncryptOptionsarmorfalsed): js.Promise[EncryptResultmessageMessa] = js.native
  def apply(options: EncryptOptionsarmorfalsedArmor): js.Promise[EncryptResultmessageMessaMessage] = js.native
  def apply(options: EncryptOptionsarmortrueun): js.Promise[EncryptResultdatastring] = js.native
  def apply(options: EncryptOptionsarmortrueunArmor): js.Promise[EncryptResultdatastringsi] = js.native
  def apply(options: EncryptOptions): js.Promise[EncryptResultdatastringRe] = js.native
}

