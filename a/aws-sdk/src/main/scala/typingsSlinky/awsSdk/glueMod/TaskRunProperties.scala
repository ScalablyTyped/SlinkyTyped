package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskRunProperties extends js.Object {
  /**
    * The configuration properties for an exporting labels task run.
    */
  var ExportLabelsTaskRunProperties: js.UndefOr[typingsSlinky.awsSdk.glueMod.ExportLabelsTaskRunProperties] = js.native
  /**
    * The configuration properties for a find matches task run.
    */
  var FindMatchesTaskRunProperties: js.UndefOr[typingsSlinky.awsSdk.glueMod.FindMatchesTaskRunProperties] = js.native
  /**
    * The configuration properties for an importing labels task run.
    */
  var ImportLabelsTaskRunProperties: js.UndefOr[typingsSlinky.awsSdk.glueMod.ImportLabelsTaskRunProperties] = js.native
  /**
    * The configuration properties for a labeling set generation task run.
    */
  var LabelingSetGenerationTaskRunProperties: js.UndefOr[typingsSlinky.awsSdk.glueMod.LabelingSetGenerationTaskRunProperties] = js.native
  /**
    * The type of task run.
    */
  var TaskType: js.UndefOr[typingsSlinky.awsSdk.glueMod.TaskType] = js.native
}

object TaskRunProperties {
  @scala.inline
  def apply(): TaskRunProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskRunProperties]
  }
  @scala.inline
  implicit class TaskRunPropertiesOps[Self <: TaskRunProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExportLabelsTaskRunProperties(value: ExportLabelsTaskRunProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExportLabelsTaskRunProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExportLabelsTaskRunProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExportLabelsTaskRunProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withFindMatchesTaskRunProperties(value: FindMatchesTaskRunProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FindMatchesTaskRunProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFindMatchesTaskRunProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FindMatchesTaskRunProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withImportLabelsTaskRunProperties(value: ImportLabelsTaskRunProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImportLabelsTaskRunProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImportLabelsTaskRunProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImportLabelsTaskRunProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelingSetGenerationTaskRunProperties(value: LabelingSetGenerationTaskRunProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LabelingSetGenerationTaskRunProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelingSetGenerationTaskRunProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LabelingSetGenerationTaskRunProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withTaskType(value: TaskType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TaskType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TaskType")(js.undefined)
        ret
    }
  }
  
}

