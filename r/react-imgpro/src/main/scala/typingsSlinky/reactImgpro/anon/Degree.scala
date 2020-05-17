package typingsSlinky.reactImgpro.anon

import typingsSlinky.reactImgpro.mod.ReactImgpro.Mode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Degree extends js.Object {
  var degree: Double = js.native
  var mode: Mode = js.native
}

object Degree {
  @scala.inline
  def apply(degree: Double, mode: Mode): Degree = {
    val __obj = js.Dynamic.literal(degree = degree.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Degree]
  }
  @scala.inline
  implicit class DegreeOps[Self <: Degree] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDegree(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("degree")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMode(value: Mode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

