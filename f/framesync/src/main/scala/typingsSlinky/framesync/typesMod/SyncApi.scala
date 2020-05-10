package typingsSlinky.framesync.typesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SyncApi extends js.Object {
  var cancelSync: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in framesync.framesync/lib/types.StepId ]: (process : framesync.framesync/lib/types.Process): void}
    */ typingsSlinky.framesync.framesyncStrings.SyncApi with TopLevel[js.Any] = js.native
  var steps: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in framesync.framesync/lib/types.StepId ]: framesync.framesync/lib/types.Step}
    */ typingsSlinky.framesync.framesyncStrings.SyncApi with TopLevel[js.Any] = js.native
  var sync: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in framesync.framesync/lib/types.StepId ]: (process : framesync.framesync/lib/types.Process, keepAlive? : boolean, immediate? : boolean): framesync.framesync/lib/types.Process}
    */ typingsSlinky.framesync.framesyncStrings.SyncApi with TopLevel[js.Any] = js.native
}

object SyncApi {
  @scala.inline
  def apply(
    cancelSync: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in framesync.framesync/lib/types.StepId ]: (process : framesync.framesync/lib/types.Process): void}
    */ typingsSlinky.framesync.framesyncStrings.SyncApi with TopLevel[js.Any],
    steps: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in framesync.framesync/lib/types.StepId ]: framesync.framesync/lib/types.Step}
    */ typingsSlinky.framesync.framesyncStrings.SyncApi with TopLevel[js.Any],
    sync: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in framesync.framesync/lib/types.StepId ]: (process : framesync.framesync/lib/types.Process, keepAlive? : boolean, immediate? : boolean): framesync.framesync/lib/types.Process}
    */ typingsSlinky.framesync.framesyncStrings.SyncApi with TopLevel[js.Any]
  ): SyncApi = {
    val __obj = js.Dynamic.literal(cancelSync = cancelSync.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any], sync = sync.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyncApi]
  }
  @scala.inline
  implicit class SyncApiOps[Self <: SyncApi] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancelSync(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in framesync.framesync/lib/types.StepId ]: (process : framesync.framesync/lib/types.Process): void}
      */ typingsSlinky.framesync.framesyncStrings.SyncApi with TopLevel[js.Any]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelSync")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSteps(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in framesync.framesync/lib/types.StepId ]: framesync.framesync/lib/types.Step}
      */ typingsSlinky.framesync.framesyncStrings.SyncApi with TopLevel[js.Any]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("steps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSync(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in framesync.framesync/lib/types.StepId ]: (process : framesync.framesync/lib/types.Process, keepAlive? : boolean, immediate? : boolean): framesync.framesync/lib/types.Process}
      */ typingsSlinky.framesync.framesyncStrings.SyncApi with TopLevel[js.Any]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sync")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

