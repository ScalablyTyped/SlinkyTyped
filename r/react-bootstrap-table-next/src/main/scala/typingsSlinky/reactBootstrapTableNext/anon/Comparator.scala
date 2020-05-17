package typingsSlinky.reactBootstrapTableNext.anon

import typingsSlinky.reactBootstrapTableNext.reactBootstrapTableNextStrings.TEXT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Comparator extends js.Object {
  var comparator: js.Any = js.native
  var filterType: TEXT = js.native
  var filterVal: js.Any = js.native
}

object Comparator {
  @scala.inline
  def apply(comparator: js.Any, filterType: TEXT, filterVal: js.Any): Comparator = {
    val __obj = js.Dynamic.literal(comparator = comparator.asInstanceOf[js.Any], filterType = filterType.asInstanceOf[js.Any], filterVal = filterVal.asInstanceOf[js.Any])
    __obj.asInstanceOf[Comparator]
  }
  @scala.inline
  implicit class ComparatorOps[Self <: Comparator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComparator(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilterType(value: TEXT): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilterVal(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterVal")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

