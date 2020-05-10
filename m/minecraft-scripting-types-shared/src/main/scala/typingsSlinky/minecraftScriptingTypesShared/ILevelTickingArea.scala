package typingsSlinky.minecraftScriptingTypesShared

import typingsSlinky.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.level_ticking_area
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILevelTickingArea extends ITickingArea {
  /**
    * The type of the object
    */
  val __type__ : level_ticking_area = js.native
  /**
    * The uuid of the ticking area
    */
  val level_ticking_area_id: String = js.native
}

object ILevelTickingArea {
  @scala.inline
  def apply(__type__ : level_ticking_area, level_ticking_area_id: String): ILevelTickingArea = {
    val __obj = js.Dynamic.literal(__type__ = __type__.asInstanceOf[js.Any], level_ticking_area_id = level_ticking_area_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILevelTickingArea]
  }
  @scala.inline
  implicit class ILevelTickingAreaOps[Self <: ILevelTickingArea] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with__type__(value: level_ticking_area): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__type__")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLevel_ticking_area_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level_ticking_area_id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

