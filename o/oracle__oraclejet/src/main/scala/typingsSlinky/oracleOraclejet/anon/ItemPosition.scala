package typingsSlinky.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.after
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.before
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemPosition
  extends /* key */ StringDictionary[js.Any] {
  var item: org.scalajs.dom.raw.Element = js.native
  var position: before | after = js.native
  var reference: org.scalajs.dom.raw.Element = js.native
}

object ItemPosition {
  @scala.inline
  def apply(
    item: org.scalajs.dom.raw.Element,
    position: before | after,
    reference: org.scalajs.dom.raw.Element
  ): ItemPosition = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemPosition]
  }
  @scala.inline
  implicit class ItemPositionOps[Self <: ItemPosition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItem(value: org.scalajs.dom.raw.Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: before | after): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReference(value: org.scalajs.dom.raw.Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reference")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

