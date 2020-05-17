package typingsSlinky.agGrid.componentProviderMod

import typingsSlinky.agGrid.anon.InstantiableB
import typingsSlinky.agGrid.iComponentMod.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.agGrid.componentProviderMod.AgGridRegisteredComponentInput[A]
  - typingsSlinky.agGrid.anon.InstantiableB[B]
*/
trait RegisteredComponentInput[A /* <: IComponent[_] with B */, B] extends js.Object

object RegisteredComponentInput {
  @scala.inline
  implicit def apply[A, B](value: AgGridRegisteredComponentInput[A]): RegisteredComponentInput[A, B] = value.asInstanceOf[RegisteredComponentInput[A, B]]
  @scala.inline
  implicit def apply[A, B](value: InstantiableB[B]): RegisteredComponentInput[A, B] = value.asInstanceOf[RegisteredComponentInput[A, B]]
}

