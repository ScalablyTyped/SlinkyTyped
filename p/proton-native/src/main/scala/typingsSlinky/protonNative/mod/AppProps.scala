package typingsSlinky.protonNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppProps extends js.Object {
  /**
    * Called when the quit menu item is called, right before the entire app quits.
    */
  var onShouldQuit: js.UndefOr[js.Function0[Unit]] = js.native
}

object AppProps {
  @scala.inline
  def apply(): AppProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppProps]
  }
  @scala.inline
  implicit class AppPropsOps[Self <: AppProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnShouldQuit(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShouldQuit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnShouldQuit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShouldQuit")(js.undefined)
        ret
    }
  }
  
}

