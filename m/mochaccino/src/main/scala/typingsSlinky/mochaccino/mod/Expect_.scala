package typingsSlinky.mochaccino.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Expect_ extends js.Object {
  var not: Expect_ = js.native
  def toBe(arg: js.Any): Unit = js.native
  def toBeDefined(): Unit = js.native
  def toBeFalsy(): Unit = js.native
  def toBeGreaterThan(other: Double): Unit = js.native
  def toBeLessThan(other: Double): Unit = js.native
  def toBeNull(): Unit = js.native
  def toBeTruthy(): Unit = js.native
  def toBeUndefined(): Unit = js.native
  def toContain(arg: js.Any): Unit = js.native
  def toEqual(arg: js.Any): Unit = js.native
  def toHaveBeenCalled(): Unit = js.native
  def toHaveBeenCalledTimes(callCount: Double): Unit = js.native
  def toHaveBeenCalledWith(arg: js.Any*): Unit = js.native
  def toMatch(matchExpression: js.Any): Unit = js.native
  def toThrow(): Unit = js.native
  def toThrowError(errType: js.Any): Unit = js.native
}

object Expect_ {
  @scala.inline
  def apply(
    not: Expect_,
    toBe: js.Any => Unit,
    toBeDefined: () => Unit,
    toBeFalsy: () => Unit,
    toBeGreaterThan: Double => Unit,
    toBeLessThan: Double => Unit,
    toBeNull: () => Unit,
    toBeTruthy: () => Unit,
    toBeUndefined: () => Unit,
    toContain: js.Any => Unit,
    toEqual: js.Any => Unit,
    toHaveBeenCalled: () => Unit,
    toHaveBeenCalledTimes: Double => Unit,
    toHaveBeenCalledWith: /* repeated */ js.Any => Unit,
    toMatch: js.Any => Unit,
    toThrow: () => Unit,
    toThrowError: js.Any => Unit
  ): Expect_ = {
    val __obj = js.Dynamic.literal(not = not.asInstanceOf[js.Any], toBe = js.Any.fromFunction1(toBe), toBeDefined = js.Any.fromFunction0(toBeDefined), toBeFalsy = js.Any.fromFunction0(toBeFalsy), toBeGreaterThan = js.Any.fromFunction1(toBeGreaterThan), toBeLessThan = js.Any.fromFunction1(toBeLessThan), toBeNull = js.Any.fromFunction0(toBeNull), toBeTruthy = js.Any.fromFunction0(toBeTruthy), toBeUndefined = js.Any.fromFunction0(toBeUndefined), toContain = js.Any.fromFunction1(toContain), toEqual = js.Any.fromFunction1(toEqual), toHaveBeenCalled = js.Any.fromFunction0(toHaveBeenCalled), toHaveBeenCalledTimes = js.Any.fromFunction1(toHaveBeenCalledTimes), toHaveBeenCalledWith = js.Any.fromFunction1(toHaveBeenCalledWith), toMatch = js.Any.fromFunction1(toMatch), toThrow = js.Any.fromFunction0(toThrow), toThrowError = js.Any.fromFunction1(toThrowError))
    __obj.asInstanceOf[Expect_]
  }
  @scala.inline
  implicit class Expect_Ops[Self <: Expect_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNot(value: Expect_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("not")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToBe(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toBe")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToBeDefined(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toBeDefined")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToBeFalsy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toBeFalsy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToBeGreaterThan(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toBeGreaterThan")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToBeLessThan(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toBeLessThan")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToBeNull(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toBeNull")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToBeTruthy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toBeTruthy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToBeUndefined(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toBeUndefined")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToContain(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toContain")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToEqual(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toEqual")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToHaveBeenCalled(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toHaveBeenCalled")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToHaveBeenCalledTimes(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toHaveBeenCalledTimes")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToHaveBeenCalledWith(value: /* repeated */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toHaveBeenCalledWith")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToMatch(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toMatch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToThrow(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toThrow")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToThrowError(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toThrowError")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

