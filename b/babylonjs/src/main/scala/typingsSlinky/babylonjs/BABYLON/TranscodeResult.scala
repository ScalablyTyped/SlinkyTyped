package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Result of transcoding a basis file
  */
@js.native
trait TranscodeResult extends js.Object {
  /**
    * Info about the .basis file
    */
  var fileInfo: BasisFileInfo = js.native
  /**
    * Format to use when loading the file
    */
  var format: Double = js.native
}

object TranscodeResult {
  @scala.inline
  def apply(fileInfo: BasisFileInfo, format: Double): TranscodeResult = {
    val __obj = js.Dynamic.literal(fileInfo = fileInfo.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranscodeResult]
  }
  @scala.inline
  implicit class TranscodeResultOps[Self <: TranscodeResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFileInfo(value: BasisFileInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormat(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

