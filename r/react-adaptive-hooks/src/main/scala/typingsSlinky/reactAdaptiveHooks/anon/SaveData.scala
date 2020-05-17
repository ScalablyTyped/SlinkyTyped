package typingsSlinky.reactAdaptiveHooks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SaveData extends js.Object {
  var saveData: Boolean | Null = js.native
  var unsupported: Boolean = js.native
}

object SaveData {
  @scala.inline
  def apply(unsupported: Boolean): SaveData = {
    val __obj = js.Dynamic.literal(unsupported = unsupported.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaveData]
  }
  @scala.inline
  implicit class SaveDataOps[Self <: SaveData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUnsupported(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsupported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSaveData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSaveDataNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveData")(null)
        ret
    }
  }
  
}

