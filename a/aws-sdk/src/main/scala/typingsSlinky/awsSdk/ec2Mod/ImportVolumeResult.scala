package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportVolumeResult extends js.Object {
  /**
    * Information about the conversion task.
    */
  var ConversionTask: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.ConversionTask] = js.native
}

object ImportVolumeResult {
  @scala.inline
  def apply(): ImportVolumeResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportVolumeResult]
  }
  @scala.inline
  implicit class ImportVolumeResultOps[Self <: ImportVolumeResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConversionTask(value: ConversionTask): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConversionTask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConversionTask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConversionTask")(js.undefined)
        ret
    }
  }
  
}

