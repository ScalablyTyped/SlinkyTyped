package typingsSlinky.knockoutProjections

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMappingWithDisposeCallback[T, TResult] extends js.Object {
  def mappingWithDisposeCallback(value: T): AnonDispose[TResult] = js.native
}

object AnonMappingWithDisposeCallback {
  @scala.inline
  def apply[T, TResult](mappingWithDisposeCallback: T => AnonDispose[TResult]): AnonMappingWithDisposeCallback[T, TResult] = {
    val __obj = js.Dynamic.literal(mappingWithDisposeCallback = js.Any.fromFunction1(mappingWithDisposeCallback))
    __obj.asInstanceOf[AnonMappingWithDisposeCallback[T, TResult]]
  }
  @scala.inline
  implicit class AnonMappingWithDisposeCallbackOps[Self[t, tresult] <: AnonMappingWithDisposeCallback[t, tresult], T, TResult] (val x: Self[T, TResult]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T, TResult] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T, TResult]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T, TResult]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T, TResult]) with Other]
    @scala.inline
    def withMappingWithDisposeCallback(value: T => AnonDispose[TResult]): Self[T, TResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mappingWithDisposeCallback")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

