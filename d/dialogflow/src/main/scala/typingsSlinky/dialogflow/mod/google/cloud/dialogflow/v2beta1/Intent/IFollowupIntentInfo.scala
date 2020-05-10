package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a FollowupIntentInfo. */
@js.native
trait IFollowupIntentInfo extends js.Object {
  /** FollowupIntentInfo followupIntentName */
  var followupIntentName: js.UndefOr[String | Null] = js.native
  /** FollowupIntentInfo parentFollowupIntentName */
  var parentFollowupIntentName: js.UndefOr[String | Null] = js.native
}

object IFollowupIntentInfo {
  @scala.inline
  def apply(): IFollowupIntentInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFollowupIntentInfo]
  }
  @scala.inline
  implicit class IFollowupIntentInfoOps[Self <: IFollowupIntentInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFollowupIntentName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followupIntentName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFollowupIntentName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followupIntentName")(js.undefined)
        ret
    }
    @scala.inline
    def withFollowupIntentNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followupIntentName")(null)
        ret
    }
    @scala.inline
    def withParentFollowupIntentName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentFollowupIntentName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentFollowupIntentName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentFollowupIntentName")(js.undefined)
        ret
    }
    @scala.inline
    def withParentFollowupIntentNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentFollowupIntentName")(null)
        ret
    }
  }
  
}

