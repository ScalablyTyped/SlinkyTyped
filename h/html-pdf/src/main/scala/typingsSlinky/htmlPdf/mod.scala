package typingsSlinky.htmlPdf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.htmlPdf.anon.Bottom
import typingsSlinky.htmlPdf.anon.Contents
import typingsSlinky.htmlPdf.anon.Detached
import typingsSlinky.htmlPdf.anon.Domain
import typingsSlinky.htmlPdf.anon.Height
import typingsSlinky.htmlPdf.htmlPdfStrings.A3
import typingsSlinky.htmlPdf.htmlPdfStrings.A4
import typingsSlinky.htmlPdf.htmlPdfStrings.A5
import typingsSlinky.htmlPdf.htmlPdfStrings.Legal
import typingsSlinky.htmlPdf.htmlPdfStrings.Letter
import typingsSlinky.htmlPdf.htmlPdfStrings.Tabloid
import typingsSlinky.htmlPdf.htmlPdfStrings.jpeg
import typingsSlinky.htmlPdf.htmlPdfStrings.landscape
import typingsSlinky.htmlPdf.htmlPdfStrings.manual
import typingsSlinky.htmlPdf.htmlPdfStrings.pdf
import typingsSlinky.htmlPdf.htmlPdfStrings.png
import typingsSlinky.htmlPdf.htmlPdfStrings.portrait
import typingsSlinky.node.Buffer
import typingsSlinky.node.fsMod.ReadStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("html-pdf", "create")
  @js.native
  def create(html: String): CreateResult = js.native
  @JSImport("html-pdf", "create")
  @js.native
  def create(html: String, options: CreateOptions): CreateResult = js.native
  
  @js.native
  trait CreateOptions extends StObject {
    
    // Rendering options
    var base: js.UndefOr[String] = js.native
    
    // Page options
    var border: js.UndefOr[String | Bottom] = js.native
    
    // To run Node application as Windows service
    var childProcessOptions: js.UndefOr[Detached] = js.native
    
    // Export options
    var directory: js.UndefOr[String] = js.native
    
    var footer: js.UndefOr[Height] = js.native
    
    var format: js.UndefOr[A3 | A4 | A5 | Legal | Letter | Tabloid] = js.native
    
    var header: js.UndefOr[Contents] = js.native
    
    // Papersize Options: http://phantomjs.org/api/webpage/property/paper-size.html
    var height: js.UndefOr[String] = js.native
    
    // HTTP Cookies that are used for requests
    var httpCookies: js.UndefOr[js.Array[Domain]] = js.native
    
    // HTTP Headers that are used for requests
    var httpHeaders: js.UndefOr[StringDictionary[String]] = js.native
    
    var orientation: js.UndefOr[portrait | landscape] = js.native
    
    var paginationOffset: js.UndefOr[Double] = js.native
    
    var phantomArgs: js.UndefOr[js.Array[String]] = js.native
    
    // Script options
    var phantomPath: js.UndefOr[String] = js.native
    
    var quality: js.UndefOr[String] = js.native
    
    // Time we should wait after window load
    var renderDelay: js.UndefOr[manual | Double] = js.native
    
    var script: js.UndefOr[String] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
    
    // File options
    var `type`: js.UndefOr[png | jpeg | pdf] = js.native
    
    var width: js.UndefOr[String] = js.native
    
    // Zooming option, can be used to scale images if `options.type` is not pdf
    var zoomFactor: js.UndefOr[String] = js.native
  }
  object CreateOptions {
    
    @scala.inline
    def apply(): CreateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateOptions]
    }
    
    @scala.inline
    implicit class CreateOptionsMutableBuilder[Self <: CreateOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
      
      @scala.inline
      def setBorder(value: String | Bottom): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      @scala.inline
      def setChildProcessOptions(value: Detached): Self = StObject.set(x, "childProcessOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildProcessOptionsUndefined: Self = StObject.set(x, "childProcessOptions", js.undefined)
      
      @scala.inline
      def setDirectory(value: String): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectoryUndefined: Self = StObject.set(x, "directory", js.undefined)
      
      @scala.inline
      def setFooter(value: Height): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      @scala.inline
      def setFormat(value: A3 | A4 | A5 | Legal | Letter | Tabloid): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setHeader(value: Contents): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setHttpCookies(value: js.Array[Domain]): Self = StObject.set(x, "httpCookies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpCookiesUndefined: Self = StObject.set(x, "httpCookies", js.undefined)
      
      @scala.inline
      def setHttpCookiesVarargs(value: Domain*): Self = StObject.set(x, "httpCookies", js.Array(value :_*))
      
      @scala.inline
      def setHttpHeaders(value: StringDictionary[String]): Self = StObject.set(x, "httpHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpHeadersUndefined: Self = StObject.set(x, "httpHeaders", js.undefined)
      
      @scala.inline
      def setOrientation(value: portrait | landscape): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      @scala.inline
      def setPaginationOffset(value: Double): Self = StObject.set(x, "paginationOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaginationOffsetUndefined: Self = StObject.set(x, "paginationOffset", js.undefined)
      
      @scala.inline
      def setPhantomArgs(value: js.Array[String]): Self = StObject.set(x, "phantomArgs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhantomArgsUndefined: Self = StObject.set(x, "phantomArgs", js.undefined)
      
      @scala.inline
      def setPhantomArgsVarargs(value: String*): Self = StObject.set(x, "phantomArgs", js.Array(value :_*))
      
      @scala.inline
      def setPhantomPath(value: String): Self = StObject.set(x, "phantomPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhantomPathUndefined: Self = StObject.set(x, "phantomPath", js.undefined)
      
      @scala.inline
      def setQuality(value: String): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
      
      @scala.inline
      def setRenderDelay(value: manual | Double): Self = StObject.set(x, "renderDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderDelayUndefined: Self = StObject.set(x, "renderDelay", js.undefined)
      
      @scala.inline
      def setScript(value: String): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setType(value: png | jpeg | pdf): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setZoomFactor(value: String): Self = StObject.set(x, "zoomFactor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomFactorUndefined: Self = StObject.set(x, "zoomFactor", js.undefined)
    }
  }
  
  @js.native
  trait CreateResult extends StObject {
    
    def toBuffer(callback: js.Function2[/* err */ js.Error, /* buffer */ Buffer, Unit]): Unit = js.native
    
    def toFile(): Unit = js.native
    def toFile(callback: js.Function2[/* err */ js.Error, /* res */ FileInfo, Unit]): Unit = js.native
    def toFile(
      filename: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* err */ js.Error, /* res */ FileInfo, Unit]
    ): Unit = js.native
    def toFile(filename: String): Unit = js.native
    def toFile(filename: String, callback: js.Function2[/* err */ js.Error, /* res */ FileInfo, Unit]): Unit = js.native
    
    def toStream(callback: js.Function2[/* err */ js.Error, /* stream */ ReadStream, Unit]): Unit = js.native
  }
  
  @js.native
  trait FileInfo extends StObject {
    
    var filename: String = js.native
  }
  object FileInfo {
    
    @scala.inline
    def apply(filename: String): FileInfo = {
      val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileInfo]
    }
    
    @scala.inline
    implicit class FileInfoMutableBuilder[Self <: FileInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    }
  }
}
