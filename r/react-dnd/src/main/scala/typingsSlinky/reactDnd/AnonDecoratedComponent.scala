package typingsSlinky.reactDnd

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDecoratedComponent[C /* <: ReactComponentClass[_] */] extends js.Object {
  var DecoratedComponent: C
}

object AnonDecoratedComponent {
  @scala.inline
  def apply[C /* <: ReactComponentClass[_] */](DecoratedComponent: C): AnonDecoratedComponent[C] = {
    val __obj = js.Dynamic.literal(DecoratedComponent = DecoratedComponent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDecoratedComponent[C]]
  }
}

