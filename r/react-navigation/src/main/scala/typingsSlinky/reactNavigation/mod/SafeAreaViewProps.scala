package typingsSlinky.reactNavigation.mod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.reactNative.mod.ViewProps
import typingsSlinky.reactNavigation.AnonBottom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SafeAreaViewProps extends ViewProps {
  var children: js.UndefOr[TagMod[Any]] = js.native
  var forceInset: js.UndefOr[AnonBottom] = js.native
}

object SafeAreaViewProps {
  @scala.inline
  def apply(): SafeAreaViewProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SafeAreaViewProps]
  }
  @scala.inline
  implicit class SafeAreaViewPropsOps[Self <: SafeAreaViewProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildrenReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withForceInset(value: AnonBottom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceInset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceInset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceInset")(js.undefined)
        ret
    }
  }
  
}

