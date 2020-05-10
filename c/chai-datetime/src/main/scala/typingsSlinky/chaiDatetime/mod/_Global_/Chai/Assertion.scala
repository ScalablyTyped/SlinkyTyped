package typingsSlinky.chaiDatetime.mod._Global_.Chai

import typingsSlinky.chaiDatetime.mod._Global_.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Assertion extends js.Object {
  def afterDate(date: Date): Assertion = js.native
  def afterTime(date: Date): Assertion = js.native
  def beforeDate(date: Date): Assertion = js.native
  def beforeTime(date: Date): Assertion = js.native
  def equalDate(date: Date): Assertion = js.native
  def equalTime(date: Date): Assertion = js.native
  def withinDate(dateFrom: Date, dateTo: Date): Assertion = js.native
  def withinTime(dateFrom: Date, dateTo: Date): Assertion = js.native
}

object Assertion {
  @scala.inline
  def apply(
    afterDate: Date => Assertion,
    afterTime: Date => Assertion,
    beforeDate: Date => Assertion,
    beforeTime: Date => Assertion,
    equalDate: Date => Assertion,
    equalTime: Date => Assertion,
    withinDate: (Date, Date) => Assertion,
    withinTime: (Date, Date) => Assertion
  ): Assertion = {
    val __obj = js.Dynamic.literal(afterDate = js.Any.fromFunction1(afterDate), afterTime = js.Any.fromFunction1(afterTime), beforeDate = js.Any.fromFunction1(beforeDate), beforeTime = js.Any.fromFunction1(beforeTime), equalDate = js.Any.fromFunction1(equalDate), equalTime = js.Any.fromFunction1(equalTime), withinDate = js.Any.fromFunction2(withinDate), withinTime = js.Any.fromFunction2(withinTime))
    __obj.asInstanceOf[Assertion]
  }
  @scala.inline
  implicit class AssertionOps[Self <: Assertion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterDate(value: Date => Assertion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterDate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAfterTime(value: Date => Assertion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterTime")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBeforeDate(value: Date => Assertion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeDate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBeforeTime(value: Date => Assertion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeTime")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEqualDate(value: Date => Assertion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equalDate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEqualTime(value: Date => Assertion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equalTime")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWithinDate(value: (Date, Date) => Assertion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withinDate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withWithinTime(value: (Date, Date) => Assertion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withinTime")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

