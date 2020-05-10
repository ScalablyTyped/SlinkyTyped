package typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoPlayer extends js.Object {
  var embedHeight: js.UndefOr[String] = js.native
  var embedHtml: js.UndefOr[String] = js.native
  var embedWidth: js.UndefOr[String] = js.native
}

object VideoPlayer {
  @scala.inline
  def apply(): VideoPlayer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoPlayer]
  }
  @scala.inline
  implicit class VideoPlayerOps[Self <: VideoPlayer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmbedHeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("embedHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmbedHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("embedHeight")(js.undefined)
        ret
    }
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
    @scala.inline
    def withEmbedWidth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("embedWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmbedWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("embedWidth")(js.undefined)
        ret
    }
  }
  
}

