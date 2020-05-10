package typingsSlinky.googleCloudDatastore.requestMod

import typingsSlinky.googleCloudDatastore.entityMod.DatastoreKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MutationResult extends js.Object {
  var conflictDetected: Boolean = js.native
  var key: DatastoreKey = js.native
  var version: Double = js.native
}

object MutationResult {
  @scala.inline
  def apply(conflictDetected: Boolean, key: DatastoreKey, version: Double): MutationResult = {
    val __obj = js.Dynamic.literal(conflictDetected = conflictDetected.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[MutationResult]
  }
  @scala.inline
  implicit class MutationResultOps[Self <: MutationResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConflictDetected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conflictDetected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: DatastoreKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

