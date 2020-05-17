package typingsSlinky.primereact.rowRadioButtonMod

import typingsSlinky.primereact.anon.DataObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowRadioButtonProps extends js.Object {
  var onClick: js.UndefOr[js.Function1[/* e */ DataObject, Unit]] = js.native
  var rowData: js.UndefOr[js.Object] = js.native
  var selected: js.UndefOr[Boolean] = js.native
}

object RowRadioButtonProps {
  @scala.inline
  def apply(): RowRadioButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowRadioButtonProps]
  }
  @scala.inline
  implicit class RowRadioButtonPropsOps[Self <: RowRadioButtonProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnClick(value: /* e */ DataObject => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.undefined)
        ret
    }
    @scala.inline
    def withRowData(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowData")(js.undefined)
        ret
    }
    @scala.inline
    def withSelected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(js.undefined)
        ret
    }
  }
  
}

