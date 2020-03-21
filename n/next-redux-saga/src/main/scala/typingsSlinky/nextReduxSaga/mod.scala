package typingsSlinky.nextReduxSaga

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("next-redux-saga", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply[P](arg: AnonAsync): js.Function1[/* BaseComponent */ ReactComponentClass[P], ReactComponentClass[P]] = js.native
  def apply[P](arg: ComponentType[P]): ReactComponentClass[P] = js.native
}

