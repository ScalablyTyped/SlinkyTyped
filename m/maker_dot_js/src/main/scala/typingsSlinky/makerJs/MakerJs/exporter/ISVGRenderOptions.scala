package typingsSlinky.makerJs.MakerJs.exporter

import typingsSlinky.makerJs.MakerJs.IPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SVG rendering options.
  */
@js.native
trait ISVGRenderOptions extends IExportOptions {
  /**
    *  Indicate that the id's of paths should be rendered as SVG text elements.
    */
  var annotate: js.UndefOr[Boolean] = js.native
  /**
    * SVG fill color.
    */
  var fill: js.UndefOr[String] = js.native
  /**
    * SVG font size and font size units.
    */
  var fontSize: js.UndefOr[String] = js.native
  /**
    * Rendered reference origin.
    */
  var origin: js.UndefOr[IPoint] = js.native
  /**
    * Scale of the SVG rendering.
    */
  var scale: js.UndefOr[Double] = js.native
  /**
    * SVG color of the rendered paths.
    */
  var stroke: js.UndefOr[String] = js.native
  /**
    * SVG stroke width of paths. This may have a unit type suffix, if not, the value will be in the same unit system as the units property.
    */
  var strokeWidth: js.UndefOr[String] = js.native
  /**
    * Optional attributes to add to the root svg tag.
    */
  var svgAttrs: js.UndefOr[IXmlTagAttrs] = js.native
  /**
    * Use SVG < path > elements instead of < line >, < circle > etc.
    */
  var useSvgPathOnly: js.UndefOr[Boolean] = js.native
  /**
    * Flag to use SVG viewbox.
    */
  var viewBox: js.UndefOr[Boolean] = js.native
}

object ISVGRenderOptions {
  @scala.inline
  def apply(): ISVGRenderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISVGRenderOptions]
  }
  @scala.inline
  implicit class ISVGRenderOptionsOps[Self <: ISVGRenderOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnnotate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnnotate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotate")(js.undefined)
        ret
    }
    @scala.inline
    def withFill(value: String): Self = {
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
    def withFontSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(js.undefined)
        ret
    }
    @scala.inline
    def withOrigin(value: IPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrigin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(js.undefined)
        ret
    }
    @scala.inline
    def withScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(js.undefined)
        ret
    }
    @scala.inline
    def withStroke(value: String): Self = {
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
    def withStrokeWidth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withSvgAttrs(value: IXmlTagAttrs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svgAttrs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSvgAttrs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svgAttrs")(js.undefined)
        ret
    }
    @scala.inline
    def withUseSvgPathOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useSvgPathOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseSvgPathOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useSvgPathOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withViewBox(value: Boolean): Self = {
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

