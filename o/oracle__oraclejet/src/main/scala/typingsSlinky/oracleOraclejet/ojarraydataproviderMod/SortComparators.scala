package typingsSlinky.oracleOraclejet.ojarraydataproviderMod

import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SortComparators[D] extends js.Object {
  var comparators: Map[/* keyof D */ String, js.Function2[/* a */ _, /* b */ _, Double]] = js.native
}

object SortComparators {
  @scala.inline
  def apply[D](comparators: Map[/* keyof D */ String, js.Function2[/* a */ _, /* b */ _, Double]]): SortComparators[D] = {
    val __obj = js.Dynamic.literal(comparators = comparators.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortComparators[D]]
  }
  @scala.inline
  implicit class SortComparatorsOps[Self[d] <: SortComparators[d], D] (val x: Self[D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[D] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[D] with Other]
    @scala.inline
    def withComparators(value: Map[/* keyof D */ String, js.Function2[/* a */ _, /* b */ _, Double]]): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comparators")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

