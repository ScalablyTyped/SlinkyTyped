package typingsSlinky.googlemaps.google.maps.Data

import org.scalajs.dom.raw.Element
import typingsSlinky.googlemaps.google.maps.ControlPosition
import typingsSlinky.googlemaps.google.maps.DrawingMode
import typingsSlinky.googlemaps.google.maps.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataOptions extends js.Object {
  var controlPosition: js.UndefOr[ControlPosition] = js.native
  var controls: js.UndefOr[js.Array[DrawingMode] | Null] = js.native
  var drawingMode: js.UndefOr[DrawingMode | Null] = js.native
  var featureFactory: js.UndefOr[js.Function1[/* geometry */ Geometry, Feature]] = js.native
  var map: js.UndefOr[Map[Element]] = js.native
  var style: js.UndefOr[StylingFunction | StyleOptions] = js.native
}

object DataOptions {
  @scala.inline
  def apply(): DataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataOptions]
  }
  @scala.inline
  implicit class DataOptionsOps[Self <: DataOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withControlPosition(value: ControlPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControlPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withControls(value: js.Array[DrawingMode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controls")(js.undefined)
        ret
    }
    @scala.inline
    def withControlsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controls")(null)
        ret
    }
    @scala.inline
    def withDrawingMode(value: DrawingMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawingMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrawingMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawingMode")(js.undefined)
        ret
    }
    @scala.inline
    def withDrawingModeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawingMode")(null)
        ret
    }
    @scala.inline
    def withFeatureFactory(value: /* geometry */ Geometry => Feature): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureFactory")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFeatureFactory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureFactory")(js.undefined)
        ret
    }
    @scala.inline
    def withMap(value: Map[Element]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(js.undefined)
        ret
    }
    @scala.inline
    def withStyleFunction1(value: /* feature */ Feature => StyleOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStyle(value: StylingFunction | StyleOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
  }
  
}

