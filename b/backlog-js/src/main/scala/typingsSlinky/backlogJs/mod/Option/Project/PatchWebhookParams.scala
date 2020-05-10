package typingsSlinky.backlogJs.mod.Option.Project

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PatchWebhookParams extends js.Object {
  var activityTypeIds: js.UndefOr[js.Array[Double]] = js.native
  var allEvent: js.UndefOr[Boolean] = js.native
  var description: js.UndefOr[String] = js.native
  var hookUrl: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
}

object PatchWebhookParams {
  @scala.inline
  def apply(): PatchWebhookParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PatchWebhookParams]
  }
  @scala.inline
  implicit class PatchWebhookParamsOps[Self <: PatchWebhookParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivityTypeIds(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activityTypeIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivityTypeIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activityTypeIds")(js.undefined)
        ret
    }
    @scala.inline
    def withAllEvent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
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
    def withHookUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hookUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHookUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hookUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
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

