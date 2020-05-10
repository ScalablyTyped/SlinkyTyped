package typingsSlinky.awsSdk.transferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HomeDirectoryMapEntry extends js.Object {
  /**
    * Represents an entry and a target for HomeDirectoryMappings.
    */
  var Entry: MapEntry = js.native
  /**
    * Represents the map target that is used in a HomeDirectorymapEntry.
    */
  var Target: MapTarget = js.native
}

object HomeDirectoryMapEntry {
  @scala.inline
  def apply(Entry: MapEntry, Target: MapTarget): HomeDirectoryMapEntry = {
    val __obj = js.Dynamic.literal(Entry = Entry.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any])
    __obj.asInstanceOf[HomeDirectoryMapEntry]
  }
  @scala.inline
  implicit class HomeDirectoryMapEntryOps[Self <: HomeDirectoryMapEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntry(value: MapEntry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Entry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: MapTarget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Target")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

