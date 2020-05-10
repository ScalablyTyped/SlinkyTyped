package typingsSlinky.oracleOraclejet

import typingsSlinky.oracleOraclejet.ojtableMod.ojTable.RowSelectionStart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonStartKeyAnon23[K] extends RowSelectionStart[K] {
  var startIndex: js.UndefOr[AnonRowNumber] = js.native
  var startKey: Anon23[K] = js.native
}

object AnonStartKeyAnon23 {
  @scala.inline
  def apply[K](startKey: Anon23[K]): AnonStartKeyAnon23[K] = {
    val __obj = js.Dynamic.literal(startKey = startKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStartKeyAnon23[K]]
  }
  @scala.inline
  implicit class AnonStartKeyAnon23Ops[Self[k] <: AnonStartKeyAnon23[k], K] (val x: Self[K]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[K] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[K] with Other]
    @scala.inline
    def withStartKey(value: Anon23[K]): Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartIndex(value: AnonRowNumber): Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartIndex: Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startIndex")(js.undefined)
        ret
    }
  }
  
}

