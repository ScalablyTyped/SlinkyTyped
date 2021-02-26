package typingsSlinky.reactNavigationCore.anon

import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Component extends StObject {
  
  var children: js.UndefOr[scala.Nothing] = js.native
  
  var component: js.UndefOr[scala.Nothing] = js.native
  
  /**
    * Lazily get a React component to render for this screen.
    */
  def getComponent(): ReactComponentClass[_] = js.native
}
object Component {
  
  @scala.inline
  def apply(getComponent: () => ReactComponentClass[_]): Component = {
    val __obj = js.Dynamic.literal(getComponent = js.Any.fromFunction0(getComponent))
    __obj.asInstanceOf[Component]
  }
  
  @scala.inline
  implicit class ComponentMutableBuilder[Self <: Component] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetComponent(value: () => ReactComponentClass[_]): Self = StObject.set(x, "getComponent", js.Any.fromFunction0(value))
  }
}
