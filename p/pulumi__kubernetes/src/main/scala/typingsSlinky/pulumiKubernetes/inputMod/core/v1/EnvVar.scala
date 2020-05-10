package typingsSlinky.pulumiKubernetes.inputMod.core.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * EnvVar represents an environment variable present in a Container.
  */
@js.native
trait EnvVar extends js.Object {
  /**
    * Name of the environment variable. Must be a C_IDENTIFIER.
    */
  var name: Input[String] = js.native
  /**
    * Variable references $(VAR_NAME) are expanded using the previous defined environment
    * variables in the container and any service environment variables. If a variable cannot be
    * resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can
    * be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded,
    * regardless of whether the variable exists or not. Defaults to "".
    */
  var value: js.UndefOr[Input[String]] = js.native
  /**
    * Source for the environment variable's value. Cannot be used if value is not empty.
    */
  var valueFrom: js.UndefOr[Input[EnvVarSource]] = js.native
}

object EnvVar {
  @scala.inline
  def apply(name: Input[String]): EnvVar = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvVar]
  }
  @scala.inline
  implicit class EnvVarOps[Self <: EnvVar] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
    @scala.inline
    def withValueFrom(value: Input[EnvVarSource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueFrom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueFrom")(js.undefined)
        ret
    }
  }
  
}

