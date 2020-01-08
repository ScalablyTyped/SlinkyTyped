package typingsSlinky.awsDashSdk.clientsBackupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CalculatedLifecycle extends js.Object {
  /**
    * A timestamp that specifies when to delete a recovery point.
    */
  var DeleteAt: js.UndefOr[js.Date] = js.native
  /**
    * A timestamp that specifies when to transition a recovery point to cold storage.
    */
  var MoveToColdStorageAt: js.UndefOr[js.Date] = js.native
}

object CalculatedLifecycle {
  @scala.inline
  def apply(DeleteAt: js.Date = null, MoveToColdStorageAt: js.Date = null): CalculatedLifecycle = {
    val __obj = js.Dynamic.literal()
    if (DeleteAt != null) __obj.updateDynamic("DeleteAt")(DeleteAt.asInstanceOf[js.Any])
    if (MoveToColdStorageAt != null) __obj.updateDynamic("MoveToColdStorageAt")(MoveToColdStorageAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalculatedLifecycle]
  }
}

