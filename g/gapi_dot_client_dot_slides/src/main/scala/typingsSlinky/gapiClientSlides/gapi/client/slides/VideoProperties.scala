package typingsSlinky.gapiClientSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoProperties extends js.Object {
  /**
    * The outline of the video. The default outline matches the defaults for new
    * videos created in the Slides editor.
    */
  var outline: js.UndefOr[Outline] = js.native
}

object VideoProperties {
  @scala.inline
  def apply(): VideoProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoProperties]
  }
  @scala.inline
  implicit class VideoPropertiesOps[Self <: VideoProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOutline(value: Outline): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outline")(js.undefined)
        ret
    }
  }
  
}

