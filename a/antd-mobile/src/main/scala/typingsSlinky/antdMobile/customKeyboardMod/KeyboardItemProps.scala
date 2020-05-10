package typingsSlinky.antdMobile.customKeyboardMod

import slinky.core.facade.ReactRef
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.Ref
import typingsSlinky.std.HTMLTableDataCellElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyboardItemProps extends HTMLTableDataProps {
  var iconOnly: js.UndefOr[Boolean] = js.native
  var prefixCls: js.UndefOr[String] = js.native
  var tdRef: js.UndefOr[Ref[HTMLTableDataCellElement]] = js.native
  def onClick(event: SyntheticMouseEvent[HTMLTableDataCellElement], value: String): Unit = js.native
}

object KeyboardItemProps {
  @scala.inline
  def apply(onClick: (SyntheticMouseEvent[HTMLTableDataCellElement], String) => Unit): KeyboardItemProps = {
    val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction2(onClick))
    __obj.asInstanceOf[KeyboardItemProps]
  }
  @scala.inline
  implicit class KeyboardItemPropsOps[Self <: KeyboardItemProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnClick(value: (SyntheticMouseEvent[HTMLTableDataCellElement], String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withIconOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefixCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefixCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(js.undefined)
        ret
    }
    @scala.inline
    def withTdRefRefObject(value: ReactRef[HTMLTableDataCellElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tdRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTdRefFunction1(value: /* instance */ HTMLTableDataCellElement | Null => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tdRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTdRef(value: Ref[HTMLTableDataCellElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tdRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTdRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tdRef")(js.undefined)
        ret
    }
    @scala.inline
    def withTdRefNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tdRef")(null)
        ret
    }
  }
  
}

