package typingsSlinky.cypress.commonMod

import typingsSlinky.cypress.Mocha_
import typingsSlinky.cypress.Mocha_.Test_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestFunctions extends js.Object {
  /**
    * Exclusive test-case.
    */
  def only(mocha: Mocha_, test: Test_): Test_ = js.native
  /**
    * Number of retry attempts
    */
  def retries(n: Double): Unit = js.native
  /**
    * Pending test case.
    */
  def skip(title: String): Unit = js.native
}

object TestFunctions {
  @scala.inline
  def apply(only: (Mocha_, Test_) => Test_, retries: Double => Unit, skip: String => Unit): TestFunctions = {
    val __obj = js.Dynamic.literal(only = js.Any.fromFunction2(only), retries = js.Any.fromFunction1(retries), skip = js.Any.fromFunction1(skip))
    __obj.asInstanceOf[TestFunctions]
  }
  @scala.inline
  implicit class TestFunctionsOps[Self <: TestFunctions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnly(value: (Mocha_, Test_) => Test_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("only")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRetries(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retries")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSkip(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skip")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

