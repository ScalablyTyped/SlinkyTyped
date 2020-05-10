package typingsSlinky.openlayers.mod.olx.interaction

import typingsSlinky.openlayers.mod.Collection
import typingsSlinky.openlayers.mod.EventsConditionType
import typingsSlinky.openlayers.mod.Feature
import typingsSlinky.openlayers.mod.MapBrowserEvent
import typingsSlinky.openlayers.mod.StyleFunction
import typingsSlinky.openlayers.mod.source.Vector
import typingsSlinky.openlayers.mod.style.Style
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyOptions extends js.Object {
  var condition: js.UndefOr[EventsConditionType] = js.native
  var deleteCondition: js.UndefOr[EventsConditionType] = js.native
  var features: js.UndefOr[Collection[Feature]] = js.native
  var insertVertexCondition: js.UndefOr[EventsConditionType] = js.native
  var pixelTolerance: js.UndefOr[Double] = js.native
  var source: js.UndefOr[Vector] = js.native
  var style: js.UndefOr[Style | js.Array[Style] | StyleFunction] = js.native
  var wrapX: js.UndefOr[Boolean] = js.native
}

object ModifyOptions {
  @scala.inline
  def apply(): ModifyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyOptions]
  }
  @scala.inline
  implicit class ModifyOptionsOps[Self <: ModifyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withDeleteCondition(value: /* event */ MapBrowserEvent => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteCondition")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDeleteCondition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteCondition")(js.undefined)
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
    def withInsertVertexCondition(value: /* event */ MapBrowserEvent => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertVertexCondition")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutInsertVertexCondition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertVertexCondition")(js.undefined)
        ret
    }
    @scala.inline
    def withPixelTolerance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelTolerance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPixelTolerance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelTolerance")(js.undefined)
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

