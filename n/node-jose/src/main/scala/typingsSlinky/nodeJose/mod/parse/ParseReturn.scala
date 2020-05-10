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

@js.native
trait ParseReturn extends js.Object {
  var format: typingsSlinky.nodeJose.nodeJoseStrings.compact | typingsSlinky.nodeJose.nodeJoseStrings.json = js.native
  var header: js.Object = js.native
  var input: Buffer | String | js.Object = js.native
  var `type`: JWS | JWE = js.native
  def perform(ks: KeyStore): js.Promise[DecryptResult | VerificationResult] = js.native
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
  @scala.inline
  implicit class ParseReturnOps[Self <: ParseReturn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormat(
      value: typingsSlinky.nodeJose.nodeJoseStrings.compact | typingsSlinky.nodeJose.nodeJoseStrings.json
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeader(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInput(value: Buffer | String | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPerform(value: KeyStore => js.Promise[DecryptResult | VerificationResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perform")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withType(value: JWS | JWE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

