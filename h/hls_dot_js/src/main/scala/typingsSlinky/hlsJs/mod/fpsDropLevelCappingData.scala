package typingsSlinky.hlsJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait fpsDropLevelCappingData extends js.Object {
  var droppedLevel: Level = js.native
  var level: Level = js.native
}

object fpsDropLevelCappingData {
  @scala.inline
  def apply(droppedLevel: Level, level: Level): fpsDropLevelCappingData = {
    val __obj = js.Dynamic.literal(droppedLevel = droppedLevel.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.asInstanceOf[fpsDropLevelCappingData]
  }
  @scala.inline
  implicit class fpsDropLevelCappingDataOps[Self <: fpsDropLevelCappingData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDroppedLevel(value: Level): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("droppedLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLevel(value: Level): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

