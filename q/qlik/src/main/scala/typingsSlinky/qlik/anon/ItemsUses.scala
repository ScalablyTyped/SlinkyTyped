package typingsSlinky.qlik.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.qlik.mod.CustomProperty
import typingsSlinky.qlik.qlikStrings.sorting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemsUses extends js.Object {
  var items: js.UndefOr[StringDictionary[CustomProperty]] = js.native
  var uses: sorting = js.native
}

object ItemsUses {
  @scala.inline
  def apply(uses: sorting): ItemsUses = {
    val __obj = js.Dynamic.literal(uses = uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsUses]
  }
  @scala.inline
  implicit class ItemsUsesOps[Self <: ItemsUses] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUses(value: sorting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItems(value: StringDictionary[CustomProperty]): Self = {
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

