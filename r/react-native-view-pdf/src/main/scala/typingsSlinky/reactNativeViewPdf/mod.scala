package typingsSlinky.reactNativeViewPdf

import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import typingsSlinky.reactNativeViewPdf.reactNativeViewPdfStrings.`utf-16`
import typingsSlinky.reactNativeViewPdf.reactNativeViewPdfStrings.`utf-8`
import typingsSlinky.reactNativeViewPdf.reactNativeViewPdfStrings.base64
import typingsSlinky.reactNativeViewPdf.reactNativeViewPdfStrings.bundle
import typingsSlinky.reactNativeViewPdf.reactNativeViewPdfStrings.documentsDirectory
import typingsSlinky.reactNativeViewPdf.reactNativeViewPdfStrings.file
import typingsSlinky.reactNativeViewPdf.reactNativeViewPdfStrings.url
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-view-pdf", JSImport.Default)
  @js.native
  class default ()
    extends Component[PDFViewProps, js.Object, js.Any]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactNativeViewPdf.reactNativeViewPdfStrings.GET
    - typingsSlinky.reactNativeViewPdf.reactNativeViewPdfStrings.HEAD
    - typingsSlinky.reactNativeViewPdf.reactNativeViewPdfStrings.POST
    - typingsSlinky.reactNativeViewPdf.reactNativeViewPdfStrings.PUT
    - typingsSlinky.reactNativeViewPdf.reactNativeViewPdfStrings.DELETE
    - typingsSlinky.reactNativeViewPdf.reactNativeViewPdfStrings.CONNECT
    - typingsSlinky.reactNativeViewPdf.reactNativeViewPdfStrings.OPTIONS
    - typingsSlinky.reactNativeViewPdf.reactNativeViewPdfStrings.TRACE
    - typingsSlinky.reactNativeViewPdf.reactNativeViewPdfStrings.PATCH
  */
  trait HTTPMethod extends StObject
  object HTTPMethod {
    
    @scala.inline
    def CONNECT: typingsSlinky.reactNativeViewPdf.reactNativeViewPdfStrings.CONNECT = "CONNECT".asInstanceOf[typingsSlinky.reactNativeViewPdf.reactNativeViewPdfStrings.CONNECT]
    
    @scala.inline
    def DELETE: typingsSlinky.reactNativeViewPdf.reactNativeViewPdfStrings.DELETE = "DELETE".asInstanceOf[typingsSlinky.reactNativeViewPdf.reactNativeViewPdfStrings.DELETE]
    
    @scala.inline
    def GET: typingsSlinky.reactNativeViewPdf.reactNativeViewPdfStrings.GET = "GET".asInstanceOf[typingsSlinky.reactNativeViewPdf.reactNativeViewPdfStrings.GET]
    
    @scala.inline
    def HEAD: typingsSlinky.reactNativeViewPdf.reactNativeViewPdfStrings.HEAD = "HEAD".asInstanceOf[typingsSlinky.reactNativeViewPdf.reactNativeViewPdfStrings.HEAD]
    
    @scala.inline
    def OPTIONS: typingsSlinky.reactNativeViewPdf.reactNativeViewPdfStrings.OPTIONS = "OPTIONS".asInstanceOf[typingsSlinky.reactNativeViewPdf.reactNativeViewPdfStrings.OPTIONS]
    
    @scala.inline
    def PATCH: typingsSlinky.reactNativeViewPdf.reactNativeViewPdfStrings.PATCH = "PATCH".asInstanceOf[typingsSlinky.reactNativeViewPdf.reactNativeViewPdfStrings.PATCH]
    
    @scala.inline
    def POST: typingsSlinky.reactNativeViewPdf.reactNativeViewPdfStrings.POST = "POST".asInstanceOf[typingsSlinky.reactNativeViewPdf.reactNativeViewPdfStrings.POST]
    
    @scala.inline
    def PUT: typingsSlinky.reactNativeViewPdf.reactNativeViewPdfStrings.PUT = "PUT".asInstanceOf[typingsSlinky.reactNativeViewPdf.reactNativeViewPdfStrings.PUT]
    
    @scala.inline
    def TRACE: typingsSlinky.reactNativeViewPdf.reactNativeViewPdfStrings.TRACE = "TRACE".asInstanceOf[typingsSlinky.reactNativeViewPdf.reactNativeViewPdfStrings.TRACE]
  }
  
  type PDFView = ReactComponentClass[PDFViewProps]
  
  @js.native
  trait PDFViewProps
    extends /* key */ StringDictionary[js.Any] {
    
    var fadeInDuration: js.UndefOr[Double] = js.native
    
    var fileFrom: js.UndefOr[bundle | documentsDirectory] = js.native
    
    var onError: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.native
    
    var onLoad: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onPageChanged: js.UndefOr[js.Function2[/* page */ Double, /* pageCount */ Double, Unit]] = js.native
    
    var onScrolled: js.UndefOr[js.Function1[/* offset */ Double, Unit]] = js.native
    
    var resource: String = js.native
    
    var resourceType: js.UndefOr[url | base64 | file] = js.native
    
    var textEncoding: js.UndefOr[`utf-8` | `utf-16`] = js.native
    
    var urlProps: js.UndefOr[URLProps] = js.native
  }
  object PDFViewProps {
    
    @scala.inline
    def apply(resource: String): PDFViewProps = {
      val __obj = js.Dynamic.literal(resource = resource.asInstanceOf[js.Any])
      __obj.asInstanceOf[PDFViewProps]
    }
    
    @scala.inline
    implicit class PDFViewPropsMutableBuilder[Self <: PDFViewProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFadeInDuration(value: Double): Self = StObject.set(x, "fadeInDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFadeInDurationUndefined: Self = StObject.set(x, "fadeInDuration", js.undefined)
      
      @scala.inline
      def setFileFrom(value: bundle | documentsDirectory): Self = StObject.set(x, "fileFrom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileFromUndefined: Self = StObject.set(x, "fileFrom", js.undefined)
      
      @scala.inline
      def setOnError(value: /* error */ js.Error => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      @scala.inline
      def setOnLoad(value: () => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      @scala.inline
      def setOnPageChanged(value: (/* page */ Double, /* pageCount */ Double) => Unit): Self = StObject.set(x, "onPageChanged", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnPageChangedUndefined: Self = StObject.set(x, "onPageChanged", js.undefined)
      
      @scala.inline
      def setOnScrolled(value: /* offset */ Double => Unit): Self = StObject.set(x, "onScrolled", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnScrolledUndefined: Self = StObject.set(x, "onScrolled", js.undefined)
      
      @scala.inline
      def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceType(value: url | base64 | file): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
      
      @scala.inline
      def setTextEncoding(value: `utf-8` | `utf-16`): Self = StObject.set(x, "textEncoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextEncodingUndefined: Self = StObject.set(x, "textEncoding", js.undefined)
      
      @scala.inline
      def setUrlProps(value: URLProps): Self = StObject.set(x, "urlProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlPropsUndefined: Self = StObject.set(x, "urlProps", js.undefined)
    }
  }
  
  @js.native
  trait URLProps extends StObject {
    
    var body: js.UndefOr[String] = js.native
    
    var headers: js.UndefOr[StringDictionary[String]] = js.native
    
    var method: js.UndefOr[HTTPMethod] = js.native
  }
  object URLProps {
    
    @scala.inline
    def apply(): URLProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[URLProps]
    }
    
    @scala.inline
    implicit class URLPropsMutableBuilder[Self <: URLProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setMethod(value: HTTPMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    }
  }
}
