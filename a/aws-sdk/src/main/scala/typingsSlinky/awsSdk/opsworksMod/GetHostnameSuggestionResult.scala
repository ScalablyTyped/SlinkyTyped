package typingsSlinky.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetHostnameSuggestionResult extends js.Object {
  /**
    * The generated host name.
    */
  var Hostname: js.UndefOr[String] = js.native
  /**
    * The layer ID.
    */
  var LayerId: js.UndefOr[String] = js.native
}

object GetHostnameSuggestionResult {
  @scala.inline
  def apply(): GetHostnameSuggestionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetHostnameSuggestionResult]
  }
  @scala.inline
  implicit class GetHostnameSuggestionResultOps[Self <: GetHostnameSuggestionResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHostname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Hostname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Hostname")(js.undefined)
        ret
    }
    @scala.inline
    def withLayerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LayerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LayerId")(js.undefined)
        ret
    }
  }
  
}

