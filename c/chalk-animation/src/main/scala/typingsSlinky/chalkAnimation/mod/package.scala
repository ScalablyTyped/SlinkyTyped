package typingsSlinky.chalkAnimation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AnimationFn = js.Function2[
    /* text */ java.lang.String, 
    /* speed */ js.UndefOr[scala.Double], 
    typingsSlinky.chalkAnimation.mod.Animation
  ]
}
