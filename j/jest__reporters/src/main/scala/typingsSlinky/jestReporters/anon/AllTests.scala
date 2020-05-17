package typingsSlinky.jestReporters.anon

import typingsSlinky.jestReporters.typesMod.Test
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllTests extends js.Object {
  var allTests: Double = js.native
  var tests: js.Array[Test] = js.native
  var total: Double = js.native
}

object AllTests {
  @scala.inline
  def apply(allTests: Double, tests: js.Array[Test], total: Double): AllTests = {
    val __obj = js.Dynamic.literal(allTests = allTests.asInstanceOf[js.Any], tests = tests.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllTests]
  }
  @scala.inline
  implicit class AllTestsOps[Self <: AllTests] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllTests(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allTests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTests(value: js.Array[Test]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

