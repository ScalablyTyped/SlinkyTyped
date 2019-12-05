package typingsSlinky.atIonicCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distTypesUtilsTransitionMod {
  import org.scalajs.dom.raw.HTMLElement
  import typingsSlinky.atIonicCore.distTypesUtilsAnimationAnimationDashInterfaceMod.Animation

  type IonicAnimationInterface = js.Function2[
    /* navEl */ HTMLElement, 
    /* opts */ TransitionOptions, 
    Animation | js.Promise[Animation]
  ]
}
