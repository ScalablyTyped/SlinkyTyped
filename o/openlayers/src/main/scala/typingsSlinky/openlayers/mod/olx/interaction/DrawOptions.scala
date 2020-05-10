package typingsSlinky.openlayers.mod.olx.interaction

import typingsSlinky.openlayers.mod.Collection
import typingsSlinky.openlayers.mod.Coordinate_
import typingsSlinky.openlayers.mod.DrawGeometryFunctionType
import typingsSlinky.openlayers.mod.EventsConditionType
import typingsSlinky.openlayers.mod.Feature
import typingsSlinky.openlayers.mod.MapBrowserEvent
import typingsSlinky.openlayers.mod.StyleFunction
import typingsSlinky.openlayers.mod.geom.GeometryType
import typingsSlinky.openlayers.mod.geom.SimpleGeometry
import typingsSlinky.openlayers.mod.source.Vector
import typingsSlinky.openlayers.mod.style.Style
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DrawOptions extends js.Object {
  var clickTolerance: js.UndefOr[Double] = js.native
  var condition: js.UndefOr[EventsConditionType] = js.native
  var features: js.UndefOr[Collection[Feature]] = js.native
  var finishCondition: js.UndefOr[EventsConditionType] = js.native
  var freehand: js.UndefOr[Boolean] = js.native
  var freehandCondition: js.UndefOr[EventsConditionType] = js.native
  var geometryFunction: js.UndefOr[DrawGeometryFunctionType] = js.native
  var geometryName: js.UndefOr[String] = js.native
  var maxPoints: js.UndefOr[Double] = js.native
  var minPoints: js.UndefOr[Double] = js.native
  var snapTolerance: js.UndefOr[Double] = js.native
  var source: js.UndefOr[Vector] = js.native
  var stopClick: js.UndefOr[Boolean] = js.native
  var style: js.UndefOr[Style | js.Array[Style] | StyleFunction] = js.native
  var `type`: GeometryType = js.native
  var wrapX: js.UndefOr[Boolean] = js.native
}

object DrawOptions {
  @scala.inline
  def apply(`type`: GeometryType): DrawOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawOptions]
  }
  @scala.inline
  implicit class DrawOptionsOps[Self <: DrawOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: GeometryType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClickTolerance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickTolerance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClickTolerance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickTolerance")(js.undefined)
        ret
    }
    @scala.inline
    def withCondition(value: /* event */ MapBrowserEvent => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("condition")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCondition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("condition")(js.undefined)
        ret
    }
    @scala.inline
    def withFeatures(value: Collection[Feature]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("features")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeatures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("features")(js.undefined)
        ret
    }
    @scala.inline
    def withFinishCondition(value: /* event */ MapBrowserEvent => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finishCondition")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFinishCondition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finishCondition")(js.undefined)
        ret
    }
    @scala.inline
    def withFreehand(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("freehand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFreehand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("freehand")(js.undefined)
        ret
    }
    @scala.inline
    def withFreehandCondition(value: /* event */ MapBrowserEvent => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("freehandCondition")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFreehandCondition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("freehandCondition")(js.undefined)
        ret
    }
    @scala.inline
    def withGeometryFunction(
      value: (/* coords */ Coordinate_ | (js.Array[js.Array[Coordinate_] | Coordinate_]), /* geo */ js.UndefOr[SimpleGeometry]) => SimpleGeometry
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometryFunction")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGeometryFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometryFunction")(js.undefined)
        ret
    }
    @scala.inline
    def withGeometryName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometryName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeometryName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometryName")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxPoints(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxPoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPoints")(js.undefined)
        ret
    }
    @scala.inline
    def withMinPoints(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minPoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinPoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minPoints")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapTolerance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapTolerance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapTolerance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapTolerance")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: Vector): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
    @scala.inline
    def withStopClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStopClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopClick")(js.undefined)
        ret
    }
    @scala.inline
    def withStyleFunction2(
      value: (/* feature */ Feature | typingsSlinky.openlayers.mod.render.Feature, /* resolution */ Double) => Style | js.Array[Style] | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withStyle(value: Style | js.Array[Style] | StyleFunction): Self = {
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
    @scala.inline
    def withWrapX(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrapX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapX")(js.undefined)
        ret
    }
  }
  
}

