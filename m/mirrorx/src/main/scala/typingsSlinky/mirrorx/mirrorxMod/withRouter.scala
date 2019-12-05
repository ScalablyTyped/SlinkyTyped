package typingsSlinky.mirrorx.mirrorxMod

import slinky.core.ReactComponentClass
import typingsSlinky.react.reactMod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mirrorx", "withRouter")
@js.native
object withRouter extends js.Object {
  def apply[P /* <: RouteComponentProps[_] */](component: ComponentType[P]): ReactComponentClass[Omit[P, String]] = js.native
  def apply[TFunction /* <: ReactComponentClass[_] */](target: TFunction): TFunction = js.native
}

