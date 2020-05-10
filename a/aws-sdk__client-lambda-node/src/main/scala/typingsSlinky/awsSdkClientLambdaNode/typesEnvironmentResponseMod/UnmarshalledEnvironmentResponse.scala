package typingsSlinky.awsSdkClientLambdaNode.typesEnvironmentResponseMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsSdkClientLambdaNode.typesEnvironmentErrorMod.UnmarshalledEnvironmentError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledEnvironmentResponse extends EnvironmentResponse {
  /**
    * <p>Error messages for environment variables that could not be applied.</p>
    */
  @JSName("Error")
  var Error_UnmarshalledEnvironmentResponse: js.UndefOr[UnmarshalledEnvironmentError] = js.native
  /**
    * <p>Environment variable key-value pairs.</p>
    */
  @JSName("Variables")
  var Variables_UnmarshalledEnvironmentResponse: js.UndefOr[StringDictionary[String]] = js.native
}

object UnmarshalledEnvironmentResponse {
  @scala.inline
  def apply(): UnmarshalledEnvironmentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledEnvironmentResponse]
  }
  @scala.inline
  implicit class UnmarshalledEnvironmentResponseOps[Self <: UnmarshalledEnvironmentResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withError(value: UnmarshalledEnvironmentError): Self = {
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
    def withVariables(value: StringDictionary[String]): Self = {
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

