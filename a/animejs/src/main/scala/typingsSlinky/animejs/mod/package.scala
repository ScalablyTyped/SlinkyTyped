package typingsSlinky.animejs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AnimeCallbackFunction = js.Function1[/* anim */ typingsSlinky.animejs.mod.AnimeInstance, scala.Unit]
  type CustomEasingFunction = js.Function3[
    /* el */ org.scalajs.dom.raw.HTMLElement, 
    /* index */ scala.Double, 
    /* length */ scala.Double, 
    js.Function1[/* time */ scala.Double, scala.Double]
  ]
  type FunctionBasedParameter = js.Function3[
    /* element */ org.scalajs.dom.raw.HTMLElement, 
    /* index */ scala.Double, 
    /* length */ scala.Double, 
    scala.Double
  ]
}
