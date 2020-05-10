package typingsSlinky.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains information about how a particular google.dataflow.v1beta3.Step
  * will be executed.
  */
@js.native
trait SchemaJobExecutionStageInfo extends js.Object {
  /**
    * The steps associated with the execution stage. Note that stages may have
    * several steps, and that a given step might be run by more than one stage.
    */
  var stepName: js.UndefOr[js.Array[String]] = js.native
}

object SchemaJobExecutionStageInfo {
  @scala.inline
  def apply(): SchemaJobExecutionStageInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaJobExecutionStageInfo]
  }
  @scala.inline
  implicit class SchemaJobExecutionStageInfoOps[Self <: SchemaJobExecutionStageInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStepName(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStepName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepName")(js.undefined)
        ret
    }
  }
  
}

