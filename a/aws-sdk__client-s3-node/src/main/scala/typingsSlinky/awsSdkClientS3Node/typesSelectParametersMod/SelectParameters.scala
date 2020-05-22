package typingsSlinky.awsSdkClientS3Node.typesSelectParametersMod

import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.SQL
import typingsSlinky.awsSdkClientS3Node.typesInputSerializationMod.InputSerialization
import typingsSlinky.awsSdkClientS3Node.typesOutputSerializationMod.OutputSerialization
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectParameters extends js.Object {
  /**
    * <p>The expression that is used to query the object.</p>
    */
  var Expression: String
  /**
    * <p>The type of the provided expression (e.g., SQL).</p>
    */
  var ExpressionType: SQL | String
  /**
    * <p>Describes the serialization format of the object.</p>
    */
  var InputSerialization: typingsSlinky.awsSdkClientS3Node.typesInputSerializationMod.InputSerialization
  /**
    * <p>Describes how the results of the Select job are serialized.</p>
    */
  var OutputSerialization: typingsSlinky.awsSdkClientS3Node.typesOutputSerializationMod.OutputSerialization
}

object SelectParameters {
  @scala.inline
  def apply(
    Expression: String,
    ExpressionType: SQL | String,
    InputSerialization: InputSerialization,
    OutputSerialization: OutputSerialization
  ): SelectParameters = {
    val __obj = js.Dynamic.literal(Expression = Expression.asInstanceOf[js.Any], ExpressionType = ExpressionType.asInstanceOf[js.Any], InputSerialization = InputSerialization.asInstanceOf[js.Any], OutputSerialization = OutputSerialization.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectParameters]
  }
}

