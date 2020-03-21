package typingsSlinky.reactIntl

import slinky.core.ReactComponentClass
import typingsSlinky.reactIntl.injectIntlMod.WrappedComponentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonWrappedComponent[P /* <: WrappedComponentProps[IntlPropName] */] extends js.Object {
  var WrappedComponent: ReactComponentClass[P]
}

object AnonWrappedComponent {
  @scala.inline
  def apply[P /* <: WrappedComponentProps[IntlPropName] */](WrappedComponent: ReactComponentClass[P]): AnonWrappedComponent[P] = {
    val __obj = js.Dynamic.literal(WrappedComponent = WrappedComponent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonWrappedComponent[P]]
  }
}

