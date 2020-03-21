package typingsSlinky.ionicReact

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.ionicCore.interfaceMod.RouterDirection
import typingsSlinky.ionicReact.ionicReactStrings.none
import typingsSlinky.ionicReact.ionicReactStrings.pop
import typingsSlinky.ionicReact.ionicReactStrings.push
import typingsSlinky.ionicReact.ionicReactStrings.replace
import typingsSlinky.react.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/react/dist/types/contexts/NavContext", JSImport.Namespace)
@js.native
object navContextMod extends js.Object {
  @js.native
  trait NavContextState extends js.Object {
    var currentPath: js.UndefOr[String] = js.native
    def getPageManager(): js.Any = js.native
    def getStackManager(): js.Any = js.native
    def goBack(): Unit = js.native
    def goBack(defaultHref: String): Unit = js.native
    def hasIonicRouter(): Boolean = js.native
    def navigate(path: String): Unit = js.native
    def navigate(path: String, direction: RouterDirection): Unit = js.native
    def navigate(path: String, direction: none, ionRouteAction: pop): Unit = js.native
    def navigate(path: String, direction: none, ionRouteAction: push): Unit = js.native
    def navigate(path: String, direction: none, ionRouteAction: replace): Unit = js.native
    @JSName("navigate")
    def navigate_none(path: String, direction: none): Unit = js.native
    @JSName("navigate")
    def navigate_pop(path: String, direction: RouterDirection, ionRouteAction: pop): Unit = js.native
    @JSName("navigate")
    def navigate_push(path: String, direction: RouterDirection, ionRouteAction: push): Unit = js.native
    @JSName("navigate")
    def navigate_replace(path: String, direction: RouterDirection, ionRouteAction: replace): Unit = js.native
    def registerIonPage(page: HTMLElement): Unit = js.native
  }
  
  val NavContext: Context[NavContextState] = js.native
}

