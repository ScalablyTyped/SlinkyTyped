package typingsSlinky.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTestGridUrlRequest extends js.Object {
  /**
    * Lifetime, in seconds, of the URL.
    */
  var expiresInSeconds: TestGridUrlExpiresInSecondsInput = js.native
  /**
    * ARN (from CreateTestGridProject or ListTestGridProjects) to associate with the short-term URL. 
    */
  var projectArn: DeviceFarmArn = js.native
}

object CreateTestGridUrlRequest {
  @scala.inline
  def apply(expiresInSeconds: TestGridUrlExpiresInSecondsInput, projectArn: DeviceFarmArn): CreateTestGridUrlRequest = {
    val __obj = js.Dynamic.literal(expiresInSeconds = expiresInSeconds.asInstanceOf[js.Any], projectArn = projectArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTestGridUrlRequest]
  }
  @scala.inline
  implicit class CreateTestGridUrlRequestOps[Self <: CreateTestGridUrlRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpiresInSeconds(value: TestGridUrlExpiresInSecondsInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiresInSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProjectArn(value: DeviceFarmArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectArn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

