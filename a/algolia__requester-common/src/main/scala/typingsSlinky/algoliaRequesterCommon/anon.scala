package typingsSlinky.algoliaRequesterCommon

import typingsSlinky.algoliaRequesterCommon.mod.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Readonly<std.Promise<@algolia/requester-common.@algolia/requester-common.Response>> */
  @js.native
  trait ReadonlyPromiseResponse extends StObject {
    
    def `catch`[TResult](): js.Promise[Response | TResult] = js.native
    
    def `finally`(): js.Promise[Response] = js.native
    
    def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2] = js.native
  }
  object ReadonlyPromiseResponse {
    
    @scala.inline
    def apply(
      `catch`: () => js.Promise[Response | js.Any],
      `finally`: () => js.Promise[Response],
      `then`: () => js.Promise[js.Any]
    ): ReadonlyPromiseResponse = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
      __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
      __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
      __obj.asInstanceOf[ReadonlyPromiseResponse]
    }
    
    @scala.inline
    implicit class ReadonlyPromiseResponseMutableBuilder[Self <: ReadonlyPromiseResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCatch(value: () => js.Promise[Response | js.Any]): Self = StObject.set(x, "catch", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFinally(value: () => js.Promise[Response]): Self = StObject.set(x, "finally", js.Any.fromFunction0(value))
      
      @scala.inline
      def setThen(value: () => js.Promise[js.Any]): Self = StObject.set(x, "then", js.Any.fromFunction0(value))
    }
  }
  
  /* Inlined std.Readonly<std.Promise<void>> */
  @js.native
  trait ReadonlyPromisevoid extends StObject {
    
    def `catch`[TResult](): js.Promise[Unit | TResult] = js.native
    
    def `finally`(): js.Promise[Unit] = js.native
    
    def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2] = js.native
  }
  object ReadonlyPromisevoid {
    
    @scala.inline
    def apply(
      `catch`: () => js.Promise[Unit | js.Any],
      `finally`: () => js.Promise[Unit],
      `then`: () => js.Promise[js.Any]
    ): ReadonlyPromisevoid = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
      __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
      __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
      __obj.asInstanceOf[ReadonlyPromisevoid]
    }
    
    @scala.inline
    implicit class ReadonlyPromisevoidMutableBuilder[Self <: ReadonlyPromisevoid] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCatch(value: () => js.Promise[Unit | js.Any]): Self = StObject.set(x, "catch", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFinally(value: () => js.Promise[Unit]): Self = StObject.set(x, "finally", js.Any.fromFunction0(value))
      
      @scala.inline
      def setThen(value: () => js.Promise[js.Any]): Self = StObject.set(x, "then", js.Any.fromFunction0(value))
    }
  }
}
