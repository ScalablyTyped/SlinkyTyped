package typingsSlinky.ionicReact.components

import org.scalajs.dom.raw.CustomEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.ionicCore.mod.Color
import typingsSlinky.ionicReact.ionTabBarMod.Props
import typingsSlinky.ionicReact.ionicReactStrings.bottom
import typingsSlinky.ionicReact.ionicReactStrings.ios
import typingsSlinky.ionicReact.ionicReactStrings.md
import typingsSlinky.ionicReact.ionicReactStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object IonTabBar {
  @JSImport("@ionic/react", "IonTabBar")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def color(value: Color): this.type = set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def currentPath(value: String): this.type = set("currentPath", value.asInstanceOf[js.Any])
    @scala.inline
    def mode(value: ios | md): this.type = set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def onIonTabsDidChange(value: /* event */ CustomEvent => Unit): this.type = set("onIonTabsDidChange", js.Any.fromFunction1(value))
    @scala.inline
    def onIonTabsWillChange(value: /* event */ CustomEvent => Unit): this.type = set("onIonTabsWillChange", js.Any.fromFunction1(value))
    @scala.inline
    def selectedTab(value: String): this.type = set("selectedTab", value.asInstanceOf[js.Any])
    @scala.inline
    def slot(value: bottom | top): this.type = set("slot", value.asInstanceOf[js.Any])
    @scala.inline
    def translucent(value: Boolean): this.type = set("translucent", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: IonTabBar.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

