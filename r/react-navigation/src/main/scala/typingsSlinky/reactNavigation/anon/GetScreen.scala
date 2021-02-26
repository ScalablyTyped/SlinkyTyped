package typingsSlinky.reactNavigation.anon

import typingsSlinky.reactNavigation.mod.NavigationScreenComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetScreen[Options, NavigationScreenPropType] extends StObject {
  
  def getScreen(): NavigationScreenComponent[Options, NavigationScreenPropType] = js.native
}
object GetScreen {
  
  @scala.inline
  def apply[Options, NavigationScreenPropType](getScreen: () => NavigationScreenComponent[Options, NavigationScreenPropType]): GetScreen[Options, NavigationScreenPropType] = {
    val __obj = js.Dynamic.literal(getScreen = js.Any.fromFunction0(getScreen))
    __obj.asInstanceOf[GetScreen[Options, NavigationScreenPropType]]
  }
  
  @scala.inline
  implicit class GetScreenMutableBuilder[Self <: GetScreen[_, _], Options, NavigationScreenPropType] (val x: Self with (GetScreen[Options, NavigationScreenPropType])) extends AnyVal {
    
    @scala.inline
    def setGetScreen(value: () => NavigationScreenComponent[Options, NavigationScreenPropType]): Self = StObject.set(x, "getScreen", js.Any.fromFunction0(value))
  }
}
