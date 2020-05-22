package typingsSlinky.reactIntl.anon

import slinky.core.ReactComponentClass
import typingsSlinky.reactIntl.injectIntlMod.WrappedComponentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WrappedComponent[P /* <: WrappedComponentProps[IntlPropName] */, IntlPropName /* <: String */] extends js.Object {
  var WrappedComponent: ReactComponentClass[P]
}

object WrappedComponent {
  @scala.inline
  def apply[P, IntlPropName](WrappedComponent: ReactComponentClass[P]): WrappedComponent[P, IntlPropName] = {
    val __obj = js.Dynamic.literal(WrappedComponent = WrappedComponent.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrappedComponent[P, IntlPropName]]
  }
}

