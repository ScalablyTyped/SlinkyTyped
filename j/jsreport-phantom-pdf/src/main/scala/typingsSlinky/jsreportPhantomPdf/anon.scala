package typingsSlinky.jsreportPhantomPdf

import typingsSlinky.jsreportPhantomPdf.jsreportPhantomPdfStrings.`dedicated-process`
import typingsSlinky.jsreportPhantomPdf.jsreportPhantomPdfStrings.`phantom-server`
import typingsSlinky.jsreportPhantomPdf.jsreportPhantomPdfStrings.landscape
import typingsSlinky.jsreportPhantomPdf.jsreportPhantomPdfStrings.portrait
import typingsSlinky.jsreportPhantomPdf.mod.Margin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<jsreport-phantom-pdf.jsreport-phantom-pdf.Options> */
  @js.native
  trait PartialOptions extends StObject {
    
    var allowLocalFilesAccess: js.UndefOr[Boolean] = js.native
    
    var defaultPhantomjsVersion: js.UndefOr[String] = js.native
    
    var strategy: js.UndefOr[`dedicated-process` | `phantom-server`] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
  }
  object PartialOptions {
    
    @scala.inline
    def apply(): PartialOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptions]
    }
    
    @scala.inline
    implicit class PartialOptionsMutableBuilder[Self <: PartialOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowLocalFilesAccess(value: Boolean): Self = StObject.set(x, "allowLocalFilesAccess", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowLocalFilesAccessUndefined: Self = StObject.set(x, "allowLocalFilesAccess", js.undefined)
      
      @scala.inline
      def setDefaultPhantomjsVersion(value: String): Self = StObject.set(x, "defaultPhantomjsVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultPhantomjsVersionUndefined: Self = StObject.set(x, "defaultPhantomjsVersion", js.undefined)
      
      @scala.inline
      def setStrategy(value: `dedicated-process` | `phantom-server`): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  /* Inlined std.Partial<jsreport-phantom-pdf.jsreport-phantom-pdf.Phantom> */
  @js.native
  trait PartialPhantom extends StObject {
    
    var blockJavaScript: js.UndefOr[Boolean] = js.native
    
    var customPhantomJS: js.UndefOr[Boolean] = js.native
    
    var fitToPage: js.UndefOr[Boolean] = js.native
    
    var footer: js.UndefOr[String] = js.native
    
    var footerHeight: js.UndefOr[String] = js.native
    
    var format: js.UndefOr[String] = js.native
    
    var header: js.UndefOr[String] = js.native
    
    var headerHeight: js.UndefOr[String] = js.native
    
    var height: js.UndefOr[String] = js.native
    
    var margin: js.UndefOr[String | Margin] = js.native
    
    var orientation: js.UndefOr[portrait | landscape] = js.native
    
    var phantomjsVersion: js.UndefOr[String] = js.native
    
    var resourceTimeout: js.UndefOr[Double] = js.native
    
    var waitForJS: js.UndefOr[Boolean] = js.native
    
    var width: js.UndefOr[String] = js.native
  }
  object PartialPhantom {
    
    @scala.inline
    def apply(): PartialPhantom = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialPhantom]
    }
    
    @scala.inline
    implicit class PartialPhantomMutableBuilder[Self <: PartialPhantom] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlockJavaScript(value: Boolean): Self = StObject.set(x, "blockJavaScript", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockJavaScriptUndefined: Self = StObject.set(x, "blockJavaScript", js.undefined)
      
      @scala.inline
      def setCustomPhantomJS(value: Boolean): Self = StObject.set(x, "customPhantomJS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomPhantomJSUndefined: Self = StObject.set(x, "customPhantomJS", js.undefined)
      
      @scala.inline
      def setFitToPage(value: Boolean): Self = StObject.set(x, "fitToPage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFitToPageUndefined: Self = StObject.set(x, "fitToPage", js.undefined)
      
      @scala.inline
      def setFooter(value: String): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterHeight(value: String): Self = StObject.set(x, "footerHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterHeightUndefined: Self = StObject.set(x, "footerHeight", js.undefined)
      
      @scala.inline
      def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderHeight(value: String): Self = StObject.set(x, "headerHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderHeightUndefined: Self = StObject.set(x, "headerHeight", js.undefined)
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setMargin(value: String | Margin): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setOrientation(value: portrait | landscape): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      @scala.inline
      def setPhantomjsVersion(value: String): Self = StObject.set(x, "phantomjsVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhantomjsVersionUndefined: Self = StObject.set(x, "phantomjsVersion", js.undefined)
      
      @scala.inline
      def setResourceTimeout(value: Double): Self = StObject.set(x, "resourceTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceTimeoutUndefined: Self = StObject.set(x, "resourceTimeout", js.undefined)
      
      @scala.inline
      def setWaitForJS(value: Boolean): Self = StObject.set(x, "waitForJS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaitForJSUndefined: Self = StObject.set(x, "waitForJS", js.undefined)
      
      @scala.inline
      def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
