package typingsSlinky.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Aggregate extends js.Object {
  var aggregate: js.UndefOr[Boolean] = js.native
}

object Aggregate {
  @scala.inline
  def apply(): Aggregate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Aggregate]
  }
  @scala.inline
  implicit class AggregateOps[Self <: Aggregate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAggregate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAggregate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregate")(js.undefined)
        ret
    }
  }
  
}

