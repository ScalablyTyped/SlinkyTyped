package typingsSlinky.reactAsync.components

import typingsSlinky.reactAsync.AnonChildrenInitial
import typingsSlinky.reactAsync.mod.AsyncState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object IfLoading {
  @JSImport("react-async", "IfLoading")
  @js.native
  object component extends js.Object
  
  def withProps[T](p: AnonChildrenInitial[T]): SharedBuilder_AnonChildrenInitial69102890[T] = new SharedBuilder_AnonChildrenInitial69102890[T](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply[T](state: AsyncState[T]): SharedBuilder_AnonChildrenInitial69102890[T] = {
    val __props = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    new SharedBuilder_AnonChildrenInitial69102890[T](js.Array(this.component, __props.asInstanceOf[AnonChildrenInitial[T]]))
  }
}

