package typingsSlinky.firebase

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.firebase.mod.analytics.Item
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDictkeyItems
  extends /* key */ StringDictionary[js.Any] {
  var items: js.UndefOr[js.Array[Item]] = js.native
}

object AnonDictkeyItems {
  @scala.inline
  def apply(): AnonDictkeyItems = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonDictkeyItems]
  }
  @scala.inline
  implicit class AnonDictkeyItemsOps[Self <: AnonDictkeyItems] (val x: Self) extends AnyVal {
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

