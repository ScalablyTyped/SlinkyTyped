package typingsSlinky.nextReduxWrapper.mod

import typingsSlinky.nextReduxWrapper.anon.GetServerSideProps
import typingsSlinky.redux.mod.Action
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("next-redux-wrapper", "createWrapper")
@js.native
object createWrapper extends js.Object {
  def apply[S /* <: js.Object */, A /* <: Action[_] */](makeStore: MakeStore[S, A]): GetServerSideProps[S, A] = js.native
  def apply[S /* <: js.Object */, A /* <: Action[_] */](makeStore: MakeStore[S, A], config: Config[S]): GetServerSideProps[S, A] = js.native
}

