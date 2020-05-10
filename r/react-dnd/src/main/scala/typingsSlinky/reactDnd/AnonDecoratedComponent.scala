package typingsSlinky.reactDnd

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDecoratedComponent[C /* <: ReactComponentClass[_] */] extends js.Object {
  var DecoratedComponent: C = js.native
}

object AnonDecoratedComponent {
  @scala.inline
  def apply[C](DecoratedComponent: C): AnonDecoratedComponent[C] = {
    val __obj = js.Dynamic.literal(DecoratedComponent = DecoratedComponent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDecoratedComponent[C]]
  }
  @scala.inline
  implicit class AnonDecoratedComponentOps[Self[c] <: AnonDecoratedComponent[c], C] (val x: Self[C]) extends AnyVal {
    @scala.inline
    def duplicate: Self[C] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[C]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[C] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[C] with Other]
    @scala.inline
    def withDecoratedComponent(value: C): Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DecoratedComponent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

