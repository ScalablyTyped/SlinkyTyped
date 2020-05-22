package typingsSlinky.jose.mod.JWS

import typingsSlinky.jose.joseBooleans.`true`
import typingsSlinky.jose.mod.ConsumeKeyInput
import typingsSlinky.jose.mod.EmbeddedVerifyKeys
import typingsSlinky.jose.mod.JWK.Key
import typingsSlinky.jose.mod.NoneKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jose", "JWS.verify")
@js.native
object verify_true extends js.Object {
  def apply(jws: String, key: ConsumeKeyInput | EmbeddedVerifyKeys, options: VerifyOptions[`true`, `true`]): completeVerification[String | js.Object, Key] = js.native
  def apply(jws: String, key: NoneKey, options: VerifyOptions[`true`, `true`]): completeVerification[String | js.Object, NoneKey] = js.native
  def apply(
    jws: FlattenedJWS,
    key: ConsumeKeyInput | EmbeddedVerifyKeys,
    options: VerifyOptions[`true`, `true`]
  ): completeVerification[String | js.Object, Key] = js.native
  def apply(jws: FlattenedJWS, key: NoneKey, options: VerifyOptions[`true`, `true`]): completeVerification[String | js.Object, NoneKey] = js.native
  def apply(jws: GeneralJWS, key: ConsumeKeyInput | EmbeddedVerifyKeys, options: VerifyOptions[`true`, `true`]): completeVerification[String | js.Object, Key] = js.native
  def apply(jws: GeneralJWS, key: NoneKey, options: VerifyOptions[`true`, `true`]): completeVerification[String | js.Object, NoneKey] = js.native
}

