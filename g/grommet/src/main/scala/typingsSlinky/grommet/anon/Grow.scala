package typingsSlinky.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Grow extends js.Object {
  var grow: js.UndefOr[Double] = js.native
  var shrink: js.UndefOr[Double] = js.native
}

object Grow {
  @scala.inline
  def apply(): Grow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Grow]
  }
  @scala.inline
  implicit class GrowOps[Self <: Grow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGrow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grow")(js.undefined)
        ret
    }
    @scala.inline
    def withShrink(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shrink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShrink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shrink")(js.undefined)
        ret
    }
  }
  
}

