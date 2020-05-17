package typingsSlinky.oracleOraclejet.anon

import typingsSlinky.oracleOraclejet.ojtableMod.ojTable.ColumnSelectionStart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartKey[K] extends ColumnSelectionStart[K] {
  var startIndex: `20` = js.native
  var startKey: js.UndefOr[`21`[K]] = js.native
}

object StartKey {
  @scala.inline
  def apply[K](startIndex: `20`): StartKey[K] = {
    val __obj = js.Dynamic.literal(startIndex = startIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartKey[K]]
  }
  @scala.inline
  implicit class StartKeyOps[Self[k] <: StartKey[k], K] (val x: Self[K]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[K] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[K] with Other]
    @scala.inline
    def withStartIndex(value: `20`): Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartKey(value: `21`[K]): Self[K] = {
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

