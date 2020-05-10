package typingsSlinky.firefoxWebextBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSuggestedkey extends js.Object {
  var description: js.UndefOr[String] = js.native
  var suggested_key: js.UndefOr[AnonAdditionalProperties] = js.native
}

object AnonSuggestedkey {
  @scala.inline
  def apply(): AnonSuggestedkey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonSuggestedkey]
  }
  @scala.inline
  implicit class AnonSuggestedkeyOps[Self <: AnonSuggestedkey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withSuggested_key(value: AnonAdditionalProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggested_key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuggested_key: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggested_key")(js.undefined)
        ret
    }
  }
  
}

