package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConversionTask extends js.Object {
  /**
    * The ID of the conversion task.
    */
  var ConversionTaskId: js.UndefOr[String] = js.native
  /**
    * The time when the task expires. If the upload isn't complete before the expiration time, we automatically cancel the task.
    */
  var ExpirationTime: js.UndefOr[String] = js.native
  /**
    * If the task is for importing an instance, this contains information about the import instance task.
    */
  var ImportInstance: js.UndefOr[ImportInstanceTaskDetails] = js.native
  /**
    * If the task is for importing a volume, this contains information about the import volume task.
    */
  var ImportVolume: js.UndefOr[ImportVolumeTaskDetails] = js.native
  /**
    * The state of the conversion task.
    */
  var State: js.UndefOr[ConversionTaskState] = js.native
  /**
    * The status message related to the conversion task.
    */
  var StatusMessage: js.UndefOr[String] = js.native
  /**
    * Any tags assigned to the task.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object ConversionTask {
  @scala.inline
  def apply(): ConversionTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConversionTask]
  }
  @scala.inline
  implicit class ConversionTaskOps[Self <: ConversionTask] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConversionTaskId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConversionTaskId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConversionTaskId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConversionTaskId")(js.undefined)
        ret
    }
    @scala.inline
    def withExpirationTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpirationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpirationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpirationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withImportInstance(value: ImportInstanceTaskDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImportInstance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImportInstance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImportInstance")(js.undefined)
        ret
    }
    @scala.inline
    def withImportVolume(value: ImportVolumeTaskDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImportVolume")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImportVolume: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImportVolume")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: ConversionTaskState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
  }
  
}

