package typingsSlinky.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateStreamingURLRequest extends js.Object {
  /**
    * The name of the application to launch after the session starts. This is the name that you specified as Name in the Image Assistant.
    */
  var ApplicationId: js.UndefOr[String] = js.native
  /**
    * The name of the fleet.
    */
  var FleetName: String = js.native
  /**
    * The session context. For more information, see Session Context in the Amazon AppStream 2.0 Administration Guide.
    */
  var SessionContext: js.UndefOr[String] = js.native
  /**
    * The name of the stack.
    */
  var StackName: String = js.native
  /**
    * The identifier of the user.
    */
  var UserId: StreamingUrlUserId = js.native
  /**
    * The time that the streaming URL will be valid, in seconds. Specify a value between 1 and 604800 seconds. The default is 60 seconds.
    */
  var Validity: js.UndefOr[Long] = js.native
}

object CreateStreamingURLRequest {
  @scala.inline
  def apply(FleetName: String, StackName: String, UserId: StreamingUrlUserId): CreateStreamingURLRequest = {
    val __obj = js.Dynamic.literal(FleetName = FleetName.asInstanceOf[js.Any], StackName = StackName.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateStreamingURLRequest]
  }
  @scala.inline
  implicit class CreateStreamingURLRequestOps[Self <: CreateStreamingURLRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFleetName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FleetName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStackName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserId(value: StreamingUrlUserId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplicationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationId")(js.undefined)
        ret
    }
    @scala.inline
    def withSessionContext(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SessionContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSessionContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SessionContext")(js.undefined)
        ret
    }
    @scala.inline
    def withValidity(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Validity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Validity")(js.undefined)
        ret
    }
  }
  
}

