package typingsSlinky.agDashGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distLibComponentsFrameworkComponentProviderMod {
  import org.scalajs.dom.raw.HTMLElement
  import typingsSlinky.agDashGrid.Anon_A
  import typingsSlinky.agDashGrid.Anon_B
  import typingsSlinky.agDashGrid.distLibInterfacesIComponentMod.IComponent

  type AgGridComponentFunctionInput = js.Function1[/* params */ js.Any, String | HTMLElement]
  type AgGridRegisteredComponentInput[A /* <: IComponent[_] */] = AgGridComponentFunctionInput | Anon_A[A]
  type RegisteredComponentInput[A /* <: IComponent[_] with B */, B] = AgGridRegisteredComponentInput[A] | Anon_B[B]
}
