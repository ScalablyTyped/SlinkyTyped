package typingsSlinky.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAppResponse extends js.Object {
  /**
    * Summary description of the application.
    */
  var appSummary: js.UndefOr[AppSummary] = js.native
  /**
    * List of server groups included in the application.
    */
  var serverGroups: js.UndefOr[ServerGroups] = js.native
  /**
    * List of taags associated with the application.
    */
  var tags: js.UndefOr[Tags] = js.native
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
    def withAppSummary(value: AppSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appSummary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appSummary")(js.undefined)
        ret
    }
    @scala.inline
    def withServerGroups(value: ServerGroups): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Tags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

