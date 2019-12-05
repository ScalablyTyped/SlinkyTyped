package typingsSlinky.jose.joseMod.JWK

import typingsSlinky.jose.joseMod.BasicParameters
import typingsSlinky.jose.joseMod.ECCurve
import typingsSlinky.jose.joseStrings.EC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jose", "JWK.generateSync")
@js.native
object generateSync_EC extends js.Object {
  def apply(kty: EC): ECKey = js.native
  def apply(kty: EC, crv: ECCurve): ECKey = js.native
  def apply(kty: EC, crv: ECCurve, parameters: BasicParameters): ECKey = js.native
  def apply(kty: EC, crv: ECCurve, parameters: BasicParameters, `private`: Boolean): ECKey = js.native
}

