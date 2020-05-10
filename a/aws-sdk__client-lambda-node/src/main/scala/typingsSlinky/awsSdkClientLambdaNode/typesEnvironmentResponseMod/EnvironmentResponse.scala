package typingsSlinky.awsSdkClientLambdaNode.typesEnvironmentResponseMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsSdkClientLambdaNode.typesEnvironmentErrorMod.EnvironmentError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnvironmentResponse extends js.Object {
  /**
    * <p>Error messages for environment variables that could not be applied.</p>
    */
  var Error: js.UndefOr[EnvironmentError] = js.native
  /**
    * <p>Environment variable key-value pairs.</p>
    */
  var Variables: js.UndefOr[StringDictionary[String] | (js.Iterable[js.Tuple2[String, String]])] = js.native
}

object EnvironmentResponse {
  @scala.inline
  def apply(): EnvironmentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvironmentResponse]
  }
  @scala.inline
  implicit class EnvironmentResponseOps[Self <: EnvironmentResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withError(value: EnvironmentError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Error")(js.undefined)
        ret
    }
    @scala.inline
    def withVariablesIterable(value: js.Iterable[js.Tuple2[String, String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Variables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVariables(value: StringDictionary[String] | (js.Iterable[js.Tuple2[String, String]])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Variables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariables: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Variables")(js.undefined)
        ret
    }
  }
  
}

