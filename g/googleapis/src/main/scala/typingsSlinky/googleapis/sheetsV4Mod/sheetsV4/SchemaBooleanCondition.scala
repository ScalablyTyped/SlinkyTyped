package typingsSlinky.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A condition that can evaluate to true or false. BooleanConditions are used
  * by conditional formatting, data validation, and the criteria in filters.
  */
@js.native
trait SchemaBooleanCondition extends js.Object {
  /**
    * The type of condition.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * The values of the condition. The number of supported values depends on
    * the condition type.  Some support zero values, others one or two values,
    * and ConditionType.ONE_OF_LIST supports an arbitrary number of values.
    */
  var values: js.UndefOr[js.Array[SchemaConditionValue]] = js.native
}

object SchemaBooleanCondition {
  @scala.inline
  def apply(): SchemaBooleanCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBooleanCondition]
  }
  @scala.inline
  implicit class SchemaBooleanConditionOps[Self <: SchemaBooleanCondition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withValues(value: js.Array[SchemaConditionValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(js.undefined)
        ret
    }
  }
  
}

