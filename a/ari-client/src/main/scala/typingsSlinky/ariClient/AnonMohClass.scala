package typingsSlinky.ariClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMohClass extends js.Object {
  var bridgeId: String = js.native
  var mohClass: js.UndefOr[String] = js.native
}

object AnonMohClass {
  @scala.inline
  def apply(bridgeId: String): AnonMohClass = {
    val __obj = js.Dynamic.literal(bridgeId = bridgeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMohClass]
  }
  @scala.inline
  implicit class AnonMohClassOps[Self <: AnonMohClass] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBridgeId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bridgeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMohClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mohClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMohClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mohClass")(js.undefined)
        ret
    }
  }
  
}

