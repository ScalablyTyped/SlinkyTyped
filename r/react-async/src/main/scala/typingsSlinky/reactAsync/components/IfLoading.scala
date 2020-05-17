package typingsSlinky.reactAsync.components

import typingsSlinky.reactAsync.anon.ChildrenInitial
import typingsSlinky.reactAsync.mod.AsyncState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object IfLoading {
  @JSImport("react-async", "IfLoading")
  @js.native
  object component extends js.Object
  
  def withProps[T](p: ChildrenInitial[T]): SharedBuilder_ChildrenInitial_198089325[T] = new SharedBuilder_ChildrenInitial_198089325[T](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply[T](state: AsyncState[T]): SharedBuilder_ChildrenInitial_198089325[T] = {
    val __props = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    new SharedBuilder_ChildrenInitial_198089325[T](js.Array(this.component, __props.asInstanceOf[ChildrenInitial[T]]))
  }
}

