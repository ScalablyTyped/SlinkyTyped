package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectParameters extends js.Object {
  /**
    * The expression that is used to query the object.
    */
  var Expression: typingsSlinky.awsSdk.s3Mod.Expression = js.native
  /**
    * The type of the provided expression (for example, SQL).
    */
  var ExpressionType: typingsSlinky.awsSdk.s3Mod.ExpressionType = js.native
  /**
    * Describes the serialization format of the object.
    */
  var InputSerialization: typingsSlinky.awsSdk.s3Mod.InputSerialization = js.native
  /**
    * Describes how the results of the Select job are serialized.
    */
  var OutputSerialization: typingsSlinky.awsSdk.s3Mod.OutputSerialization = js.native
}

object SelectParameters {
  @scala.inline
  def apply(
    Expression: Expression,
    ExpressionType: ExpressionType,
    InputSerialization: InputSerialization,
    OutputSerialization: OutputSerialization
  ): SelectParameters = {
    val __obj = js.Dynamic.literal(Expression = Expression.asInstanceOf[js.Any], ExpressionType = ExpressionType.asInstanceOf[js.Any], InputSerialization = InputSerialization.asInstanceOf[js.Any], OutputSerialization = OutputSerialization.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectParameters]
  }
  @scala.inline
  implicit class SelectParametersOps[Self <: SelectParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpression(value: Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Expression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpressionType(value: ExpressionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpressionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputSerialization(value: InputSerialization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputSerialization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutputSerialization(value: OutputSerialization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputSerialization")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

