package typingsSlinky.googleapis.mlV1Mod.mlV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents output related to a built-in algorithm Job.
  */
@js.native
trait SchemaGoogleCloudMlV1BuiltInAlgorithmOutput extends js.Object {
  /**
    * Framework on which the built-in algorithm was trained on.
    */
  var framework: js.UndefOr[String] = js.native
  /**
    * Built-in algorithm&#39;s saved model path. Only set for non-hptuning
    * succeeded jobs.
    */
  var modelPath: js.UndefOr[String] = js.native
  /**
    * Python version on which the built-in algorithm was trained on.
    */
  var pythonVersion: js.UndefOr[String] = js.native
  /**
    * CMLE runtime version on which the built-in algorithm was trained on.
    */
  var runtimeVersion: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudMlV1BuiltInAlgorithmOutput {
  @scala.inline
  def apply(): SchemaGoogleCloudMlV1BuiltInAlgorithmOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudMlV1BuiltInAlgorithmOutput]
  }
  @scala.inline
  implicit class SchemaGoogleCloudMlV1BuiltInAlgorithmOutputOps[Self <: SchemaGoogleCloudMlV1BuiltInAlgorithmOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFramework(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("framework")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFramework: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("framework")(js.undefined)
        ret
    }
    @scala.inline
    def withModelPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModelPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelPath")(js.undefined)
        ret
    }
    @scala.inline
    def withPythonVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pythonVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPythonVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pythonVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withRuntimeVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runtimeVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuntimeVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runtimeVersion")(js.undefined)
        ret
    }
  }
  
}

