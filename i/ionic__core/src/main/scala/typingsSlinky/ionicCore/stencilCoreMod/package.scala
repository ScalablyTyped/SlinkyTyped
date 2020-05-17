package typingsSlinky.ionicCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object stencilCoreMod {
  type FunctionalComponent[T] = js.Function3[
    /* props */ T, 
    /* children */ js.Array[typingsSlinky.ionicCore.stencilCoreMod.VNode], 
    /* utils */ typingsSlinky.ionicCore.stencilCoreMod.FunctionalUtilities, 
    typingsSlinky.ionicCore.stencilCoreMod.VNode | js.Array[typingsSlinky.ionicCore.stencilCoreMod.VNode]
  ]
  type RafCallback = js.Function1[/* timeStamp */ scala.Double, scala.Unit]
}
