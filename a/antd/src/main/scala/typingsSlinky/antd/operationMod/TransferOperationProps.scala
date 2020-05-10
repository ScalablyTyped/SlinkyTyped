package typingsSlinky.antd.operationMod

import org.scalajs.dom.raw.HTMLButtonElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.antd.antdStrings.ltr
import typingsSlinky.antd.antdStrings.rtl
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransferOperationProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  var direction: js.UndefOr[ltr | rtl] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var leftActive: js.UndefOr[Boolean] = js.native
  var leftArrowText: js.UndefOr[String] = js.native
  var moveToLeft: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.native
  var moveToRight: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.native
  var rightActive: js.UndefOr[Boolean] = js.native
  var rightArrowText: js.UndefOr[String] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
}

object TransferOperationProps {
  @scala.inline
  def apply(): TransferOperationProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransferOperationProps]
  }
  @scala.inline
  implicit class TransferOperationPropsOps[Self <: TransferOperationProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withDirection(value: ltr | rtl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withLeftActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftActive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeftActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftActive")(js.undefined)
        ret
    }
    @scala.inline
    def withLeftArrowText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftArrowText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeftArrowText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftArrowText")(js.undefined)
        ret
    }
    @scala.inline
    def withMoveToLeft(value: SyntheticMouseEvent[HTMLButtonElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveToLeft")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMoveToLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveToLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withMoveToRight(value: SyntheticMouseEvent[HTMLButtonElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveToRight")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMoveToRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveToRight")(js.undefined)
        ret
    }
    @scala.inline
    def withRightActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightActive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightActive")(js.undefined)
        ret
    }
    @scala.inline
    def withRightArrowText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightArrowText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightArrowText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightArrowText")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
  }
  
}

