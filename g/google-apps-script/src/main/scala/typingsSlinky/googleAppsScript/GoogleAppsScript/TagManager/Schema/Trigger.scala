package typingsSlinky.googleAppsScript.GoogleAppsScript.TagManager.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Trigger extends js.Object {
  var accountId: js.UndefOr[String] = js.native
  var autoEventFilter: js.UndefOr[js.Array[Condition]] = js.native
  var checkValidation: js.UndefOr[Parameter] = js.native
  var containerId: js.UndefOr[String] = js.native
  var continuousTimeMinMilliseconds: js.UndefOr[Parameter] = js.native
  var customEventFilter: js.UndefOr[js.Array[Condition]] = js.native
  var eventName: js.UndefOr[Parameter] = js.native
  var filter: js.UndefOr[js.Array[Condition]] = js.native
  var fingerprint: js.UndefOr[String] = js.native
  var horizontalScrollPercentageList: js.UndefOr[Parameter] = js.native
  var interval: js.UndefOr[Parameter] = js.native
  var intervalSeconds: js.UndefOr[Parameter] = js.native
  var limit: js.UndefOr[Parameter] = js.native
  var maxTimerLengthSeconds: js.UndefOr[Parameter] = js.native
  var name: js.UndefOr[String] = js.native
  var notes: js.UndefOr[String] = js.native
  var parameter: js.UndefOr[js.Array[Parameter]] = js.native
  var parentFolderId: js.UndefOr[String] = js.native
  var path: js.UndefOr[String] = js.native
  var selector: js.UndefOr[Parameter] = js.native
  var tagManagerUrl: js.UndefOr[String] = js.native
  var totalTimeMinMilliseconds: js.UndefOr[Parameter] = js.native
  var triggerId: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
  var uniqueTriggerId: js.UndefOr[Parameter] = js.native
  var verticalScrollPercentageList: js.UndefOr[Parameter] = js.native
  var visibilitySelector: js.UndefOr[Parameter] = js.native
  var visiblePercentageMax: js.UndefOr[Parameter] = js.native
  var visiblePercentageMin: js.UndefOr[Parameter] = js.native
  var waitForTags: js.UndefOr[Parameter] = js.native
  var waitForTagsTimeout: js.UndefOr[Parameter] = js.native
  var workspaceId: js.UndefOr[String] = js.native
}

object Trigger {
  @scala.inline
  def apply(): Trigger = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Trigger]
  }
  @scala.inline
  implicit class TriggerOps[Self <: Trigger] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoEventFilter(value: js.Array[Condition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoEventFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoEventFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoEventFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckValidation(value: Parameter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkValidation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckValidation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkValidation")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerId")(js.undefined)
        ret
    }
    @scala.inline
    def withContinuousTimeMinMilliseconds(value: Parameter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continuousTimeMinMilliseconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContinuousTimeMinMilliseconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continuousTimeMinMilliseconds")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomEventFilter(value: js.Array[Condition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customEventFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomEventFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customEventFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withEventName(value: Parameter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventName")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter(value: js.Array[Condition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withFingerprint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fingerprint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFingerprint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fingerprint")(js.undefined)
        ret
    }
    @scala.inline
    def withHorizontalScrollPercentageList(value: Parameter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalScrollPercentageList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontalScrollPercentageList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalScrollPercentageList")(js.undefined)
        ret
    }
    @scala.inline
    def withInterval(value: Parameter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(js.undefined)
        ret
    }
    @scala.inline
    def withIntervalSeconds(value: Parameter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intervalSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntervalSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intervalSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withLimit(value: Parameter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxTimerLengthSeconds(value: Parameter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTimerLengthSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxTimerLengthSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTimerLengthSeconds")(js.undefined)
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
    @scala.inline
    def withNotes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notes")(js.undefined)
        ret
    }
    @scala.inline
    def withParameter(value: js.Array[Parameter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameter")(js.undefined)
        ret
    }
    @scala.inline
    def withParentFolderId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentFolderId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentFolderId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentFolderId")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
    @scala.inline
    def withSelector(value: Parameter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(js.undefined)
        ret
    }
    @scala.inline
    def withTagManagerUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagManagerUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagManagerUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagManagerUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalTimeMinMilliseconds(value: Parameter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalTimeMinMilliseconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalTimeMinMilliseconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalTimeMinMilliseconds")(js.undefined)
        ret
    }
    @scala.inline
    def withTriggerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTriggerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerId")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withUniqueTriggerId(value: Parameter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniqueTriggerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUniqueTriggerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniqueTriggerId")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalScrollPercentageList(value: Parameter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalScrollPercentageList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalScrollPercentageList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalScrollPercentageList")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibilitySelector(value: Parameter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibilitySelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibilitySelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibilitySelector")(js.undefined)
        ret
    }
    @scala.inline
    def withVisiblePercentageMax(value: Parameter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visiblePercentageMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisiblePercentageMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visiblePercentageMax")(js.undefined)
        ret
    }
    @scala.inline
    def withVisiblePercentageMin(value: Parameter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visiblePercentageMin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisiblePercentageMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visiblePercentageMin")(js.undefined)
        ret
    }
    @scala.inline
    def withWaitForTags(value: Parameter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaitForTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForTags")(js.undefined)
        ret
    }
    @scala.inline
    def withWaitForTagsTimeout(value: Parameter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForTagsTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaitForTagsTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForTagsTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkspaceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workspaceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkspaceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workspaceId")(js.undefined)
        ret
    }
  }
  
}

