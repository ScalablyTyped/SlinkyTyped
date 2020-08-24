package typingsSlinky.ionicCore

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.ionicCore.animationInterfaceMod.AnimationBuilder
import typingsSlinky.ionicCore.anon.Ids
import typingsSlinky.ionicCore.interfaceMod.RouteChain
import typingsSlinky.ionicCore.interfaceMod.RouterDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/router/utils/dom", JSImport.Namespace)
@js.native
object domMod extends js.Object {
  def readNavState(): js.Promise[Ids] = js.native
  def readNavState(root: HTMLElement): js.Promise[Ids] = js.native
  def waitUntilNavNode(): js.Promise[_] = js.native
  def writeNavState(root: js.UndefOr[scala.Nothing], chain: RouteChain, direction: RouterDirection, index: Double): js.Promise[Boolean] = js.native
  def writeNavState(
    root: js.UndefOr[scala.Nothing],
    chain: RouteChain,
    direction: RouterDirection,
    index: Double,
    changed: js.UndefOr[scala.Nothing],
    animation: AnimationBuilder
  ): js.Promise[Boolean] = js.native
  def writeNavState(
    root: js.UndefOr[scala.Nothing],
    chain: RouteChain,
    direction: RouterDirection,
    index: Double,
    changed: Boolean
  ): js.Promise[Boolean] = js.native
  def writeNavState(
    root: js.UndefOr[scala.Nothing],
    chain: RouteChain,
    direction: RouterDirection,
    index: Double,
    changed: Boolean,
    animation: AnimationBuilder
  ): js.Promise[Boolean] = js.native
  def writeNavState(root: HTMLElement, chain: RouteChain, direction: RouterDirection, index: Double): js.Promise[Boolean] = js.native
  def writeNavState(
    root: HTMLElement,
    chain: RouteChain,
    direction: RouterDirection,
    index: Double,
    changed: js.UndefOr[scala.Nothing],
    animation: AnimationBuilder
  ): js.Promise[Boolean] = js.native
  def writeNavState(root: HTMLElement, chain: RouteChain, direction: RouterDirection, index: Double, changed: Boolean): js.Promise[Boolean] = js.native
  def writeNavState(
    root: HTMLElement,
    chain: RouteChain,
    direction: RouterDirection,
    index: Double,
    changed: Boolean,
    animation: AnimationBuilder
  ): js.Promise[Boolean] = js.native
}

