package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2.Intent

import typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2.Intent.TrainingPhrase.IPart
import typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2.Intent.TrainingPhrase.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a TrainingPhrase. */
@js.native
trait ITrainingPhrase extends js.Object {
  /** TrainingPhrase name */
  var name: js.UndefOr[String | Null] = js.native
  /** TrainingPhrase parts */
  var parts: js.UndefOr[js.Array[IPart] | Null] = js.native
  /** TrainingPhrase timesAddedCount */
  var timesAddedCount: js.UndefOr[Double | Null] = js.native
  /** TrainingPhrase type */
  var `type`: js.UndefOr[Type | Null] = js.native
}

object ITrainingPhrase {
  @scala.inline
  def apply(): ITrainingPhrase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITrainingPhrase]
  }
  @scala.inline
  implicit class ITrainingPhraseOps[Self <: ITrainingPhrase] (val x: Self) extends AnyVal {
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
    def withNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(null)
        ret
    }
    @scala.inline
    def withParts(value: js.Array[IPart]): Self = {
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
    def withPartsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parts")(null)
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
    def withTimesAddedCountNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timesAddedCount")(null)
        ret
    }
    @scala.inline
    def withType(value: Type): Self = {
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
    def withTypeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(null)
        ret
    }
  }
  
}

