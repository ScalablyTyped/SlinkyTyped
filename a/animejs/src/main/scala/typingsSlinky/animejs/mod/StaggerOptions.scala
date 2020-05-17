package typingsSlinky.animejs.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.animejs.animejsStrings.center
import typingsSlinky.animejs.animejsStrings.first
import typingsSlinky.animejs.animejsStrings.last
import typingsSlinky.animejs.animejsStrings.normal
import typingsSlinky.animejs.animejsStrings.reverse
import typingsSlinky.animejs.animejsStrings.x
import typingsSlinky.animejs.animejsStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StaggerOptions extends js.Object {
  var axis: js.UndefOr[x | y] = js.native
  var direction: js.UndefOr[normal | reverse] = js.native
  var easing: js.UndefOr[CustomEasingFunction | String | EasingOptions] = js.native
  var from: js.UndefOr[first | last | center | Double] = js.native
  var grid: js.UndefOr[js.Array[Double]] = js.native
  var start: js.UndefOr[Double | String] = js.native
}

object StaggerOptions {
  @scala.inline
  def apply(): StaggerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StaggerOptions]
  }
  @scala.inline
  implicit class StaggerOptionsOps[Self <: StaggerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAxis(value: typingsSlinky.animejs.animejsStrings.x | y): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axis")(js.undefined)
        ret
    }
    @scala.inline
    def withDirection(value: normal | reverse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
    @scala.inline
    def withEasingFunction3(
      value: (/* el */ HTMLElement, /* index */ Double, /* length */ Double) => js.Function1[/* time */ Double, Double]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withEasing(value: CustomEasingFunction | String | EasingOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEasing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(js.undefined)
        ret
    }
    @scala.inline
    def withFrom(value: first | last | center | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(js.undefined)
        ret
    }
    @scala.inline
    def withGrid(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
        ret
    }
  }
  
}

