package typingsSlinky.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Parameters to provide to the template being launched.
  */
@js.native
trait SchemaLaunchTemplateParameters extends js.Object {
  /**
    * The runtime environment for the job.
    */
  var environment: js.UndefOr[SchemaRuntimeEnvironment] = js.native
  /**
    * Required. The job name to use for the created job.
    */
  var jobName: js.UndefOr[String] = js.native
  /**
    * The runtime parameters to pass to the job.
    */
  var parameters: js.UndefOr[StringDictionary[String]] = js.native
}

object SchemaLaunchTemplateParameters {
  @scala.inline
  def apply(): SchemaLaunchTemplateParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLaunchTemplateParameters]
  }
  @scala.inline
  implicit class SchemaLaunchTemplateParametersOps[Self <: SchemaLaunchTemplateParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnvironment(value: SchemaRuntimeEnvironment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvironment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environment")(js.undefined)
        ret
    }
    @scala.inline
    def withJobName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobName")(js.undefined)
        ret
    }
    @scala.inline
    def withParameters(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(js.undefined)
        ret
    }
  }
  
}

