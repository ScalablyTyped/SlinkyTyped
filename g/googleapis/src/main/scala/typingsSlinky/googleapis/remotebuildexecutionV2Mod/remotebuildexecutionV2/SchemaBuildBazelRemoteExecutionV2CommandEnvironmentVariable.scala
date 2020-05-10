package typingsSlinky.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An `EnvironmentVariable` is one variable to set in the running
  * program&#39;s environment.
  */
@js.native
trait SchemaBuildBazelRemoteExecutionV2CommandEnvironmentVariable extends js.Object {
  /**
    * The variable name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The variable value.
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaBuildBazelRemoteExecutionV2CommandEnvironmentVariable {
  @scala.inline
  def apply(): SchemaBuildBazelRemoteExecutionV2CommandEnvironmentVariable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2CommandEnvironmentVariable]
  }
  @scala.inline
  implicit class SchemaBuildBazelRemoteExecutionV2CommandEnvironmentVariableOps[Self <: SchemaBuildBazelRemoteExecutionV2CommandEnvironmentVariable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withValue(value: String): Self = {
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
  }
  
}

