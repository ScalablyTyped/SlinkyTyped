package typingsSlinky.reduxTestkit

import typingsSlinky.redux.mod.Action
import typingsSlinky.redux.mod.AnyAction
import typingsSlinky.redux.mod.Dispatch
import typingsSlinky.redux.mod.Middleware
import typingsSlinky.reduxTestkit.anon.Execute
import typingsSlinky.reduxTestkit.anon.Flush
import typingsSlinky.reduxTestkit.anon.ReducerTestkitwithStatest
import typingsSlinky.reduxTestkit.anon.ThunkTestkitwithStatestat
import typingsSlinky.reduxTestkit.anon.ToChangeInState
import typingsSlinky.reduxThunk.mod.ThunkAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object FlushThunks {
    
    @JSImport("redux-testkit", "FlushThunks.createMiddleware")
    @js.native
    def createMiddleware(): (Middleware[js.Object, _, Dispatch[AnyAction]]) with Flush = js.native
  }
  
  @JSImport("redux-testkit", "Reducer")
  @js.native
  def Reducer(action: typingsSlinky.redux.mod.Reducer[_, AnyAction]): ReducerTestkitwithStatest = js.native
  
  @JSImport("redux-testkit", "Selector")
  @js.native
  def Selector(selector: js.Function2[/* state */ js.Any, /* action */ js.Any, _]): Execute = js.native
  
  @JSImport("redux-testkit", "Thunk")
  @js.native
  def Thunk(thunkFunc: ThunkAction[_, _, _, _]): ThunkTestkitwithStatestat = js.native
  @JSImport("redux-testkit", "Thunk")
  @js.native
  def Thunk(thunkFunc: ThunkAction[_, _, _, _], extraArg: js.Any): ThunkTestkitwithStatestat = js.native
  
  @js.native
  trait ReducerTestkit extends StObject {
    
    def execute(action: Action[_]): js.Any = js.native
    
    def expect(action: Action[_]): ToChangeInState = js.native
  }
  object ReducerTestkit {
    
    @scala.inline
    def apply(execute: Action[_] => js.Any, expect: Action[_] => ToChangeInState): ReducerTestkit = {
      val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), expect = js.Any.fromFunction1(expect))
      __obj.asInstanceOf[ReducerTestkit]
    }
    
    @scala.inline
    implicit class ReducerTestkitMutableBuilder[Self <: ReducerTestkit] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExecute(value: Action[_] => js.Any): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
      
      @scala.inline
      def setExpect(value: Action[_] => ToChangeInState): Self = StObject.set(x, "expect", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait ThunkTestkit extends StObject {
    
    def execute(args: js.Any*): js.Any = js.native
  }
  object ThunkTestkit {
    
    @scala.inline
    def apply(execute: /* repeated */ js.Any => js.Any): ThunkTestkit = {
      val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute))
      __obj.asInstanceOf[ThunkTestkit]
    }
    
    @scala.inline
    implicit class ThunkTestkitMutableBuilder[Self <: ThunkTestkit] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExecute(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
    }
  }
}
