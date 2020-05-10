package typingsSlinky.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResultsResource extends js.Object {
  var findings: FindingsResource = js.native
}

object ResultsResource {
  @scala.inline
  def apply(findings: FindingsResource): ResultsResource = {
    val __obj = js.Dynamic.literal(findings = findings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultsResource]
  }
  @scala.inline
  implicit class ResultsResourceOps[Self <: ResultsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFindings(value: FindingsResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findings")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

