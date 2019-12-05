package typingsSlinky.openpgp.openpgpMod

import typingsSlinky.openpgp.Anon_Armor
import typingsSlinky.openpgp.Anon_ArmorDetached
import typingsSlinky.openpgp.Anon_ArmorDetachedFalse
import typingsSlinky.openpgp.Anon_ArmorDetachedFalseTrue
import typingsSlinky.openpgp.Anon_Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openpgp", "encrypt")
@js.native
object encrypt extends js.Object {
  def apply(
    options: (EncryptOptions with (Anon_Armor | Anon_ArmorDetached | Anon_ArmorDetachedFalse | Anon_ArmorDetachedFalseTrue)) | EncryptOptions
  ): js.Promise[EncryptResult with Anon_Data] = js.native
}

