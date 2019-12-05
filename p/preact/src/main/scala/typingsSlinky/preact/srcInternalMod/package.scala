package typingsSlinky.preact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object srcInternalMod {
  import typingsSlinky.preact.preactMod.ComponentClass

  type ComponentFactory[P] = (ComponentClass[P, js.Object]) | FunctionalComponent[P]
}
