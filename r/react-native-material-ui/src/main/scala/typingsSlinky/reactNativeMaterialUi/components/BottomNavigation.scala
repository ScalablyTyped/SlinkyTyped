package typingsSlinky.reactNativeMaterialUi.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNativeMaterialUi.anon.Active
import typingsSlinky.reactNativeMaterialUi.anon.`0`
import typingsSlinky.reactNativeMaterialUi.mod.BottomNavigationAction
import typingsSlinky.reactNativeMaterialUi.mod.BottomNavigationProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object BottomNavigation {
  @JSImport("react-native-material-ui", "BottomNavigation")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactNativeMaterialUi.mod.BottomNavigation] {
    @scala.inline
    def active(value: String): this.type = set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def hidden(value: Boolean): this.type = set("hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: `0`): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: BottomNavigationProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(children: ReactElement | js.Array[ReactElement]): Builder = {
    val __props = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[BottomNavigationProps]))
  }
  object Action {
    @JSImport("react-native-material-ui", "BottomNavigation.Action")
    @js.native
    object component extends js.Object
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, typingsSlinky.reactNativeMaterialUi.mod.BottomNavigation.Action] {
      @scala.inline
      def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
      @scala.inline
      def label(value: String): this.type = set("label", value.asInstanceOf[js.Any])
      @scala.inline
      def onPress(value: () => Unit): this.type = set("onPress", js.Any.fromFunction0(value))
      @scala.inline
      def style(value: Active): this.type = set("style", value.asInstanceOf[js.Any])
      @scala.inline
      def testID(value: String): this.type = set("testID", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: BottomNavigationAction): typingsSlinky.reactNativeMaterialUi.components.BottomNavigation.Action.Builder = new typingsSlinky.reactNativeMaterialUi.components.BottomNavigation.Action.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
    @scala.inline
    def apply(active: Boolean, icon: ReactElement | String): typingsSlinky.reactNativeMaterialUi.components.BottomNavigation.Action.Builder = {
        val __props = js.Dynamic.literal(active = active.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any])
        new typingsSlinky.reactNativeMaterialUi.components.BottomNavigation.Action.Builder(js.Array(this.component, __props.asInstanceOf[BottomNavigationAction]))
    }
  }
  
}

