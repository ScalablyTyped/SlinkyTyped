package typingsSlinky.reactBootstrapTable.anon

import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComparatorDate extends js.Object {
  var comparator: CSSProperties = js.native
  var date: CSSProperties = js.native
}

object ComparatorDate {
  @scala.inline
  def apply(comparator: CSSProperties, date: CSSProperties): ComparatorDate = {
    val __obj = js.Dynamic.literal(comparator = comparator.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComparatorDate]
  }
  @scala.inline
  implicit class ComparatorDateOps[Self <: ComparatorDate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComparator(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDate(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

