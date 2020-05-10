package typingsSlinky.jimpCore.jimpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScanIteratorReturn[This] extends js.Object {
  var idx: Double = js.native
  var image: This = js.native
  var x: Double = js.native
  var y: Double = js.native
}

object ScanIteratorReturn {
  @scala.inline
  def apply[This](idx: Double, image: This, x: Double, y: Double): ScanIteratorReturn[This] = {
    val __obj = js.Dynamic.literal(idx = idx.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScanIteratorReturn[This]]
  }
  @scala.inline
  implicit class ScanIteratorReturnOps[Self[`this`] <: ScanIteratorReturn[`this`], This] (val x: Self[This]) extends AnyVal {
    @scala.inline
    def duplicate: Self[This] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[This]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[This] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[This] with Other]
    @scala.inline
    def withIdx(value: Double): Self[This] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImage(value: This): Self[This] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX(value: Double): Self[This] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: Double): Self[This] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

