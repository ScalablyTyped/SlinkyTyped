package typingsSlinky.baseui.selectMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptgroupsT
  extends /* key */ StringDictionary[Value]
     with OptionsT {
  var __ungrouped: Value = js.native
}

object OptgroupsT {
  @scala.inline
  def apply(__ungrouped: Value): OptgroupsT = {
    val __obj = js.Dynamic.literal(__ungrouped = __ungrouped.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptgroupsT]
  }
  @scala.inline
  implicit class OptgroupsTOps[Self <: OptgroupsT] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with__ungrouped(value: Value): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__ungrouped")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

