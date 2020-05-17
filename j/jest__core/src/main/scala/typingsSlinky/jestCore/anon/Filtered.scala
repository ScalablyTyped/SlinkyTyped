package typingsSlinky.jestCore.anon

import typingsSlinky.jestCore.typesMod.FilterResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Filtered extends js.Object {
  var filtered: js.Array[FilterResult] = js.native
}

object Filtered {
  @scala.inline
  def apply(filtered: js.Array[FilterResult]): Filtered = {
    val __obj = js.Dynamic.literal(filtered = filtered.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filtered]
  }
  @scala.inline
  implicit class FilteredOps[Self <: Filtered] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFiltered(value: js.Array[FilterResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filtered")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

