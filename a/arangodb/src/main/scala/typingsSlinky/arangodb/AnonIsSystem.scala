package typingsSlinky.arangodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIsSystem extends js.Object {
  var isSystem: js.UndefOr[Boolean] = js.native
}

object AnonIsSystem {
  @scala.inline
  def apply(): AnonIsSystem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonIsSystem]
  }
  @scala.inline
  implicit class AnonIsSystemOps[Self <: AnonIsSystem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsSystem(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSystem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsSystem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSystem")(js.undefined)
        ret
    }
  }
  
}

