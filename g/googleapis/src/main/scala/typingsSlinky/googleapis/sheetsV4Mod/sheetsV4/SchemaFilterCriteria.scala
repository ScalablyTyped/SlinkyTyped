package typingsSlinky.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Criteria for showing/hiding rows in a filter or filter view.
  */
@js.native
trait SchemaFilterCriteria extends js.Object {
  /**
    * A condition that must be true for values to be shown. (This does not
    * override hiddenValues -- if a value is listed there,  it will still be
    * hidden.)
    */
  var condition: js.UndefOr[SchemaBooleanCondition] = js.native
  /**
    * Values that should be hidden.
    */
  var hiddenValues: js.UndefOr[js.Array[String]] = js.native
}

object SchemaFilterCriteria {
  @scala.inline
  def apply(): SchemaFilterCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFilterCriteria]
  }
  @scala.inline
  implicit class SchemaFilterCriteriaOps[Self <: SchemaFilterCriteria] (val x: Self) extends AnyVal {
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
    def withHiddenValues(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHiddenValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenValues")(js.undefined)
        ret
    }
  }
  
}

