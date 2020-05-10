package typingsSlinky.hlsJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait fpsDropData extends js.Object {
  var currentDecoded: Double = js.native
  var currentDropped: Double = js.native
  var totalDroppedFragmes: Double = js.native
}

object fpsDropData {
  @scala.inline
  def apply(currentDecoded: Double, currentDropped: Double, totalDroppedFragmes: Double): fpsDropData = {
    val __obj = js.Dynamic.literal(currentDecoded = currentDecoded.asInstanceOf[js.Any], currentDropped = currentDropped.asInstanceOf[js.Any], totalDroppedFragmes = totalDroppedFragmes.asInstanceOf[js.Any])
    __obj.asInstanceOf[fpsDropData]
  }
  @scala.inline
  implicit class fpsDropDataOps[Self <: fpsDropData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentDecoded(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentDecoded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentDropped(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentDropped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalDroppedFragmes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalDroppedFragmes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

