package typingsSlinky.openlayers.mod.olx.interaction

import typingsSlinky.openlayers.mod.Extent_
import typingsSlinky.openlayers.mod.Feature
import typingsSlinky.openlayers.mod.StyleFunction
import typingsSlinky.openlayers.mod.style.Style
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtentOptions extends js.Object {
  var boxStyle: js.UndefOr[Style | js.Array[Style] | StyleFunction] = js.native
  var extent: js.UndefOr[Extent_] = js.native
  var pixelTolerance: js.UndefOr[Double] = js.native
  var pointerStyle: js.UndefOr[Style | js.Array[Style] | StyleFunction] = js.native
  var wrapX: js.UndefOr[Boolean] = js.native
}

object ExtentOptions {
  @scala.inline
  def apply(): ExtentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtentOptions]
  }
  @scala.inline
  implicit class ExtentOptionsOps[Self <: ExtentOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBoxStyleFunction2(
      value: (/* feature */ Feature | typingsSlinky.openlayers.mod.render.Feature, /* resolution */ Double) => Style | js.Array[Style] | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxStyle")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withBoxStyle(value: Style | js.Array[Style] | StyleFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoxStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withExtent(value: Extent_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extent")(js.undefined)
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
    def withPointerStyleFunction2(
      value: (/* feature */ Feature | typingsSlinky.openlayers.mod.render.Feature, /* resolution */ Double) => Style | js.Array[Style] | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointerStyle")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPointerStyle(value: Style | js.Array[Style] | StyleFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointerStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointerStyle")(js.undefined)
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

