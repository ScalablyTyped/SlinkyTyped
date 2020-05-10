package typingsSlinky.firefoxWebextBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonChildIds extends js.Object {
  var childIds: js.Array[String] = js.native
}

object AnonChildIds {
  @scala.inline
  def apply(childIds: js.Array[String]): AnonChildIds = {
    val __obj = js.Dynamic.literal(childIds = childIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChildIds]
  }
  @scala.inline
  implicit class AnonChildIdsOps[Self <: AnonChildIds] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childIds")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

