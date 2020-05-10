package typingsSlinky.rbx

import typingsSlinky.propTypes.mod.Requireable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonActive extends js.Object {
  var active: Requireable[Boolean] = js.native
  var clipped: Requireable[Boolean] = js.native
  var closeOnBlur: Requireable[Boolean] = js.native
  var closeOnEsc: Requireable[Boolean] = js.native
  var containerClassName: Requireable[String] = js.native
  var document: Requireable[js.Object] = js.native
  var onClose: Requireable[js.Function1[/* repeated */ _, _]] = js.native
}

object AnonActive {
  @scala.inline
  def apply(
    active: Requireable[Boolean],
    clipped: Requireable[Boolean],
    closeOnBlur: Requireable[Boolean],
    closeOnEsc: Requireable[Boolean],
    containerClassName: Requireable[String],
    document: Requireable[js.Object],
    onClose: Requireable[js.Function1[/* repeated */ _, _]]
  ): AnonActive = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], clipped = clipped.asInstanceOf[js.Any], closeOnBlur = closeOnBlur.asInstanceOf[js.Any], closeOnEsc = closeOnEsc.asInstanceOf[js.Any], containerClassName = containerClassName.asInstanceOf[js.Any], document = document.asInstanceOf[js.Any], onClose = onClose.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonActive]
  }
  @scala.inline
  implicit class AnonActiveOps[Self <: AnonActive] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive(value: Requireable[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClipped(value: Requireable[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCloseOnBlur(value: Requireable[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnBlur")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCloseOnEsc(value: Requireable[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnEsc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainerClassName(value: Requireable[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDocument(value: Requireable[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnClose(value: Requireable[js.Function1[/* repeated */ _, _]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

