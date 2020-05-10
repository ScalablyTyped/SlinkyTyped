package typingsSlinky.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SyncConfig extends js.Object {
  /**
    * The Conflict Detection strategy to use.    VERSION: Detect conflicts based on object versions for this resolver.    NONE: Do not detect conflicts when executing this resolver.  
    */
  var conflictDetection: js.UndefOr[ConflictDetectionType] = js.native
  /**
    * The Conflict Resolution strategy to perform in the event of a conflict.    OPTIMISTIC_CONCURRENCY: Resolve conflicts by rejecting mutations when versions do not match the latest version at the server.    AUTOMERGE: Resolve conflicts with the Automerge conflict resolution strategy.    LAMBDA: Resolve conflicts with a Lambda function supplied in the LambdaConflictHandlerConfig.  
    */
  var conflictHandler: js.UndefOr[ConflictHandlerType] = js.native
  /**
    * The LambdaConflictHandlerConfig when configuring LAMBDA as the Conflict Handler.
    */
  var lambdaConflictHandlerConfig: js.UndefOr[LambdaConflictHandlerConfig] = js.native
}

object SyncConfig {
  @scala.inline
  def apply(): SyncConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SyncConfig]
  }
  @scala.inline
  implicit class SyncConfigOps[Self <: SyncConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConflictDetection(value: ConflictDetectionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conflictDetection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConflictDetection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conflictDetection")(js.undefined)
        ret
    }
    @scala.inline
    def withConflictHandler(value: ConflictHandlerType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conflictHandler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConflictHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conflictHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withLambdaConflictHandlerConfig(value: LambdaConflictHandlerConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lambdaConflictHandlerConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLambdaConflictHandlerConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lambdaConflictHandlerConfig")(js.undefined)
        ret
    }
  }
  
}

