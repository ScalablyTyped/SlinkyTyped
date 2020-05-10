package typingsSlinky.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Additional information about how a Cloud Dataflow job will be executed that
  * isn&#39;t contained in the submitted job.
  */
@js.native
trait SchemaJobExecutionInfo extends js.Object {
  /**
    * A mapping from each stage to the information about that stage.
    */
  var stages: js.UndefOr[StringDictionary[SchemaJobExecutionStageInfo]] = js.native
}

object SchemaJobExecutionInfo {
  @scala.inline
  def apply(): SchemaJobExecutionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaJobExecutionInfo]
  }
  @scala.inline
  implicit class SchemaJobExecutionInfoOps[Self <: SchemaJobExecutionInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStages(value: StringDictionary[SchemaJobExecutionStageInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stages")(js.undefined)
        ret
    }
  }
  
}

