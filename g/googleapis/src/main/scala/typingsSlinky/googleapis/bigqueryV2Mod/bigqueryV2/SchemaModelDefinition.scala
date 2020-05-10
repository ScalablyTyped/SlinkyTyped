package typingsSlinky.googleapis.bigqueryV2Mod.bigqueryV2

import typingsSlinky.googleapis.AnonLabels
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaModelDefinition extends js.Object {
  /**
    * [Output-only, Beta] Model options used for the first training run. These
    * options are immutable for subsequent training runs. Default values are
    * used for any options not specified in the input query.
    */
  var modelOptions: js.UndefOr[AnonLabels] = js.native
  /**
    * [Output-only, Beta] Information about ml training runs, each training run
    * comprises of multiple iterations and there may be multiple training runs
    * for the model if warm start is used or if a user decides to continue a
    * previously cancelled query.
    */
  var trainingRuns: js.UndefOr[js.Array[SchemaBqmlTrainingRun]] = js.native
}

object SchemaModelDefinition {
  @scala.inline
  def apply(): SchemaModelDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaModelDefinition]
  }
  @scala.inline
  implicit class SchemaModelDefinitionOps[Self <: SchemaModelDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withModelOptions(value: AnonLabels): Self = {
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
    def withTrainingRuns(value: js.Array[SchemaBqmlTrainingRun]): Self = {
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

