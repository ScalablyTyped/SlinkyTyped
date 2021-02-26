package typingsSlinky.cors

import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.express.mod.Request_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cors", JSImport.Namespace)
  @js.native
  def apply(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  @JSImport("cors", JSImport.Namespace)
  @js.native
  def apply(options: CorsOptions): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  @JSImport("cors", JSImport.Namespace)
  @js.native
  def apply(options: CorsOptionsDelegate): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  
  @js.native
  trait CorsOptions extends StObject {
    
    var allowedHeaders: js.UndefOr[String | js.Array[String]] = js.native
    
    var credentials: js.UndefOr[Boolean] = js.native
    
    var exposedHeaders: js.UndefOr[String | js.Array[String]] = js.native
    
    var maxAge: js.UndefOr[Double] = js.native
    
    /**
      * @default 'GET,HEAD,PUT,PATCH,POST,DELETE'
      */
    var methods: js.UndefOr[String | js.Array[String]] = js.native
    
    /**
      * @default 204
      */
    var optionsSuccessStatus: js.UndefOr[Double] = js.native
    
    /**
      * @default '*''
      */
    var origin: js.UndefOr[Boolean | String | js.RegExp | (js.Array[String | js.RegExp]) | CustomOrigin] = js.native
    
    /**
      * @default false
      */
    var preflightContinue: js.UndefOr[Boolean] = js.native
  }
  object CorsOptions {
    
    @scala.inline
    def apply(): CorsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CorsOptions]
    }
    
    @scala.inline
    implicit class CorsOptionsMutableBuilder[Self <: CorsOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowedHeaders(value: String | js.Array[String]): Self = StObject.set(x, "allowedHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowedHeadersUndefined: Self = StObject.set(x, "allowedHeaders", js.undefined)
      
      @scala.inline
      def setAllowedHeadersVarargs(value: String*): Self = StObject.set(x, "allowedHeaders", js.Array(value :_*))
      
      @scala.inline
      def setCredentials(value: Boolean): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
      
      @scala.inline
      def setExposedHeaders(value: String | js.Array[String]): Self = StObject.set(x, "exposedHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExposedHeadersUndefined: Self = StObject.set(x, "exposedHeaders", js.undefined)
      
      @scala.inline
      def setExposedHeadersVarargs(value: String*): Self = StObject.set(x, "exposedHeaders", js.Array(value :_*))
      
      @scala.inline
      def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      @scala.inline
      def setMethods(value: String | js.Array[String]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
      
      @scala.inline
      def setMethodsVarargs(value: String*): Self = StObject.set(x, "methods", js.Array(value :_*))
      
      @scala.inline
      def setOptionsSuccessStatus(value: Double): Self = StObject.set(x, "optionsSuccessStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsSuccessStatusUndefined: Self = StObject.set(x, "optionsSuccessStatus", js.undefined)
      
      @scala.inline
      def setOrigin(value: Boolean | String | js.RegExp | (js.Array[String | js.RegExp]) | CustomOrigin): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginFunction2(
        value: (/* requestOrigin */ js.UndefOr[String], /* callback */ js.Function2[/* err */ js.Error | Null, /* allow */ js.UndefOr[Boolean], Unit]) => Unit
      ): Self = StObject.set(x, "origin", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOriginRegExp(value: js.RegExp): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
      
      @scala.inline
      def setOriginVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "origin", js.Array(value :_*))
      
      @scala.inline
      def setPreflightContinue(value: Boolean): Self = StObject.set(x, "preflightContinue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreflightContinueUndefined: Self = StObject.set(x, "preflightContinue", js.undefined)
    }
  }
  
  type CorsOptionsDelegate = js.Function2[
    /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    /* callback */ js.Function2[/* err */ js.Error | Null, /* options */ js.UndefOr[CorsOptions], Unit], 
    Unit
  ]
  
  type CustomOrigin = js.Function2[
    /* requestOrigin */ js.UndefOr[String], 
    /* callback */ js.Function2[/* err */ js.Error | Null, /* allow */ js.UndefOr[Boolean], Unit], 
    Unit
  ]
}
