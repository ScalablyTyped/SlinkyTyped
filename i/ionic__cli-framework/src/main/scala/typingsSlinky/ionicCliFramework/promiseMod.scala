package typingsSlinky.ionicCliFramework

import typingsSlinky.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/cli-framework/utils/promise", JSImport.Namespace)
@js.native
object promiseMod extends js.Object {
  
  val promisify: Promisify_ = js.native
  
  def promisifyEvent(emitter: EventEmitter, event: String): js.Promise[_] = js.native
  def promisifyEvent(emitter: EventEmitter, event: js.Symbol): js.Promise[_] = js.native
  
  @js.native
  object PromiseUtil extends js.Object {
    
    def any(promises: js.Array[js.Promise[_]]): js.Promise[_] = js.native
    
    def some(promises: js.Array[js.Promise[_]]): js.Promise[js.Array[_]] = js.native
    def some(promises: js.Array[js.Promise[_]], expected: Double): js.Promise[js.Array[_]] = js.native
  }
  
  @js.native
  trait Promisify_ extends js.Object {
    
    def apply[T](
      func: js.Function1[
          /* callback */ js.Function2[/* err */ js.Any, /* result */ js.UndefOr[T], Unit], 
          Unit
        ]
    ): js.Function0[js.Promise[T]] = js.native
    def apply[T, A1](
      func: js.Function2[
          /* arg1 */ A1, 
          /* callback */ js.Function2[/* err */ js.Any, /* result */ js.UndefOr[T], Unit], 
          Unit
        ]
    ): js.Function1[/* arg1 */ A1, js.Promise[T]] = js.native
    def apply[T, A1, A2](
      func: js.Function3[
          /* arg1 */ A1, 
          /* arg2 */ A2, 
          /* callback */ js.Function2[/* err */ js.Any, /* result */ js.UndefOr[T], Unit], 
          Unit
        ]
    ): js.Function2[/* arg1 */ A1, /* arg2 */ A2, js.Promise[T]] = js.native
    def apply[T, A1, A2, A3](
      func: js.Function4[
          /* arg1 */ A1, 
          /* arg2 */ A2, 
          /* arg3 */ A3, 
          /* callback */ js.Function2[/* err */ js.Any, /* result */ js.UndefOr[T], Unit], 
          Unit
        ]
    ): js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, js.Promise[T]] = js.native
    def apply[T, A1, A2, A3, A4](
      func: js.Function5[
          /* arg1 */ A1, 
          /* arg2 */ A2, 
          /* arg3 */ A3, 
          /* arg4 */ A4, 
          /* callback */ js.Function2[/* err */ js.Any, /* result */ js.UndefOr[T], Unit], 
          Unit
        ]
    ): js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, js.Promise[T]] = js.native
    def apply[T, A1, A2, A3, A4, A5](
      func: js.Function6[
          /* arg1 */ A1, 
          /* arg2 */ A2, 
          /* arg3 */ A3, 
          /* arg4 */ A4, 
          /* arg5 */ A5, 
          /* callback */ js.Function2[/* err */ js.Any, /* result */ js.UndefOr[T], Unit], 
          Unit
        ]
    ): js.Function5[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, /* arg5 */ A5, js.Promise[T]] = js.native
  }
}
