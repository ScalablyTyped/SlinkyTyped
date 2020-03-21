package typingsSlinky.ionicCore

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.ionicCore.animationInterfaceMod.Animation
import typingsSlinky.ionicCore.transitionMod.TransitionOptions
import typingsSlinky.std.ShadowRoot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/utils/transition/ios.transition", JSImport.Namespace)
@js.native
object iosTransitionMod extends js.Object {
  def iosTransitionAnimation(navEl: HTMLElement, opts: TransitionOptions): Animation = js.native
  def shadow[T /* <: Element */](el: T): ShadowRoot | T = js.native
}

