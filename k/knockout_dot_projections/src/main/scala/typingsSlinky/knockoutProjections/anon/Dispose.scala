package typingsSlinky.knockoutProjections.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dispose[TResult] extends js.Object {
  var mappedValue: TResult = js.native
  def dispose(): Unit = js.native
}

object Dispose {
  @scala.inline
  def apply[TResult](dispose: () => Unit, mappedValue: TResult): Dispose[TResult] = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), mappedValue = mappedValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dispose[TResult]]
  }
  @scala.inline
  implicit class DisposeOps[Self[tresult] <: Dispose[tresult], TResult] (val x: Self[TResult]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TResult] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TResult]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TResult] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TResult] with Other]
    @scala.inline
    def withDispose(value: () => Unit): Self[TResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMappedValue(value: TResult): Self[TResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mappedValue")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

