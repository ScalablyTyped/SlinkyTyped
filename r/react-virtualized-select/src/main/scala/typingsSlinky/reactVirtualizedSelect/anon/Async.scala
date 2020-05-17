package typingsSlinky.reactVirtualizedSelect.anon

import typingsSlinky.reactVirtualizedSelect.reactVirtualizedSelectBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Async extends js.Object {
  var async: `true` = js.native
}

object Async {
  @scala.inline
  def apply(async: `true`): Async = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any])
    __obj.asInstanceOf[Async]
  }
  @scala.inline
  implicit class AsyncOps[Self <: Async] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAsync(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("async")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

