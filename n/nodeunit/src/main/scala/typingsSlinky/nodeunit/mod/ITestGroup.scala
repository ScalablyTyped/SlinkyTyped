package typingsSlinky.nodeunit.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITestGroup
  extends /* property */ StringDictionary[
      js.UndefOr[ITestGroup | ITestBody | (js.Function1[/* callback */ ICallbackFunction, Unit])]
    ] {
  /** The setUp function is run before each test */
  var setUp: js.UndefOr[js.Function1[/* callback */ ICallbackFunction, Unit]] = js.native
  /** The tearDown function is run after each test calls test.done() */
  var tearDown: js.UndefOr[js.Function1[/* callback */ ICallbackFunction, Unit]] = js.native
}

object ITestGroup {
  @scala.inline
  def apply(): ITestGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITestGroup]
  }
  @scala.inline
  implicit class ITestGroupOps[Self <: ITestGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSetUp(value: /* callback */ ICallbackFunction => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUp")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUp")(js.undefined)
        ret
    }
    @scala.inline
    def withTearDown(value: /* callback */ ICallbackFunction => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tearDown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTearDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tearDown")(js.undefined)
        ret
    }
  }
  
}

