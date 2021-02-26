package typingsSlinky.jose

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.jose.mod.ProduceKeyInput
    - typingsSlinky.jose.mod.JWKS.KeyStore
  */
  type ConsumeKeyInput = typingsSlinky.jose.mod._ConsumeKeyInput | typingsSlinky.node.cryptoMod.KeyObject | typingsSlinky.jose.mod.KeyInput
  
  type ConsumeKeyInputWithNone = typingsSlinky.jose.mod.ConsumeKeyInput | typingsSlinky.jose.mod.NoneKey
  
  type EmbeddedJWK = typingsSlinky.jose.mod.JWK.EmbeddedJWK
  
  type EmbeddedVerifyKeys = typingsSlinky.jose.mod.EmbeddedJWK | typingsSlinky.jose.mod.EmbeddedX5C
  
  type EmbeddedX5C = typingsSlinky.jose.mod.JWK.EmbeddedX5C
  
  type KeyInput = typingsSlinky.node.cryptoMod.PrivateKeyInput | typingsSlinky.node.cryptoMod.PublicKeyInput | java.lang.String | typingsSlinky.node.Buffer
  
  type NoneKey = typingsSlinky.jose.mod.JWK.NoneKey
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.jose.mod.JWK.Key
    - typingsSlinky.node.cryptoMod.KeyObject
    - typingsSlinky.jose.mod.KeyInput
    - typingsSlinky.jose.mod.JWKOctKey
    - typingsSlinky.jose.mod.JWKRSAKey
    - typingsSlinky.jose.mod.JWKECKey
    - typingsSlinky.jose.mod.JWKOKPKey
  */
  type ProduceKeyInput = typingsSlinky.jose.mod._ProduceKeyInput | typingsSlinky.node.cryptoMod.KeyObject | typingsSlinky.jose.mod.KeyInput
  
  type ProduceKeyInputWithNone = typingsSlinky.jose.mod.ProduceKeyInput | typingsSlinky.jose.mod.NoneKey
}
