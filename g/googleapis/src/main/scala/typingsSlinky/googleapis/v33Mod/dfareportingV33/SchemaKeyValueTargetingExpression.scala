package typingsSlinky.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Key Value Targeting Expression.
  */
@js.native
trait SchemaKeyValueTargetingExpression extends js.Object {
  /**
    * Keyword expression being targeted by the ad.
    */
  var expression: js.UndefOr[String] = js.native
}

object SchemaKeyValueTargetingExpression {
  @scala.inline
  def apply(): SchemaKeyValueTargetingExpression = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaKeyValueTargetingExpression]
  }
  @scala.inline
  implicit class SchemaKeyValueTargetingExpressionOps[Self <: SchemaKeyValueTargetingExpression] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpression(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expression")(js.undefined)
        ret
    }
  }
  
}

