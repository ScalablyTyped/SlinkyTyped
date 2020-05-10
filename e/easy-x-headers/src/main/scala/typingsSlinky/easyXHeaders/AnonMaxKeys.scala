package typingsSlinky.easyXHeaders

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMaxKeys extends js.Object {
  var maxKeys: js.UndefOr[Double] = js.native
}

object AnonMaxKeys {
  @scala.inline
  def apply(): AnonMaxKeys = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonMaxKeys]
  }
  @scala.inline
  implicit class AnonMaxKeysOps[Self <: AnonMaxKeys] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxKeys(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxKeys")(js.undefined)
        ret
    }
  }
  
}

