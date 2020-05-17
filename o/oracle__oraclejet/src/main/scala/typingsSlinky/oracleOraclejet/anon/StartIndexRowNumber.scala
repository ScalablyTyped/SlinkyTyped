package typingsSlinky.oracleOraclejet.anon

import typingsSlinky.oracleOraclejet.ojtableMod.ojTable.RowSelectionStart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartIndexRowNumber[K] extends RowSelectionStart[K] {
  var startIndex: RowNumber = js.native
  var startKey: js.UndefOr[`23`[K]] = js.native
}

object StartIndexRowNumber {
  @scala.inline
  def apply[K](startIndex: RowNumber): StartIndexRowNumber[K] = {
    val __obj = js.Dynamic.literal(startIndex = startIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartIndexRowNumber[K]]
  }
  @scala.inline
  implicit class StartIndexRowNumberOps[Self[k] <: StartIndexRowNumber[k], K] (val x: Self[K]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[K] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[K] with Other]
    @scala.inline
    def withStartIndex(value: RowNumber): Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartKey(value: `23`[K]): Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartKey: Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startKey")(js.undefined)
        ret
    }
  }
  
}

