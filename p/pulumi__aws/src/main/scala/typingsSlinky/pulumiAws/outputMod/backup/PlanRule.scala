package typingsSlinky.pulumiAws.outputMod.backup

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlanRule extends js.Object {
  /**
    * The amount of time AWS Backup attempts a backup before canceling the job and returning an error.
    */
  var completionWindow: js.UndefOr[Double] = js.native
  /**
    * The lifecycle defines when a protected resource is transitioned to cold storage and when it expires.  Fields documented below.
    */
  var lifecycle: js.UndefOr[PlanRuleLifecycle] = js.native
  /**
    * Metadata that you can assign to help organize the resources that you create.
    */
  var recoveryPointTags: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * An display name for a backup rule.
    */
  var ruleName: String = js.native
  /**
    * A CRON expression specifying when AWS Backup initiates a backup job.
    */
  var schedule: js.UndefOr[String] = js.native
  /**
    * The amount of time in minutes before beginning a backup.
    */
  var startWindow: js.UndefOr[Double] = js.native
  /**
    * The name of a logical container where backups are stored.
    */
  var targetVaultName: String = js.native
}

object PlanRule {
  @scala.inline
  def apply(ruleName: String, targetVaultName: String): PlanRule = {
    val __obj = js.Dynamic.literal(ruleName = ruleName.asInstanceOf[js.Any], targetVaultName = targetVaultName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlanRule]
  }
  @scala.inline
  implicit class PlanRuleOps[Self <: PlanRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRuleName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruleName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetVaultName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetVaultName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompletionWindow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completionWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompletionWindow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completionWindow")(js.undefined)
        ret
    }
    @scala.inline
    def withLifecycle(value: PlanRuleLifecycle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lifecycle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLifecycle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lifecycle")(js.undefined)
        ret
    }
    @scala.inline
    def withRecoveryPointTags(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recoveryPointTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecoveryPointTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recoveryPointTags")(js.undefined)
        ret
    }
    @scala.inline
    def withSchedule(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schedule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchedule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schedule")(js.undefined)
        ret
    }
    @scala.inline
    def withStartWindow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartWindow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startWindow")(js.undefined)
        ret
    }
  }
  
}

