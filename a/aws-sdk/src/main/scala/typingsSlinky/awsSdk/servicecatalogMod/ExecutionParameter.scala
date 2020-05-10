package typingsSlinky.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecutionParameter extends js.Object {
  /**
    * The default values for the execution parameter.
    */
  var DefaultValues: js.UndefOr[ExecutionParameterValueList] = js.native
  /**
    * The name of the execution parameter.
    */
  var Name: js.UndefOr[ExecutionParameterKey] = js.native
  /**
    * The execution parameter type.
    */
  var Type: js.UndefOr[ExecutionParameterType] = js.native
}

object ExecutionParameter {
  @scala.inline
  def apply(): ExecutionParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecutionParameter]
  }
  @scala.inline
  implicit class ExecutionParameterOps[Self <: ExecutionParameter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultValues(value: ExecutionParameterValueList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultValues")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: ExecutionParameterKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: ExecutionParameterType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(js.undefined)
        ret
    }
  }
  
}

