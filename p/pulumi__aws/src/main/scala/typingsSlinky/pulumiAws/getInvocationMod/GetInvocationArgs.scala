package typingsSlinky.pulumiAws.getInvocationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInvocationArgs extends js.Object {
  /**
    * The name of the lambda function.
    */
  val functionName: String = js.native
  /**
    * A string in JSON format that is passed as payload to the lambda function.
    */
  val input: String = js.native
  /**
    * The qualifier (a.k.a version) of the lambda function. Defaults
    * to `$LATEST`.
    */
  val qualifier: js.UndefOr[String] = js.native
}

object GetInvocationArgs {
  @scala.inline
  def apply(functionName: String, input: String): GetInvocationArgs = {
    val __obj = js.Dynamic.literal(functionName = functionName.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInvocationArgs]
  }
  @scala.inline
  implicit class GetInvocationArgsOps[Self <: GetInvocationArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFunctionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInput(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQualifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qualifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQualifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qualifier")(js.undefined)
        ret
    }
  }
  
}

