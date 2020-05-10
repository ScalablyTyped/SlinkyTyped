package typingsSlinky.cesium

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLCanvasElement
import typingsSlinky.cesium.mod.MapMode2D
import typingsSlinky.cesium.mod.MapProjection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonContextOptions extends js.Object {
  var canvas: HTMLCanvasElement = js.native
  var contextOptions: js.UndefOr[js.Any] = js.native
  var creditContainer: js.UndefOr[Element] = js.native
  var creditViewport: js.UndefOr[Element] = js.native
  var mapMode2D: js.UndefOr[MapMode2D] = js.native
  var mapProjection: js.UndefOr[MapProjection] = js.native
  var maximumRenderTimeChange: js.UndefOr[Double] = js.native
  var orderIndependentTranslucency: js.UndefOr[Boolean] = js.native
  var requestRenderMode: js.UndefOr[Boolean] = js.native
  var scene3DOnly: js.UndefOr[Boolean] = js.native
  var shadows: js.UndefOr[Boolean] = js.native
  var terrainExaggeration: js.UndefOr[Double] = js.native
}

object AnonContextOptions {
  @scala.inline
  def apply(canvas: HTMLCanvasElement): AnonContextOptions = {
    val __obj = js.Dynamic.literal(canvas = canvas.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContextOptions]
  }
  @scala.inline
  implicit class AnonContextOptionsOps[Self <: AnonContextOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanvas(value: HTMLCanvasElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canvas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContextOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContextOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withCreditContainer(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creditContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreditContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creditContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withCreditViewport(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creditViewport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreditViewport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creditViewport")(js.undefined)
        ret
    }
    @scala.inline
    def withMapMode2D(value: MapMode2D): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapMode2D")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMapMode2D: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapMode2D")(js.undefined)
        ret
    }
    @scala.inline
    def withMapProjection(value: MapProjection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapProjection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMapProjection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapProjection")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumRenderTimeChange(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumRenderTimeChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumRenderTimeChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumRenderTimeChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOrderIndependentTranslucency(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderIndependentTranslucency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrderIndependentTranslucency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderIndependentTranslucency")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestRenderMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestRenderMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestRenderMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestRenderMode")(js.undefined)
        ret
    }
    @scala.inline
    def withScene3DOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scene3DOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScene3DOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scene3DOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withShadows(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadows")(js.undefined)
        ret
    }
    @scala.inline
    def withTerrainExaggeration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("terrainExaggeration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTerrainExaggeration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("terrainExaggeration")(js.undefined)
        ret
    }
  }
  
}

