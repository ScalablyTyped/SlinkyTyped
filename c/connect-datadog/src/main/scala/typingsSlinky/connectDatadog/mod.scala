package typingsSlinky.connectDatadog

import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.hotShots.mod.StatsD
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("connect-datadog", JSImport.Namespace)
  @js.native
  def apply(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  @JSImport("connect-datadog", JSImport.Namespace)
  @js.native
  def apply(options: Options): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  
  @js.native
  trait Options extends StObject {
    
    var base_url: js.UndefOr[Boolean] = js.native
    
    var dogstatsd: js.UndefOr[StatsD] = js.native
    
    var method: js.UndefOr[Boolean] = js.native
    
    var path: js.UndefOr[Boolean] = js.native
    
    var protocol: js.UndefOr[Boolean] = js.native
    
    var response_code: js.UndefOr[Boolean] = js.native
    
    var stat: js.UndefOr[String] = js.native
    
    var tags: js.UndefOr[js.Array[String]] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBase_url(value: Boolean): Self = StObject.set(x, "base_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBase_urlUndefined: Self = StObject.set(x, "base_url", js.undefined)
      
      @scala.inline
      def setDogstatsd(value: StatsD): Self = StObject.set(x, "dogstatsd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDogstatsdUndefined: Self = StObject.set(x, "dogstatsd", js.undefined)
      
      @scala.inline
      def setMethod(value: Boolean): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setPath(value: Boolean): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setProtocol(value: Boolean): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      @scala.inline
      def setResponse_code(value: Boolean): Self = StObject.set(x, "response_code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponse_codeUndefined: Self = StObject.set(x, "response_code", js.undefined)
      
      @scala.inline
      def setStat(value: String): Self = StObject.set(x, "stat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatUndefined: Self = StObject.set(x, "stat", js.undefined)
      
      @scala.inline
      def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
    }
  }
}
