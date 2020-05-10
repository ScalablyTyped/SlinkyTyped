package typingsSlinky.reactVirtualized.esCellMeasurerMod

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CellMeasurerChildProps extends js.Object {
  var registerChild: js.UndefOr[js.Function1[/* element */ Element, Unit]] = js.native
  def measure(): Unit = js.native
}

object CellMeasurerChildProps {
  @scala.inline
  def apply(measure: () => Unit): CellMeasurerChildProps = {
    val __obj = js.Dynamic.literal(measure = js.Any.fromFunction0(measure))
    __obj.asInstanceOf[CellMeasurerChildProps]
  }
  @scala.inline
  implicit class CellMeasurerChildPropsOps[Self <: CellMeasurerChildProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMeasure(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measure")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRegisterChild(value: /* element */ Element => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerChild")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRegisterChild: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerChild")(js.undefined)
        ret
    }
  }
  
}

