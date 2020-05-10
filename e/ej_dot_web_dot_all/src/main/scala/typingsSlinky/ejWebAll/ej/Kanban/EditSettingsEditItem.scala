package typingsSlinky.ejWebAll.ej.Kanban

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditSettingsEditItem extends js.Object {
  /** It is used to specify defaultValue for the fields while adding new card.
    * @Default {null}
    */
  var defaultValue: js.UndefOr[String | Double] = js.native
  /** It is used to set the particular editparams in the card for editing.
    * @Default {Object}
    */
  var editParams: js.UndefOr[js.Any] = js.native
  /** It is used to set the particular editType in the card for editing.
    * @Default {ej.Kanban.EditingType.String}
    */
  var editType: js.UndefOr[EditingType | String] = js.native
  /** It is used to map editing field from the data source.
    * @Default {null}
    */
  var field: js.UndefOr[String] = js.native
  /** Gets or sets a value that indicates to define constraints for saving data to the database.
    * @Default {Object}
    */
  var validationRules: js.UndefOr[js.Any] = js.native
}

object EditSettingsEditItem {
  @scala.inline
  def apply(): EditSettingsEditItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditSettingsEditItem]
  }
  @scala.inline
  implicit class EditSettingsEditItemOps[Self <: EditSettingsEditItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultValue(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(js.undefined)
        ret
    }
    @scala.inline
    def withEditParams(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editParams")(js.undefined)
        ret
    }
    @scala.inline
    def withEditType(value: EditingType | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editType")(js.undefined)
        ret
    }
    @scala.inline
    def withField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(js.undefined)
        ret
    }
    @scala.inline
    def withValidationRules(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidationRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationRules")(js.undefined)
        ret
    }
  }
  
}

