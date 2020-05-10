package typingsSlinky.baidumapWebSdk.BMap

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapPanes extends js.Object {
  var floatPane: js.UndefOr[HTMLElement] = js.native
  var floatShadow: js.UndefOr[HTMLElement] = js.native
  var labelPane: js.UndefOr[HTMLElement] = js.native
  var mapPane: js.UndefOr[HTMLElement] = js.native
  var markerMouseTarget: js.UndefOr[HTMLElement] = js.native
  var markerPane: js.UndefOr[HTMLElement] = js.native
  var markerShadow: js.UndefOr[HTMLElement] = js.native
}

object MapPanes {
  @scala.inline
  def apply(): MapPanes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapPanes]
  }
  @scala.inline
  implicit class MapPanesOps[Self <: MapPanes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFloatPane(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floatPane")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloatPane: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floatPane")(js.undefined)
        ret
    }
    @scala.inline
    def withFloatShadow(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floatShadow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloatShadow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floatShadow")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelPane(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelPane")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelPane: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelPane")(js.undefined)
        ret
    }
    @scala.inline
    def withMapPane(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapPane")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMapPane: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapPane")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerMouseTarget(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerMouseTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerMouseTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerMouseTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerPane(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerPane")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerPane: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerPane")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerShadow(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerShadow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerShadow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerShadow")(js.undefined)
        ret
    }
  }
  
}

