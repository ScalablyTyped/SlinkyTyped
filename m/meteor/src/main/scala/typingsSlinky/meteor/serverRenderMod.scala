package typingsSlinky.meteor

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.node.NodeJS.ReadableStream
import typingsSlinky.node.httpMod.IncomingHttpHeaders
import typingsSlinky.node.httpMod.IncomingMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serverRenderMod {
  
  @JSImport("meteor/server-render", "onPageLoad")
  @js.native
  def onPageLoad[T /* <: Callback */](callback: T): T = js.native
  
  type Callback = js.Function1[/* sink */ Sink, js.Promise[js.Any] | js.Any]
  
  @js.native
  trait Sink extends StObject {
    
    var appendToBody: js.UndefOr[js.Function1[/* html */ String, Unit]] = js.native
    
    var appendToElementById: js.UndefOr[js.Function2[/* id */ String, /* html */ String, Unit]] = js.native
    
    var appendToHead: js.UndefOr[js.Function1[/* html */ String, Unit]] = js.native
    
    var arch: js.UndefOr[String] = js.native
    
    var body: js.UndefOr[String] = js.native
    
    var getCookies: js.UndefOr[js.Function0[StringDictionary[String]]] = js.native
    
    var getHeaders: js.UndefOr[js.Function0[IncomingHttpHeaders]] = js.native
    
    var head: js.UndefOr[String] = js.native
    
    var htmlById: js.UndefOr[StringDictionary[String]] = js.native
    
    var maybeMadeChanges: js.UndefOr[Boolean] = js.native
    
    var redirect: js.UndefOr[js.Function2[/* location */ String, /* code */ js.UndefOr[Double], Unit]] = js.native
    
    var renderIntoElementById: (js.UndefOr[js.Function2[/* id */ String, /* html */ String, Unit]]) with (js.UndefOr[js.Function2[/* id */ String, /* html */ ReadableStream, Unit]]) = js.native
    
    var request: js.UndefOr[IncomingMessage] = js.native
    
    var setHeader: js.UndefOr[
        js.Function2[/* key */ String, /* value */ Double | String | js.Array[String], Unit]
      ] = js.native
    
    var setStatusCode: js.UndefOr[js.Function1[/* code */ Double, Unit]] = js.native
  }
  object Sink {
    
    @scala.inline
    def apply(
      renderIntoElementById: (js.UndefOr[js.Function2[/* id */ String, /* html */ String, Unit]]) with (js.UndefOr[js.Function2[/* id */ String, /* html */ ReadableStream, Unit]])
    ): Sink = {
      val __obj = js.Dynamic.literal(renderIntoElementById = renderIntoElementById.asInstanceOf[js.Any])
      __obj.asInstanceOf[Sink]
    }
    
    @scala.inline
    implicit class SinkMutableBuilder[Self <: Sink] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppendToBody(value: /* html */ String => Unit): Self = StObject.set(x, "appendToBody", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAppendToBodyUndefined: Self = StObject.set(x, "appendToBody", js.undefined)
      
      @scala.inline
      def setAppendToElementById(value: (/* id */ String, /* html */ String) => Unit): Self = StObject.set(x, "appendToElementById", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAppendToElementByIdUndefined: Self = StObject.set(x, "appendToElementById", js.undefined)
      
      @scala.inline
      def setAppendToHead(value: /* html */ String => Unit): Self = StObject.set(x, "appendToHead", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAppendToHeadUndefined: Self = StObject.set(x, "appendToHead", js.undefined)
      
      @scala.inline
      def setArch(value: String): Self = StObject.set(x, "arch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArchUndefined: Self = StObject.set(x, "arch", js.undefined)
      
      @scala.inline
      def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setGetCookies(value: () => StringDictionary[String]): Self = StObject.set(x, "getCookies", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetCookiesUndefined: Self = StObject.set(x, "getCookies", js.undefined)
      
      @scala.inline
      def setGetHeaders(value: () => IncomingHttpHeaders): Self = StObject.set(x, "getHeaders", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetHeadersUndefined: Self = StObject.set(x, "getHeaders", js.undefined)
      
      @scala.inline
      def setHead(value: String): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadUndefined: Self = StObject.set(x, "head", js.undefined)
      
      @scala.inline
      def setHtmlById(value: StringDictionary[String]): Self = StObject.set(x, "htmlById", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlByIdUndefined: Self = StObject.set(x, "htmlById", js.undefined)
      
      @scala.inline
      def setMaybeMadeChanges(value: Boolean): Self = StObject.set(x, "maybeMadeChanges", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaybeMadeChangesUndefined: Self = StObject.set(x, "maybeMadeChanges", js.undefined)
      
      @scala.inline
      def setRedirect(value: (/* location */ String, /* code */ js.UndefOr[Double]) => Unit): Self = StObject.set(x, "redirect", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
      
      @scala.inline
      def setRenderIntoElementById(
        value: (js.UndefOr[js.Function2[/* id */ String, /* html */ String, Unit]]) with (js.UndefOr[js.Function2[/* id */ String, /* html */ ReadableStream, Unit]])
      ): Self = StObject.set(x, "renderIntoElementById", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequest(value: IncomingMessage): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
      
      @scala.inline
      def setSetHeader(value: (/* key */ String, /* value */ Double | String | js.Array[String]) => Unit): Self = StObject.set(x, "setHeader", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetHeaderUndefined: Self = StObject.set(x, "setHeader", js.undefined)
      
      @scala.inline
      def setSetStatusCode(value: /* code */ Double => Unit): Self = StObject.set(x, "setStatusCode", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetStatusCodeUndefined: Self = StObject.set(x, "setStatusCode", js.undefined)
    }
  }
}
