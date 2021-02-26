package typingsSlinky.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectParameters extends StObject {
  
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
  implicit class SelectParametersMutableBuilder[Self <: SelectParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpression(value: Expression): Self = StObject.set(x, "Expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpressionType(value: ExpressionType): Self = StObject.set(x, "ExpressionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputSerialization(value: InputSerialization): Self = StObject.set(x, "InputSerialization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputSerialization(value: OutputSerialization): Self = StObject.set(x, "OutputSerialization", value.asInstanceOf[js.Any])
  }
}
