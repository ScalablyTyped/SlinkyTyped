package typingsSlinky.qlik.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.qlik.mod.CustomProperty
import typingsSlinky.qlik.qlikStrings.settings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `0` extends js.Object {
  var items: js.UndefOr[StringDictionary[CustomProperty]] = js.native
  var uses: settings = js.native
}

object `0` {
  @scala.inline
  def apply(uses: settings): `0` = {
    val __obj = js.Dynamic.literal(uses = uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
  @scala.inline
  implicit class `0Ops`[Self <: `0`] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUses(value: settings): Self = {
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

