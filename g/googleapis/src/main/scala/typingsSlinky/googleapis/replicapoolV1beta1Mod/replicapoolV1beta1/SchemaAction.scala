package typingsSlinky.googleapis.replicapoolV1beta1Mod.replicapoolV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An action that gets executed during initialization of the replicas.
  */
@js.native
trait SchemaAction extends js.Object {
  /**
    * A list of commands to run, one per line. If any command fails, the whole
    * action is considered a failure and no further actions are run. This also
    * marks the virtual machine or replica as a failure.
    */
  var commands: js.UndefOr[js.Array[String]] = js.native
  /**
    * A list of environment variables to use for the commands in this action.
    */
  var envVariables: js.UndefOr[js.Array[SchemaEnvVariable]] = js.native
  /**
    * If an action&#39;s commands on a particular replica do not finish in the
    * specified timeoutMilliSeconds, the replica is considered to be in a
    * FAILING state. No efforts are made to stop any processes that were
    * spawned or created as the result of running the action&#39;s commands.
    * The default is the max allowed value, 1 hour (i.e. 3600000 milliseconds).
    */
  var timeoutMilliSeconds: js.UndefOr[Double] = js.native
}

object SchemaAction {
  @scala.inline
  def apply(): SchemaAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAction]
  }
  @scala.inline
  implicit class SchemaActionOps[Self <: SchemaAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommands(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commands")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommands: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commands")(js.undefined)
        ret
    }
    @scala.inline
    def withEnvVariables(value: js.Array[SchemaEnvVariable]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("envVariables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvVariables: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("envVariables")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeoutMilliSeconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeoutMilliSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeoutMilliSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeoutMilliSeconds")(js.undefined)
        ret
    }
  }
  
}

