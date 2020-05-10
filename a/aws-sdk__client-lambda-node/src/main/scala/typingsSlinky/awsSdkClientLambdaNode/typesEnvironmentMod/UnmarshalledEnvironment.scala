package typingsSlinky.awsSdkClientLambdaNode.typesEnvironmentMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledEnvironment extends Environment {
  /**
    * <p>Environment variable key-value pairs.</p>
    */
  @JSName("Variables")
  var Variables_UnmarshalledEnvironment: js.UndefOr[StringDictionary[String]] = js.native
}

object UnmarshalledEnvironment {
  @scala.inline
  def apply(): UnmarshalledEnvironment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledEnvironment]
  }
  @scala.inline
  implicit class UnmarshalledEnvironmentOps[Self <: UnmarshalledEnvironment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

