package typingsSlinky.googleapis.texttospeechV1beta1Mod.texttospeechV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The message returned to the client by the `ListVoices` method.
  */
@js.native
trait SchemaListVoicesResponse extends js.Object {
  /**
    * The list of voices.
    */
  var voices: js.UndefOr[js.Array[SchemaVoice]] = js.native
}

object SchemaListVoicesResponse {
  @scala.inline
  def apply(): SchemaListVoicesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListVoicesResponse]
  }
  @scala.inline
  implicit class SchemaListVoicesResponseOps[Self <: SchemaListVoicesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVoices(value: js.Array[SchemaVoice]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVoices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voices")(js.undefined)
        ret
    }
  }
  
}

