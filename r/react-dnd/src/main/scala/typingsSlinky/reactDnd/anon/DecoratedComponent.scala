package typingsSlinky.reactDnd.anon

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecoratedComponent[C /* <: ReactComponentClass[_] */] extends js.Object {
  var DecoratedComponent: C
}

object DecoratedComponent {
  @scala.inline
  def apply[C](DecoratedComponent: C): DecoratedComponent[C] = {
    val __obj = js.Dynamic.literal(DecoratedComponent = DecoratedComponent.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecoratedComponent[C]]
  }
}

