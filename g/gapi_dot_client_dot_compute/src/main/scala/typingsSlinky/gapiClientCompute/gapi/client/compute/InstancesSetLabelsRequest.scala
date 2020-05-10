package typingsSlinky.gapiClientCompute.gapi.client.compute

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstancesSetLabelsRequest extends js.Object {
  /**
    * Fingerprint of the previous set of labels for this resource, used to prevent conflicts. Provide the latest fingerprint value when making a request to
    * add or change labels.
    */
  var labelFingerprint: js.UndefOr[String] = js.native
  var labels: js.UndefOr[Record[String, String]] = js.native
}

object InstancesSetLabelsRequest {
  @scala.inline
  def apply(): InstancesSetLabelsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstancesSetLabelsRequest]
  }
  @scala.inline
  implicit class InstancesSetLabelsRequestOps[Self <: InstancesSetLabelsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLabelFingerprint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFingerprint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelFingerprint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFingerprint")(js.undefined)
        ret
    }
    @scala.inline
    def withLabels(value: Record[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(js.undefined)
        ret
    }
  }
  
}

