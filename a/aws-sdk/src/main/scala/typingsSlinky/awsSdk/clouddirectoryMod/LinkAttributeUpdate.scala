package typingsSlinky.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinkAttributeUpdate extends js.Object {
  /**
    * The action to perform as part of the attribute update.
    */
  var AttributeAction: js.UndefOr[LinkAttributeAction] = js.native
  /**
    * The key of the attribute being updated.
    */
  var AttributeKey: js.UndefOr[typingsSlinky.awsSdk.clouddirectoryMod.AttributeKey] = js.native
}

object LinkAttributeUpdate {
  @scala.inline
  def apply(): LinkAttributeUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinkAttributeUpdate]
  }
  @scala.inline
  implicit class LinkAttributeUpdateOps[Self <: LinkAttributeUpdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributeAction(value: LinkAttributeAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributeAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeAction")(js.undefined)
        ret
    }
    @scala.inline
    def withAttributeKey(value: AttributeKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributeKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeKey")(js.undefined)
        ret
    }
  }
  
}

