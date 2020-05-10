package typingsSlinky.rcPicker.panelContextMod

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.facade.ReactRef
import typingsSlinky.rcPicker.interfaceMod.OnSelect
import typingsSlinky.rcPicker.rcPickerStrings.key
import typingsSlinky.rcPicker.rcPickerStrings.mouse
import typingsSlinky.rcPicker.rcPickerStrings.submit
import typingsSlinky.react.mod.MutableRefObject
import typingsSlinky.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PanelContextProps extends js.Object {
  /** Only used for TimePicker and this is a deprecated prop */
  var defaultOpenValue: js.UndefOr[js.Any] = js.native
  /** Only work with time panel */
  var hideHeader: js.UndefOr[Boolean] = js.native
  var hideNextBtn: js.UndefOr[Boolean] = js.native
  var hidePrevBtn: js.UndefOr[Boolean] = js.native
  var hideRanges: js.UndefOr[Boolean] = js.native
  var onDateMouseEnter: js.UndefOr[js.Function1[/* date */ js.Any, Unit]] = js.native
  var onDateMouseLeave: js.UndefOr[js.Function1[/* date */ js.Any, Unit]] = js.native
  var onSelect: js.UndefOr[OnSelect[_]] = js.native
  var open: js.UndefOr[Boolean] = js.native
  var operationRef: js.UndefOr[MutableRefObject[ContextOperationRefProps | Null]] = js.native
  var panelRef: js.UndefOr[Ref[HTMLDivElement]] = js.native
}

object PanelContextProps {
  @scala.inline
  def apply(): PanelContextProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PanelContextProps]
  }
  @scala.inline
  implicit class PanelContextPropsOps[Self <: PanelContextProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultOpenValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultOpenValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultOpenValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultOpenValue")(js.undefined)
        ret
    }
    @scala.inline
    def withHideHeader(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withHideNextBtn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideNextBtn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideNextBtn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideNextBtn")(js.undefined)
        ret
    }
    @scala.inline
    def withHidePrevBtn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidePrevBtn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHidePrevBtn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidePrevBtn")(js.undefined)
        ret
    }
    @scala.inline
    def withHideRanges(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideRanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideRanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideRanges")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDateMouseEnter(value: /* date */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDateMouseEnter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDateMouseEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDateMouseEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDateMouseLeave(value: /* date */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDateMouseLeave")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDateMouseLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDateMouseLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelect(value: (_, /* type */ key | mouse | submit) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(js.undefined)
        ret
    }
    @scala.inline
    def withOperationRef(value: MutableRefObject[ContextOperationRefProps | Null]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperationRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationRef")(js.undefined)
        ret
    }
    @scala.inline
    def withPanelRefRefObject(value: ReactRef[HTMLDivElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panelRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPanelRefFunction1(value: /* instance */ HTMLDivElement | Null => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panelRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPanelRef(value: Ref[HTMLDivElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panelRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPanelRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panelRef")(js.undefined)
        ret
    }
    @scala.inline
    def withPanelRefNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panelRef")(null)
        ret
    }
  }
  
}

