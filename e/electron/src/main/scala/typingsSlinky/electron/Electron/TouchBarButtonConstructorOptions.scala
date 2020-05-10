package typingsSlinky.electron.Electron

import typingsSlinky.electron.electronStrings.left
import typingsSlinky.electron.electronStrings.overlay
import typingsSlinky.electron.electronStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TouchBarButtonConstructorOptions extends js.Object {
  /**
    * Button background color in hex format, i.e #ABCDEF.
    */
  var backgroundColor: js.UndefOr[String] = js.native
  /**
    * Function to call when the button is clicked.
    */
  var click: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Button icon.
    */
  var icon: js.UndefOr[NativeImage_] = js.native
  /**
    * Can be left, right or overlay.
    */
  var iconPosition: js.UndefOr[left | right | overlay] = js.native
  /**
    * Button text.
    */
  var label: js.UndefOr[String] = js.native
}

object TouchBarButtonConstructorOptions {
  @scala.inline
  def apply(): TouchBarButtonConstructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TouchBarButtonConstructorOptions]
  }
  @scala.inline
  implicit class TouchBarButtonConstructorOptionsOps[Self <: TouchBarButtonConstructorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withClick(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(js.undefined)
        ret
    }
    @scala.inline
    def withIcon(value: NativeImage_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.undefined)
        ret
    }
    @scala.inline
    def withIconPosition(value: left | right | overlay): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
  }
  
}

