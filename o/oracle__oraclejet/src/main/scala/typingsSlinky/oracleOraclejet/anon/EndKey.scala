package typingsSlinky.oracleOraclejet.anon

import typingsSlinky.oracleOraclejet.ojtableMod.ojTable.ColumnSelectionEnd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndKey[K] extends ColumnSelectionEnd[K] {
  var endIndex: js.UndefOr[`20`] = js.native
  var endKey: `21`[K] = js.native
}

object EndKey {
  @scala.inline
  def apply[K](endKey: `21`[K]): EndKey[K] = {
    val __obj = js.Dynamic.literal(endKey = endKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndKey[K]]
  }
  @scala.inline
  implicit class EndKeyOps[Self[k] <: EndKey[k], K] (val x: Self[K]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[K] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[K] with Other]
    @scala.inline
    def withEndKey(value: `21`[K]): Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndIndex(value: `20`): Self[K] = {
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

