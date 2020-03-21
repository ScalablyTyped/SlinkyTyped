package typingsSlinky.reactLifecycleComponent.mod

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LifecycleStateProps[P, S] extends js.Object {
  var component: ReactComponentClass[P]
}

object LifecycleStateProps {
  @scala.inline
  def apply[P, S](component: ReactComponentClass[P]): LifecycleStateProps[P, S] = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LifecycleStateProps[P, S]]
  }
}

