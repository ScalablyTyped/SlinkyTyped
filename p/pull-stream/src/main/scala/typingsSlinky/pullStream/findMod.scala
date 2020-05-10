package typingsSlinky.pullStream

import typingsSlinky.pullStream.mod.Sink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pull-stream/sinks/find", JSImport.Namespace)
@js.native
object findMod extends js.Object {
  def apply[T](): Sink[T] = js.native
  def apply[T](cb: js.Function2[/* err */ js.Error | Null, /* results */ js.Array[T], _]): Sink[T] = js.native
  def apply[T](test: /* keyof T */ String): Sink[T] = js.native
  def apply[T](test: /* keyof T */ String, cb: js.Function2[/* err */ js.Error | Null, /* result */ T, _]): Sink[T] = js.native
  def apply[T](test: js.Function1[/* data */ T, Boolean]): Sink[T] = js.native
  def apply[T](
    test: js.Function1[/* data */ T, Boolean],
    cb: js.Function2[/* err */ js.Error | Null, /* result */ T, _]
  ): Sink[T] = js.native
}

