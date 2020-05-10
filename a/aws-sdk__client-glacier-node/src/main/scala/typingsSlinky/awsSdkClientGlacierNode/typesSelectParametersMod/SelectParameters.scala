package typingsSlinky.awsSdkClientGlacierNode.typesSelectParametersMod

import typingsSlinky.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.SQL
import typingsSlinky.awsSdkClientGlacierNode.typesInputSerializationMod.InputSerialization
import typingsSlinky.awsSdkClientGlacierNode.typesOutputSerializationMod.OutputSerialization
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectParameters extends js.Object {
  /**
    * <p>The expression that is used to select the object.</p>
    */
  var Expression: js.UndefOr[String] = js.native
  /**
    * <p>The type of the provided expression, for example <code>SQL</code>.</p>
    */
  var ExpressionType: js.UndefOr[SQL | String] = js.native
  /**
    * <p>Describes the serialization format of the object.</p>
    */
  var InputSerialization: js.UndefOr[
    typingsSlinky.awsSdkClientGlacierNode.typesInputSerializationMod.InputSerialization
  ] = js.native
  /**
    * <p>Describes how the results of the select job are serialized.</p>
    */
  var OutputSerialization: js.UndefOr[
    typingsSlinky.awsSdkClientGlacierNode.typesOutputSerializationMod.OutputSerialization
  ] = js.native
}

object SelectParameters {
  @scala.inline
  def apply(): SelectParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectParameters]
  }
  @scala.inline
  implicit class SelectParametersOps[Self <: SelectParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpression(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Expression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Expression")(js.undefined)
        ret
    }
    @scala.inline
    def withExpressionType(value: SQL | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpressionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpressionType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpressionType")(js.undefined)
        ret
    }
    @scala.inline
    def withInputSerialization(value: InputSerialization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputSerialization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputSerialization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputSerialization")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputSerialization(value: OutputSerialization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputSerialization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputSerialization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputSerialization")(js.undefined)
        ret
    }
  }
  
}

