package typingsSlinky.jose.mod.JWT

import typingsSlinky.jose.joseBooleans.`false`
import typingsSlinky.jose.joseBooleans.`true`
import typingsSlinky.jose.joseStrings.atPlussignJWT
import typingsSlinky.jose.mod.ConsumeKeyInput
import typingsSlinky.jose.mod.ConsumeKeyInputWithNone
import typingsSlinky.jose.mod.JWK.Key
import typingsSlinky.jose.mod.NoneKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jose", "JWT.AccessToken")
@js.native
object AccessToken extends js.Object {
  def verify(
    jwt: String,
    key: ConsumeKeyInputWithNone,
    options: VerifyOptions[`false`] with VerifyProfileOptions[atPlussignJWT]
  ): js.Object = js.native
  def verify(
    jwt: String,
    key: ConsumeKeyInput,
    options: VerifyOptions[`true`] with VerifyProfileOptions[atPlussignJWT]
  ): completeResult[Key] = js.native
  def verify(jwt: String, key: NoneKey, options: VerifyOptions[`true`] with VerifyProfileOptions[atPlussignJWT]): completeResult[NoneKey] = js.native
}

