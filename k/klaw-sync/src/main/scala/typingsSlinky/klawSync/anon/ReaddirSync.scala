package typingsSlinky.klawSync.anon

import typingsSlinky.node.fsMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReaddirSync extends js.Object {
  def readdirSync(path: String): js.Array[String] = js.native
  def statSync(path: String): Stats = js.native
}

object ReaddirSync {
  @scala.inline
  def apply(readdirSync: String => js.Array[String], statSync: String => Stats): ReaddirSync = {
    val __obj = js.Dynamic.literal(readdirSync = js.Any.fromFunction1(readdirSync), statSync = js.Any.fromFunction1(statSync))
    __obj.asInstanceOf[ReaddirSync]
  }
  @scala.inline
  implicit class ReaddirSyncOps[Self <: ReaddirSync] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReaddirSync(value: String => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readdirSync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStatSync(value: String => Stats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statSync")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

