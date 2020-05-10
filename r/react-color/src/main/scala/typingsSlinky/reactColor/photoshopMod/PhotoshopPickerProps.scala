package typingsSlinky.reactColor.photoshopMod

import typingsSlinky.reactColor.mod.ColorChangeHandler
import typingsSlinky.reactColor.mod.ColorPickerProps
import typingsSlinky.reactColor.mod.ColorResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhotoshopPickerProps extends ColorPickerProps[PhotoshopPicker] {
  var header: js.UndefOr[String] = js.native
  var onAccept: js.UndefOr[ColorChangeHandler] = js.native
  var onCancel: js.UndefOr[ColorChangeHandler] = js.native
}

object PhotoshopPickerProps {
  @scala.inline
  def apply(): PhotoshopPickerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PhotoshopPickerProps]
  }
  @scala.inline
  implicit class PhotoshopPickerPropsOps[Self <: PhotoshopPickerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeader(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAccept(value: /* color */ ColorResult => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAccept")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnAccept: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAccept")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCancel(value: /* color */ ColorResult => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCancel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCancel")(js.undefined)
        ret
    }
  }
  
}

