package typingsSlinky.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A data validation rule.
  */
@js.native
trait SchemaDataValidationRule extends js.Object {
  /**
    * The condition that data in the cell must match.
    */
  var condition: js.UndefOr[SchemaBooleanCondition] = js.native
  /**
    * A message to show the user when adding data to the cell.
    */
  var inputMessage: js.UndefOr[String] = js.native
  /**
    * True if the UI should be customized based on the kind of condition. If
    * true, &quot;List&quot; conditions will show a dropdown.
    */
  var showCustomUi: js.UndefOr[Boolean] = js.native
  /**
    * True if invalid data should be rejected.
    */
  var strict: js.UndefOr[Boolean] = js.native
}

object SchemaDataValidationRule {
  @scala.inline
  def apply(): SchemaDataValidationRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDataValidationRule]
  }
  @scala.inline
  implicit class SchemaDataValidationRuleOps[Self <: SchemaDataValidationRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCondition(value: SchemaBooleanCondition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("condition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCondition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("condition")(js.undefined)
        ret
    }
    @scala.inline
    def withInputMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withShowCustomUi(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCustomUi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowCustomUi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCustomUi")(js.undefined)
        ret
    }
    @scala.inline
    def withStrict(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrict: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strict")(js.undefined)
        ret
    }
  }
  
}

