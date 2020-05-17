package typingsSlinky.antdMobile.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Accept extends js.Object {
  var accept: String = js.native
  var disableDelete: Boolean = js.native
  var files: js.Array[scala.Nothing] = js.native
  var length: Double = js.native
  var multiple: Boolean = js.native
  var onAddImageClick: js.Function0[Unit] = js.native
  var onChange: js.Function0[Unit] = js.native
  var onFail: js.Function0[Unit] = js.native
  var onImageClick: js.Function0[Unit] = js.native
  var prefixCls: String = js.native
  var selectable: Boolean = js.native
}

object Accept {
  @scala.inline
  def apply(
    accept: String,
    disableDelete: Boolean,
    files: js.Array[scala.Nothing],
    length: Double,
    multiple: Boolean,
    onAddImageClick: () => Unit,
    onChange: () => Unit,
    onFail: () => Unit,
    onImageClick: () => Unit,
    prefixCls: String,
    selectable: Boolean
  ): Accept = {
    val __obj = js.Dynamic.literal(accept = accept.asInstanceOf[js.Any], disableDelete = disableDelete.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], multiple = multiple.asInstanceOf[js.Any], onAddImageClick = js.Any.fromFunction0(onAddImageClick), onChange = js.Any.fromFunction0(onChange), onFail = js.Any.fromFunction0(onFail), onImageClick = js.Any.fromFunction0(onImageClick), prefixCls = prefixCls.asInstanceOf[js.Any], selectable = selectable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accept]
  }
  @scala.inline
  implicit class AcceptOps[Self <: Accept] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccept(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accept")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisableDelete(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableDelete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFiles(value: js.Array[scala.Nothing]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMultiple(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnAddImageClick(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAddImageClick")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnChange(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnFail(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFail")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnImageClick(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onImageClick")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPrefixCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectable")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

