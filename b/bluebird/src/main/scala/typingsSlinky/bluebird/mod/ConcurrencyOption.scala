package typingsSlinky.bluebird.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConcurrencyOption extends js.Object {
  var concurrency: Double = js.native
}

object ConcurrencyOption {
  @scala.inline
  def apply(concurrency: Double): ConcurrencyOption = {
    val __obj = js.Dynamic.literal(concurrency = concurrency.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConcurrencyOption]
  }
  @scala.inline
  implicit class ConcurrencyOptionOps[Self <: ConcurrencyOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConcurrency(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concurrency")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

