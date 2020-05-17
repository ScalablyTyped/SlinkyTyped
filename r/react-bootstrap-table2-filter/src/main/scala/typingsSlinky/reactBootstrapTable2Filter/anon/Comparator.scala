package typingsSlinky.reactBootstrapTable2Filter.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Comparator extends js.Object {
  var comparator: typingsSlinky.reactBootstrapTable2Filter.mod.Comparator = js.native
  var number: Double = js.native
}

object Comparator {
  @scala.inline
  def apply(comparator: typingsSlinky.reactBootstrapTable2Filter.mod.Comparator, number: Double): Comparator = {
    val __obj = js.Dynamic.literal(comparator = comparator.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
    __obj.asInstanceOf[Comparator]
  }
  @scala.inline
  implicit class ComparatorOps[Self <: Comparator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComparator(value: typingsSlinky.reactBootstrapTable2Filter.mod.Comparator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

