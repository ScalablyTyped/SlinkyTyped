package typingsSlinky.ractive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ractive.mod.Static[typingsSlinky.ractive.mod.Ractive[typingsSlinky.ractive.mod.Ractive[js.Any]]]
  - js.Promise[
typingsSlinky.ractive.mod.Static[typingsSlinky.ractive.mod.Ractive[typingsSlinky.ractive.mod.Ractive[js.Any]]]]
*/
trait Component extends js.Object

object Component {
  @scala.inline
  implicit def apply(value: js.Promise[Static[Ractive[Ractive[js.Any]]]]): Component = value.asInstanceOf[Component]
  @scala.inline
  implicit def apply(value: Static[Ractive[Ractive[js.Any]]]): Component = value.asInstanceOf[Component]
}

