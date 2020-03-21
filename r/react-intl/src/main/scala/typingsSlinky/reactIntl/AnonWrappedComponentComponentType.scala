package typingsSlinky.reactIntl

import slinky.core.ReactComponentClass
import typingsSlinky.reactIntl.mod.WrappedComponentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonWrappedComponentComponentType[P /* <: WrappedComponentProps[IntlPropName] */] extends js.Object {
  var WrappedComponent: ReactComponentClass[P]
}

object AnonWrappedComponentComponentType {
  @scala.inline
  def apply[P /* <: WrappedComponentProps[IntlPropName] */](WrappedComponent: ReactComponentClass[P]): AnonWrappedComponentComponentType[P] = {
    val __obj = js.Dynamic.literal(WrappedComponent = WrappedComponent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonWrappedComponentComponentType[P]]
  }
}

