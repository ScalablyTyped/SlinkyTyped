package typingsSlinky.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SizeConstraintStatement extends js.Object {
  /**
    * The operator to use to compare the request part to the size setting. 
    */
  var ComparisonOperator: typingsSlinky.awsSdk.wafv2Mod.ComparisonOperator = js.native
  /**
    * The part of a web request that you want AWS WAF to inspect. For more information, see FieldToMatch. 
    */
  var FieldToMatch: typingsSlinky.awsSdk.wafv2Mod.FieldToMatch = js.native
  /**
    * The size, in byte, to compare to the request part, after any transformations.
    */
  var Size: typingsSlinky.awsSdk.wafv2Mod.Size = js.native
  /**
    * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. If you specify one or more transformations in a rule statement, AWS WAF performs all transformations on the content identified by FieldToMatch, starting from the lowest priority setting, before inspecting the content for a match.
    */
  var TextTransformations: typingsSlinky.awsSdk.wafv2Mod.TextTransformations = js.native
}

object SizeConstraintStatement {
  @scala.inline
  def apply(
    ComparisonOperator: ComparisonOperator,
    FieldToMatch: FieldToMatch,
    Size: Size,
    TextTransformations: TextTransformations
  ): SizeConstraintStatement = {
    val __obj = js.Dynamic.literal(ComparisonOperator = ComparisonOperator.asInstanceOf[js.Any], FieldToMatch = FieldToMatch.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], TextTransformations = TextTransformations.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizeConstraintStatement]
  }
  @scala.inline
  implicit class SizeConstraintStatementOps[Self <: SizeConstraintStatement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComparisonOperator(value: ComparisonOperator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComparisonOperator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFieldToMatch(value: FieldToMatch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FieldToMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextTransformations(value: TextTransformations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextTransformations")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

