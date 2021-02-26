package typingsSlinky.reactOnsenui.anon

import slinky.core.facade.ReactElement
import typingsSlinky.reactOnsenui.mod.Navigator
import typingsSlinky.reactOnsenui.mod.NavigatorAnimationTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimationOptions extends StObject {
  
  var animation: js.UndefOr[NavigatorAnimationTypes] = js.native
  
  var animationOptions: js.UndefOr[typingsSlinky.reactOnsenui.mod.AnimationOptions] = js.native
  
  var initialRoute: js.UndefOr[js.Any] = js.native
  
  var initialRouteStack: js.UndefOr[js.Array[String]] = js.native
  
  var onPostPop: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onPostPush: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onPrePop: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onPrePush: js.UndefOr[js.Function0[Unit]] = js.native
  
  def renderPage(route: js.Any): ReactElement = js.native
  def renderPage(route: js.Any, navigator: Navigator): ReactElement = js.native
}
