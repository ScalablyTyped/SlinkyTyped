package typingsSlinky.reactNative.anon

import typingsSlinky.reactNative.mod.ViewToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Changed extends js.Object {
  var changed: js.Array[ViewToken]
  var viewableItems: js.Array[ViewToken]
}

object Changed {
  @scala.inline
  def apply(changed: js.Array[ViewToken], viewableItems: js.Array[ViewToken]): Changed = {
    val __obj = js.Dynamic.literal(changed = changed.asInstanceOf[js.Any], viewableItems = viewableItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[Changed]
  }
  @scala.inline
  implicit class ChangedOps[Self <: Changed] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChanged(value: js.Array[ViewToken]): Self = this.set("changed", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewableItems(value: js.Array[ViewToken]): Self = this.set("viewableItems", value.asInstanceOf[js.Any])
  }
  
}

