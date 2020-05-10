package typingsSlinky.gapiClientPagespeedonline

import typingsSlinky.gapiClientPagespeedonline.gapi.client.pagespeedonline.PagespeedApiFormatStringV2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDetails extends js.Object {
  /** List of entries that provide additional details about a single URL. Optional. */
  var details: js.UndefOr[js.Array[PagespeedApiFormatStringV2]] = js.native
  /** A format string that gives information about the URL, and a list of arguments for that format string. */
  var result: js.UndefOr[PagespeedApiFormatStringV2] = js.native
}

object AnonDetails {
  @scala.inline
  def apply(): AnonDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonDetails]
  }
  @scala.inline
  implicit class AnonDetailsOps[Self <: AnonDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDetails(value: js.Array[PagespeedApiFormatStringV2]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("details")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("details")(js.undefined)
        ret
    }
    @scala.inline
    def withResult(value: PagespeedApiFormatStringV2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(js.undefined)
        ret
    }
  }
  
}

