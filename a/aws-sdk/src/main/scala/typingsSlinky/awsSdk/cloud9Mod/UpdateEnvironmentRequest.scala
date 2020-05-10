package typingsSlinky.awsSdk.cloud9Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateEnvironmentRequest extends js.Object {
  /**
    * Any new or replacement description for the environment.
    */
  var description: js.UndefOr[EnvironmentDescription] = js.native
  /**
    * The ID of the environment to change settings.
    */
  var environmentId: EnvironmentId = js.native
  /**
    * A replacement name for the environment.
    */
  var name: js.UndefOr[EnvironmentName] = js.native
}

object UpdateEnvironmentRequest {
  @scala.inline
  def apply(environmentId: EnvironmentId): UpdateEnvironmentRequest = {
    val __obj = js.Dynamic.literal(environmentId = environmentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEnvironmentRequest]
  }
  @scala.inline
  implicit class UpdateEnvironmentRequestOps[Self <: UpdateEnvironmentRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnvironmentId(value: EnvironmentId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environmentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: EnvironmentDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: EnvironmentName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}

