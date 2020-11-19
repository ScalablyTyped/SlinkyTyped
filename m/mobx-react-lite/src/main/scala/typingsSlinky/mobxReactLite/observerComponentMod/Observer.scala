package typingsSlinky.mobxReactLite.observerComponentMod

import org.scalablytyped.runtime.StringDictionary
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobx-react-lite/dist/ObserverComponent", "Observer")
@js.native
object Observer extends js.Object {
  
  def apply(hasChildrenRender: IObserverProps): ReactElement | Null = js.native
  
  var displayName: String = js.native
  
  @js.native
  object propTypes extends js.Object {
    
    var children: js.Function5[
        /* props */ StringDictionary[js.Any], 
        /* key */ String, 
        /* componentName */ String, 
        /* location */ js.Any, 
        /* propFullName */ String, 
        js.Error | Null
      ] = js.native
    
    var render: js.Function5[
        /* props */ StringDictionary[js.Any], 
        /* key */ String, 
        /* componentName */ String, 
        /* location */ js.Any, 
        /* propFullName */ String, 
        js.Error | Null
      ] = js.native
  }
}
