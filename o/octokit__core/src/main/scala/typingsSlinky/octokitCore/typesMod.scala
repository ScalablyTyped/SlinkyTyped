package typingsSlinky.octokitCore

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.octokitCore.anon.Debug
import typingsSlinky.octokitCore.mod.Octokit
import typingsSlinky.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import typingsSlinky.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type AnyFunction = js.Function1[/* args */ js.Any, js.Any]
  
  type Constructor[T] = Instantiable1[/* args (repeated) */ js.Any, T]
  
  @js.native
  trait OctokitOptions
    extends /* key */ StringDictionary[js.Any] {
    
    var auth: js.UndefOr[js.Any] = js.native
    
    var authStrategy: js.UndefOr[js.Any] = js.native
    
    var baseUrl: js.UndefOr[String] = js.native
    
    var log: js.UndefOr[Debug] = js.native
    
    var previews: js.UndefOr[js.Array[String]] = js.native
    
    var request: js.UndefOr[RequestRequestOptions] = js.native
    
    var timeZone: js.UndefOr[String] = js.native
    
    var userAgent: js.UndefOr[String] = js.native
  }
  object OctokitOptions {
    
    @scala.inline
    def apply(): OctokitOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OctokitOptions]
    }
    
    @scala.inline
    implicit class OctokitOptionsMutableBuilder[Self <: OctokitOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuth(value: js.Any): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthStrategy(value: js.Any): Self = StObject.set(x, "authStrategy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthStrategyUndefined: Self = StObject.set(x, "authStrategy", js.undefined)
      
      @scala.inline
      def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      @scala.inline
      def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
      
      @scala.inline
      def setLog(value: Debug): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
      @scala.inline
      def setPreviews(value: js.Array[String]): Self = StObject.set(x, "previews", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviewsUndefined: Self = StObject.set(x, "previews", js.undefined)
      
      @scala.inline
      def setPreviewsVarargs(value: String*): Self = StObject.set(x, "previews", js.Array(value :_*))
      
      @scala.inline
      def setRequest(value: RequestRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
      
      @scala.inline
      def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
      
      @scala.inline
      def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
    }
  }
  
  type OctokitPlugin = js.Function2[/* octokit */ Octokit, /* options */ OctokitOptions, StringDictionary[js.Any] | Unit]
  
  type RequestParameters = typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
  
  type ReturnTypeOf[T /* <: AnyFunction | js.Array[AnyFunction] */] = (UnionToIntersection[
    ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: T[number] */ js.Any
    ]
  ]) | ReturnType[T]
  
  type UnionToIntersection[Union] = js.Any
}
