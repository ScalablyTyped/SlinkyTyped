package typingsSlinky.gapiClientFirebaserules.gapi.client.firebaserules

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestSuite extends js.Object {
  /** Collection of test cases associated with the `TestSuite`. */
  var testCases: js.UndefOr[js.Array[TestCase]] = js.native
}

object TestSuite {
  @scala.inline
  def apply(): TestSuite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestSuite]
  }
  @scala.inline
  implicit class TestSuiteOps[Self <: TestSuite] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTestCases(value: js.Array[TestCase]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testCases")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTestCases: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testCases")(js.undefined)
        ret
    }
  }
  
}

