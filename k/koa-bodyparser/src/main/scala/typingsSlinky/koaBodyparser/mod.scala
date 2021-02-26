package typingsSlinky.koaBodyparser

import typingsSlinky.koa.mod.Context
import typingsSlinky.koa.mod.DefaultContext
import typingsSlinky.koa.mod.DefaultState
import typingsSlinky.koa.mod.Middleware
import typingsSlinky.koaBodyparser.anon.Form
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("koa-bodyparser", JSImport.Namespace)
  @js.native
  def apply(): Middleware[DefaultState, DefaultContext] = js.native
  @JSImport("koa-bodyparser", JSImport.Namespace)
  @js.native
  def apply(opts: Options): Middleware[DefaultState, DefaultContext] = js.native
  
  @js.native
  trait Options extends StObject {
    
    /**
      * custom json request detect function. Default is null
      */
    var detectJSON: js.UndefOr[js.Function1[/* ctx */ Context, Boolean]] = js.native
    
    /**
      *  parser will only parse when request type hits enableTypes, default is ['json', 'form'].
      */
    var enableTypes: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * requested encoding. Default is utf-8 by co-body
      */
    var encode: js.UndefOr[String] = js.native
    
    /**
      * support extend types
      */
    var extendTypes: js.UndefOr[Form] = js.native
    
    /**
      * limit of the urlencoded body. If the body ends up being larger than this limit
      * a 413 error code is returned. Default is 56kb
      */
    var formLimit: js.UndefOr[String] = js.native
    
    /**
      * limit of the json body. Default is 1mb
      */
    var jsonLimit: js.UndefOr[String] = js.native
    
    /**
      * support custom error handle
      */
    var onerror: js.UndefOr[js.Function2[/* err */ js.Error, /* ctx */ Context, Unit]] = js.native
    
    /**
      * when set to true, JSON parser will only accept arrays and objects. Default is true
      */
    var strict: js.UndefOr[Boolean] = js.native
    
    /**
      * limit of the text body. Default is 1mb.
      */
    var textLimit: js.UndefOr[String] = js.native
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
      def setDetectJSON(value: /* ctx */ Context => Boolean): Self = StObject.set(x, "detectJSON", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDetectJSONUndefined: Self = StObject.set(x, "detectJSON", js.undefined)
      
      @scala.inline
      def setEnableTypes(value: js.Array[String]): Self = StObject.set(x, "enableTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableTypesUndefined: Self = StObject.set(x, "enableTypes", js.undefined)
      
      @scala.inline
      def setEnableTypesVarargs(value: String*): Self = StObject.set(x, "enableTypes", js.Array(value :_*))
      
      @scala.inline
      def setEncode(value: String): Self = StObject.set(x, "encode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodeUndefined: Self = StObject.set(x, "encode", js.undefined)
      
      @scala.inline
      def setExtendTypes(value: Form): Self = StObject.set(x, "extendTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtendTypesUndefined: Self = StObject.set(x, "extendTypes", js.undefined)
      
      @scala.inline
      def setFormLimit(value: String): Self = StObject.set(x, "formLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormLimitUndefined: Self = StObject.set(x, "formLimit", js.undefined)
      
      @scala.inline
      def setJsonLimit(value: String): Self = StObject.set(x, "jsonLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsonLimitUndefined: Self = StObject.set(x, "jsonLimit", js.undefined)
      
      @scala.inline
      def setOnerror(value: (/* err */ js.Error, /* ctx */ Context) => Unit): Self = StObject.set(x, "onerror", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnerrorUndefined: Self = StObject.set(x, "onerror", js.undefined)
      
      @scala.inline
      def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
      
      @scala.inline
      def setTextLimit(value: String): Self = StObject.set(x, "textLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextLimitUndefined: Self = StObject.set(x, "textLimit", js.undefined)
    }
  }
  
  /* augmented module */
  object koaAugmentingMod {
    
    @js.native
    trait Request extends StObject {
      
      var body: js.UndefOr[js.Any] = js.native
      
      var rawBody: String = js.native
    }
    object Request {
      
      @scala.inline
      def apply(rawBody: String): Request = {
        val __obj = js.Dynamic.literal(rawBody = rawBody.asInstanceOf[js.Any])
        __obj.asInstanceOf[Request]
      }
      
      @scala.inline
      implicit class RequestMutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBody(value: js.Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
        
        @scala.inline
        def setRawBody(value: String): Self = StObject.set(x, "rawBody", value.asInstanceOf[js.Any])
      }
    }
  }
}
