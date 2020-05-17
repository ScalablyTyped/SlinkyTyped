package typingsSlinky.nextServer.dynamicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Function0[typingsSlinky.nextServer.dynamicMod.LoaderComponent[P]]
  - typingsSlinky.nextServer.dynamicMod.LoaderComponent[P]
*/
trait Loader[P] extends js.Object

object Loader {
  @scala.inline
  implicit def apply[P](value: js.Function0[LoaderComponent[P]]): Loader[P] = value.asInstanceOf[Loader[P]]
  @scala.inline
  implicit def apply[P](value: LoaderComponent[P]): Loader[P] = value.asInstanceOf[Loader[P]]
}

