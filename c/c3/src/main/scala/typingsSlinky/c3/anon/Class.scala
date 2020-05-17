package typingsSlinky.c3.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Class extends js.Object {
  /** Class to apply to the line. */
  var `class`: js.UndefOr[String] = js.native
  var value_x1: js.UndefOr[Double] = js.native
  var value_x2: js.UndefOr[Double] = js.native
  var value_y1: js.UndefOr[Double] = js.native
  var value_y2: js.UndefOr[Double] = js.native
}

object Class {
  @scala.inline
  def apply(): Class = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Class]
  }
  @scala.inline
  implicit class ClassOps[Self <: Class] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("class")(js.undefined)
        ret
    }
    @scala.inline
    def withValue_x1(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value_x1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue_x1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value_x1")(js.undefined)
        ret
    }
    @scala.inline
    def withValue_x2(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value_x2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue_x2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value_x2")(js.undefined)
        ret
    }
    @scala.inline
    def withValue_y1(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value_y1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue_y1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value_y1")(js.undefined)
        ret
    }
    @scala.inline
    def withValue_y2(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value_y2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue_y2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value_y2")(js.undefined)
        ret
    }
  }
  
}

