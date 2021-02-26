package typingsSlinky.reactNavigation.anon

import typingsSlinky.reactNavigation.mod.NavigationComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Screen[Options, NavigationScreenPropType] extends StObject {
  
  var screen: NavigationComponent[Options, NavigationScreenPropType] = js.native
}
object Screen {
  
  @scala.inline
  def apply[Options, NavigationScreenPropType](screen: NavigationComponent[Options, NavigationScreenPropType]): Screen[Options, NavigationScreenPropType] = {
    val __obj = js.Dynamic.literal(screen = screen.asInstanceOf[js.Any])
    __obj.asInstanceOf[Screen[Options, NavigationScreenPropType]]
  }
  
  @scala.inline
  implicit class ScreenMutableBuilder[Self <: Screen[_, _], Options, NavigationScreenPropType] (val x: Self with (Screen[Options, NavigationScreenPropType])) extends AnyVal {
    
    @scala.inline
    def setScreen(value: NavigationComponent[Options, NavigationScreenPropType]): Self = StObject.set(x, "screen", value.asInstanceOf[js.Any])
  }
}
