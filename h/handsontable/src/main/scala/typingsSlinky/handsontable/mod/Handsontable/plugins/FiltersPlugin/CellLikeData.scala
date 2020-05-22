package typingsSlinky.handsontable.mod.Handsontable.plugins.FiltersPlugin

import typingsSlinky.handsontable.anon.Col
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellLikeData extends js.Object {
  var meta: Col
  var value: String
}

object CellLikeData {
  @scala.inline
  def apply(meta: Col, value: String): CellLikeData = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellLikeData]
  }
}

