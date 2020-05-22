package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2.Intent

import typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2.Intent.TrainingPhrase.IPart
import typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2.Intent.TrainingPhrase.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a TrainingPhrase. */
trait ITrainingPhrase extends js.Object {
  /** TrainingPhrase name */
  var name: js.UndefOr[String | Null] = js.undefined
  /** TrainingPhrase parts */
  var parts: js.UndefOr[js.Array[IPart] | Null] = js.undefined
  /** TrainingPhrase timesAddedCount */
  var timesAddedCount: js.UndefOr[Double | Null] = js.undefined
  /** TrainingPhrase type */
  var `type`: js.UndefOr[Type | Null] = js.undefined
}

object ITrainingPhrase {
  @scala.inline
  def apply(
    name: js.UndefOr[Null | String] = js.undefined,
    parts: js.UndefOr[Null | js.Array[IPart]] = js.undefined,
    timesAddedCount: js.UndefOr[Null | Double] = js.undefined,
    `type`: js.UndefOr[Null | Type] = js.undefined
  ): ITrainingPhrase = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(name)) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(parts)) __obj.updateDynamic("parts")(parts.asInstanceOf[js.Any])
    if (!js.isUndefined(timesAddedCount)) __obj.updateDynamic("timesAddedCount")(timesAddedCount.asInstanceOf[js.Any])
    if (!js.isUndefined(`type`)) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITrainingPhrase]
  }
}

