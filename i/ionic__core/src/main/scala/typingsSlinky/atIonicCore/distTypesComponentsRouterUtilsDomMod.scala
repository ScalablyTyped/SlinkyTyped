package typingsSlinky.atIonicCore

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.atIonicCore.distTypesComponentsRouterUtilsInterfaceMod.RouteEntry
import typingsSlinky.atIonicCore.distTypesComponentsRouterUtilsInterfaceMod.RouterDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/router/utils/dom", JSImport.Namespace)
@js.native
object distTypesComponentsRouterUtilsDomMod extends js.Object {
  def readNavState(): js.Promise[Anon_Ids] = js.native
  def readNavState(root: HTMLElement): js.Promise[Anon_Ids] = js.native
  def waitUntilNavNode(): js.Promise[_] = js.native
  def writeNavState(
    root: js.UndefOr[scala.Nothing],
    chain: js.Array[RouteEntry],
    direction: RouterDirection,
    index: Double
  ): js.Promise[Boolean] = js.native
  def writeNavState(
    root: js.UndefOr[scala.Nothing],
    chain: js.Array[RouteEntry],
    direction: RouterDirection,
    index: Double,
    changed: Boolean
  ): js.Promise[Boolean] = js.native
  def writeNavState(
    root: typingsSlinky.std.HTMLElement,
    chain: js.Array[RouteEntry],
    direction: RouterDirection,
    index: Double
  ): js.Promise[Boolean] = js.native
  def writeNavState(
    root: typingsSlinky.std.HTMLElement,
    chain: js.Array[RouteEntry],
    direction: RouterDirection,
    index: Double,
    changed: Boolean
  ): js.Promise[Boolean] = js.native
}

