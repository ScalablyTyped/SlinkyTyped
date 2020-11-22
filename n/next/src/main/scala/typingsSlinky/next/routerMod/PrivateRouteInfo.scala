package typingsSlinky.next.routerMod

import slinky.core.ReactComponentClass
import typingsSlinky.next.nextBooleans.`true`
import typingsSlinky.next.pageLoaderMod.StyleSheetTuple
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.next.anon.OmitCompletePrivateRouteI
  - typingsSlinky.next.routerMod.CompletePrivateRouteInfo
*/
trait PrivateRouteInfo extends js.Object
object PrivateRouteInfo {
  
  @scala.inline
  def OmitCompletePrivateRouteI(Component: ReactComponentClass[js.Object], initial: `true`): PrivateRouteInfo = {
    val __obj = js.Dynamic.literal(Component = Component.asInstanceOf[js.Any], initial = initial.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrivateRouteInfo]
  }
  
  @scala.inline
  def CompletePrivateRouteInfo(Component: ReactComponentClass[js.Object], styleSheets: js.Array[StyleSheetTuple]): PrivateRouteInfo = {
    val __obj = js.Dynamic.literal(Component = Component.asInstanceOf[js.Any], styleSheets = styleSheets.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrivateRouteInfo]
  }
}
