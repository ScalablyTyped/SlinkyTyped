package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.devextremeStrings.column
import typingsSlinky.devextreme.devextremeStrings.moveFocus
import typingsSlinky.devextreme.devextremeStrings.none
import typingsSlinky.devextreme.devextremeStrings.row
import typingsSlinky.devextreme.devextremeStrings.startEdit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditOnKeyPress extends js.Object {
  var editOnKeyPress: js.UndefOr[Boolean] = js.native
  var enabled: js.UndefOr[Boolean] = js.native
  var enterKeyAction: js.UndefOr[startEdit | moveFocus] = js.native
  var enterKeyDirection: js.UndefOr[none | column | row] = js.native
}

object EditOnKeyPress {
  @scala.inline
  def apply(): EditOnKeyPress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditOnKeyPress]
  }
  @scala.inline
  implicit class EditOnKeyPressOps[Self <: EditOnKeyPress] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEditOnKeyPress(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editOnKeyPress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditOnKeyPress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editOnKeyPress")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withEnterKeyAction(value: startEdit | moveFocus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterKeyAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnterKeyAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterKeyAction")(js.undefined)
        ret
    }
    @scala.inline
    def withEnterKeyDirection(value: none | column | row): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterKeyDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnterKeyDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterKeyDirection")(js.undefined)
        ret
    }
  }
  
}

