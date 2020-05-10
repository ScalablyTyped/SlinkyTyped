package typingsSlinky.gapiDrive.gapi.client.drive

import typingsSlinky.gapiDrive.gapiDriveStrings.driveNumbersigngeneratedIds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdsResource extends js.Object {
  var ids: js.Array[String] = js.native
  var kind: driveNumbersigngeneratedIds = js.native
  var space: String = js.native
}

object IdsResource {
  @scala.inline
  def apply(ids: js.Array[String], kind: driveNumbersigngeneratedIds, space: String): IdsResource = {
    val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], space = space.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdsResource]
  }
  @scala.inline
  implicit class IdsResourceOps[Self <: IdsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: driveNumbersigngeneratedIds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("space")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

