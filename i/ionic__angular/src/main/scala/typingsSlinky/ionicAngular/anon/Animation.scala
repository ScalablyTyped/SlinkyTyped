package typingsSlinky.ionicAngular.anon

import typingsSlinky.ionicCore.animationInterfaceMod.AnimationBuilder
import typingsSlinky.ionicCore.interfaceMod.RouterDirection
import typingsSlinky.ionicCore.navInterfaceMod.NavDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Animation extends js.Object {
  var animation: NavDirection = js.native
  @JSName("animationBuilder")
  var animationBuilder_Original: AnimationBuilder = js.native
  var direction: RouterDirection = js.native
  def animationBuilder(baseEl: js.Any): typingsSlinky.ionicCore.animationInterfaceMod.Animation = js.native
  def animationBuilder(baseEl: js.Any, opts: js.Any): typingsSlinky.ionicCore.animationInterfaceMod.Animation = js.native
}

