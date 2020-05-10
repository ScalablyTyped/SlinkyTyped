package typingsSlinky.openlayers.mod.olx.style

import typingsSlinky.openlayers.mod.Feature
import typingsSlinky.openlayers.mod.StyleGeometryFunction
import typingsSlinky.openlayers.mod.geom.Geometry
import typingsSlinky.openlayers.mod.style.Fill
import typingsSlinky.openlayers.mod.style.Image
import typingsSlinky.openlayers.mod.style.Stroke
import typingsSlinky.openlayers.mod.style.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StyleOptions extends js.Object {
  var fill: js.UndefOr[Fill] = js.native
  var geometry: js.UndefOr[String | Geometry | StyleGeometryFunction] = js.native
  var image: js.UndefOr[Image] = js.native
  var stroke: js.UndefOr[Stroke] = js.native
  var text: js.UndefOr[Text] = js.native
  var zIndex: js.UndefOr[Double] = js.native
}

object StyleOptions {
  @scala.inline
  def apply(): StyleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StyleOptions]
  }
  @scala.inline
  implicit class StyleOptionsOps[Self <: StyleOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFill(value: Fill): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(js.undefined)
        ret
    }
    @scala.inline
    def withGeometryFunction1(
      value: /* feature */ Feature | typingsSlinky.openlayers.mod.render.Feature => Geometry | typingsSlinky.openlayers.mod.render.Feature
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometry")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGeometry(value: String | Geometry | StyleGeometryFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeometry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometry")(js.undefined)
        ret
    }
    @scala.inline
    def withImage(value: Image): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(js.undefined)
        ret
    }
    @scala.inline
    def withStroke(value: Stroke): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStroke: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: Text): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withZIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(js.undefined)
        ret
    }
  }
  
}

