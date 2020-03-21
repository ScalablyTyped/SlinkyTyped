package typingsSlinky.qlik

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.qlik.mod.CustomProperty
import typingsSlinky.qlik.qlikStrings.sorting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItemsUses extends js.Object {
  var items: js.UndefOr[StringDictionary[CustomProperty]] = js.undefined
  var uses: sorting
}

object AnonItemsUses {
  @scala.inline
  def apply(uses: sorting, items: StringDictionary[CustomProperty] = null): AnonItemsUses = {
    val __obj = js.Dynamic.literal(uses = uses.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonItemsUses]
  }
}

