package typingsSlinky.reactDnd.anon

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DecoratedComponent[C /* <: ReactComponentClass[_] */] extends js.Object {
  var DecoratedComponent: C = js.native
}

object DecoratedComponent {
  @scala.inline
  def apply[C](DecoratedComponent: C): DecoratedComponent[C] = {
    val __obj = js.Dynamic.literal(DecoratedComponent = DecoratedComponent.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecoratedComponent[C]]
  }
  @scala.inline
  implicit class DecoratedComponentOps[Self[c] <: DecoratedComponent[c], C] (val x: Self[C]) extends AnyVal {
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

