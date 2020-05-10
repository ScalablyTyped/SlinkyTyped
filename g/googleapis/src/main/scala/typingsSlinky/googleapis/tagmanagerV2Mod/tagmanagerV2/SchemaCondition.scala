package typingsSlinky.googleapis.tagmanagerV2Mod.tagmanagerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a predicate.
  */
@js.native
trait SchemaCondition extends js.Object {
  /**
    * A list of named parameters (key/value), depending on the condition&#39;s
    * type. Notes:  - For binary operators, include parameters named arg0 and
    * arg1 for specifying the left and right operands, respectively.  - At this
    * time, the left operand (arg0) must be a reference to a variable.  - For
    * case-insensitive Regex matching, include a boolean parameter named
    * ignore_case that is set to true. If not specified or set to any other
    * value, the matching will be case sensitive.  - To negate an operator,
    * include a boolean parameter named negate boolean parameter that is set to
    * true.
    */
  var parameter: js.UndefOr[js.Array[SchemaParameter]] = js.native
  /**
    * The type of operator for this condition.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaCondition {
  @scala.inline
  def apply(): SchemaCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCondition]
  }
  @scala.inline
  implicit class SchemaConditionOps[Self <: SchemaCondition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParameter(value: js.Array[SchemaParameter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameter")(js.undefined)
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
  }
  
}

