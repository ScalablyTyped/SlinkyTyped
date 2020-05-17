package typingsSlinky.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Suggestedkey extends js.Object {
  var description: js.UndefOr[String] = js.native
  var suggested_key: js.UndefOr[AdditionalProperties] = js.native
}

object Suggestedkey {
  @scala.inline
  def apply(): Suggestedkey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Suggestedkey]
  }
  @scala.inline
  implicit class SuggestedkeyOps[Self <: Suggestedkey] (val x: Self) extends AnyVal {
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
    def withSuggested_key(value: AdditionalProperties): Self = {
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

