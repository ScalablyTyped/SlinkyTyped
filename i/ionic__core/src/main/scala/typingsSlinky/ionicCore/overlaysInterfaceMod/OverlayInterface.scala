package typingsSlinky.ionicCore.overlaysInterfaceMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.ionicCore.mod.Mode
import typingsSlinky.ionicCore.oldAnimationAnimationInterfaceMod.Animation
import typingsSlinky.ionicCore.oldAnimationAnimationInterfaceMod.AnimationBuilder
import typingsSlinky.ionicCore.stencilCoreMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OverlayInterface extends js.Object {
  var animated: Boolean = js.native
  var animation: js.UndefOr[Animation | typingsSlinky.ionicCore.animationInterfaceMod.Animation] = js.native
  var didDismiss: EventEmitter[OverlayEventDetail[_]] = js.native
  var didPresent: EventEmitter[Unit] = js.native
  var el: HTMLElement = js.native
  var enterAnimation: js.UndefOr[AnimationBuilder] = js.native
  var keyboardClose: Boolean = js.native
  var leaveAnimation: js.UndefOr[AnimationBuilder] = js.native
  var mode: Mode = js.native
  var overlayIndex: Double = js.native
  var presented: Boolean = js.native
  var willDismiss: EventEmitter[OverlayEventDetail[_]] = js.native
  var willPresent: EventEmitter[Unit] = js.native
  def dismiss(): js.Promise[Boolean] = js.native
  def dismiss(data: js.Any): js.Promise[Boolean] = js.native
  def dismiss(data: js.Any, role: String): js.Promise[Boolean] = js.native
  def present(): js.Promise[Unit] = js.native
}

