package typingsSlinky.firebase.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.firebase.mod.analytics.Item
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DictkeyItems
  extends /* key */ StringDictionary[js.Any] {
  var items: js.UndefOr[js.Array[Item]] = js.native
}

object DictkeyItems {
  @scala.inline
  def apply(): DictkeyItems = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DictkeyItems]
  }
  @scala.inline
  implicit class DictkeyItemsOps[Self <: DictkeyItems] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[Item]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
        ret
    }
  }
  
}

