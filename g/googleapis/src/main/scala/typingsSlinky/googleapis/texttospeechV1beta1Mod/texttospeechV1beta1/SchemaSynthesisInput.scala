package typingsSlinky.googleapis.texttospeechV1beta1Mod.texttospeechV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains text input to be synthesized. Either `text` or `ssml` must be
  * supplied. Supplying both or neither returns
  * google.rpc.Code.INVALID_ARGUMENT. The input size is limited to 5000
  * characters.
  */
@js.native
trait SchemaSynthesisInput extends js.Object {
  /**
    * The SSML document to be synthesized. The SSML document must be valid and
    * well-formed. Otherwise the RPC will fail and return
    * google.rpc.Code.INVALID_ARGUMENT. For more information, see
    * [SSML](/speech/text-to-speech/docs/ssml).
    */
  var ssml: js.UndefOr[String] = js.native
  /**
    * The raw text to be synthesized.
    */
  var text: js.UndefOr[String] = js.native
}

object SchemaSynthesisInput {
  @scala.inline
  def apply(): SchemaSynthesisInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSynthesisInput]
  }
  @scala.inline
  implicit class SchemaSynthesisInputOps[Self <: SchemaSynthesisInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSsml(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssml")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSsml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssml")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
  }
  
}

