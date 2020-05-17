package typingsSlinky.d3Geo.anon

import typingsSlinky.d3Geo.mod.GeoStream_
import typingsSlinky.d3Geo.mod.GeoTransformPrototype
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `0`[T /* <: GeoTransformPrototype */] extends js.Object {
  def stream(s: GeoStream_): T with GeoStream_ = js.native
}

object `0` {
  @scala.inline
  def apply[T](stream: GeoStream_ => T with GeoStream_): `0`[T] = {
    val __obj = js.Dynamic.literal(stream = js.Any.fromFunction1(stream))
    __obj.asInstanceOf[`0`[T]]
  }
  @scala.inline
  implicit class `0Ops`[Self[t] <: `0`[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withStream(value: GeoStream_ => T with GeoStream_): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stream")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

