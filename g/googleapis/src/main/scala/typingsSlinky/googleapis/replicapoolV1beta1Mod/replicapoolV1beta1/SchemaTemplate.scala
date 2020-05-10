package typingsSlinky.googleapis.replicapoolV1beta1Mod.replicapoolV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The template used for creating replicas in the pool.
  */
@js.native
trait SchemaTemplate extends js.Object {
  /**
    * An action to run during initialization of your replicas. An action is run
    * as shell commands which are executed one after the other in the same bash
    * shell, so any state established by one command is inherited by later
    * commands.
    */
  var action: js.UndefOr[SchemaAction] = js.native
  /**
    * A list of HTTP Health Checks to configure for this replica pool and all
    * virtual machines in this replica pool.
    */
  var healthChecks: js.UndefOr[js.Array[SchemaHealthCheck]] = js.native
  /**
    * A free-form string describing the version of this template. You can
    * provide any versioning string you would like. For example, version1 or
    * template-v1.
    */
  var version: js.UndefOr[String] = js.native
  /**
    * The virtual machine parameters to use for creating replicas. You can
    * define settings such as the machine type and the image of replicas in
    * this pool. This is required if replica type is SMART_VM.
    */
  var vmParams: js.UndefOr[SchemaVmParams] = js.native
}

object SchemaTemplate {
  @scala.inline
  def apply(): SchemaTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTemplate]
  }
  @scala.inline
  implicit class SchemaTemplateOps[Self <: SchemaTemplate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: SchemaAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(js.undefined)
        ret
    }
    @scala.inline
    def withHealthChecks(value: js.Array[SchemaHealthCheck]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("healthChecks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHealthChecks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("healthChecks")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
    @scala.inline
    def withVmParams(value: SchemaVmParams): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vmParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVmParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vmParams")(js.undefined)
        ret
    }
  }
  
}

