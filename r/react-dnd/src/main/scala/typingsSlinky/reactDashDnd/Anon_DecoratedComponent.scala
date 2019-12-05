package typingsSlinky.reactDashDnd

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DecoratedComponent[C /* <: ReactComponentClass[_] */] extends js.Object {
  var DecoratedComponent: C
}

object Anon_DecoratedComponent {
  @scala.inline
  def apply[C /* <: ReactComponentClass[_] */](DecoratedComponent: C): Anon_DecoratedComponent[C] = {
    val __obj = js.Dynamic.literal(DecoratedComponent = DecoratedComponent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_DecoratedComponent[C]]
  }
}

