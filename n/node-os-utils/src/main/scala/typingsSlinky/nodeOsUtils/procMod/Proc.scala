package typingsSlinky.nodeOsUtils.procMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Proc extends js.Object {
  def totalProcesses(): js.Promise[Double | String] = js.native
  def zombieProcesses(): js.Promise[Double | String] = js.native
}

object Proc {
  @scala.inline
  def apply(
    totalProcesses: () => js.Promise[Double | String],
    zombieProcesses: () => js.Promise[Double | String]
  ): Proc = {
    val __obj = js.Dynamic.literal(totalProcesses = js.Any.fromFunction0(totalProcesses), zombieProcesses = js.Any.fromFunction0(zombieProcesses))
    __obj.asInstanceOf[Proc]
  }
  @scala.inline
  implicit class ProcOps[Self <: Proc] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTotalProcesses(value: () => js.Promise[Double | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalProcesses")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withZombieProcesses(value: () => js.Promise[Double | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zombieProcesses")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

