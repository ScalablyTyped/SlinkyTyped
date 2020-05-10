package typingsSlinky.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaPlaylistPlayer extends js.Object {
  /**
    * An &lt;iframe&gt; tag that embeds a player that will play the playlist.
    */
  var embedHtml: js.UndefOr[String] = js.native
}

object SchemaPlaylistPlayer {
  @scala.inline
  def apply(): SchemaPlaylistPlayer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlaylistPlayer]
  }
  @scala.inline
  implicit class SchemaPlaylistPlayerOps[Self <: SchemaPlaylistPlayer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmbedHtml(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("embedHtml")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmbedHtml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("embedHtml")(js.undefined)
        ret
    }
  }
  
}

