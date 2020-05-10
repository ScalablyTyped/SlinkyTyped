package typingsSlinky.antDesignReactNative.drawerMod

import typingsSlinky.antDesignReactNative.drawerPropsTypeMod.DrawerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DrawerNativeProps extends DrawerProps {
  var drawerBackgroundColor: js.UndefOr[String] = js.native
  var drawerRef: js.UndefOr[
    js.Function1[/* el */ typingsSlinky.bang88ReactNativeDrawerLayout.mod.default | Null, Unit]
  ] = js.native
  var drawerWidth: js.UndefOr[Double] = js.native
}

object DrawerNativeProps {
  @scala.inline
  def apply(): DrawerNativeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrawerNativeProps]
  }
  @scala.inline
  implicit class DrawerNativePropsOps[Self <: DrawerNativeProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDrawerBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawerBackgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrawerBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawerBackgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withDrawerRef(value: /* el */ typingsSlinky.bang88ReactNativeDrawerLayout.mod.default | Null => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawerRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDrawerRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawerRef")(js.undefined)
        ret
    }
    @scala.inline
    def withDrawerWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawerWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrawerWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawerWidth")(js.undefined)
        ret
    }
  }
  
}

