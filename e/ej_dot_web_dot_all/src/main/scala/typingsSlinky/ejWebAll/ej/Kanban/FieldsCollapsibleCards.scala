package typingsSlinky.ejWebAll.ej.Kanban

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldsCollapsibleCards extends js.Object {
  /** It is used to specify the collapsible card's field mapping.
    * @Default {null}
    */
  var field: js.UndefOr[String] = js.native
  /** It is used to specify the collapsible card's key mapping which is available in datasource value of field mapped in collapsibleCards.field.
    * @Default {null}
    */
  var key: js.UndefOr[String] = js.native
}

object FieldsCollapsibleCards {
  @scala.inline
  def apply(): FieldsCollapsibleCards = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldsCollapsibleCards]
  }
  @scala.inline
  implicit class FieldsCollapsibleCardsOps[Self <: FieldsCollapsibleCards] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
  }
  
}

