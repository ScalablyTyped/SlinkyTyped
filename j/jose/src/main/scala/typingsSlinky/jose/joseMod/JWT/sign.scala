package typingsSlinky.jose.joseMod.JWT

import typingsSlinky.jose.joseMod.JWK.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jose", "JWT.sign")
@js.native
object sign extends js.Object {
  def apply(payload: js.Object, key: Key): String = js.native
  def apply(payload: js.Object, key: Key, options: SignOptions): String = js.native
}

