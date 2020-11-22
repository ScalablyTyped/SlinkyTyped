package typingsSlinky.devextreme.mod.DevExpress.viz

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.SVGElement
import typingsSlinky.devextreme.devextremeStrings.GIF
import typingsSlinky.devextreme.devextremeStrings.JPEG
import typingsSlinky.devextreme.devextremeStrings.PDF
import typingsSlinky.devextreme.devextremeStrings.PNG
import typingsSlinky.devextreme.devextremeStrings.SVG
import typingsSlinky.devextreme.mod.global.JQueryPromise
import typingsSlinky.devextreme.mod.global.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * [descr:BaseWidget.Options.export]
  */
@js.native
trait BaseWidgetExport extends js.Object {
  
  /**
    * [descr:BaseWidget.Options.export.backgroundColor]
    */
  var backgroundColor: js.UndefOr[String] = js.native
  
  /**
    * [descr:BaseWidget.Options.export.enabled]
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:BaseWidget.Options.export.fileName]
    */
  var fileName: js.UndefOr[String] = js.native
  
  /**
    * [descr:BaseWidget.Options.export.formats]
    */
  var formats: js.UndefOr[js.Array[GIF | JPEG | PDF | PNG | SVG]] = js.native
  
  /**
    * [descr:BaseWidget.Options.export.margin]
    */
  var margin: js.UndefOr[Double] = js.native
  
  /**
    * [descr:BaseWidget.Options.export.printingEnabled]
    */
  var printingEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:BaseWidget.Options.export.proxyUrl]
    * @deprecated [depNote:BaseWidget.Options.export.proxyUrl]
    */
  var proxyUrl: js.UndefOr[String] = js.native
  
  /**
    * [descr:BaseWidget.Options.export.svgToCanvas]
    */
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setFileName(value: String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileName: Self = this.set("fileName", js.undefined)
    
    @scala.inline
    def setFormatsVarargs(value: (GIF | JPEG | PDF | PNG | SVG)*): Self = this.set("formats", js.Array(value :_*))
    
    @scala.inline
    def setFormats(value: js.Array[GIF | JPEG | PDF | PNG | SVG]): Self = this.set("formats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormats: Self = this.set("formats", js.undefined)
    
    @scala.inline
    def setMargin(value: Double): Self = this.set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    
    @scala.inline
    def setPrintingEnabled(value: Boolean): Self = this.set("printingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrintingEnabled: Self = this.set("printingEnabled", js.undefined)
    
    @scala.inline
    def setProxyUrl(value: String): Self = this.set("proxyUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProxyUrl: Self = this.set("proxyUrl", js.undefined)
    
    @scala.inline
    def setSvgToCanvas(
      value: (/* svg */ SVGElement, /* canvas */ HTMLCanvasElement) => Promise[Unit] | JQueryPromise[Unit]
    ): Self = this.set("svgToCanvas", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSvgToCanvas: Self = this.set("svgToCanvas", js.undefined)
  }
}
