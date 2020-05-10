package typingsSlinky.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagKeys extends js.Object {
  /**
    *  A complex type that contains Tag key elements.
    */
  var Items: js.UndefOr[TagKeyList] = js.native
}

object TagKeys {
  @scala.inline
  def apply(): TagKeys = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagKeys]
  }
  @scala.inline
  implicit class TagKeysOps[Self <: TagKeys] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: TagKeyList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Items")(js.undefined)
        ret
    }
  }
  
}

