package typingsSlinky.nodeJose.mod.parse

import typingsSlinky.node.Buffer
import typingsSlinky.nodeJose.mod.JWE.DecryptResult
import typingsSlinky.nodeJose.mod.JWK.KeyStore
import typingsSlinky.nodeJose.mod.JWS.VerificationResult
import typingsSlinky.nodeJose.nodeJoseStrings.JWE
import typingsSlinky.nodeJose.nodeJoseStrings.JWS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseReturn extends js.Object {
  var format: typingsSlinky.nodeJose.nodeJoseStrings.compact | typingsSlinky.nodeJose.nodeJoseStrings.json
  var header: js.Object
  var input: Buffer | String | js.Object
  var `type`: JWS | JWE
  def perform(ks: KeyStore): js.Promise[DecryptResult | VerificationResult]
}

object ParseReturn {
  @scala.inline
  def apply(
    format: typingsSlinky.nodeJose.nodeJoseStrings.compact | typingsSlinky.nodeJose.nodeJoseStrings.json,
    header: js.Object,
    input: Buffer | String | js.Object,
    perform: KeyStore => js.Promise[DecryptResult | VerificationResult],
    `type`: JWS | JWE
  ): ParseReturn = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], perform = js.Any.fromFunction1(perform))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseReturn]
  }
}

