package typingsSlinky.istanbulMiddleware

import typingsSlinky.express.mod.Request_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.istanbulMiddleware.mod.ClientMatcher
import typingsSlinky.istanbulMiddleware.mod.PathTransformer
import typingsSlinky.istanbulMiddleware.mod.PostLoadHookFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Matcher extends StObject {
    
    var matcher: js.UndefOr[ClientMatcher] = js.native
    
    var pathTransformer: js.UndefOr[PathTransformer] = js.native
    
    var verbose: js.UndefOr[Boolean] = js.native
  }
  object Matcher {
    
    @scala.inline
    def apply(): Matcher = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Matcher]
    }
    
    @scala.inline
    implicit class MatcherMutableBuilder[Self <: Matcher] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMatcher(value: /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query] => Boolean): Self = StObject.set(x, "matcher", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMatcherUndefined: Self = StObject.set(x, "matcher", js.undefined)
      
      @scala.inline
      def setPathTransformer(value: /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query] => String): Self = StObject.set(x, "pathTransformer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPathTransformerUndefined: Self = StObject.set(x, "pathTransformer", js.undefined)
      
      @scala.inline
      def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
  
  @js.native
  trait PostLoadHook extends StObject {
    
    var postLoadHook: js.UndefOr[typingsSlinky.istanbulMiddleware.mod.PostLoadHook] = js.native
    
    var verbose: js.UndefOr[Boolean] = js.native
  }
  object PostLoadHook {
    
    @scala.inline
    def apply(): PostLoadHook = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PostLoadHook]
    }
    
    @scala.inline
    implicit class PostLoadHookMutableBuilder[Self <: PostLoadHook] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPostLoadHook(
        value: (/* matcherfn */ typingsSlinky.istanbulMiddleware.mod.Matcher, /* transformer */ js.Any, /* verbose */ Boolean) => PostLoadHookFn
      ): Self = StObject.set(x, "postLoadHook", js.Any.fromFunction3(value))
      
      @scala.inline
      def setPostLoadHookUndefined: Self = StObject.set(x, "postLoadHook", js.undefined)
      
      @scala.inline
      def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
  
  @js.native
  trait ResetOnGet extends StObject {
    
    var resetOnGet: js.UndefOr[Boolean] = js.native
  }
  object ResetOnGet {
    
    @scala.inline
    def apply(): ResetOnGet = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResetOnGet]
    }
    
    @scala.inline
    implicit class ResetOnGetMutableBuilder[Self <: ResetOnGet] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setResetOnGet(value: Boolean): Self = StObject.set(x, "resetOnGet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResetOnGetUndefined: Self = StObject.set(x, "resetOnGet", js.undefined)
    }
  }
}
