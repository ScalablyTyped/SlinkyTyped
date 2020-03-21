package typingsSlinky.ionicCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object transitionMod {
  type IonicAnimationInterface = js.Function2[
    /* navEl */ org.scalajs.dom.raw.HTMLElement, 
    /* opts */ typingsSlinky.ionicCore.transitionMod.TransitionOptions, 
    typingsSlinky.ionicCore.animationInterfaceMod.Animation | js.Promise[typingsSlinky.ionicCore.animationInterfaceMod.Animation]
  ]
}
