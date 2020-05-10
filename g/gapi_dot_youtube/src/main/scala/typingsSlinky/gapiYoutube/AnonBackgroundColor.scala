package typingsSlinky.gapiYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBackgroundColor extends js.Object {
  /**
    * The text color for the video watch pages branded area.
    */
  var backgroundColor: String = js.native
  /**
    * An ID that uniquely identifies a playlist that displays next to the video player on the video watch page.
    */
  var featuredPlaylistId: String = js.native
  /**
    * The background color for the video watch pages branded area.
    */
  var textColor: String = js.native
}

object AnonBackgroundColor {
  @scala.inline
  def apply(backgroundColor: String, featuredPlaylistId: String, textColor: String): AnonBackgroundColor = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], featuredPlaylistId = featuredPlaylistId.asInstanceOf[js.Any], textColor = textColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBackgroundColor]
  }
  @scala.inline
  implicit class AnonBackgroundColorOps[Self <: AnonBackgroundColor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFeaturedPlaylistId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featuredPlaylistId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textColor")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

