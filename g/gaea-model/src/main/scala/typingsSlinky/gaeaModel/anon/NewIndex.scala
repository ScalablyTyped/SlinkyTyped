package typingsSlinky.gaeaModel.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NewIndex extends js.Object {
  var newIndex: Double = js.native
  var oldIndex: Double = js.native
}

object NewIndex {
  @scala.inline
  def apply(newIndex: Double, oldIndex: Double): NewIndex = {
    val __obj = js.Dynamic.literal(newIndex = newIndex.asInstanceOf[js.Any], oldIndex = oldIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewIndex]
  }
  @scala.inline
  implicit class NewIndexOps[Self <: NewIndex] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldIndex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

