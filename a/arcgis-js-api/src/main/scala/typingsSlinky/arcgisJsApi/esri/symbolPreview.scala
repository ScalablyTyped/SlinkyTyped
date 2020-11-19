package typingsSlinky.arcgisJsApi.esri

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait symbolPreview extends js.Object {
  
  /**
    * Generates a preview image of a given symbol that can be displayed in a custom widget or other DOM element.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-symbolPreview.html#renderPreviewHTML)
    *
    * @param symbol The symbol for which to generate a preview image.
    * @param options Formatting options for the symbol preview image.
    * @param options.node The parent node to append to the symbol.
    * @param options.size The size of the symbol preview in points.
    * @param options.maxSize The maximum size of the symbol preview in points.
    * @param options.opacity The opacity of the layer represented by the `symbol`.
    * @param options.scale Indicates whether to scale the symbol preview.
    * @param options.disableUpsampling Indicates whether to disable upsampling for raster images.
    * @param options.symbolConfig For "tall" symbols in portrait view, then the `tall` value should be used here.
    *
    */
  def renderPreviewHTML(symbol: Symbol): js.Promise[HTMLElement] = js.native
  def renderPreviewHTML(symbol: Symbol, options: symbolPreviewRenderPreviewHTMLOptions): js.Promise[HTMLElement] = js.native
}
