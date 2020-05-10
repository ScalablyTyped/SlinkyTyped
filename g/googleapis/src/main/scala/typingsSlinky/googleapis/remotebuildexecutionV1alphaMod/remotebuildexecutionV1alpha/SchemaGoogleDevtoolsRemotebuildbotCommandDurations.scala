package typingsSlinky.googleapis.remotebuildexecutionV1alphaMod.remotebuildexecutionV1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CommandDuration contains the various duration metrics tracked when a bot
  * performs a command.
  */
@js.native
trait SchemaGoogleDevtoolsRemotebuildbotCommandDurations extends js.Object {
  /**
    * The time spent preparing the command to be run in a Docker container
    * (includes pulling the Docker image, if necessary).
    */
  var dockerPrep: js.UndefOr[String] = js.native
  /**
    * The time spent downloading the input files and constructing the working
    * directory.
    */
  var download: js.UndefOr[String] = js.native
  /**
    * The time spent executing the command (i.e., doing useful work).
    */
  var execution: js.UndefOr[String] = js.native
  /**
    * The timestamp when preparation is done and bot starts downloading files.
    */
  var isoPrepDone: js.UndefOr[String] = js.native
  /**
    * The time spent completing the command, in total.
    */
  var overall: js.UndefOr[String] = js.native
  /**
    * The time spent uploading the stdout logs.
    */
  var stdout: js.UndefOr[String] = js.native
  /**
    * The time spent uploading the output files.
    */
  var upload: js.UndefOr[String] = js.native
}

object SchemaGoogleDevtoolsRemotebuildbotCommandDurations {
  @scala.inline
  def apply(): SchemaGoogleDevtoolsRemotebuildbotCommandDurations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemotebuildbotCommandDurations]
  }
  @scala.inline
  implicit class SchemaGoogleDevtoolsRemotebuildbotCommandDurationsOps[Self <: SchemaGoogleDevtoolsRemotebuildbotCommandDurations] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDockerPrep(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dockerPrep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDockerPrep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dockerPrep")(js.undefined)
        ret
    }
    @scala.inline
    def withDownload(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("download")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDownload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("download")(js.undefined)
        ret
    }
    @scala.inline
    def withExecution(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execution")(js.undefined)
        ret
    }
    @scala.inline
    def withIsoPrepDone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isoPrepDone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsoPrepDone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isoPrepDone")(js.undefined)
        ret
    }
    @scala.inline
    def withOverall(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overall")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverall: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overall")(js.undefined)
        ret
    }
    @scala.inline
    def withStdout(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stdout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStdout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stdout")(js.undefined)
        ret
    }
    @scala.inline
    def withUpload(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upload")(js.undefined)
        ret
    }
  }
  
}

