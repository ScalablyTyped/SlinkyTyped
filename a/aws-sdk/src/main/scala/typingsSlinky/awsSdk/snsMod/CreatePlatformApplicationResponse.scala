package typingsSlinky.awsSdk.snsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePlatformApplicationResponse extends js.Object {
  /**
    * PlatformApplicationArn is returned.
    */
  var PlatformApplicationArn: js.UndefOr[String] = js.native
}

object CreatePlatformApplicationResponse {
  @scala.inline
  def apply(): CreatePlatformApplicationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatePlatformApplicationResponse]
  }
  @scala.inline
  implicit class CreatePlatformApplicationResponseOps[Self <: CreatePlatformApplicationResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPlatformApplicationArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlatformApplicationArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatformApplicationArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlatformApplicationArn")(js.undefined)
        ret
    }
  }
  
}

