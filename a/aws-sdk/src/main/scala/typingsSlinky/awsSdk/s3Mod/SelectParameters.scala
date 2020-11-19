package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExpression(value: Expression): Self = this.set("Expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpressionType(value: ExpressionType): Self = this.set("ExpressionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputSerialization(value: InputSerialization): Self = this.set("InputSerialization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputSerialization(value: OutputSerialization): Self = this.set("OutputSerialization", value.asInstanceOf[js.Any])
  }
}
