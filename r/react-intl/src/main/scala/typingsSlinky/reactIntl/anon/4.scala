package typingsSlinky.reactIntl.anon

import slinky.core.ReactComponentClass
import typingsSlinky.reactIntl.mod.WrappedComponentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `4`[P /* <: WrappedComponentProps[IntlPropName] */, IntlPropName /* <: String */] extends js.Object {
  var WrappedComponent: ReactComponentClass[P]
}

object `4` {
  @scala.inline
  def apply[P, IntlPropName](WrappedComponent: ReactComponentClass[P]): `4`[P, IntlPropName] = {
    val __obj = js.Dynamic.literal(WrappedComponent = WrappedComponent.asInstanceOf[js.Any])
    __obj.asInstanceOf[`4`[P, IntlPropName]]
  }
}

