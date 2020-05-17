package typingsSlinky.oracleOraclejet.anon

import typingsSlinky.oracleOraclejet.ojtableMod.ojTable.ColumnSelectionEnd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndIndex[K] extends ColumnSelectionEnd[K] {
  var endIndex: `20` = js.native
  var endKey: js.UndefOr[`21`[K]] = js.native
}

object EndIndex {
  @scala.inline
  def apply[K](endIndex: `20`): EndIndex[K] = {
    val __obj = js.Dynamic.literal(endIndex = endIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndIndex[K]]
  }
  @scala.inline
  implicit class EndIndexOps[Self[k] <: EndIndex[k], K] (val x: Self[K]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[K] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[K] with Other]
    @scala.inline
    def withEndIndex(value: `20`): Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndKey(value: `21`[K]): Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndKey: Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endKey")(js.undefined)
        ret
    }
  }
  
}

