package typingsSlinky.googleAppsScript.GoogleAppsScript.Bigquery.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelDefinition extends js.Object {
  var modelOptions: js.UndefOr[ModelDefinitionModelOptions] = js.native
  var trainingRuns: js.UndefOr[js.Array[BqmlTrainingRun]] = js.native
}

object ModelDefinition {
  @scala.inline
  def apply(): ModelDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelDefinition]
  }
  @scala.inline
  implicit class ModelDefinitionOps[Self <: ModelDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withModelOptions(value: ModelDefinitionModelOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModelOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withTrainingRuns(value: js.Array[BqmlTrainingRun]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trainingRuns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrainingRuns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trainingRuns")(js.undefined)
        ret
    }
  }
  
}

