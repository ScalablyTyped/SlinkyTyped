package typingsSlinky.jose.mod.JWK

import typingsSlinky.jose.mod.BasicParameters
import typingsSlinky.jose.mod.Curves
import typingsSlinky.jose.mod.keyType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jose", "JWK.generate")
@js.native
object generate extends js.Object {
  
  def apply(kty: keyType): js.Promise[Key] = js.native
  def apply(
    kty: keyType,
    crvOrSize: js.UndefOr[scala.Nothing],
    parameters: js.UndefOr[scala.Nothing],
    `private`: Boolean
  ): js.Promise[Key] = js.native
  def apply(kty: keyType, crvOrSize: js.UndefOr[scala.Nothing], parameters: BasicParameters): js.Promise[Key] = js.native
  def apply(
    kty: keyType,
    crvOrSize: js.UndefOr[scala.Nothing],
    parameters: BasicParameters,
    `private`: Boolean
  ): js.Promise[Key] = js.native
  def apply(kty: keyType, crvOrSize: Double): js.Promise[Key] = js.native
  def apply(kty: keyType, crvOrSize: Double, parameters: js.UndefOr[scala.Nothing], `private`: Boolean): js.Promise[Key] = js.native
  def apply(kty: keyType, crvOrSize: Double, parameters: BasicParameters): js.Promise[Key] = js.native
  def apply(kty: keyType, crvOrSize: Double, parameters: BasicParameters, `private`: Boolean): js.Promise[Key] = js.native
  def apply(kty: keyType, crvOrSize: Curves): js.Promise[Key] = js.native
  def apply(kty: keyType, crvOrSize: Curves, parameters: js.UndefOr[scala.Nothing], `private`: Boolean): js.Promise[Key] = js.native
  def apply(kty: keyType, crvOrSize: Curves, parameters: BasicParameters): js.Promise[Key] = js.native
  def apply(kty: keyType, crvOrSize: Curves, parameters: BasicParameters, `private`: Boolean): js.Promise[Key] = js.native
}
