package typingsSlinky.androiduix.android.util.Pools

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.util.Pools.SimplePool")
@js.native
class SimplePool[T] protected () extends Pool[T] {
  def this(maxPoolSize: Double) = this()
  var mPool: js.Array[T] = js.native
  var mPoolSize: Double = js.native
  /* private */ def isInPool(instance: js.Any): js.Any = js.native
}

