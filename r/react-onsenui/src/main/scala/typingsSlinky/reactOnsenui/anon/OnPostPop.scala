package typingsSlinky.reactOnsenui.anon

import slinky.core.facade.ReactElement
import typingsSlinky.reactOnsenui.mod.Navigator
import typingsSlinky.reactOnsenui.reactOnsenuiStrings.force
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnPostPop extends StObject {
  
  var animation: js.UndefOr[String] = js.native
  
  def onPostPop(): Unit = js.native
  
  def onPostPush(): Unit = js.native
  
  def renderPage(route: js.Any): ReactElement = js.native
  def renderPage(route: js.Any, navigator: Navigator): ReactElement = js.native
  
  var routeConfig: js.Any = js.native
  
  var swipePop: js.UndefOr[js.Function0[Unit]] = js.native
  
  var swipeTargetWidth: js.UndefOr[Double] = js.native
  
  var swipeable: js.UndefOr[Boolean | force] = js.native
}
