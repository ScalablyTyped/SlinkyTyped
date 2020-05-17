package typingsSlinky.reactIntl.anon

import slinky.core.ReactComponentClass
import typingsSlinky.reactIntl.mod.WrappedComponentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `5`[P /* <: WrappedComponentProps[IntlPropName] */, IntlPropName /* <: String */] extends js.Object {
  var WrappedComponent: ReactComponentClass[P] = js.native
}

object `5` {
  @scala.inline
  def apply[P, IntlPropName](WrappedComponent: ReactComponentClass[P]): `5`[P, IntlPropName] = {
    val __obj = js.Dynamic.literal(WrappedComponent = WrappedComponent.asInstanceOf[js.Any])
    __obj.asInstanceOf[`5`[P, IntlPropName]]
  }
  @scala.inline
  implicit class `5Ops`[Self[p, intlpropname] <: `5`[p, intlpropname], P, IntlPropName] (val x: Self[P, IntlPropName]) extends AnyVal {
    @scala.inline
    def duplicate: Self[P, IntlPropName] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[P, IntlPropName]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[P, IntlPropName]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[P, IntlPropName]) with Other]
    @scala.inline
    def withWrappedComponent(value: ReactComponentClass[P]): Self[P, IntlPropName] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WrappedComponent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

