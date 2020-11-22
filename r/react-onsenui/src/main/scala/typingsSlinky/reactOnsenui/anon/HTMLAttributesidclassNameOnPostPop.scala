package typingsSlinky.reactOnsenui.anon

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactOnsenui.mod.Navigator
import typingsSlinky.reactOnsenui.reactOnsenuiStrings.force
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-onsenui.react-onsenui.HTMLAttributes<'id' | 'className' | 'style'> & {  routeConfig :any, renderPage (route : any, navigator : react-onsenui.react-onsenui.Navigator | undefined): react.react.<global>.JSX.Element,   swipeable :boolean | 'force' | undefined,   swipePop :(): void | undefined,   swipeTargetWidth :number | undefined,   animation :string | undefined, onPostPush (): void, onPostPop (): void} */
@js.native
trait HTMLAttributesidclassNameOnPostPop extends js.Object {
  
  var animation: js.UndefOr[String] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  def onPostPop(): Unit = js.native
  
  def onPostPush(): Unit = js.native
  
  def renderPage(route: js.Any): ReactElement = js.native
  def renderPage(route: js.Any, navigator: Navigator): ReactElement = js.native
  
  var routeConfig: js.Any = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var swipePop: js.UndefOr[js.Function0[Unit]] = js.native
  
  var swipeTargetWidth: js.UndefOr[Double] = js.native
  
  var swipeable: js.UndefOr[Boolean | force] = js.native
}
