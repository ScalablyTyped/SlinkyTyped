package typingsSlinky.googleapis.websecurityscannerV1alphaMod.websecurityscannerV1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about vulnerable request parameters.
  */
@js.native
trait SchemaVulnerableParameters extends js.Object {
  /**
    * The vulnerable parameter names.
    */
  var parameterNames: js.UndefOr[js.Array[String]] = js.native
}

object SchemaVulnerableParameters {
  @scala.inline
  def apply(): SchemaVulnerableParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVulnerableParameters]
  }
  @scala.inline
  implicit class SchemaVulnerableParametersOps[Self <: SchemaVulnerableParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParameterNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameterNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameterNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameterNames")(js.undefined)
        ret
    }
  }
  
}

