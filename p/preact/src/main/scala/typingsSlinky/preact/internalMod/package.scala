package typingsSlinky.preact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object internalMod {
  type ComponentFactory[P] = (typingsSlinky.preact.mod.ComponentClass[P, js.Object]) | typingsSlinky.preact.internalMod.FunctionalComponent[P]
}
