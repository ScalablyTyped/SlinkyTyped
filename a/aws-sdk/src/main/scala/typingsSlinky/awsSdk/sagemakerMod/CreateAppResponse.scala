package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAppResponse extends js.Object {
  /**
    * The app's Amazon Resource Name (ARN).
    */
  var AppArn: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.AppArn] = js.native
}

object CreateAppResponse {
  @scala.inline
  def apply(): CreateAppResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAppResponse]
  }
  @scala.inline
  implicit class CreateAppResponseOps[Self <: CreateAppResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppArn(value: AppArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AppArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AppArn")(js.undefined)
        ret
    }
  }
  
}

