package typingsSlinky.reactNativeSqliteStorage.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResultSetRowList extends js.Object {
  var length: Double = js.native
  def item(index: Double): js.Any = js.native
  def raw(): js.Array[_] = js.native
}

object ResultSetRowList {
  @scala.inline
  def apply(item: Double => js.Any, length: Double, raw: () => js.Array[_]): ResultSetRowList = {
    val __obj = js.Dynamic.literal(item = js.Any.fromFunction1(item), length = length.asInstanceOf[js.Any], raw = js.Any.fromFunction0(raw))
    __obj.asInstanceOf[ResultSetRowList]
  }
  @scala.inline
  implicit class ResultSetRowListOps[Self <: ResultSetRowList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItem(value: Double => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRaw(value: () => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

