package typingsSlinky.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectAttributeUpdate extends js.Object {
  /**
    * The action to perform as part of the attribute update.
    */
  var ObjectAttributeAction: js.UndefOr[typingsSlinky.awsSdk.clouddirectoryMod.ObjectAttributeAction] = js.native
  /**
    * The key of the attribute being updated.
    */
  var ObjectAttributeKey: js.UndefOr[AttributeKey] = js.native
}

object ObjectAttributeUpdate {
  @scala.inline
  def apply(): ObjectAttributeUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectAttributeUpdate]
  }
  @scala.inline
  implicit class ObjectAttributeUpdateOps[Self <: ObjectAttributeUpdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withObjectAttributeAction(value: ObjectAttributeAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectAttributeAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectAttributeAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectAttributeAction")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectAttributeKey(value: AttributeKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectAttributeKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectAttributeKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectAttributeKey")(js.undefined)
        ret
    }
  }
  
}

