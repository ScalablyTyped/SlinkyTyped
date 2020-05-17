package typingsSlinky.onfleetNodeOnfleet.anon

import typingsSlinky.onfleetNodeOnfleet.workersMod.WorkerSchedule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Entries extends js.Object {
  var entries: js.Array[WorkerSchedule] = js.native
}

object Entries {
  @scala.inline
  def apply(entries: js.Array[WorkerSchedule]): Entries = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entries]
  }
  @scala.inline
  implicit class EntriesOps[Self <: Entries] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntries(value: js.Array[WorkerSchedule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entries")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

