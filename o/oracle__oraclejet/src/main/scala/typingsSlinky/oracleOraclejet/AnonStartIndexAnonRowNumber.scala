package typingsSlinky.oracleOraclejet

import typingsSlinky.oracleOraclejet.ojtableMod.ojTable.RowSelectionStart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonStartIndexAnonRowNumber[K] extends RowSelectionStart[K] {
  var startIndex: AnonRowNumber = js.native
  var startKey: js.UndefOr[Anon23[K]] = js.native
}

object AnonStartIndexAnonRowNumber {
  @scala.inline
  def apply[K](startIndex: AnonRowNumber): AnonStartIndexAnonRowNumber[K] = {
    val __obj = js.Dynamic.literal(startIndex = startIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStartIndexAnonRowNumber[K]]
  }
  @scala.inline
  implicit class AnonStartIndexAnonRowNumberOps[Self[k] <: AnonStartIndexAnonRowNumber[k], K] (val x: Self[K]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[K] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[K] with Other]
    @scala.inline
    def withStartIndex(value: AnonRowNumber): Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartKey(value: Anon23[K]): Self[K] = {
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

