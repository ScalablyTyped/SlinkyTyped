package typingsSlinky.gapiYoutube.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NewItemCount extends js.Object {
  /**
    *
    */
  var newItemCount: Double = js.native
  /**
    *
    */
  var totalItemCount: Double = js.native
}

object NewItemCount {
  @scala.inline
  def apply(newItemCount: Double, totalItemCount: Double): NewItemCount = {
    val __obj = js.Dynamic.literal(newItemCount = newItemCount.asInstanceOf[js.Any], totalItemCount = totalItemCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewItemCount]
  }
  @scala.inline
  implicit class NewItemCountOps[Self <: NewItemCount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewItemCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newItemCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalItemCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalItemCount")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

