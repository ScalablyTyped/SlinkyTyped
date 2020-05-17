package typingsSlinky.reactImageGallery.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CurrentIndex extends js.Object {
  var currentIndex: Double = js.native
  var item: this.type = js.native
  var itemIndex: Double = js.native
}

object CurrentIndex {
  @scala.inline
  def apply(currentIndex: Double, item: CurrentIndex, itemIndex: Double): CurrentIndex = {
    val __obj = js.Dynamic.literal(currentIndex = currentIndex.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], itemIndex = itemIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentIndex]
  }
  @scala.inline
  implicit class CurrentIndexOps[Self <: CurrentIndex] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItem(value: CurrentIndex): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemIndex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

