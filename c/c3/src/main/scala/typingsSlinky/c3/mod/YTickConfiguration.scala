package typingsSlinky.c3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait YTickConfiguration extends TickConfiguration {
  /**
    * A function to format y-axis tick values.
    */
  var format: js.UndefOr[js.Function1[/* x */ Double, String | Double]] = js.native
}

object YTickConfiguration {
  @scala.inline
  def apply(): YTickConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[YTickConfiguration]
  }
  @scala.inline
  implicit class YTickConfigurationOps[Self <: YTickConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormat(value: /* x */ Double => String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
  }
  
}

