package typingsSlinky.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Command describes a step performed as part of the build pipeline.
  */
@js.native
trait SchemaCommand extends js.Object {
  /**
    * Command-line arguments used when executing this Command.
    */
  var args: js.UndefOr[js.Array[String]] = js.native
  /**
    * Working directory (relative to project source root) used when running
    * this Command.
    */
  var dir: js.UndefOr[String] = js.native
  /**
    * Environment variables set before running this Command.
    */
  var env: js.UndefOr[js.Array[String]] = js.native
  /**
    * Optional unique identifier for this Command, used in wait_for to
    * reference this Command as a dependency.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Name of the command, as presented on the command line, or if the command
    * is packaged as a Docker container, as presented to `docker pull`.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The ID(s) of the Command(s) that this Command depends on.
    */
  var waitFor: js.UndefOr[js.Array[String]] = js.native
}

object SchemaCommand {
  @scala.inline
  def apply(): SchemaCommand = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCommand]
  }
  @scala.inline
  implicit class SchemaCommandOps[Self <: SchemaCommand] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArgs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(js.undefined)
        ret
    }
    @scala.inline
    def withDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dir")(js.undefined)
        ret
    }
    @scala.inline
    def withEnv(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("env")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("env")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withWaitFor(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitFor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaitFor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitFor")(js.undefined)
        ret
    }
  }
  
}

