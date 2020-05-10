package typingsSlinky.gapiYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonItemCount extends js.Object {
  /**
    * The number of videos in the playlist.
    */
  var itemCount: Double = js.native
}

object AnonItemCount {
  @scala.inline
  def apply(itemCount: Double): AnonItemCount = {
    val __obj = js.Dynamic.literal(itemCount = itemCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonItemCount]
  }
  @scala.inline
  implicit class AnonItemCountOps[Self <: AnonItemCount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItemCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemCount")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

