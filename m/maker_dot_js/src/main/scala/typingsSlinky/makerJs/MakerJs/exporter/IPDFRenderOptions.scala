package typingsSlinky.makerJs.MakerJs.exporter

import typingsSlinky.makerJs.MakerJs.IPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PDF rendering options.
  */
@js.native
trait IPDFRenderOptions extends IExportOptions {
  /**
    * Rendered reference origin.
    */
  var origin: js.UndefOr[IPoint] = js.native
  /**
    * SVG color of the rendered paths.
    */
  var stroke: js.UndefOr[String] = js.native
}

object IPDFRenderOptions {
  @scala.inline
  def apply(): IPDFRenderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPDFRenderOptions]
  }
  @scala.inline
  implicit class IPDFRenderOptionsOps[Self <: IPDFRenderOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
  }
  
}

