package typingsSlinky.reactDashDom.testDashUtilsMod

import slinky.core.ReactComponentClass
import typingsSlinky.react.reactMod.ClassType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dom/test-utils", "scryRenderedComponentsWithType")
@js.native
object scryRenderedComponentsWithType extends js.Object {
  def apply[T /* <: ReactComponentClass[_] */, C /* <: ReactComponentClass[_] */](root: ReactComponentClass[_], `type`: ClassType[_, T, C]): js.Array[T] = js.native
}

