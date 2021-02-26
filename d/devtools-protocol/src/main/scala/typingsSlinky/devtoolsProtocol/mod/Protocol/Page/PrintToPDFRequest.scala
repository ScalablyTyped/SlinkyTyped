package typingsSlinky.devtoolsProtocol.mod.Protocol.Page

import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.ReturnAsBase64
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.ReturnAsStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrintToPDFRequest extends StObject {
  
  /**
    * Display header and footer. Defaults to false.
    */
  var displayHeaderFooter: js.UndefOr[Boolean] = js.native
  
  /**
    * HTML template for the print footer. Should use the same format as the `headerTemplate`.
    */
  var footerTemplate: js.UndefOr[String] = js.native
  
  /**
    * HTML template for the print header. Should be valid HTML markup with following
    * classes used to inject printing values into them:
    * - `date`: formatted print date
    * - `title`: document title
    * - `url`: document location
    * - `pageNumber`: current page number
    * - `totalPages`: total pages in the document
    * 
    * For example, `<span class=title></span>` would generate span containing the title.
    */
  var headerTemplate: js.UndefOr[String] = js.native
  
  /**
    * Whether to silently ignore invalid but successfully parsed page ranges, such as '3-2'.
    * Defaults to false.
    */
  var ignoreInvalidPageRanges: js.UndefOr[Boolean] = js.native
  
  /**
    * Paper orientation. Defaults to false.
    */
  var landscape: js.UndefOr[Boolean] = js.native
  
  /**
    * Bottom margin in inches. Defaults to 1cm (~0.4 inches).
    */
  var marginBottom: js.UndefOr[Double] = js.native
  
  /**
    * Left margin in inches. Defaults to 1cm (~0.4 inches).
    */
  var marginLeft: js.UndefOr[Double] = js.native
  
  /**
    * Right margin in inches. Defaults to 1cm (~0.4 inches).
    */
  var marginRight: js.UndefOr[Double] = js.native
  
  /**
    * Top margin in inches. Defaults to 1cm (~0.4 inches).
    */
  var marginTop: js.UndefOr[Double] = js.native
  
  /**
    * Paper ranges to print, e.g., '1-5, 8, 11-13'. Defaults to the empty string, which means
    * print all pages.
    */
  var pageRanges: js.UndefOr[String] = js.native
  
  /**
    * Paper height in inches. Defaults to 11 inches.
    */
  var paperHeight: js.UndefOr[Double] = js.native
  
  /**
    * Paper width in inches. Defaults to 8.5 inches.
    */
  var paperWidth: js.UndefOr[Double] = js.native
  
  /**
    * Whether or not to prefer page size as defined by css. Defaults to false,
    * in which case the content will be scaled to fit the paper size.
    */
  var preferCSSPageSize: js.UndefOr[Boolean] = js.native
  
  /**
    * Print background graphics. Defaults to false.
    */
  var printBackground: js.UndefOr[Boolean] = js.native
  
  /**
    * Scale of the webpage rendering. Defaults to 1.
    */
  var scale: js.UndefOr[Double] = js.native
  
  /**
    * return as stream (PrintToPDFRequestTransferMode enum)
    */
  var transferMode: js.UndefOr[ReturnAsBase64 | ReturnAsStream] = js.native
}
object PrintToPDFRequest {
  
  @scala.inline
  def apply(): PrintToPDFRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrintToPDFRequest]
  }
  
  @scala.inline
  implicit class PrintToPDFRequestMutableBuilder[Self <: PrintToPDFRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayHeaderFooter(value: Boolean): Self = StObject.set(x, "displayHeaderFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayHeaderFooterUndefined: Self = StObject.set(x, "displayHeaderFooter", js.undefined)
    
    @scala.inline
    def setFooterTemplate(value: String): Self = StObject.set(x, "footerTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterTemplateUndefined: Self = StObject.set(x, "footerTemplate", js.undefined)
    
    @scala.inline
    def setHeaderTemplate(value: String): Self = StObject.set(x, "headerTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderTemplateUndefined: Self = StObject.set(x, "headerTemplate", js.undefined)
    
    @scala.inline
    def setIgnoreInvalidPageRanges(value: Boolean): Self = StObject.set(x, "ignoreInvalidPageRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreInvalidPageRangesUndefined: Self = StObject.set(x, "ignoreInvalidPageRanges", js.undefined)
    
    @scala.inline
    def setLandscape(value: Boolean): Self = StObject.set(x, "landscape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLandscapeUndefined: Self = StObject.set(x, "landscape", js.undefined)
    
    @scala.inline
    def setMarginBottom(value: Double): Self = StObject.set(x, "marginBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginBottomUndefined: Self = StObject.set(x, "marginBottom", js.undefined)
    
    @scala.inline
    def setMarginLeft(value: Double): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginLeftUndefined: Self = StObject.set(x, "marginLeft", js.undefined)
    
    @scala.inline
    def setMarginRight(value: Double): Self = StObject.set(x, "marginRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginRightUndefined: Self = StObject.set(x, "marginRight", js.undefined)
    
    @scala.inline
    def setMarginTop(value: Double): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginTopUndefined: Self = StObject.set(x, "marginTop", js.undefined)
    
    @scala.inline
    def setPageRanges(value: String): Self = StObject.set(x, "pageRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageRangesUndefined: Self = StObject.set(x, "pageRanges", js.undefined)
    
    @scala.inline
    def setPaperHeight(value: Double): Self = StObject.set(x, "paperHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaperHeightUndefined: Self = StObject.set(x, "paperHeight", js.undefined)
    
    @scala.inline
    def setPaperWidth(value: Double): Self = StObject.set(x, "paperWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaperWidthUndefined: Self = StObject.set(x, "paperWidth", js.undefined)
    
    @scala.inline
    def setPreferCSSPageSize(value: Boolean): Self = StObject.set(x, "preferCSSPageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferCSSPageSizeUndefined: Self = StObject.set(x, "preferCSSPageSize", js.undefined)
    
    @scala.inline
    def setPrintBackground(value: Boolean): Self = StObject.set(x, "printBackground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrintBackgroundUndefined: Self = StObject.set(x, "printBackground", js.undefined)
    
    @scala.inline
    def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    @scala.inline
    def setTransferMode(value: ReturnAsBase64 | ReturnAsStream): Self = StObject.set(x, "transferMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransferModeUndefined: Self = StObject.set(x, "transferMode", js.undefined)
  }
}
