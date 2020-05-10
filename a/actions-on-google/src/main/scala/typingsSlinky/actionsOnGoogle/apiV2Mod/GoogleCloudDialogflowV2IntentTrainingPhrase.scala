package typingsSlinky.actionsOnGoogle.apiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleCloudDialogflowV2IntentTrainingPhrase extends js.Object {
  var name: js.UndefOr[String] = js.native
  var parts: js.UndefOr[js.Array[GoogleCloudDialogflowV2IntentTrainingPhrasePart]] = js.native
  var timesAddedCount: js.UndefOr[Double] = js.native
  var `type`: js.UndefOr[GoogleCloudDialogflowV2IntentTrainingPhraseType] = js.native
}

object GoogleCloudDialogflowV2IntentTrainingPhrase {
  @scala.inline
  def apply(): GoogleCloudDialogflowV2IntentTrainingPhrase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2IntentTrainingPhrase]
  }
  @scala.inline
  implicit class GoogleCloudDialogflowV2IntentTrainingPhraseOps[Self <: GoogleCloudDialogflowV2IntentTrainingPhrase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withParts(value: js.Array[GoogleCloudDialogflowV2IntentTrainingPhrasePart]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parts")(js.undefined)
        ret
    }
    @scala.inline
    def withTimesAddedCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timesAddedCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimesAddedCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timesAddedCount")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: GoogleCloudDialogflowV2IntentTrainingPhraseType): Self = {
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
  }
  
}

