package typingsSlinky.ejWebAll.ej.ComboBox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilteringEventArgs extends js.Object {
  /** Instance of the combobox model object.
    */
  var model: js.UndefOr[Model] = js.native
  /** text of the combobox.
    */
  var text: js.UndefOr[String] = js.native
  /** Name of the event.
    */
  var `type`: js.UndefOr[String] = js.native
  /** Function used to update the filtering value.
    */
  var updateData: js.UndefOr[js.Any] = js.native
}

object FilteringEventArgs {
  @scala.inline
  def apply(): FilteringEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilteringEventArgs]
  }
  @scala.inline
  implicit class FilteringEventArgsOps[Self <: FilteringEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withModel(value: Model): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateData")(js.undefined)
        ret
    }
  }
  
}

