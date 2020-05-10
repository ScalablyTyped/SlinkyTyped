package typingsSlinky.officeUiFabricReact.pickerCustomResultExampleMod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPeoplePickerExampleState extends js.Object {
  var contextualMenuTarget: js.UndefOr[HTMLElement] = js.native
  var contextualMenuVisible: js.UndefOr[Boolean] = js.native
  var isPickerDisabled: js.UndefOr[Boolean] = js.native
}

object IPeoplePickerExampleState {
  @scala.inline
  def apply(): IPeoplePickerExampleState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPeoplePickerExampleState]
  }
  @scala.inline
  implicit class IPeoplePickerExampleStateOps[Self <: IPeoplePickerExampleState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContextualMenuTarget(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextualMenuTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContextualMenuTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextualMenuTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withContextualMenuVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextualMenuVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContextualMenuVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextualMenuVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withIsPickerDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPickerDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsPickerDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPickerDisabled")(js.undefined)
        ret
    }
  }
  
}

