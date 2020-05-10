package typingsSlinky.cpy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProgressData extends js.Object {
  /**
  		Copied file count.
  		*/
  var completedFiles: Double = js.native
  /**
  		Completed size in bytes.
  		*/
  var completedSize: Double = js.native
  /**
  		Completed percentage. A value between `0` and `1`.
  		*/
  var percent: Double = js.native
  /**
  		Overall file count.
  		*/
  var totalFiles: Double = js.native
}

object ProgressData {
  @scala.inline
  def apply(completedFiles: Double, completedSize: Double, percent: Double, totalFiles: Double): ProgressData = {
    val __obj = js.Dynamic.literal(completedFiles = completedFiles.asInstanceOf[js.Any], completedSize = completedSize.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any], totalFiles = totalFiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressData]
  }
  @scala.inline
  implicit class ProgressDataOps[Self <: ProgressData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompletedFiles(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completedFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompletedSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completedSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPercent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalFiles(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalFiles")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

