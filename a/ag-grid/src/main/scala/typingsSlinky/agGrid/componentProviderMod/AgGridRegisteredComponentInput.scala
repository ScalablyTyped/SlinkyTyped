package typingsSlinky.agGrid.componentProviderMod

import typingsSlinky.agGrid.anon.InstantiableA
import typingsSlinky.agGrid.componentResolverMod.AgComponentPropertyInput
import typingsSlinky.agGrid.iComponentMod.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.agGrid.componentProviderMod.AgGridComponentFunctionInput
  - typingsSlinky.agGrid.anon.InstantiableA[A]
*/
trait AgGridRegisteredComponentInput[A /* <: IComponent[_] */]
  extends AgComponentPropertyInput[A]
     with RegisteredComponentInput[A, js.Any]

object AgGridRegisteredComponentInput {
  @scala.inline
  implicit def apply[A](value: AgGridComponentFunctionInput): AgGridRegisteredComponentInput[A] = value.asInstanceOf[AgGridRegisteredComponentInput[A]]
  @scala.inline
  implicit def apply[A](value: InstantiableA[A]): AgGridRegisteredComponentInput[A] = value.asInstanceOf[AgGridRegisteredComponentInput[A]]
}

