package typingsSlinky.nodeDashJose.nodeDashJoseMod.parse

import typingsSlinky.node.Buffer
import typingsSlinky.nodeDashJose.nodeDashJoseMod.JWE.DecryptResult
import typingsSlinky.nodeDashJose.nodeDashJoseMod.JWK.KeyStore
import typingsSlinky.nodeDashJose.nodeDashJoseMod.JWS.VerificationResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseReturn extends js.Object {
  var format: typingsSlinky.nodeDashJose.nodeDashJoseStrings.compact | typingsSlinky.nodeDashJose.nodeDashJoseStrings.json
  var header: js.Object
  var input: Buffer | String | js.Object
  var `type`: typingsSlinky.nodeDashJose.nodeDashJoseStrings.JWS | typingsSlinky.nodeDashJose.nodeDashJoseStrings.JWE
  def perform(ks: KeyStore): js.Promise[DecryptResult | VerificationResult]
}

object ParseReturn {
  @scala.inline
  def apply(
    format: typingsSlinky.nodeDashJose.nodeDashJoseStrings.compact | typingsSlinky.nodeDashJose.nodeDashJoseStrings.json,
    header: js.Object,
    input: Buffer | String | js.Object,
    perform: KeyStore => js.Promise[DecryptResult | VerificationResult],
    `type`: typingsSlinky.nodeDashJose.nodeDashJoseStrings.JWS | typingsSlinky.nodeDashJose.nodeDashJoseStrings.JWE
  ): ParseReturn = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], perform = js.Any.fromFunction1(perform))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseReturn]
  }
}

