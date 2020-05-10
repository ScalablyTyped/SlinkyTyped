package typingsSlinky.jimpCore.jimpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiffReturn[This] extends js.Object {
  var image: This = js.native
  var percent: Double = js.native
}

object DiffReturn {
  @scala.inline
  def apply[This](image: This, percent: Double): DiffReturn[This] = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiffReturn[This]]
  }
  @scala.inline
  implicit class DiffReturnOps[Self[`this`] <: DiffReturn[`this`], This] (val x: Self[This]) extends AnyVal {
    @scala.inline
    def duplicate: Self[This] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[This]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[This] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[This] with Other]
    @scala.inline
    def withImage(value: This): Self[This] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPercent(value: Double): Self[This] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

