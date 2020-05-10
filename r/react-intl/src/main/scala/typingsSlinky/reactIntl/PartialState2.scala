package typingsSlinky.reactIntl

import typingsSlinky.formatjsIntlRelativetimeformat.mod.Unit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-intl.react-intl.State_2> */
@js.native
trait PartialState2 extends js.Object {
  var currentValueInSeconds: js.UndefOr[Double] = js.native
  var prevUnit: js.UndefOr[Unit] = js.native
  var prevValue: js.UndefOr[Double] = js.native
}

object PartialState2 {
  @scala.inline
  def apply(): PartialState2 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialState2]
  }
  @scala.inline
  implicit class PartialState2Ops[Self <: PartialState2] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentValueInSeconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentValueInSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentValueInSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentValueInSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withPrevUnit(value: Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrevUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevUnit")(js.undefined)
        ret
    }
    @scala.inline
    def withPrevValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrevValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevValue")(js.undefined)
        ret
    }
  }
  
}

