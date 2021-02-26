package typingsSlinky.mobxReactLite.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.mobxReactLite.observerComponentMod.IObserverProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Observer {
  
  @JSImport("mobx-react-lite/dist/ObserverComponent", "Observer")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def children(value: () => ReactElement | Null): this.type = set("children", js.Any.fromFunction0(value))
    
    @scala.inline
    def render(value: () => ReactElement | Null): this.type = set("render", js.Any.fromFunction0(value))
  }
  
  implicit def make(companion: Observer.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: IObserverProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
