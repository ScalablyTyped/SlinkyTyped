package typingsSlinky.apolloEngineReporting.anon

import typingsSlinky.apolloEngineReporting.agentMod.SendValuesBaseOptions
import typingsSlinky.apolloEngineReporting.apolloEngineReportingBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait All extends SendValuesBaseOptions {
  var all: `true` = js.native
}

object All {
  @scala.inline
  def apply(all: `true`): All = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any])
    __obj.asInstanceOf[All]
  }
  @scala.inline
  implicit class AllOps[Self <: All] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAll(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

