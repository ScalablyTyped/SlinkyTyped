package typingsSlinky.gapiClientCloudmonitoring.gapi.client.cloudmonitoring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteMetricDescriptorResponse extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "cloudmonitoring#deleteMetricDescriptorResponse". */
  var kind: js.UndefOr[String] = js.native
}

object DeleteMetricDescriptorResponse {
  @scala.inline
  def apply(): DeleteMetricDescriptorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteMetricDescriptorResponse]
  }
  @scala.inline
  implicit class DeleteMetricDescriptorResponseOps[Self <: DeleteMetricDescriptorResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
  }
  
}

