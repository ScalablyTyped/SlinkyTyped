package typingsSlinky.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTestGridSessionRequest extends js.Object {
  /**
    * The ARN for the project that this session belongs to. See CreateTestGridProject and ListTestGridProjects.
    */
  var projectArn: js.UndefOr[DeviceFarmArn] = js.native
  /**
    * An ARN that uniquely identifies a TestGridSession.
    */
  var sessionArn: js.UndefOr[DeviceFarmArn] = js.native
  /**
    * An ID associated with this session.
    */
  var sessionId: js.UndefOr[ResourceId] = js.native
}

object GetTestGridSessionRequest {
  @scala.inline
  def apply(): GetTestGridSessionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTestGridSessionRequest]
  }
  @scala.inline
  implicit class GetTestGridSessionRequestOps[Self <: GetTestGridSessionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProjectArn(value: DeviceFarmArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjectArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectArn")(js.undefined)
        ret
    }
    @scala.inline
    def withSessionArn(value: DeviceFarmArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSessionArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionArn")(js.undefined)
        ret
    }
    @scala.inline
    def withSessionId(value: ResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSessionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionId")(js.undefined)
        ret
    }
  }
  
}

