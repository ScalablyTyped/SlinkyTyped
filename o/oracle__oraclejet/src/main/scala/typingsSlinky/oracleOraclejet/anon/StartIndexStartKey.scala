package typingsSlinky.oracleOraclejet.anon

import typingsSlinky.oracleOraclejet.ojtableMod.ojTable.ColumnSelectionStart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartIndexStartKey[K] extends ColumnSelectionStart[K] {
  var startIndex: js.UndefOr[`20`] = js.native
  var startKey: `21`[K] = js.native
}

object StartIndexStartKey {
  @scala.inline
  def apply[K](startKey: `21`[K]): StartIndexStartKey[K] = {
    val __obj = js.Dynamic.literal(startKey = startKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartIndexStartKey[K]]
  }
  @scala.inline
  implicit class StartIndexStartKeyOps[Self[k] <: StartIndexStartKey[k], K] (val x: Self[K]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[K] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[K] with Other]
    @scala.inline
    def withStartKey(value: `21`[K]): Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartIndex(value: `20`): Self[K] = {
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

