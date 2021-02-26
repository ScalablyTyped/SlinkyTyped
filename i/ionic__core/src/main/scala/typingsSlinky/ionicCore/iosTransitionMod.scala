package typingsSlinky.ionicCore

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.ionicCore.animationInterfaceMod.Animation
import typingsSlinky.ionicCore.transitionMod.TransitionOptions
import typingsSlinky.std.ShadowRoot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iosTransitionMod {
  
  @JSImport("@ionic/core/dist/types/utils/transition/ios.transition", "iosTransitionAnimation")
  @js.native
  def iosTransitionAnimation(navEl: HTMLElement, opts: TransitionOptions): Animation = js.native
  
  @JSImport("@ionic/core/dist/types/utils/transition/ios.transition", "shadow")
  @js.native
  def shadow[T /* <: Element */](el: T): ShadowRoot | T = js.native
}
