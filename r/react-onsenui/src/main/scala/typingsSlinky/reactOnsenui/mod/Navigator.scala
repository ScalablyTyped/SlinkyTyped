package typingsSlinky.reactOnsenui.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.reactOnsenui.anon.HTMLAttributesidclassNameAnimationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-onsenui", "Navigator")
@js.native
class Navigator ()
  extends typingsSlinky.react.mod.Component[HTMLAttributesidclassNameAnimationOptions, js.Any, js.Any] {
  
  var pages: js.Array[_] = js.native
  
  def popPage(): js.Promise[HTMLElement] = js.native
  def popPage(options: PageTransitionOptions): js.Promise[HTMLElement] = js.native
  
  def pushPage(route: js.Any): js.Promise[HTMLElement] = js.native
  def pushPage(route: js.Any, options: PageTransitionOptions): js.Promise[HTMLElement] = js.native
  
  def resetPage(route: js.Any): js.Promise[HTMLElement] = js.native
  def resetPage(route: js.Any, options: PageTransitionOptions): js.Promise[HTMLElement] = js.native
  
  def resetPageStack(route: js.Any): js.Promise[HTMLElement] = js.native
  def resetPageStack(route: js.Any, options: PageTransitionOptions): js.Promise[HTMLElement] = js.native
  
  var routes: js.Array[_] = js.native
}
