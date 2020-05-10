package typingsSlinky.antdMobileRn.imagePickerPropsTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImagePickerPropTypes extends js.Object {
  var files: js.UndefOr[js.Array[js.Object]] = js.native
  var onAddImageClick: js.UndefOr[js.Function0[Unit]] = js.native
  var onChange: js.UndefOr[
    js.Function3[
      /* files */ js.Array[js.Object], 
      /* operationType */ String, 
      /* index */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
  var onFail: js.UndefOr[js.Function1[/* msg */ String, Unit]] = js.native
  var onImageClick: js.UndefOr[
    js.Function2[/* index */ js.UndefOr[Double], /* files */ js.UndefOr[js.Array[js.Object]], Unit]
  ] = js.native
  var selectable: js.UndefOr[Boolean] = js.native
  var styles: js.UndefOr[js.Object] = js.native
}

object ImagePickerPropTypes {
  @scala.inline
  def apply(): ImagePickerPropTypes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImagePickerPropTypes]
  }
  @scala.inline
  implicit class ImagePickerPropTypesOps[Self <: ImagePickerPropTypes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFiles(value: js.Array[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAddImageClick(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAddImageClick")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnAddImageClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAddImageClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(
      value: (/* files */ js.Array[js.Object], /* operationType */ String, /* index */ js.UndefOr[Double]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFail(value: /* msg */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFail")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnFail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFail")(js.undefined)
        ret
    }
    @scala.inline
    def withOnImageClick(value: (/* index */ js.UndefOr[Double], /* files */ js.UndefOr[js.Array[js.Object]]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onImageClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnImageClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onImageClick")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectable")(js.undefined)
        ret
    }
    @scala.inline
    def withStyles(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.undefined)
        ret
    }
  }
  
}

