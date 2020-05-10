package typingsSlinky.keenTracking

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonProjectId extends js.Object {
  var projectId: String = js.native
  var requestType: js.UndefOr[String] = js.native
  var writeKey: String = js.native
}

object AnonProjectId {
  @scala.inline
  def apply(projectId: String, writeKey: String): AnonProjectId = {
    val __obj = js.Dynamic.literal(projectId = projectId.asInstanceOf[js.Any], writeKey = writeKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonProjectId]
  }
  @scala.inline
  implicit class AnonProjectIdOps[Self <: AnonProjectId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProjectId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWriteKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestType")(js.undefined)
        ret
    }
  }
  
}

