package typingsSlinky.antDesignCompatible.formFormMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormComponentProps[V]
  extends WrappedFormInternalProps[V]
     with RcBaseFormProps

object FormComponentProps {
  @scala.inline
  def apply[V](form: WrappedFormUtils[V]): FormComponentProps[V] = {
    val __obj = js.Dynamic.literal(form = form.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormComponentProps[V]]
  }
}

