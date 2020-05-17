package typingsSlinky.oracleOraclejet.anon

import typingsSlinky.oracleOraclejet.ojtableMod.ojTable.RowSelectionEnd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndIndexEndKey[K] extends RowSelectionEnd[K] {
  var endIndex: RowNumber = js.native
  var endKey: js.UndefOr[`23`[K]] = js.native
}

object EndIndexEndKey {
  @scala.inline
  def apply[K](endIndex: RowNumber): EndIndexEndKey[K] = {
    val __obj = js.Dynamic.literal(endIndex = endIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndIndexEndKey[K]]
  }
  @scala.inline
  implicit class EndIndexEndKeyOps[Self[k] <: EndIndexEndKey[k], K] (val x: Self[K]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[K] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[K] with Other]
    @scala.inline
    def withEndIndex(value: RowNumber): Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndKey(value: `23`[K]): Self[K] = {
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

