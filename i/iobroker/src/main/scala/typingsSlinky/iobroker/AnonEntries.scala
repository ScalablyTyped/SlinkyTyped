package typingsSlinky.iobroker

import typingsSlinky.iobroker.mod._Global_.ioBroker.ChownFileResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEntries extends js.Object {
  var entries: js.Array[ChownFileResult] = js.native
  var id: String = js.native
}

object AnonEntries {
  @scala.inline
  def apply(entries: js.Array[ChownFileResult], id: String): AnonEntries = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEntries]
  }
  @scala.inline
  implicit class AnonEntriesOps[Self <: AnonEntries] (val x: Self) extends AnyVal {
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

