package typingsSlinky.ionicCore

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.ionicCore.interfaceMod.RouteChain
import typingsSlinky.ionicCore.interfaceMod.RouteRedirect
import typingsSlinky.ionicCore.interfaceMod.RouteTree
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parserMod {
  
  @JSImport("@ionic/core/dist/types/components/router/utils/parser", "flattenRouterTree")
  @js.native
  def flattenRouterTree(nodes: RouteTree): js.Array[RouteChain] = js.native
  
  @JSImport("@ionic/core/dist/types/components/router/utils/parser", "readProp")
  @js.native
  def readProp(el: HTMLElement, prop: String): js.UndefOr[String | Null] = js.native
  
  @JSImport("@ionic/core/dist/types/components/router/utils/parser", "readRedirects")
  @js.native
  def readRedirects(root: Element): js.Array[RouteRedirect] = js.native
  
  @JSImport("@ionic/core/dist/types/components/router/utils/parser", "readRouteNodes")
  @js.native
  def readRouteNodes(root: Element): RouteTree = js.native
  @JSImport("@ionic/core/dist/types/components/router/utils/parser", "readRouteNodes")
  @js.native
  def readRouteNodes(root: Element, node: Element): RouteTree = js.native
  
  @JSImport("@ionic/core/dist/types/components/router/utils/parser", "readRoutes")
  @js.native
  def readRoutes(root: Element): js.Array[RouteChain] = js.native
}
