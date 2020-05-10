package typingsSlinky.googleapis.tagmanagerV2Mod.tagmanagerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a Google Tag Manager Trigger
  */
@js.native
trait SchemaTrigger extends js.Object {
  /**
    * GTM Account ID.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * Used in the case of auto event tracking.
    */
  var autoEventFilter: js.UndefOr[js.Array[SchemaCondition]] = js.native
  /**
    * Whether or not we should only fire tags if the form submit or link click
    * event is not cancelled by some other event handler (e.g. because of
    * validation). Only valid for Form Submission and Link Click triggers.
    */
  var checkValidation: js.UndefOr[SchemaParameter] = js.native
  /**
    * GTM Container ID.
    */
  var containerId: js.UndefOr[String] = js.native
  /**
    * A visibility trigger minimum continuous visible time (in milliseconds).
    * Only valid for AMP Visibility trigger.
    */
  var continuousTimeMinMilliseconds: js.UndefOr[SchemaParameter] = js.native
  /**
    * Used in the case of custom event, which is fired iff all Conditions are
    * true.
    */
  var customEventFilter: js.UndefOr[js.Array[SchemaCondition]] = js.native
  /**
    * Name of the GTM event that is fired. Only valid for Timer triggers.
    */
  var eventName: js.UndefOr[SchemaParameter] = js.native
  /**
    * The trigger will only fire iff all Conditions are true.
    */
  var filter: js.UndefOr[js.Array[SchemaCondition]] = js.native
  /**
    * The fingerprint of the GTM Trigger as computed at storage time. This
    * value is recomputed whenever the trigger is modified.
    */
  var fingerprint: js.UndefOr[String] = js.native
  /**
    * List of integer percentage values for scroll triggers. The trigger will
    * fire when each percentage is reached when the view is scrolled
    * horizontally. Only valid for AMP scroll triggers.
    */
  var horizontalScrollPercentageList: js.UndefOr[SchemaParameter] = js.native
  /**
    * Time between triggering recurring Timer Events (in milliseconds). Only
    * valid for Timer triggers.
    */
  var interval: js.UndefOr[SchemaParameter] = js.native
  /**
    * Time between Timer Events to fire (in seconds). Only valid for AMP Timer
    * trigger.
    */
  var intervalSeconds: js.UndefOr[SchemaParameter] = js.native
  /**
    * Limit of the number of GTM events this Timer Trigger will fire. If no
    * limit is set, we will continue to fire GTM events until the user leaves
    * the page. Only valid for Timer triggers.
    */
  var limit: js.UndefOr[SchemaParameter] = js.native
  /**
    * Max time to fire Timer Events (in seconds). Only valid for AMP Timer
    * trigger.
    */
  var maxTimerLengthSeconds: js.UndefOr[SchemaParameter] = js.native
  /**
    * Trigger display name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * User notes on how to apply this trigger in the container.
    */
  var notes: js.UndefOr[String] = js.native
  /**
    * Additional parameters.
    */
  var parameter: js.UndefOr[js.Array[SchemaParameter]] = js.native
  /**
    * Parent folder id.
    */
  var parentFolderId: js.UndefOr[String] = js.native
  /**
    * GTM Trigger&#39;s API relative path.
    */
  var path: js.UndefOr[String] = js.native
  /**
    * A click trigger CSS selector (i.e. &quot;a&quot;, &quot;button&quot;
    * etc.). Only valid for AMP Click trigger.
    */
  var selector: js.UndefOr[SchemaParameter] = js.native
  /**
    * Auto generated link to the tag manager UI
    */
  var tagManagerUrl: js.UndefOr[String] = js.native
  /**
    * A visibility trigger minimum total visible time (in milliseconds). Only
    * valid for AMP Visibility trigger.
    */
  var totalTimeMinMilliseconds: js.UndefOr[SchemaParameter] = js.native
  /**
    * The Trigger ID uniquely identifies the GTM Trigger.
    */
  var triggerId: js.UndefOr[String] = js.native
  /**
    * Defines the data layer event that causes this trigger.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * Globally unique id of the trigger that auto-generates this (a Form
    * Submit, Link Click or Timer listener) if any. Used to make incompatible
    * auto-events work together with trigger filtering based on trigger ids.
    * This value is populated during output generation since the tags implied
    * by triggers don&#39;t exist until then. Only valid for Form Submit, Link
    * Click and Timer triggers.
    */
  var uniqueTriggerId: js.UndefOr[SchemaParameter] = js.native
  /**
    * List of integer percentage values for scroll triggers. The trigger will
    * fire when each percentage is reached when the view is scrolled
    * vertically. Only valid for AMP scroll triggers.
    */
  var verticalScrollPercentageList: js.UndefOr[SchemaParameter] = js.native
  /**
    * A visibility trigger CSS selector (i.e. &quot;#id&quot;). Only valid for
    * AMP Visibility trigger.
    */
  var visibilitySelector: js.UndefOr[SchemaParameter] = js.native
  /**
    * A visibility trigger maximum percent visibility. Only valid for AMP
    * Visibility trigger.
    */
  var visiblePercentageMax: js.UndefOr[SchemaParameter] = js.native
  /**
    * A visibility trigger minimum percent visibility. Only valid for AMP
    * Visibility trigger.
    */
  var visiblePercentageMin: js.UndefOr[SchemaParameter] = js.native
  /**
    * Whether or not we should delay the form submissions or link opening until
    * all of the tags have fired (by preventing the default action and later
    * simulating the default action). Only valid for Form Submission and Link
    * Click triggers.
    */
  var waitForTags: js.UndefOr[SchemaParameter] = js.native
  /**
    * How long to wait (in milliseconds) for tags to fire when
    * &#39;waits_for_tags&#39; above evaluates to true. Only valid for Form
    * Submission and Link Click triggers.
    */
  var waitForTagsTimeout: js.UndefOr[SchemaParameter] = js.native
  /**
    * GTM Workspace ID.
    */
  var workspaceId: js.UndefOr[String] = js.native
}

object SchemaTrigger {
  @scala.inline
  def apply(): SchemaTrigger = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTrigger]
  }
  @scala.inline
  implicit class SchemaTriggerOps[Self <: SchemaTrigger] (val x: Self) extends AnyVal {
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
    def withAutoEventFilter(value: js.Array[SchemaCondition]): Self = {
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
    def withCheckValidation(value: SchemaParameter): Self = {
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
    def withContinuousTimeMinMilliseconds(value: SchemaParameter): Self = {
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
    def withCustomEventFilter(value: js.Array[SchemaCondition]): Self = {
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
    def withEventName(value: SchemaParameter): Self = {
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
    def withFilter(value: js.Array[SchemaCondition]): Self = {
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
    def withHorizontalScrollPercentageList(value: SchemaParameter): Self = {
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
    def withInterval(value: SchemaParameter): Self = {
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
    def withIntervalSeconds(value: SchemaParameter): Self = {
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
    def withLimit(value: SchemaParameter): Self = {
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
    def withMaxTimerLengthSeconds(value: SchemaParameter): Self = {
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
    def withParameter(value: js.Array[SchemaParameter]): Self = {
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
    def withSelector(value: SchemaParameter): Self = {
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
    def withTotalTimeMinMilliseconds(value: SchemaParameter): Self = {
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
    def withUniqueTriggerId(value: SchemaParameter): Self = {
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
    def withVerticalScrollPercentageList(value: SchemaParameter): Self = {
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
    def withVisibilitySelector(value: SchemaParameter): Self = {
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
    def withVisiblePercentageMax(value: SchemaParameter): Self = {
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
    def withVisiblePercentageMin(value: SchemaParameter): Self = {
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
    def withWaitForTags(value: SchemaParameter): Self = {
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
    def withWaitForTagsTimeout(value: SchemaParameter): Self = {
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

