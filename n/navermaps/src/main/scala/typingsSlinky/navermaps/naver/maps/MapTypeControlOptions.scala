package typingsSlinky.navermaps.naver.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapTypeControlOptions extends js.Object {
  var mapTypeIds: js.Array[MapTypeId] | Null = js.native
  var position: Position = js.native
  var style: MapTypeControlStyle = js.native
}

object MapTypeControlOptions {
  @scala.inline
  def apply(position: Position, style: MapTypeControlStyle): MapTypeControlOptions = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapTypeControlOptions]
  }
  @scala.inline
  implicit class MapTypeControlOptionsOps[Self <: MapTypeControlOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPosition(value: Position): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyle(value: MapTypeControlStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMapTypeIds(value: js.Array[MapTypeId]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapTypeIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMapTypeIdsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapTypeIds")(null)
        ret
    }
  }
  
}

