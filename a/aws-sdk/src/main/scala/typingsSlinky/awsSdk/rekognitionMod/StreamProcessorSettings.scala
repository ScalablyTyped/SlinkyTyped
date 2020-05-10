package typingsSlinky.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamProcessorSettings extends js.Object {
  /**
    * Face search settings to use on a streaming video. 
    */
  var FaceSearch: js.UndefOr[FaceSearchSettings] = js.native
}

object StreamProcessorSettings {
  @scala.inline
  def apply(): StreamProcessorSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamProcessorSettings]
  }
  @scala.inline
  implicit class StreamProcessorSettingsOps[Self <: StreamProcessorSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFaceSearch(value: FaceSearchSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FaceSearch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFaceSearch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FaceSearch")(js.undefined)
        ret
    }
  }
  
}

