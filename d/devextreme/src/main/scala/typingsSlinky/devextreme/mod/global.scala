package typingsSlinky.devextreme.mod

import typingsSlinky.devextreme.mod.DevExpress.events.event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @js.native
  trait JQuery extends StObject
  
  @js.native
  trait JQueryEventObject extends event {
    
    var cancel: js.UndefOr[Boolean] = js.native
  }
  object JQueryEventObject {
    
    @scala.inline
    def apply(): JQueryEventObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JQueryEventObject]
    }
    
    @scala.inline
    implicit class JQueryEventObjectMutableBuilder[Self <: JQueryEventObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    }
  }
  
  @js.native
  trait JQueryPromise[T] extends StObject
  
  @js.native
  trait Promise[T] extends StObject {
    
    def `then`[TResult1, TResult2](): Promise[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](
      onfulfilled: js.UndefOr[scala.Nothing],
      onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]
    ): Promise[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](
      onfulfilled: js.Function2[/* value */ T, /* extraParameters */ T, TResult1 | js.Thenable[TResult1]]
    ): Promise[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](
      onfulfilled: js.Function2[/* value */ T, /* extraParameters */ T, TResult1 | js.Thenable[TResult1]],
      onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]
    ): Promise[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](onfulfilled: Null, onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]): Promise[TResult1 | TResult2] = js.native
  }
}
