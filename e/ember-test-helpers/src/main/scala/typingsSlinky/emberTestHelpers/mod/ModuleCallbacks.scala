package typingsSlinky.emberTestHelpers.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModuleCallbacks
  extends /* key */ StringDictionary[js.Any] {
  var afterTeardown: js.UndefOr[js.Function1[/* assert */ js.UndefOr[js.Any], Unit]] = js.native
  var beforeSetup: js.UndefOr[js.Function1[/* assert */ js.UndefOr[js.Any], Unit]] = js.native
  var integration: js.UndefOr[Boolean] = js.native
  var needs: js.UndefOr[js.Array[String]] = js.native
  var setup: js.UndefOr[js.Function1[/* assert */ js.UndefOr[js.Any], Unit]] = js.native
  var teardown: js.UndefOr[js.Function1[/* assert */ js.UndefOr[js.Any], Unit]] = js.native
  var unit: js.UndefOr[Boolean] = js.native
}

object ModuleCallbacks {
  @scala.inline
  def apply(): ModuleCallbacks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModuleCallbacks]
  }
  @scala.inline
  implicit class ModuleCallbacksOps[Self <: ModuleCallbacks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterTeardown(value: /* assert */ js.UndefOr[js.Any] => Unit): Self = {
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
    def withBeforeSetup(value: /* assert */ js.UndefOr[js.Any] => Unit): Self = {
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
    def withIntegration(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntegration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integration")(js.undefined)
        ret
    }
    @scala.inline
    def withNeeds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNeeds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needs")(js.undefined)
        ret
    }
    @scala.inline
    def withSetup(value: /* assert */ js.UndefOr[js.Any] => Unit): Self = {
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
    def withTeardown(value: /* assert */ js.UndefOr[js.Any] => Unit): Self = {
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
    @scala.inline
    def withUnit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unit")(js.undefined)
        ret
    }
  }
  
}

