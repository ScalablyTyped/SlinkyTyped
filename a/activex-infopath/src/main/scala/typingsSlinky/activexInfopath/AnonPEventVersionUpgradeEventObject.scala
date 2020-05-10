package typingsSlinky.activexInfopath

import typingsSlinky.activexInfopath.InfoPath.VersionUpgradeEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPEventVersionUpgradeEventObject extends js.Object {
  val pEvent: VersionUpgradeEventObject = js.native
}

object AnonPEventVersionUpgradeEventObject {
  @scala.inline
  def apply(pEvent: VersionUpgradeEventObject): AnonPEventVersionUpgradeEventObject = {
    val __obj = js.Dynamic.literal(pEvent = pEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPEventVersionUpgradeEventObject]
  }
  @scala.inline
  implicit class AnonPEventVersionUpgradeEventObjectOps[Self <: AnonPEventVersionUpgradeEventObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPEvent(value: VersionUpgradeEventObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pEvent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

