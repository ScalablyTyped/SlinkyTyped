package typingsSlinky.ionicCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object stencilCoreMod {
  type ChildType = typingsSlinky.ionicCore.stencilCoreMod.VNode | scala.Double | java.lang.String
  type FunctionalComponent[T] = js.Function3[
    /* props */ T, 
    /* children */ js.Array[typingsSlinky.ionicCore.stencilCoreMod.VNode], 
    /* utils */ typingsSlinky.ionicCore.stencilCoreMod.FunctionalUtilities, 
    typingsSlinky.ionicCore.stencilCoreMod.VNode | js.Array[typingsSlinky.ionicCore.stencilCoreMod.VNode]
  ]
  type PropsType = typingsSlinky.ionicCore.stencilCoreMod.VNodeProdData | scala.Double | java.lang.String | scala.Null
  type RafCallback = js.Function1[/* timeStamp */ scala.Double, scala.Unit]
}
