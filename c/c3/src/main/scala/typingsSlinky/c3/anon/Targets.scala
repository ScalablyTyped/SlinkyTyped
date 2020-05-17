package typingsSlinky.c3.anon

import typingsSlinky.c3.mod.DataSeries
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Targets extends js.Object {
  var targets: js.Array[DataSeries] = js.native
}

object Targets {
  @scala.inline
  def apply(targets: js.Array[DataSeries]): Targets = {
    val __obj = js.Dynamic.literal(targets = targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[Targets]
  }
  @scala.inline
  implicit class TargetsOps[Self <: Targets] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTargets(value: js.Array[DataSeries]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targets")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

