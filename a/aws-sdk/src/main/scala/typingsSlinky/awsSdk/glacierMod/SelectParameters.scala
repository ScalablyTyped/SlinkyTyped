package typingsSlinky.awsSdk.glacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectParameters extends js.Object {
  /**
    * The expression that is used to select the object.
    */
  var Expression: js.UndefOr[String] = js.native
  /**
    * The type of the provided expression, for example SQL.
    */
  var ExpressionType: js.UndefOr[typingsSlinky.awsSdk.glacierMod.ExpressionType] = js.native
  /**
    * Describes the serialization format of the object.
    */
  var InputSerialization: js.UndefOr[typingsSlinky.awsSdk.glacierMod.InputSerialization] = js.native
  /**
    * Describes how the results of the select job are serialized.
    */
  var OutputSerialization: js.UndefOr[typingsSlinky.awsSdk.glacierMod.OutputSerialization] = js.native
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
    def withExpressionType(value: ExpressionType): Self = {
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

