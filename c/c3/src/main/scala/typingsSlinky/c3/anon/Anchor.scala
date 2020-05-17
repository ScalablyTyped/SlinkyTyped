package typingsSlinky.c3.anon

import typingsSlinky.c3.c3Strings.`bottom-left`
import typingsSlinky.c3.c3Strings.`bottom-right`
import typingsSlinky.c3.c3Strings.`top-left`
import typingsSlinky.c3.c3Strings.`top-right`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anchor extends js.Object {
  /**
    * Decides the position of the legend.
    * Defaults to `"top-left"`.
    */
  var anchor: js.UndefOr[`top-left` | `top-right` | `bottom-left` | `bottom-right`] = js.native
  /**
    * Defines the max step the legend has (e.g. If `step=2` and legend has 3 items, the legend has 2 columns).
    */
  var step: js.UndefOr[Double] = js.native
  /**
    * Set the horizontal position of the legend based on the anchor.
    * Defaults to `10`.
    */
  var x: js.UndefOr[Double] = js.native
  /**
    * Set the vertical position of the legend based on the anchor.
    * Defaults to `0`.
    */
  var y: js.UndefOr[Double] = js.native
}

object Anchor {
  @scala.inline
  def apply(): Anchor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Anchor]
  }
  @scala.inline
  implicit class AnchorOps[Self <: Anchor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnchor(value: `top-left` | `top-right` | `bottom-left` | `bottom-right`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnchor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchor")(js.undefined)
        ret
    }
    @scala.inline
    def withStep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(js.undefined)
        ret
    }
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
  }
  
}

