package typingsSlinky.lyricist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientTimestamps extends js.Object {
  var lyrics_updated_at: Double = js.native
  var updated_by_human_at: Double = js.native
}

object ClientTimestamps {
  @scala.inline
  def apply(lyrics_updated_at: Double, updated_by_human_at: Double): ClientTimestamps = {
    val __obj = js.Dynamic.literal(lyrics_updated_at = lyrics_updated_at.asInstanceOf[js.Any], updated_by_human_at = updated_by_human_at.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientTimestamps]
  }
  @scala.inline
  implicit class ClientTimestampsOps[Self <: ClientTimestamps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLyrics_updated_at(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lyrics_updated_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdated_by_human_at(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated_by_human_at")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

