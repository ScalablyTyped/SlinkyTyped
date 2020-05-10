package typingsSlinky.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapTypeControlOptions extends js.Object {
  var mapTypes: js.UndefOr[js.Array[MapType]] = js.native
  var `type`: js.UndefOr[MapTypeControlType] = js.native
}

object MapTypeControlOptions {
  @scala.inline
  def apply(): MapTypeControlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapTypeControlOptions]
  }
  @scala.inline
  implicit class MapTypeControlOptionsOps[Self <: MapTypeControlOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMapTypes(value: js.Array[MapType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMapTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: MapTypeControlType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

