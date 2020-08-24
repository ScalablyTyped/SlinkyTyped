package typingsSlinky.ionicReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.ionicCore.tabBarInterfaceMod.TabButtonLayout
import typingsSlinky.ionicReact.ionTabButtonMod.Props
import typingsSlinky.ionicReact.ionicReactStrings.ios
import typingsSlinky.ionicReact.ionicReactStrings.md
import typingsSlinky.ionicReact.routerOptionsMod.RouterOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object IonTabButton {
  @JSImport("@ionic/react", "IonTabButton")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.ionicReact.mod.IonTabButton] {
    @scala.inline
    def `class`(value: String): this.type = set("class", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def download(value: String): this.type = set("download", value.asInstanceOf[js.Any])
    @scala.inline
    def href(value: String): this.type = set("href", value.asInstanceOf[js.Any])
    @scala.inline
    def layout(value: TabButtonLayout): this.type = set("layout", value.asInstanceOf[js.Any])
    @scala.inline
    def mode(value: ios | md): this.type = set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def onClick(value: /* e */ js.Any => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def rel(value: String): this.type = set("rel", value.asInstanceOf[js.Any])
    @scala.inline
    def routerOptions(value: RouterOptions): this.type = set("routerOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def selected(value: Boolean): this.type = set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def tab(value: String): this.type = set("tab", value.asInstanceOf[js.Any])
    @scala.inline
    def target(value: String): this.type = set("target", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: IonTabButton.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

