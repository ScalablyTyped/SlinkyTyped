package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaPreconfiguredWafSet extends js.Object {
  /**
    * List of entities that are currently supported for WAF rules.
    */
  var expressionSets: js.UndefOr[js.Array[SchemaWafExpressionSet]] = js.native
}

object SchemaPreconfiguredWafSet {
  @scala.inline
  def apply(): SchemaPreconfiguredWafSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPreconfiguredWafSet]
  }
  @scala.inline
  implicit class SchemaPreconfiguredWafSetOps[Self <: SchemaPreconfiguredWafSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpressionSets(value: js.Array[SchemaWafExpressionSet]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expressionSets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpressionSets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expressionSets")(js.undefined)
        ret
    }
  }
  
}

