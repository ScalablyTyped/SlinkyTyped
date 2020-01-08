package typingsSlinky.jose.joseMod.JWK

import typingsSlinky.jose.joseMod.ImportOptions
import typingsSlinky.jose.joseMod.JWKECKey
import typingsSlinky.jose.joseMod.JWKOKPKey
import typingsSlinky.jose.joseMod.JWKOctKey
import typingsSlinky.jose.joseMod.JWKRSAKey
import typingsSlinky.jose.joseMod.KeyInput
import typingsSlinky.jose.joseMod.KeyParameters
import typingsSlinky.node.cryptoMod.KeyObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jose", "JWK.asKey")
@js.native
object asKey extends js.Object {
  def apply(jwk: JWKECKey): ECKey = js.native
  def apply(jwk: JWKOKPKey): OKPKey = js.native
  def apply(jwk: JWKOctKey): OctKey = js.native
  def apply(jwk: JWKRSAKey): RSAKey = js.native
  def apply(jwk: JWKRSAKey, options: ImportOptions): RSAKey = js.native
  def apply(key: KeyInput): RSAKey | ECKey | OKPKey | OctKey = js.native
  def apply(key: KeyInput, parameters: KeyParameters): RSAKey | ECKey | OKPKey | OctKey = js.native
  def apply(key: KeyObject): RSAKey | ECKey | OKPKey | OctKey = js.native
  def apply(key: KeyObject, parameters: KeyParameters): RSAKey | ECKey | OKPKey | OctKey = js.native
}

