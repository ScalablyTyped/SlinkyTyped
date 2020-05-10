package typingsSlinky.emberQunit.mod

import typingsSlinky.emberTestHelpers.mod.ModuleCallbacks
import typingsSlinky.qunit.Assert
import typingsSlinky.qunit.Hooks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QUnitModuleCallbacks
  extends ModuleCallbacks
     with Hooks {
  @JSName("afterTeardown")
  var afterTeardown_QUnitModuleCallbacks: js.UndefOr[js.Function1[/* assert */ Assert, Unit]] = js.native
  @JSName("beforeSetup")
  var beforeSetup_QUnitModuleCallbacks: js.UndefOr[js.Function1[/* assert */ Assert, Unit]] = js.native
  @JSName("setup")
  var setup_QUnitModuleCallbacks: js.UndefOr[js.Function1[/* assert */ Assert, Unit]] = js.native
  @JSName("teardown")
  var teardown_QUnitModuleCallbacks: js.UndefOr[js.Function1[/* assert */ Assert, Unit]] = js.native
}

object QUnitModuleCallbacks {
  @scala.inline
  def apply(): QUnitModuleCallbacks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QUnitModuleCallbacks]
  }
  @scala.inline
  implicit class QUnitModuleCallbacksOps[Self <: QUnitModuleCallbacks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterTeardown(value: /* assert */ Assert => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterTeardown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfterTeardown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterTeardown")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeSetup(value: /* assert */ Assert => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeSetup")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeSetup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeSetup")(js.undefined)
        ret
    }
    @scala.inline
    def withSetup(value: /* assert */ Assert => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setup")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setup")(js.undefined)
        ret
    }
    @scala.inline
    def withTeardown(value: /* assert */ Assert => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teardown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTeardown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teardown")(js.undefined)
        ret
    }
  }
  
}

