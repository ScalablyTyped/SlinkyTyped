package typingsSlinky.devextreme.mod.DevExpress.viz

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.SVGElement
import typingsSlinky.devextreme.devextremeStrings.GIF
import typingsSlinky.devextreme.devextremeStrings.JPEG
import typingsSlinky.devextreme.devextremeStrings.PDF
import typingsSlinky.devextreme.devextremeStrings.PNG
import typingsSlinky.devextreme.devextremeStrings.SVG
import typingsSlinky.devextreme.mod._Global_.JQueryPromise
import typingsSlinky.devextreme.mod._Global_.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Configures the exporting and printing features. */
@js.native
trait BaseWidgetExport extends js.Object {
  /** Specifies the color that will fill transparent regions in the resulting file or document. */
  var backgroundColor: js.UndefOr[String] = js.native
  /** Enables the client-side exporting in the widget. */
  var enabled: js.UndefOr[Boolean] = js.native
  /** Specifies a default name for the file to which the widget will be exported. */
  var fileName: js.UndefOr[String] = js.native
  /** Specifies a set of export formats. */
  var formats: js.UndefOr[js.Array[GIF | JPEG | PDF | PNG | SVG]] = js.native
  /** Adds an empty space around the exported widget; measured in pixels. */
  var margin: js.UndefOr[Double] = js.native
  /** Enables the printing feature in the widget. Applies only if the export.enabled option is true. */
  var printingEnabled: js.UndefOr[Boolean] = js.native
  /** @deprecated [important] Since v10, Safari browser supports API for saving files, and this option is no longer required. */
  /** Specifies the URL of the server-side proxy that streams the resulting file to the end user to enable exporting in the Safari browser. */
  var proxyUrl: js.UndefOr[String] = js.native
  /** A function that renders SVG markup on the HTML canvas. Required to export custom SVG elements (for example, markerTemplate). */
  var svgToCanvas: js.UndefOr[
    js.Function2[
      /* svg */ SVGElement, 
      /* canvas */ HTMLCanvasElement, 
      Promise[Unit] | JQueryPromise[Unit]
    ]
  ] = js.native
}

object BaseWidgetExport {
  @scala.inline
  def apply(): BaseWidgetExport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseWidgetExport]
  }
  @scala.inline
  implicit class BaseWidgetExportOps[Self <: BaseWidgetExport] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withFileName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileName")(js.undefined)
        ret
    }
    @scala.inline
    def withFormats(value: js.Array[GIF | JPEG | PDF | PNG | SVG]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formats")(js.undefined)
        ret
    }
    @scala.inline
    def withMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(js.undefined)
        ret
    }
    @scala.inline
    def withPrintingEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printingEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrintingEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printingEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withProxyUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProxyUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withSvgToCanvas(
      value: (/* svg */ SVGElement, /* canvas */ HTMLCanvasElement) => Promise[Unit] | JQueryPromise[Unit]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svgToCanvas")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSvgToCanvas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svgToCanvas")(js.undefined)
        ret
    }
  }
  
}

