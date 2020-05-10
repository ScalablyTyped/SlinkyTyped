package typingsSlinky.reactNativeMaterialUi.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNativeMaterialUi.AnonActive
import typingsSlinky.reactNativeMaterialUi.mod.BottomNavigation.Action
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object BottomNavigationAction {
  @JSImport("react-native-material-ui", "BottomNavigation.Action")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, Action] {
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def label(value: String): this.type = set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def onPress(value: () => Unit): this.type = set("onPress", js.Any.fromFunction0(value))
    @scala.inline
    def style(value: AnonActive): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def testID(value: String): this.type = set("testID", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: typingsSlinky.reactNativeMaterialUi.mod.BottomNavigationAction): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(active: Boolean, icon: ReactElement | String): Builder = {
    val __props = js.Dynamic.literal(active = active.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[typingsSlinky.reactNativeMaterialUi.mod.BottomNavigationAction]))
  }
}

