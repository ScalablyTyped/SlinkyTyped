package typingsSlinky.ionicCore

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.ionicCore.animationInterfaceMod.AnimationBuilder
import typingsSlinky.ionicCore.anon.Ids
import typingsSlinky.ionicCore.interfaceMod.RouteChain
import typingsSlinky.ionicCore.interfaceMod.RouterDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domMod {
  
  @JSImport("@ionic/core/dist/types/components/router/utils/dom", "readNavState")
  @js.native
  def readNavState(): js.Promise[Ids] = js.native
  @JSImport("@ionic/core/dist/types/components/router/utils/dom", "readNavState")
  @js.native
  def readNavState(root: HTMLElement): js.Promise[Ids] = js.native
  
  @JSImport("@ionic/core/dist/types/components/router/utils/dom", "waitUntilNavNode")
  @js.native
  def waitUntilNavNode(): js.Promise[_] = js.native
  
  @JSImport("@ionic/core/dist/types/components/router/utils/dom", "writeNavState")
  @js.native
  def writeNavState(root: js.UndefOr[scala.Nothing], chain: RouteChain, direction: RouterDirection, index: Double): js.Promise[Boolean] = js.native
  @JSImport("@ionic/core/dist/types/components/router/utils/dom", "writeNavState")
  @js.native
  def writeNavState(
    root: js.UndefOr[scala.Nothing],
    chain: RouteChain,
    direction: RouterDirection,
    index: Double,
    changed: js.UndefOr[scala.Nothing],
    animation: AnimationBuilder
  ): js.Promise[Boolean] = js.native
  @JSImport("@ionic/core/dist/types/components/router/utils/dom", "writeNavState")
  @js.native
  def writeNavState(
    root: js.UndefOr[scala.Nothing],
    chain: RouteChain,
    direction: RouterDirection,
    index: Double,
    changed: Boolean
  ): js.Promise[Boolean] = js.native
  @JSImport("@ionic/core/dist/types/components/router/utils/dom", "writeNavState")
  @js.native
  def writeNavState(
    root: js.UndefOr[scala.Nothing],
    chain: RouteChain,
    direction: RouterDirection,
    index: Double,
    changed: Boolean,
    animation: AnimationBuilder
  ): js.Promise[Boolean] = js.native
  @JSImport("@ionic/core/dist/types/components/router/utils/dom", "writeNavState")
  @js.native
  def writeNavState(root: HTMLElement, chain: RouteChain, direction: RouterDirection, index: Double): js.Promise[Boolean] = js.native
  @JSImport("@ionic/core/dist/types/components/router/utils/dom", "writeNavState")
  @js.native
  def writeNavState(
    root: HTMLElement,
    chain: RouteChain,
    direction: RouterDirection,
    index: Double,
    changed: js.UndefOr[scala.Nothing],
    animation: AnimationBuilder
  ): js.Promise[Boolean] = js.native
  @JSImport("@ionic/core/dist/types/components/router/utils/dom", "writeNavState")
  @js.native
  def writeNavState(root: HTMLElement, chain: RouteChain, direction: RouterDirection, index: Double, changed: Boolean): js.Promise[Boolean] = js.native
  @JSImport("@ionic/core/dist/types/components/router/utils/dom", "writeNavState")
  @js.native
  def writeNavState(
    root: HTMLElement,
    chain: RouteChain,
    direction: RouterDirection,
    index: Double,
    changed: Boolean,
    animation: AnimationBuilder
  ): js.Promise[Boolean] = js.native
}
