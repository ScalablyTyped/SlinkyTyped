package typingsSlinky.knockoutTransformations.KnockoutTransformations

import typingsSlinky.knockoutTransformations.anon.Dispose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MappingWithDisposeCallbackOption[T, TResult] extends js.Object {
  def mappingWithDisposeCallback(value: T): Dispose[TResult] = js.native
}

object MappingWithDisposeCallbackOption {
  @scala.inline
  def apply[T, TResult](mappingWithDisposeCallback: T => Dispose[TResult]): MappingWithDisposeCallbackOption[T, TResult] = {
    val __obj = js.Dynamic.literal(mappingWithDisposeCallback = js.Any.fromFunction1(mappingWithDisposeCallback))
    __obj.asInstanceOf[MappingWithDisposeCallbackOption[T, TResult]]
  }
  @scala.inline
  implicit class MappingWithDisposeCallbackOptionOps[Self[t, tresult] <: MappingWithDisposeCallbackOption[t, tresult], T, TResult] (val x: Self[T, TResult]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T, TResult] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T, TResult]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T, TResult]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T, TResult]) with Other]
    @scala.inline
    def withMappingWithDisposeCallback(value: T => Dispose[TResult]): Self[T, TResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mappingWithDisposeCallback")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

