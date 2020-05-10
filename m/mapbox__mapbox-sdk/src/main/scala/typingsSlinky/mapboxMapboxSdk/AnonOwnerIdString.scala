package typingsSlinky.mapboxMapboxSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOwnerIdString extends js.Object {
  var ownerId: String = js.native
}

object AnonOwnerIdString {
  @scala.inline
  def apply(ownerId: String): AnonOwnerIdString = {
    val __obj = js.Dynamic.literal(ownerId = ownerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOwnerIdString]
  }
  @scala.inline
  implicit class AnonOwnerIdStringOps[Self <: AnonOwnerIdString] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOwnerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

