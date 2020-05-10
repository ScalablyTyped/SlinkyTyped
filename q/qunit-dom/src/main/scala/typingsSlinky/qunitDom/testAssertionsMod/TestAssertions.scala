package typingsSlinky.qunitDom.testAssertionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestAssertions extends js.Object {
  var results: js.Array[_] = js.native
  def dom(target: js.Any, rootElement: js.Any): typingsSlinky.qunitDom.assertionsMod.default = js.native
  def pushResult(result: js.Any): Unit = js.native
}

object TestAssertions {
  @scala.inline
  def apply(
    dom: (js.Any, js.Any) => typingsSlinky.qunitDom.assertionsMod.default,
    pushResult: js.Any => Unit,
    results: js.Array[_]
  ): TestAssertions = {
    val __obj = js.Dynamic.literal(dom = js.Any.fromFunction2(dom), pushResult = js.Any.fromFunction1(pushResult), results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestAssertions]
  }
  @scala.inline
  implicit class TestAssertionsOps[Self <: TestAssertions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDom(value: (js.Any, js.Any) => typingsSlinky.qunitDom.assertionsMod.default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dom")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPushResult(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pushResult")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withResults(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("results")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

