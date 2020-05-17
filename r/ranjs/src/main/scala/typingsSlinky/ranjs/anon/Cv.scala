package typingsSlinky.ranjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cv extends js.Object {
  var cv: Double = js.native
  var mean: Double = js.native
  var std: Double = js.native
}

object Cv {
  @scala.inline
  def apply(cv: Double, mean: Double, std: Double): Cv = {
    val __obj = js.Dynamic.literal(cv = cv.asInstanceOf[js.Any], mean = mean.asInstanceOf[js.Any], std = std.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cv]
  }
  @scala.inline
  implicit class CvOps[Self <: Cv] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCv(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cv")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMean(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mean")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("std")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

