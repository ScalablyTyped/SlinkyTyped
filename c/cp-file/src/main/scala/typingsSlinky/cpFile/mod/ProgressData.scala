package typingsSlinky.cpFile.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProgressData extends js.Object {
  /**
  		Absolute path to destination.
  		*/
  var dest: String = js.native
  /**
  		Copied percentage, a value between `0` and `1`.
  		*/
  var percent: Double = js.native
  /**
  		File size in bytes.
  		*/
  var size: Double = js.native
  /**
  		Absolute path to source.
  		*/
  var src: String = js.native
  /**
  		Copied size in bytes.
  		*/
  var written: Double = js.native
}

object ProgressData {
  @scala.inline
  def apply(dest: String, percent: Double, size: Double, src: String, written: Double): ProgressData = {
    val __obj = js.Dynamic.literal(dest = dest.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], written = written.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressData]
  }
  @scala.inline
  implicit class ProgressDataOps[Self <: ProgressData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDest(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPercent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSrc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWritten(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("written")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

