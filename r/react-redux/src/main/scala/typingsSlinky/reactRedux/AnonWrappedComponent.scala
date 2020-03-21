package typingsSlinky.reactRedux

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonWrappedComponent[C /* <: ReactComponentClass[_] */] extends js.Object {
  var WrappedComponent: C
}

object AnonWrappedComponent {
  @scala.inline
  def apply[C /* <: ReactComponentClass[_] */](WrappedComponent: C): AnonWrappedComponent[C] = {
    val __obj = js.Dynamic.literal(WrappedComponent = WrappedComponent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonWrappedComponent[C]]
  }
}

