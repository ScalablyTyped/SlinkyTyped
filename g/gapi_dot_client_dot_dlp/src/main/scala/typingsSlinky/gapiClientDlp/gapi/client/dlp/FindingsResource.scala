package typingsSlinky.gapiClientDlp.gapi.client.dlp

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientDlp.anon.Bearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FindingsResource extends js.Object {
  /** Returns list of results for given inspect operation result set id. */
  def list(request: Bearertoken): Request[GooglePrivacyDlpV2beta1ListInspectFindingsResponse] = js.native
}

object FindingsResource {
  @scala.inline
  def apply(list: Bearertoken => Request[GooglePrivacyDlpV2beta1ListInspectFindingsResponse]): FindingsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[FindingsResource]
  }
  @scala.inline
  implicit class FindingsResourceOps[Self <: FindingsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withList(value: Bearertoken => Request[GooglePrivacyDlpV2beta1ListInspectFindingsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

