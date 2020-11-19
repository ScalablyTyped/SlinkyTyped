package typingsSlinky.androiduix.global.android.util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("android.util.Pools")
@js.native
class Pools ()
  extends typingsSlinky.androiduix.android.util.Pools
@JSGlobal("android.util.Pools")
@js.native
object Pools extends js.Object {
  
  @js.native
  class SimplePool[T] protected ()
    extends typingsSlinky.androiduix.android.util.Pools.SimplePool[T] {
    def this(maxPoolSize: Double) = this()
  }
  
  @js.native
  class SynchronizedPool[T] ()
    extends typingsSlinky.androiduix.android.util.Pools.SimplePool[T]
}
