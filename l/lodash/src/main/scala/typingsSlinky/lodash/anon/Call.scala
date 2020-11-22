package typingsSlinky.lodash.anon

import typingsSlinky.lodash.mod.MapCacheConstructor
import typingsSlinky.lodash.mod.MemoizedFunction
import typingsSlinky.std.Parameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Call extends js.Object {
  
  def apply[T /* <: js.Function1[/* args */ js.Any, _] */](func: T): T with MemoizedFunction = js.native
  def apply[T /* <: js.Function1[/* args */ js.Any, _] */](func: T, resolver: js.Function1[/* args */ Parameters[T], _]): T with MemoizedFunction = js.native
  
  var Cache: MapCacheConstructor = js.native
}
