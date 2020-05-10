package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MonitoringConstraintsResource extends js.Object {
  /**
    * The Amazon S3 URI for the constraints resource.
    */
  var S3Uri: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.S3Uri] = js.native
}

object MonitoringConstraintsResource {
  @scala.inline
  def apply(): MonitoringConstraintsResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MonitoringConstraintsResource]
  }
  @scala.inline
  implicit class MonitoringConstraintsResourceOps[Self <: MonitoringConstraintsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withS3Uri(value: S3Uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3Uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3Uri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3Uri")(js.undefined)
        ret
    }
  }
  
}

