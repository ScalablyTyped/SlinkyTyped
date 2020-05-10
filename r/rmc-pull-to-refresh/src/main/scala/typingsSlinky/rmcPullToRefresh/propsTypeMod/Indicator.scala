package typingsSlinky.rmcPullToRefresh.propsTypeMod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Indicator extends js.Object {
  var activate: js.UndefOr[TagMod[Any]] = js.native
  var deactivate: js.UndefOr[TagMod[Any]] = js.native
  var finish: js.UndefOr[TagMod[Any]] = js.native
  var release: js.UndefOr[TagMod[Any]] = js.native
}

object Indicator {
  @scala.inline
  def apply(): Indicator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Indicator]
  }
  @scala.inline
  implicit class IndicatorOps[Self <: Indicator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivateReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActivate(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activate")(js.undefined)
        ret
    }
    @scala.inline
    def withDeactivateReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deactivate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeactivate(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deactivate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeactivate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deactivate")(js.undefined)
        ret
    }
    @scala.inline
    def withFinishReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finish")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFinish(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finish")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFinish: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finish")(js.undefined)
        ret
    }
    @scala.inline
    def withReleaseReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("release")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelease(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("release")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelease: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("release")(js.undefined)
        ret
    }
  }
  
}

