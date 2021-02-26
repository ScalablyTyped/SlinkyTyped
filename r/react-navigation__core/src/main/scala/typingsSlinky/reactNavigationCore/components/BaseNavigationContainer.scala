package typingsSlinky.reactNavigationCore.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.reactNavigationCore.typesMod.NavigationContainerProps
import typingsSlinky.reactNavigationCore.typesMod.NavigationContainerRef
import typingsSlinky.reactNavigationRouters.typesMod.InitialState
import typingsSlinky.reactNavigationRouters.typesMod.NavigationAction
import typingsSlinky.reactNavigationRouters.typesMod.NavigationState
import typingsSlinky.reactNavigationRouters.typesMod.ParamListBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BaseNavigationContainer {
  
  @JSImport("@react-navigation/core", "BaseNavigationContainer")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, NavigationContainerRef] {
    
    @scala.inline
    def independent(value: Boolean): this.type = set("independent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def initialState(value: InitialState): this.type = set("initialState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onStateChange(value: /* state */ js.UndefOr[NavigationState[ParamListBase]] => Unit): this.type = set("onStateChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onUnhandledAction(value: /* action */ NavigationAction => Unit): this.type = set("onUnhandledAction", js.Any.fromFunction1(value))
  }
  
  implicit def make(companion: BaseNavigationContainer.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: NavigationContainerProps with RefAttributes[NavigationContainerRef]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
