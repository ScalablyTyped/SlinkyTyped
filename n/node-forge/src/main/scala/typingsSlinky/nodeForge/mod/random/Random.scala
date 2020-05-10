package typingsSlinky.nodeForge.mod.random

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Random extends js.Object {
  def seedFile(needed: Double, cb: CB): Unit = js.native
  def seedFileSync(needed: Double): String = js.native
}

object Random {
  @scala.inline
  def apply(seedFile: (Double, CB) => Unit, seedFileSync: Double => String): Random = {
    val __obj = js.Dynamic.literal(seedFile = js.Any.fromFunction2(seedFile), seedFileSync = js.Any.fromFunction1(seedFileSync))
    __obj.asInstanceOf[Random]
  }
  @scala.inline
  implicit class RandomOps[Self <: Random] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSeedFile(value: (Double, CB) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seedFile")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSeedFileSync(value: Double => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seedFileSync")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

