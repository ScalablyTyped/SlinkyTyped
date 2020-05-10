package typingsSlinky.ol.drawMod

import typingsSlinky.ol.conditionMod.Condition
import typingsSlinky.ol.geometryTypeMod.GeometryType
import typingsSlinky.ol.olFeatureMod.FeatureLike
import typingsSlinky.ol.styleStyleMod.Style
import typingsSlinky.ol.styleStyleMod.StyleLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var clickTolerance: js.UndefOr[Double] = js.native
  var condition: js.UndefOr[Condition] = js.native
  var dragVertexDelay: js.UndefOr[Double] = js.native
  var features: js.UndefOr[
    typingsSlinky.ol.collectionMod.default[typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default]]
  ] = js.native
  var finishCondition: js.UndefOr[Condition] = js.native
  var freehand: js.UndefOr[Boolean] = js.native
  var freehandCondition: js.UndefOr[Condition] = js.native
  var geometryFunction: js.UndefOr[GeometryFunction] = js.native
  var geometryName: js.UndefOr[String] = js.native
  var maxPoints: js.UndefOr[Double] = js.native
  var minPoints: js.UndefOr[Double] = js.native
  var snapTolerance: js.UndefOr[Double] = js.native
  var source: js.UndefOr[typingsSlinky.ol.sourceVectorMod.default[typingsSlinky.ol.geometryMod.default]] = js.native
  var stopClick: js.UndefOr[Boolean] = js.native
  var style: js.UndefOr[StyleLike] = js.native
  var `type`: GeometryType = js.native
  var wrapX: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(`type`: GeometryType): Options = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def withCondition(value: Condition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("condition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCondition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("condition")(js.undefined)
        ret
    }
    @scala.inline
    def withDragVertexDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragVertexDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragVertexDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragVertexDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withFeatures(
      value: typingsSlinky.ol.collectionMod.default[typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default]]
    ): Self = {
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
    def withFinishCondition(value: Condition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finishCondition")(value.asInstanceOf[js.Any])
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
    def withFreehandCondition(value: Condition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("freehandCondition")(value.asInstanceOf[js.Any])
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
      value: (/* p0 */ SketchCoordType, /* p1 */ js.UndefOr[typingsSlinky.ol.simpleGeometryMod.default], /* p2 */ js.UndefOr[typingsSlinky.ol.projectionMod.default]) => typingsSlinky.ol.simpleGeometryMod.default
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometryFunction")(js.Any.fromFunction3(value))
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
    def withSource(value: typingsSlinky.ol.sourceVectorMod.default[typingsSlinky.ol.geometryMod.default]): Self = {
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
    def withStyleFunction2(value: (/* p0 */ FeatureLike, /* p1 */ Double) => Style | js.Array[Style] | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withStyle(value: StyleLike): Self = {
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

