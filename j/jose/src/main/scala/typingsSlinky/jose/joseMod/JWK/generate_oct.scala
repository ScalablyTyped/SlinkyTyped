package typingsSlinky.jose.joseMod.JWK

import typingsSlinky.jose.joseMod.BasicParameters
import typingsSlinky.jose.joseStrings.oct
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jose", "JWK.generate")
@js.native
object generate_oct extends js.Object {
  def apply(kty: oct): js.Promise[OctKey] = js.native
  def apply(kty: oct, bitlength: Double): js.Promise[OctKey] = js.native
  def apply(kty: oct, bitlength: Double, parameters: BasicParameters): js.Promise[OctKey] = js.native
}

