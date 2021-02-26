package typingsSlinky.reactNavigation.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DrawerNavigationState extends NavigationState {
  
  var isDrawerOpen: Boolean = js.native
}
object DrawerNavigationState {
  
  @scala.inline
  def apply(
    index: Double,
    isDrawerOpen: Boolean,
    isTransitioning: Boolean,
    key: String,
    routes: js.Array[NavigationRoute[NavigationParams]]
  ): DrawerNavigationState = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], isDrawerOpen = isDrawerOpen.asInstanceOf[js.Any], isTransitioning = isTransitioning.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawerNavigationState]
  }
  
  @scala.inline
  implicit class DrawerNavigationStateMutableBuilder[Self <: DrawerNavigationState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsDrawerOpen(value: Boolean): Self = StObject.set(x, "isDrawerOpen", value.asInstanceOf[js.Any])
  }
}
