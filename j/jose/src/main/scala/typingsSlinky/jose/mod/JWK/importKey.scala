package typingsSlinky.jose.mod.JWK

import typingsSlinky.jose.mod.JWKECKey
import typingsSlinky.jose.mod.JWKOKPKey
import typingsSlinky.jose.mod.JWKOctKey
import typingsSlinky.jose.mod.JWKRSAKey
import typingsSlinky.jose.mod.KeyInput
import typingsSlinky.jose.mod.KeyParameters
import typingsSlinky.node.cryptoMod.KeyObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jose", "JWK.importKey")
@js.native
object importKey extends js.Object {
  
  def apply(jwk: JWKECKey): ECKey = js.native
  def apply(jwk: JWKOKPKey): OKPKey = js.native
  def apply(jwk: JWKOctKey): OctKey = js.native
  def apply(jwk: JWKRSAKey): RSAKey = js.native
  def apply(key: KeyInput): RSAKey | ECKey | OKPKey | OctKey = js.native
  def apply(key: KeyInput, parameters: KeyParameters): RSAKey | ECKey | OKPKey | OctKey = js.native
  /*
    * @deprecated in favor of asKey
    */
  def apply(key: KeyObject): RSAKey | ECKey | OKPKey | OctKey = js.native
  def apply(key: KeyObject, parameters: KeyParameters): RSAKey | ECKey | OKPKey | OctKey = js.native
}
