package typingsSlinky.reactDashAxe

import typingsSlinky.axeDashCore.axeDashCoreMod.Spec
import typingsSlinky.reactDashAxe.reactDashAxeMod.ReactAxeConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-axe", JSImport.Namespace)
@js.native
object reactDashAxeMod extends js.Object {
  def apply(react: TypeofReact, reactDOM: TypeofReactDOM, timeout: Double): Unit = js.native
  def apply(react: TypeofReact, reactDOM: TypeofReactDOM, timeout: Double, config: ReactAxeConfig): Unit = js.native
  type ReactAxeConfig = Spec
}

