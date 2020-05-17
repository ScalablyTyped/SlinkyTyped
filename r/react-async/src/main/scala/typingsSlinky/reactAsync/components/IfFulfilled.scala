package typingsSlinky.reactAsync.components

import typingsSlinky.reactAsync.anon.PersistState
import typingsSlinky.reactAsync.mod.AsyncState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object IfFulfilled {
  @JSImport("react-async", "IfFulfilled")
  @js.native
  object component extends js.Object
  
  def withProps[T](p: PersistState[T]): SharedBuilder_PersistState_1165549361[T] = new SharedBuilder_PersistState_1165549361[T](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply[T](state: AsyncState[T]): SharedBuilder_PersistState_1165549361[T] = {
    val __props = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    new SharedBuilder_PersistState_1165549361[T](js.Array(this.component, __props.asInstanceOf[PersistState[T]]))
  }
}

