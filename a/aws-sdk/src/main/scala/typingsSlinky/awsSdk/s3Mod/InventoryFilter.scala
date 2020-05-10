package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InventoryFilter extends js.Object {
  /**
    * The prefix that an object must have to be included in the inventory results.
    */
  var Prefix: typingsSlinky.awsSdk.s3Mod.Prefix = js.native
}

object InventoryFilter {
  @scala.inline
  def apply(Prefix: Prefix): InventoryFilter = {
    val __obj = js.Dynamic.literal(Prefix = Prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[InventoryFilter]
  }
  @scala.inline
  implicit class InventoryFilterOps[Self <: InventoryFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPrefix(value: Prefix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Prefix")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

