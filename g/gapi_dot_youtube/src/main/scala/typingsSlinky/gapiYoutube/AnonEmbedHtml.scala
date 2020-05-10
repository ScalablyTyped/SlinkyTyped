package typingsSlinky.gapiYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEmbedHtml extends js.Object {
  /**
    * An <iframe> tag that embeds a player that will play the video.
    */
  var embedHtml: String = js.native
}

object AnonEmbedHtml {
  @scala.inline
  def apply(embedHtml: String): AnonEmbedHtml = {
    val __obj = js.Dynamic.literal(embedHtml = embedHtml.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEmbedHtml]
  }
  @scala.inline
  implicit class AnonEmbedHtmlOps[Self <: AnonEmbedHtml] (val x: Self) extends AnyVal {
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
  }
  
}

