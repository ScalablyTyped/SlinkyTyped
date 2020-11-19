package typingsSlinky.jose.mod.JWS

import typingsSlinky.jose.joseBooleans.`false`
import typingsSlinky.jose.joseBooleans.`true`
import typingsSlinky.jose.mod.ConsumeKeyInputWithNone
import typingsSlinky.jose.mod.EmbeddedVerifyKeys
import typingsSlinky.jose.mod.NoneKey
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jose", "JWS.verify")
@js.native
object verify extends js.Object {
  
  def apply(jws: String, key: ConsumeKeyInputWithNone | EmbeddedVerifyKeys): String | js.Object = js.native
  def apply(
    jws: String,
    key: ConsumeKeyInputWithNone | EmbeddedVerifyKeys,
    options: VerifyOptions[`false`, `true`]
  ): String | js.Object = js.native
  def apply(jws: String, key: NoneKey): completeVerification[String | js.Object, NoneKey] = js.native
  def apply(jws: String, key: NoneKey, options: VerifyOptions[`true`, `false`]): completeVerification[Buffer, NoneKey] = js.native
  def apply(jws: FlattenedJWS, key: ConsumeKeyInputWithNone | EmbeddedVerifyKeys): String | js.Object = js.native
  def apply(
    jws: FlattenedJWS,
    key: ConsumeKeyInputWithNone | EmbeddedVerifyKeys,
    options: VerifyOptions[`false`, `true`]
  ): String | js.Object = js.native
  def apply(jws: FlattenedJWS, key: NoneKey): completeVerification[String | js.Object, NoneKey] = js.native
  def apply(jws: FlattenedJWS, key: NoneKey, options: VerifyOptions[`true`, `false`]): completeVerification[Buffer, NoneKey] = js.native
  def apply(jws: GeneralJWS, key: ConsumeKeyInputWithNone | EmbeddedVerifyKeys): String | js.Object = js.native
  def apply(
    jws: GeneralJWS,
    key: ConsumeKeyInputWithNone | EmbeddedVerifyKeys,
    options: VerifyOptions[`false`, `true`]
  ): String | js.Object = js.native
  def apply(jws: GeneralJWS, key: NoneKey): completeVerification[String | js.Object, NoneKey] = js.native
  def apply(jws: GeneralJWS, key: NoneKey, options: VerifyOptions[`true`, `false`]): completeVerification[Buffer, NoneKey] = js.native
}
