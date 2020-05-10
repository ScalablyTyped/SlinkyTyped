package typingsSlinky.reactHotkeys.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HotKeysEnabledProps extends GlobalHotKeysProps {
  /**
    * Function to call when this component loses focus in the browser
    */
  @JSName("onBlur")
  var onBlur_HotKeysEnabledProps: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Function to call when this component gains focus in the browser
    */
  @JSName("onFocus")
  var onFocus_HotKeysEnabledProps: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Whether this is the root HotKeys node - this enables some special behaviour
    */
  var root: js.UndefOr[Boolean] = js.native
}

object HotKeysEnabledProps {
  @scala.inline
  def apply(): HotKeysEnabledProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HotKeysEnabledProps]
  }
  @scala.inline
  implicit class HotKeysEnabledPropsOps[Self <: HotKeysEnabledProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnBlur(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnBlur: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFocus(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withRoot(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(js.undefined)
        ret
    }
  }
  
}

