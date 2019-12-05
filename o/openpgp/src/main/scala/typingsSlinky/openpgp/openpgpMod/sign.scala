package typingsSlinky.openpgp.openpgpMod

import typingsSlinky.openpgp.Anon_Armor
import typingsSlinky.openpgp.Anon_ArmorDetached
import typingsSlinky.openpgp.Anon_ArmorDetachedFalse
import typingsSlinky.openpgp.Anon_ArmorDetachedFalseTrue
import typingsSlinky.openpgp.Anon_Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openpgp", "sign")
@js.native
object sign extends js.Object {
  def apply(
    options: (SignOptions with (Anon_Armor | Anon_ArmorDetached | Anon_ArmorDetachedFalse | Anon_ArmorDetachedFalseTrue)) | SignOptions
  ): js.Promise[Anon_Data] = js.native
}

