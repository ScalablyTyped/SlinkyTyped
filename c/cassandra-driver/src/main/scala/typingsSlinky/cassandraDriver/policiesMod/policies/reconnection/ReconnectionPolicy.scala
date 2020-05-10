package typingsSlinky.cassandraDriver.policiesMod.policies.reconnection

import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReconnectionPolicy extends js.Object {
  def getOptions(): Map[String, js.Object] = js.native
  def newSchedule(): js.Iterator[Double] = js.native
}

object ReconnectionPolicy {
  @scala.inline
  def apply(getOptions: () => Map[String, js.Object], newSchedule: () => js.Iterator[Double]): ReconnectionPolicy = {
    val __obj = js.Dynamic.literal(getOptions = js.Any.fromFunction0(getOptions), newSchedule = js.Any.fromFunction0(newSchedule))
    __obj.asInstanceOf[ReconnectionPolicy]
  }
  @scala.inline
  implicit class ReconnectionPolicyOps[Self <: ReconnectionPolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetOptions(value: () => Map[String, js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOptions")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewSchedule(value: () => js.Iterator[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newSchedule")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

