package typingsSlinky.officeUiFabricReact.ikeytiptransitionkeyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IKeytipTransitionKey extends js.Object {
  var key: String = js.native
  var modifierKeys: js.UndefOr[js.Array[KeytipTransitionModifier]] = js.native
}

object IKeytipTransitionKey {
  @scala.inline
  def apply(key: String): IKeytipTransitionKey = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKeytipTransitionKey]
  }
  @scala.inline
  implicit class IKeytipTransitionKeyOps[Self <: IKeytipTransitionKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModifierKeys(value: js.Array[KeytipTransitionModifier]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifierKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModifierKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifierKeys")(js.undefined)
        ret
    }
  }
  
}

