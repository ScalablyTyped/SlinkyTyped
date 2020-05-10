package typingsSlinky.googleapis.remotebuildexecutionV1Mod.remotebuildexecutionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A batch of Change messages.
  */
@js.native
trait SchemaGoogleWatcherV1ChangeBatch extends js.Object {
  /**
    * A list of Change messages.
    */
  var changes: js.UndefOr[js.Array[SchemaGoogleWatcherV1Change]] = js.native
}

object SchemaGoogleWatcherV1ChangeBatch {
  @scala.inline
  def apply(): SchemaGoogleWatcherV1ChangeBatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleWatcherV1ChangeBatch]
  }
  @scala.inline
  implicit class SchemaGoogleWatcherV1ChangeBatchOps[Self <: SchemaGoogleWatcherV1ChangeBatch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChanges(value: js.Array[SchemaGoogleWatcherV1Change]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changes")(js.undefined)
        ret
    }
  }
  
}

