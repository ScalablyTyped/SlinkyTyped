package typingsSlinky.googleapis.v1alpha2Mod.genomicsV1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Docker execuctor specification.
  */
@js.native
trait SchemaDockerExecutor extends js.Object {
  /**
    * Required. The command or newline delimited script to run. The command
    * string will be executed within a bash shell.  If the command exits with a
    * non-zero exit code, output parameter de-localization will be skipped and
    * the pipeline operation&#39;s `error` field will be populated.  Maximum
    * command string length is 16384.
    */
  var cmd: js.UndefOr[String] = js.native
  /**
    * Required. Image name from either Docker Hub or Google Container Registry.
    * Users that run pipelines must have READ access to the image.
    */
  var imageName: js.UndefOr[String] = js.native
}

object SchemaDockerExecutor {
  @scala.inline
  def apply(): SchemaDockerExecutor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDockerExecutor]
  }
  @scala.inline
  implicit class SchemaDockerExecutorOps[Self <: SchemaDockerExecutor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCmd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cmd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCmd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cmd")(js.undefined)
        ret
    }
    @scala.inline
    def withImageName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageName")(js.undefined)
        ret
    }
  }
  
}

