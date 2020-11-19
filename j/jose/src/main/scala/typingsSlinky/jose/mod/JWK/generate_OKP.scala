package typingsSlinky.jose.mod.JWK

import typingsSlinky.jose.joseStrings.OKP
import typingsSlinky.jose.mod.BasicParameters
import typingsSlinky.jose.mod.OKPCurve
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jose", "JWK.generate")
@js.native
object generate_OKP extends js.Object {
  
  def apply(kty: OKP): js.Promise[OKPKey] = js.native
  def apply(
    kty: OKP,
    crv: js.UndefOr[scala.Nothing],
    parameters: js.UndefOr[scala.Nothing],
    `private`: Boolean
  ): js.Promise[OKPKey] = js.native
  def apply(kty: OKP, crv: js.UndefOr[scala.Nothing], parameters: BasicParameters): js.Promise[OKPKey] = js.native
  def apply(kty: OKP, crv: js.UndefOr[scala.Nothing], parameters: BasicParameters, `private`: Boolean): js.Promise[OKPKey] = js.native
  def apply(kty: OKP, crv: OKPCurve): js.Promise[OKPKey] = js.native
  def apply(kty: OKP, crv: OKPCurve, parameters: js.UndefOr[scala.Nothing], `private`: Boolean): js.Promise[OKPKey] = js.native
  def apply(kty: OKP, crv: OKPCurve, parameters: BasicParameters): js.Promise[OKPKey] = js.native
  def apply(kty: OKP, crv: OKPCurve, parameters: BasicParameters, `private`: Boolean): js.Promise[OKPKey] = js.native
}
