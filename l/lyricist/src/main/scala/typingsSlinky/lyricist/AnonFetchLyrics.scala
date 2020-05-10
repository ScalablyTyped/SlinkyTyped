package typingsSlinky.lyricist

import typingsSlinky.lyricist.mod.LyricistTextFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFetchLyrics extends js.Object {
  var fetchLyrics: js.UndefOr[Boolean] = js.native
  var textFormat: js.UndefOr[LyricistTextFormat] = js.native
}

object AnonFetchLyrics {
  @scala.inline
  def apply(): AnonFetchLyrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonFetchLyrics]
  }
  @scala.inline
  implicit class AnonFetchLyricsOps[Self <: AnonFetchLyrics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFetchLyrics(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchLyrics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFetchLyrics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchLyrics")(js.undefined)
        ret
    }
    @scala.inline
    def withTextFormat(value: LyricistTextFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textFormat")(js.undefined)
        ret
    }
  }
  
}

