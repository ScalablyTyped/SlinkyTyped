package typingsSlinky.awsSdkClientS3Browser.typesSelectParametersMod

import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.SQL
import typingsSlinky.awsSdkClientS3Browser.typesInputSerializationMod.UnmarshalledInputSerialization
import typingsSlinky.awsSdkClientS3Browser.typesOutputSerializationMod.UnmarshalledOutputSerialization
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledSelectParameters extends SelectParameters {
  /**
    * <p>Describes the serialization format of the object.</p>
    */
  @JSName("InputSerialization")
  var InputSerialization_UnmarshalledSelectParameters: UnmarshalledInputSerialization = js.native
  /**
    * <p>Describes how the results of the Select job are serialized.</p>
    */
  @JSName("OutputSerialization")
  var OutputSerialization_UnmarshalledSelectParameters: UnmarshalledOutputSerialization = js.native
}

object UnmarshalledSelectParameters {
  @scala.inline
  def apply(
    Expression: String,
    ExpressionType: SQL | String,
    InputSerialization: UnmarshalledInputSerialization,
    OutputSerialization: UnmarshalledOutputSerialization
  ): UnmarshalledSelectParameters = {
    val __obj = js.Dynamic.literal(Expression = Expression.asInstanceOf[js.Any], ExpressionType = ExpressionType.asInstanceOf[js.Any], InputSerialization = InputSerialization.asInstanceOf[js.Any], OutputSerialization = OutputSerialization.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledSelectParameters]
  }
  @scala.inline
  implicit class UnmarshalledSelectParametersOps[Self <: UnmarshalledSelectParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInputSerialization(value: UnmarshalledInputSerialization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputSerialization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutputSerialization(value: UnmarshalledOutputSerialization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputSerialization")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

