package typingsSlinky.jestTypes.anon

import typingsSlinky.jestTypes.circusMod.Event
import typingsSlinky.jestTypes.circusMod.TestFn
import typingsSlinky.jestTypes.circusMod.TestMode
import typingsSlinky.jestTypes.circusMod.TestName
import typingsSlinky.jestTypes.globalMod.DoneFn
import typingsSlinky.jestTypes.jestTypesStrings.add_test
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mode extends Event {
  var asyncError: js.Error = js.native
  var fn: js.UndefOr[TestFn] = js.native
  var mode: js.UndefOr[TestMode] = js.native
  var name: add_test = js.native
  var testName: TestName = js.native
  var timeout: js.UndefOr[Double] = js.native
}

object Mode {
  @scala.inline
  def apply(asyncError: js.Error, name: add_test, testName: TestName): Mode = {
    val __obj = js.Dynamic.literal(asyncError = asyncError.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], testName = testName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mode]
  }
  @scala.inline
  implicit class ModeOps[Self <: Mode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAsyncError(value: js.Error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: add_test): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestName(value: TestName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFn(value: /* done */ js.UndefOr[DoneFn] => js.UndefOr[js.Promise[js.Any] | Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fn")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: TestMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
  }
  
}

