package typingsSlinky.oracleOraclejet.anon

import typingsSlinky.oracleOraclejet.ojtableMod.ojTable.RowSelectionEnd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndIndexRowNumber[K] extends RowSelectionEnd[K] {
  var endIndex: js.UndefOr[RowNumber] = js.native
  var endKey: `23`[K] = js.native
}

object EndIndexRowNumber {
  @scala.inline
  def apply[K](endKey: `23`[K]): EndIndexRowNumber[K] = {
    val __obj = js.Dynamic.literal(endKey = endKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndIndexRowNumber[K]]
  }
  @scala.inline
  implicit class EndIndexRowNumberOps[Self[k] <: EndIndexRowNumber[k], K] (val x: Self[K]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[K] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[K] with Other]
    @scala.inline
    def withEndKey(value: `23`[K]): Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndIndex(value: RowNumber): Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndIndex: Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endIndex")(js.undefined)
        ret
    }
  }
  
}

