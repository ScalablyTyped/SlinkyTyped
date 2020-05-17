package typingsSlinky.ionicons

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object stencilCoreMod {
  type FunctionalComponent[T] = js.Function3[
    /* props */ T, 
    /* children */ js.Array[typingsSlinky.ionicons.stencilCoreMod.VNode], 
    /* utils */ typingsSlinky.ionicons.stencilCoreMod.FunctionalUtilities, 
    typingsSlinky.ionicons.stencilCoreMod.VNode | js.Array[typingsSlinky.ionicons.stencilCoreMod.VNode]
  ]
  type RafCallback = js.Function1[/* timeStamp */ scala.Double, scala.Unit]
}
