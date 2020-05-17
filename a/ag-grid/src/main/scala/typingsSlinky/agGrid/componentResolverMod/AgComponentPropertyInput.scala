package typingsSlinky.agGrid.componentResolverMod

import typingsSlinky.agGrid.componentProviderMod.AgGridRegisteredComponentInput
import typingsSlinky.agGrid.iComponentMod.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.agGrid.componentProviderMod.AgGridRegisteredComponentInput[A]
  - java.lang.String
*/
trait AgComponentPropertyInput[A /* <: IComponent[_] */] extends js.Object

object AgComponentPropertyInput {
  @scala.inline
  implicit def apply[A](value: AgGridRegisteredComponentInput[A]): AgComponentPropertyInput[A] = value.asInstanceOf[AgComponentPropertyInput[A]]
  @scala.inline
  implicit def apply[A](value: String): AgComponentPropertyInput[A] = value.asInstanceOf[AgComponentPropertyInput[A]]
}

