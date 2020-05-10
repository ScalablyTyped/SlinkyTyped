package typingsSlinky.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TouchBarColorPickerConstructorOptions extends js.Object {
  /**
    * Array of hex color strings to appear as possible colors to select.
    */
  var availableColors: js.UndefOr[js.Array[String]] = js.native
  /**
    * Function to call when a color is selected.
    */
  var change: js.UndefOr[js.Function1[/* color */ String, Unit]] = js.native
  /**
    * The selected hex color in the picker, i.e #ABCDEF.
    */
  var selectedColor: js.UndefOr[String] = js.native
}

object TouchBarColorPickerConstructorOptions {
  @scala.inline
  def apply(): TouchBarColorPickerConstructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TouchBarColorPickerConstructorOptions]
  }
  @scala.inline
  implicit class TouchBarColorPickerConstructorOptionsOps[Self <: TouchBarColorPickerConstructorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvailableColors(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availableColors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailableColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availableColors")(js.undefined)
        ret
    }
    @scala.inline
    def withChange(value: /* color */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedColor")(js.undefined)
        ret
    }
  }
  
}

