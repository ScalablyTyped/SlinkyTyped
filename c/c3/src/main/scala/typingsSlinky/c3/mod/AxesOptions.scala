package typingsSlinky.c3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AxesOptions extends js.Object {
  /**
    * Switch x and y axis position.
    */
  var rotated: js.UndefOr[Boolean] = js.native
  /** x axis configuration. */
  var x: js.UndefOr[XAxisConfiguration] = js.native
  /** y axis configuration. */
  var y: js.UndefOr[YAxisConfigurationWithTime] = js.native
  /** y2 axis configuration. */
  var y2: js.UndefOr[YAxisConfiguration] = js.native
}

object AxesOptions {
  @scala.inline
  def apply(): AxesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AxesOptions]
  }
  @scala.inline
  implicit class AxesOptionsOps[Self <: AxesOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRotated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotated")(js.undefined)
        ret
    }
    @scala.inline
    def withX(value: XAxisConfiguration): Self = {
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
    def withY(value: YAxisConfigurationWithTime): Self = {
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
    def withY2(value: YAxisConfiguration): Self = {
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

