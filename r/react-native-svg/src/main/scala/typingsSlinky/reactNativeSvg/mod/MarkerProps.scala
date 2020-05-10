package typingsSlinky.reactNativeSvg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MarkerProps extends js.Object {
  var id: js.UndefOr[String] = js.native
  var markerHeight: js.UndefOr[NumberProp] = js.native
  var markerUnits: js.UndefOr[MarkerUnits] = js.native
  var markerWidth: js.UndefOr[NumberProp] = js.native
  var orient: js.UndefOr[Orient | NumberProp] = js.native
  var preserveAspectRatio: js.UndefOr[String] = js.native
  var refX: js.UndefOr[NumberProp] = js.native
  var refY: js.UndefOr[NumberProp] = js.native
  var viewBox: js.UndefOr[String] = js.native
}

object MarkerProps {
  @scala.inline
  def apply(): MarkerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarkerProps]
  }
  @scala.inline
  implicit class MarkerPropsOps[Self <: MarkerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerHeight(value: NumberProp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerUnits(value: MarkerUnits): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerUnits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerUnits")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerWidth(value: NumberProp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withOrient(value: Orient | NumberProp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orient")(js.undefined)
        ret
    }
    @scala.inline
    def withPreserveAspectRatio(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveAspectRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreserveAspectRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveAspectRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withRefX(value: NumberProp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refX")(js.undefined)
        ret
    }
    @scala.inline
    def withRefY(value: NumberProp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refY")(js.undefined)
        ret
    }
    @scala.inline
    def withViewBox(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewBox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewBox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewBox")(js.undefined)
        ret
    }
  }
  
}

