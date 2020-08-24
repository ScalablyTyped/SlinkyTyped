package typingsSlinky.ionicCore

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.ionicCore.interfaceMod.RouteChain
import typingsSlinky.ionicCore.interfaceMod.RouteRedirect
import typingsSlinky.ionicCore.interfaceMod.RouteTree
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/router/utils/parser", JSImport.Namespace)
@js.native
object parserMod extends js.Object {
  def flattenRouterTree(nodes: RouteTree): js.Array[RouteChain] = js.native
  def readProp(el: HTMLElement, prop: String): js.UndefOr[String | Null] = js.native
  def readRedirects(root: Element): js.Array[RouteRedirect] = js.native
  def readRouteNodes(root: Element): RouteTree = js.native
  def readRouteNodes(root: Element, node: Element): RouteTree = js.native
  def readRoutes(root: Element): js.Array[RouteChain] = js.native
}

