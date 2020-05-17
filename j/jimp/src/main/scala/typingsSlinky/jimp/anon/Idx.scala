package typingsSlinky.jimp.anon

import typingsSlinky.jimp.mod.DepreciatedJimp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Idx extends js.Object {
  var idx: Double = js.native
  var image: DepreciatedJimp = js.native
  var x: Double = js.native
  var y: Double = js.native
}

object Idx {
  @scala.inline
  def apply(idx: Double, image: DepreciatedJimp, x: Double, y: Double): Idx = {
    val __obj = js.Dynamic.literal(idx = idx.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Idx]
  }
  @scala.inline
  implicit class IdxOps[Self <: Idx] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIdx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImage(value: DepreciatedJimp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

