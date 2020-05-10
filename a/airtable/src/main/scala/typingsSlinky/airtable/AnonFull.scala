package typingsSlinky.airtable

import typingsSlinky.airtable.mod._Global_.Airtable.Thumbnail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFull extends js.Object {
  var full: Thumbnail = js.native
  var large: Thumbnail = js.native
  var small: Thumbnail = js.native
}

object AnonFull {
  @scala.inline
  def apply(full: Thumbnail, large: Thumbnail, small: Thumbnail): AnonFull = {
    val __obj = js.Dynamic.literal(full = full.asInstanceOf[js.Any], large = large.asInstanceOf[js.Any], small = small.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFull]
  }
  @scala.inline
  implicit class AnonFullOps[Self <: AnonFull] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFull(value: Thumbnail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("full")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLarge(value: Thumbnail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("large")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSmall(value: Thumbnail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("small")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

