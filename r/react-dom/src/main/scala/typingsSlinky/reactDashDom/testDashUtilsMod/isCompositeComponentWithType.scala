package typingsSlinky.reactDashDom.testDashUtilsMod

import slinky.core.ReactComponentClass
import typingsSlinky.react.reactMod.ClassType
import typingsSlinky.react.reactMod.ReactInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dom/test-utils", "isCompositeComponentWithType")
@js.native
object isCompositeComponentWithType extends js.Object {
  def apply[T /* <: ReactComponentClass[_] */, C /* <: ReactComponentClass[_] */](instance: ReactInstance, `type`: ClassType[_, T, C]): Boolean = js.native
}

