package typingsSlinky.baidumapWebSdk.BMap

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapStyleItemStylers
  extends /* k */ StringDictionary[js.UndefOr[String]] {
  var color: js.UndefOr[String] = js.native
  var curZoomRegion: js.UndefOr[String] = js.native
  var curZoomRegionId: js.UndefOr[String] = js.native
  var fontsize: js.UndefOr[String] = js.native
  var level: js.UndefOr[String] = js.native
  var visibility: js.UndefOr[String] = js.native
  var weight: js.UndefOr[String] = js.native
}

object MapStyleItemStylers {
  @scala.inline
  def apply(): MapStyleItemStylers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapStyleItemStylers]
  }
  @scala.inline
  implicit class MapStyleItemStylersOps[Self <: MapStyleItemStylers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withCurZoomRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("curZoomRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurZoomRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("curZoomRegion")(js.undefined)
        ret
    }
    @scala.inline
    def withCurZoomRegionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("curZoomRegionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurZoomRegionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("curZoomRegionId")(js.undefined)
        ret
    }
    @scala.inline
    def withFontsize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontsize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontsize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontsize")(js.undefined)
        ret
    }
    @scala.inline
    def withLevel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibility(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibility")(js.undefined)
        ret
    }
    @scala.inline
    def withWeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weight")(js.undefined)
        ret
    }
  }
  
}

