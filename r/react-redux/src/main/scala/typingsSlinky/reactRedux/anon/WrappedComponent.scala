package typingsSlinky.reactRedux.anon

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WrappedComponent[C /* <: ReactComponentClass[_] */] extends js.Object {
  var WrappedComponent: C
}

object WrappedComponent {
  @scala.inline
  def apply[C](WrappedComponent: C): WrappedComponent[C] = {
    val __obj = js.Dynamic.literal(WrappedComponent = WrappedComponent.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrappedComponent[C]]
  }
}

