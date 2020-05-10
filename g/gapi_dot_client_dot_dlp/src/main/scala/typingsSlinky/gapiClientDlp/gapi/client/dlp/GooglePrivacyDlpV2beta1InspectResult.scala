package typingsSlinky.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1InspectResult extends js.Object {
  /** List of findings for an item. */
  var findings: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1Finding]] = js.native
  /**
    * If true, then this item might have more findings than were returned,
    * and the findings returned are an arbitrary subset of all findings.
    * The findings list might be truncated because the input items were too
    * large, or because the server reached the maximum amount of resources
    * allowed for a single API call. For best results, divide the input into
    * smaller batches.
    */
  var findingsTruncated: js.UndefOr[Boolean] = js.native
}

object GooglePrivacyDlpV2beta1InspectResult {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1InspectResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1InspectResult]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1InspectResultOps[Self <: GooglePrivacyDlpV2beta1InspectResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFindings(value: js.Array[GooglePrivacyDlpV2beta1Finding]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFindings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findings")(js.undefined)
        ret
    }
    @scala.inline
    def withFindingsTruncated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findingsTruncated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFindingsTruncated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findingsTruncated")(js.undefined)
        ret
    }
  }
  
}

