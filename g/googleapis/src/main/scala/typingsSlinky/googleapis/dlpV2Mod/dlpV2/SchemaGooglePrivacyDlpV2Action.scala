package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A task to execute on the completion of a job. See
  * https://cloud.google.com/dlp/docs/concepts-actions to learn more.
  */
@js.native
trait SchemaGooglePrivacyDlpV2Action extends js.Object {
  /**
    * Enable email notification to project owners and editors on job&#39;s
    * completion/failure.
    */
  var jobNotificationEmails: js.UndefOr[SchemaGooglePrivacyDlpV2JobNotificationEmails] = js.native
  /**
    * Publish a notification to a pubsub topic.
    */
  var pubSub: js.UndefOr[SchemaGooglePrivacyDlpV2PublishToPubSub] = js.native
  /**
    * Publish summary to Cloud Security Command Center (Alpha).
    */
  var publishSummaryToCscc: js.UndefOr[SchemaGooglePrivacyDlpV2PublishSummaryToCscc] = js.native
  /**
    * Save resulting findings in a provided location.
    */
  var saveFindings: js.UndefOr[SchemaGooglePrivacyDlpV2SaveFindings] = js.native
}

object SchemaGooglePrivacyDlpV2Action {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2Action = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2Action]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2ActionOps[Self <: SchemaGooglePrivacyDlpV2Action] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJobNotificationEmails(value: SchemaGooglePrivacyDlpV2JobNotificationEmails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobNotificationEmails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobNotificationEmails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobNotificationEmails")(js.undefined)
        ret
    }
    @scala.inline
    def withPubSub(value: SchemaGooglePrivacyDlpV2PublishToPubSub): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pubSub")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPubSub: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pubSub")(js.undefined)
        ret
    }
    @scala.inline
    def withPublishSummaryToCscc(value: SchemaGooglePrivacyDlpV2PublishSummaryToCscc): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publishSummaryToCscc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublishSummaryToCscc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publishSummaryToCscc")(js.undefined)
        ret
    }
    @scala.inline
    def withSaveFindings(value: SchemaGooglePrivacyDlpV2SaveFindings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveFindings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSaveFindings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveFindings")(js.undefined)
        ret
    }
  }
  
}

