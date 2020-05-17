package typingsSlinky.reactIntl.anon

import slinky.core.ReactComponentClass
import typingsSlinky.reactIntl.injectIntlMod.WrappedComponentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WrappedComponentComponentType[P /* <: WrappedComponentProps[IntlPropName] */, IntlPropName /* <: String */] extends js.Object {
  var WrappedComponent: ReactComponentClass[P] = js.native
}

object WrappedComponentComponentType {
  @scala.inline
  def apply[P, IntlPropName](WrappedComponent: ReactComponentClass[P]): WrappedComponentComponentType[P, IntlPropName] = {
    val __obj = js.Dynamic.literal(WrappedComponent = WrappedComponent.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrappedComponentComponentType[P, IntlPropName]]
  }
  @scala.inline
  implicit class WrappedComponentComponentTypeOps[Self[p, intlpropname] <: WrappedComponentComponentType[p, intlpropname], P, IntlPropName] (val x: Self[P, IntlPropName]) extends AnyVal {
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

