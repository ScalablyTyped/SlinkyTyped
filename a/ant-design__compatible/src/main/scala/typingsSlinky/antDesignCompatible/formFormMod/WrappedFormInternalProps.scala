package typingsSlinky.antDesignCompatible.formFormMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WrappedFormInternalProps[V] extends js.Object {
  var form: WrappedFormUtils[V] = js.native
}

object WrappedFormInternalProps {
  @scala.inline
  def apply[V](form: WrappedFormUtils[V]): WrappedFormInternalProps[V] = {
    val __obj = js.Dynamic.literal(form = form.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrappedFormInternalProps[V]]
  }
  @scala.inline
  implicit class WrappedFormInternalPropsOps[Self[v] <: WrappedFormInternalProps[v], V] (val x: Self[V]) extends AnyVal {
    @scala.inline
    def duplicate: Self[V] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[V]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[V] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[V] with Other]
    @scala.inline
    def withForm(value: WrappedFormUtils[V]): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("form")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

