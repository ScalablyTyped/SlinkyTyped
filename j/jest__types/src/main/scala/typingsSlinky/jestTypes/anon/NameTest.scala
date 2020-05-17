package typingsSlinky.jestTypes.anon

import typingsSlinky.jestTypes.circusMod.Event
import typingsSlinky.jestTypes.circusMod.TestEntry
import typingsSlinky.jestTypes.jestTypesStrings.test_fn_success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NameTest extends Event {
  var name: test_fn_success = js.native
  var test: TestEntry = js.native
}

object NameTest {
  @scala.inline
  def apply(name: test_fn_success, test: TestEntry): NameTest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameTest]
  }
  @scala.inline
  implicit class NameTestOps[Self <: NameTest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: test_fn_success): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTest(value: TestEntry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

