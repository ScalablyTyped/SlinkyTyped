package typingsSlinky.iobroker.anon

import typingsSlinky.iobroker.mod.global.ioBroker.ChownFileResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Entries extends js.Object {
  var entries: js.Array[ChownFileResult] = js.native
  var id: String = js.native
}

object Entries {
  @scala.inline
  def apply(entries: js.Array[ChownFileResult], id: String): Entries = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entries]
  }
  @scala.inline
  implicit class EntriesOps[Self <: Entries] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntries(value: js.Array[ChownFileResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

