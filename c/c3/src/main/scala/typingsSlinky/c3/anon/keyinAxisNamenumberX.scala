package typingsSlinky.c3.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ key in c3.c3.AxisName ]:? number} */
@js.native
trait keyinAxisNamenumberX extends js.Object {
  var x: js.UndefOr[Double] = js.native
  var y: js.UndefOr[Double] = js.native
  var y2: js.UndefOr[Double] = js.native
}

object keyinAxisNamenumberX {
  @scala.inline
  def apply(): keyinAxisNamenumberX = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[keyinAxisNamenumberX]
  }
  @scala.inline
  implicit class keyinAxisNamenumberXOps[Self <: keyinAxisNamenumberX] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(js.undefined)
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(js.undefined)
        ret
    }
    @scala.inline
    def withY2(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutY2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y2")(js.undefined)
        ret
    }
  }
  
}

