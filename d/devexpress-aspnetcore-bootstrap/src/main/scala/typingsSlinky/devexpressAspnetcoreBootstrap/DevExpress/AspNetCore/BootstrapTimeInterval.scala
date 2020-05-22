package typingsSlinky.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BootstrapTimeInterval extends js.Object {
  val instance: js.Any
  def contains(interval: BootstrapTimeInterval): Boolean
  def equals(interval: BootstrapTimeInterval): Boolean
  def getAllDay(): Boolean
  def getDuration(): Double
  def getEnd(): js.Date
  def getStart(): js.Date
  def intersectsWith(interval: BootstrapTimeInterval): Boolean
  def intersectsWithExcludingBounds(interval: BootstrapTimeInterval): Boolean
  def setAllDay(allDayValue: Boolean): Unit
  def setDuration(value: Double): Unit
  def setEnd(value: js.Date): Unit
  def setStart(value: js.Date): Unit
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
}

