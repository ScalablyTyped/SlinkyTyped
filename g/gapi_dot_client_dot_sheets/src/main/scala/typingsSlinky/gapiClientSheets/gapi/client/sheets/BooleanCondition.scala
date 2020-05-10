package typingsSlinky.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BooleanCondition extends js.Object {
  /** The type of condition. */
  var `type`: js.UndefOr[String] = js.native
  /**
    * The values of the condition. The number of supported values depends
    * on the condition type.  Some support zero values,
    * others one or two values,
    * and ConditionType.ONE_OF_LIST supports an arbitrary number of values.
    */
  var values: js.UndefOr[js.Array[ConditionValue]] = js.native
}

object BooleanCondition {
  @scala.inline
  def apply(): BooleanCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BooleanCondition]
  }
  @scala.inline
  implicit class BooleanConditionOps[Self <: BooleanCondition] (val x: Self) extends AnyVal {
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
    def withValues(value: js.Array[ConditionValue]): Self = {
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

