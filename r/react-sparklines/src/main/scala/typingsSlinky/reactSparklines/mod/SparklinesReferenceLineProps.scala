package typingsSlinky.reactSparklines.mod

import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactSparklines.reactSparklinesStrings.avg
import typingsSlinky.reactSparklines.reactSparklinesStrings.custom
import typingsSlinky.reactSparklines.reactSparklinesStrings.max
import typingsSlinky.reactSparklines.reactSparklinesStrings.mean
import typingsSlinky.reactSparklines.reactSparklinesStrings.median
import typingsSlinky.reactSparklines.reactSparklinesStrings.min
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SparklinesReferenceLineProps extends js.Object {
  var style: js.UndefOr[CSSProperties] = js.native
  var `type`: js.UndefOr[max | min | mean | avg | median | custom] = js.native
  var value: js.UndefOr[Double] = js.native
}

object SparklinesReferenceLineProps {
  @scala.inline
  def apply(): SparklinesReferenceLineProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SparklinesReferenceLineProps]
  }
  @scala.inline
  implicit class SparklinesReferenceLinePropsOps[Self <: SparklinesReferenceLineProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: max | min | mean | avg | median | custom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

