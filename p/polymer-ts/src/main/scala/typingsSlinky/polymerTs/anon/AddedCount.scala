package typingsSlinky.polymerTs.anon

import typingsSlinky.polymerTs.polymerTsStrings.splice
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddedCount extends js.Object {
  var addedCount: Double = js.native
  var index: Double = js.native
  var `object`: js.Array[_] = js.native
  var removed: js.Array[_] = js.native
  var `type`: splice = js.native
}

object AddedCount {
  @scala.inline
  def apply(addedCount: Double, index: Double, `object`: js.Array[_], removed: js.Array[_], `type`: splice): AddedCount = {
    val __obj = js.Dynamic.literal(addedCount = addedCount.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddedCount]
  }
  @scala.inline
  implicit class AddedCountOps[Self <: AddedCount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddedCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addedCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObject(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoved(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: splice): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

