package typingsSlinky.reactDom.testUtilsMod

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.ClassType
import typingsSlinky.react.mod.ReactInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-dom/test-utils", "isCompositeComponentWithType")
@js.native
object isCompositeComponentWithType extends js.Object {
  
  def apply[T /* <: ReactComponentClass[_] */, C /* <: ReactComponentClass[_] */](instance: ReactInstance, `type`: ClassType[_, T, C]): Boolean = js.native
}
