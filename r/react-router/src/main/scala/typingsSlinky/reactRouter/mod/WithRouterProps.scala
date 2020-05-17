package typingsSlinky.reactRouter.mod

import slinky.core.ReactComponentClass
import typingsSlinky.reactRouter.anon.WrappedComponentRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Object
  - typingsSlinky.reactRouter.anon.WrappedComponentRef[C]
*/
trait WithRouterProps[C /* <: ReactComponentClass[_] */] extends js.Object

object WithRouterProps {
  @scala.inline
  implicit def apply[C](value: js.Object): WithRouterProps[C] = value.asInstanceOf[WithRouterProps[C]]
  @scala.inline
  implicit def apply[C](value: WrappedComponentRef[C]): WithRouterProps[C] = value.asInstanceOf[WithRouterProps[C]]
}

