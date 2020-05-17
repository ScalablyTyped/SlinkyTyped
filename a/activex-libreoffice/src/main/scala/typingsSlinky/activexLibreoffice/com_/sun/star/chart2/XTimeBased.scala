package typingsSlinky.activexLibreoffice.com_.sun.star.chart2

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XTimeBased extends XInterface {
  def setRange(start: Double, end: Double): Unit = js.native
  /**
    * point is the zero based index into the time based array
    * @returns FALSE if the point is outside of the supported array
    */
  def setToPointInTime(point: Double): Boolean = js.native
  /** @returns FALSE if the data wrapped around */
  def switchToNext(wrap: Boolean): Boolean = js.native
}

object XTimeBased {
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setRange: (Double, Double) => Unit,
    setToPointInTime: Double => Boolean,
    switchToNext: Boolean => Boolean
  ): XTimeBased = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setRange = js.Any.fromFunction2(setRange), setToPointInTime = js.Any.fromFunction1(setToPointInTime), switchToNext = js.Any.fromFunction1(switchToNext))
    __obj.asInstanceOf[XTimeBased]
  }
  @scala.inline
  implicit class XTimeBasedOps[Self <: XTimeBased] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSetRange(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetToPointInTime(value: Double => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setToPointInTime")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSwitchToNext(value: Boolean => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("switchToNext")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

