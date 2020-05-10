package typingsSlinky.googleapis.tagmanagerV2Mod.tagmanagerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of reverting a zone in a workspace.
  */
@js.native
trait SchemaRevertZoneResponse extends js.Object {
  /**
    * Zone as it appears in the latest container version since the last
    * workspace synchronization operation. If no zone is present, that means
    * the zone was deleted in the latest container version.
    */
  var zone: js.UndefOr[SchemaZone] = js.native
}

object SchemaRevertZoneResponse {
  @scala.inline
  def apply(): SchemaRevertZoneResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRevertZoneResponse]
  }
  @scala.inline
  implicit class SchemaRevertZoneResponseOps[Self <: SchemaRevertZoneResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withZone(value: SchemaZone): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zone")(js.undefined)
        ret
    }
  }
  
}

