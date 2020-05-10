package typingsSlinky.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenerateChangeSetRequest extends js.Object {
  /**
    * ID of the application associated with the change set.
    */
  var appId: js.UndefOr[AppId] = js.native
  /**
    * Format for the change set.
    */
  var changesetFormat: js.UndefOr[OutputFormat] = js.native
}

object GenerateChangeSetRequest {
  @scala.inline
  def apply(): GenerateChangeSetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateChangeSetRequest]
  }
  @scala.inline
  implicit class GenerateChangeSetRequestOps[Self <: GenerateChangeSetRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppId(value: AppId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appId")(js.undefined)
        ret
    }
    @scala.inline
    def withChangesetFormat(value: OutputFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changesetFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChangesetFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changesetFormat")(js.undefined)
        ret
    }
  }
  
}

