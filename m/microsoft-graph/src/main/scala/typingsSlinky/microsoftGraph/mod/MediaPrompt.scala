package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaPrompt extends Prompt {
  var mediaInfo: js.UndefOr[MediaInfo] = js.native
}

object MediaPrompt {
  @scala.inline
  def apply(): MediaPrompt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaPrompt]
  }
  @scala.inline
  implicit class MediaPromptOps[Self <: MediaPrompt] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMediaInfo(value: MediaInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediaInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaInfo")(js.undefined)
        ret
    }
  }
  
}

