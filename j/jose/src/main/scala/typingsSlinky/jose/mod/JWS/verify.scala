package typingsSlinky.jose.mod.JWS

import typingsSlinky.jose.anon.VerifyOptionscompletetrue
import typingsSlinky.jose.mod.ConsumeKeyInput
import typingsSlinky.jose.mod.ConsumeKeyInputWithNone
import typingsSlinky.jose.mod.EmbeddedVerifyKeys
import typingsSlinky.jose.mod.JWK.Key
import typingsSlinky.jose.mod.NoneKey
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jose", "JWS.verify")
@js.native
object verify extends js.Object {
  
  def apply(jws: String, key: ConsumeKeyInputWithNone | EmbeddedVerifyKeys): Buffer = js.native
  def apply(jws: String, key: ConsumeKeyInput | EmbeddedVerifyKeys, options: VerifyOptionscompletetrue): completeVerification[Key] = js.native
  def apply(jws: String, key: ConsumeKeyInputWithNone | EmbeddedVerifyKeys, options: VerifyOptions): Buffer = js.native
  def apply(jws: String, key: NoneKey, options: VerifyOptionscompletetrue): completeVerification[NoneKey] = js.native
  def apply(jws: FlattenedJWS, key: ConsumeKeyInputWithNone | EmbeddedVerifyKeys): Buffer = js.native
  def apply(jws: FlattenedJWS, key: ConsumeKeyInput | EmbeddedVerifyKeys, options: VerifyOptionscompletetrue): completeVerification[Key] = js.native
  def apply(jws: FlattenedJWS, key: ConsumeKeyInputWithNone | EmbeddedVerifyKeys, options: VerifyOptions): Buffer = js.native
  def apply(jws: FlattenedJWS, key: NoneKey, options: VerifyOptionscompletetrue): completeVerification[NoneKey] = js.native
  def apply(jws: GeneralJWS, key: ConsumeKeyInputWithNone | EmbeddedVerifyKeys): Buffer = js.native
  def apply(jws: GeneralJWS, key: ConsumeKeyInput | EmbeddedVerifyKeys, options: VerifyOptionscompletetrue): completeVerification[Key] = js.native
  def apply(jws: GeneralJWS, key: ConsumeKeyInputWithNone | EmbeddedVerifyKeys, options: VerifyOptions): Buffer = js.native
  def apply(jws: GeneralJWS, key: NoneKey, options: VerifyOptionscompletetrue): completeVerification[NoneKey] = js.native
}
