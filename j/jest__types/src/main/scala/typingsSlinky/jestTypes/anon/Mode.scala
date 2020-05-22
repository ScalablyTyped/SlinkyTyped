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

trait Mode extends Event {
  var asyncError: js.Error
  var fn: js.UndefOr[TestFn] = js.undefined
  var mode: js.UndefOr[TestMode] = js.undefined
  var name: add_test
  var testName: TestName
  var timeout: js.UndefOr[Double] = js.undefined
}

object Mode {
  @scala.inline
  def apply(
    asyncError: js.Error,
    name: add_test,
    testName: TestName,
    fn: /* done */ js.UndefOr[DoneFn] => js.UndefOr[js.Promise[js.Any] | Unit] = null,
    mode: TestMode = null,
    timeout: js.UndefOr[Double] = js.undefined
  ): Mode = {
    val __obj = js.Dynamic.literal(asyncError = asyncError.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], testName = testName.asInstanceOf[js.Any])
    if (fn != null) __obj.updateDynamic("fn")(js.Any.fromFunction1(fn))
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mode]
  }
}

