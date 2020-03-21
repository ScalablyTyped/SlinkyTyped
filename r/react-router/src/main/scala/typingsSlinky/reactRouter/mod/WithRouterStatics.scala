package typingsSlinky.reactRouter.mod

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WithRouterStatics[C /* <: ReactComponentClass[_] */] extends js.Object {
  var WrappedComponent: C
}

object WithRouterStatics {
  @scala.inline
  def apply[C /* <: ReactComponentClass[_] */](WrappedComponent: C): WithRouterStatics[C] = {
    val __obj = js.Dynamic.literal(WrappedComponent = WrappedComponent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WithRouterStatics[C]]
  }
}

