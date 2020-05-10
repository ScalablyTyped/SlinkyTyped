package typingsSlinky.reactSimpleMaps.mod

import org.scalajs.dom.raw.SVGSVGElement
import typingsSlinky.d3Geo.mod.GeoProjection_
import typingsSlinky.react.mod.SVGAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComposableMapProps extends SVGAttributes[SVGSVGElement] {
  /**
    * @default 600
    */
  @JSName("height")
  var height_ComposableMapProps: js.UndefOr[Double] = js.native
  /**
    * @default "geoEqualEarth"
    */
  var projection: js.UndefOr[String | ProjectionFunction] = js.native
  /**
    * @default {}
    */
  var projectionConfig: js.UndefOr[ProjectionConfig] = js.native
  /**
    * @default 800
    */
  @JSName("width")
  var width_ComposableMapProps: js.UndefOr[Double] = js.native
}

object ComposableMapProps {
  @scala.inline
  def apply(): ComposableMapProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComposableMapProps]
  }
  @scala.inline
  implicit class ComposableMapPropsOps[Self <: ComposableMapProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withProjectionFunction3(value: (/* width */ Double, /* height */ Double, /* config */ ProjectionConfig) => GeoProjection_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projection")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withProjection(value: String | ProjectionFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projection")(js.undefined)
        ret
    }
    @scala.inline
    def withProjectionConfig(value: ProjectionConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectionConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjectionConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectionConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

