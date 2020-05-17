package typingsSlinky.gapiYoutube.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemCount extends js.Object {
  /**
    * The number of videos in the playlist.
    */
  var itemCount: Double = js.native
}

object ItemCount {
  @scala.inline
  def apply(itemCount: Double): ItemCount = {
    val __obj = js.Dynamic.literal(itemCount = itemCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemCount]
  }
  @scala.inline
  implicit class ItemCountOps[Self <: ItemCount] (val x: Self) extends AnyVal {
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

