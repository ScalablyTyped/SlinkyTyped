package typingsSlinky.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BootstrapTimeInterval extends js.Object {
  val instance: js.Any = js.native
  def contains(interval: BootstrapTimeInterval): Boolean = js.native
  def equals(interval: BootstrapTimeInterval): Boolean = js.native
  def getAllDay(): Boolean = js.native
  def getDuration(): Double = js.native
  def getEnd(): js.Date = js.native
  def getStart(): js.Date = js.native
  def intersectsWith(interval: BootstrapTimeInterval): Boolean = js.native
  def intersectsWithExcludingBounds(interval: BootstrapTimeInterval): Boolean = js.native
  def setAllDay(allDayValue: Boolean): Unit = js.native
  def setDuration(value: Double): Unit = js.native
  def setEnd(value: js.Date): Unit = js.native
  def setStart(value: js.Date): Unit = js.native
}

object BootstrapTimeInterval {
  @scala.inline
  def apply(
    contains: BootstrapTimeInterval => Boolean,
    equals: BootstrapTimeInterval => Boolean,
    getAllDay: () => Boolean,
    getDuration: () => Double,
    getEnd: () => js.Date,
    getStart: () => js.Date,
    instance: js.Any,
    intersectsWith: BootstrapTimeInterval => Boolean,
    intersectsWithExcludingBounds: BootstrapTimeInterval => Boolean,
    setAllDay: Boolean => Unit,
    setDuration: Double => Unit,
    setEnd: js.Date => Unit,
    setStart: js.Date => Unit
  ): BootstrapTimeInterval = {
    val __obj = js.Dynamic.literal(contains = js.Any.fromFunction1(contains), equals = js.Any.fromFunction1(equals), getAllDay = js.Any.fromFunction0(getAllDay), getDuration = js.Any.fromFunction0(getDuration), getEnd = js.Any.fromFunction0(getEnd), getStart = js.Any.fromFunction0(getStart), instance = instance.asInstanceOf[js.Any], intersectsWith = js.Any.fromFunction1(intersectsWith), intersectsWithExcludingBounds = js.Any.fromFunction1(intersectsWithExcludingBounds), setAllDay = js.Any.fromFunction1(setAllDay), setDuration = js.Any.fromFunction1(setDuration), setEnd = js.Any.fromFunction1(setEnd), setStart = js.Any.fromFunction1(setStart))
    __obj.asInstanceOf[BootstrapTimeInterval]
  }
  @scala.inline
  implicit class BootstrapTimeIntervalOps[Self <: BootstrapTimeInterval] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContains(value: BootstrapTimeInterval => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contains")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEquals(value: BootstrapTimeInterval => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equals")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetAllDay(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAllDay")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDuration(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDuration")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetEnd(value: () => js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEnd")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetStart(value: () => js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStart")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInstance(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIntersectsWith(value: BootstrapTimeInterval => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intersectsWith")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIntersectsWithExcludingBounds(value: BootstrapTimeInterval => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intersectsWithExcludingBounds")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetAllDay(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAllDay")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetDuration(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDuration")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetEnd(value: js.Date => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetStart(value: js.Date => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStart")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

