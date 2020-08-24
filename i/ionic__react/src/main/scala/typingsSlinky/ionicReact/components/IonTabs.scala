package typingsSlinky.ionicReact.components

import org.scalajs.dom.raw.CustomEvent
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.ionicReact.ionTabsContextMod.IonTabsContextState
import typingsSlinky.ionicReact.ionTabsMod.ChildFunction
import typingsSlinky.ionicReact.ionTabsMod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object IonTabs {
  @JSImport("@ionic/react", "IonTabs")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.ionicReact.mod.IonTabs] {
    @scala.inline
    def childrenReactElement(value: ReactElement): this.type = set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def childrenFunction1(value: /* ionTabContext */ IonTabsContextState => ReactElement): this.type = set("children", js.Any.fromFunction1(value))
    @scala.inline
    def children(value: ChildFunction | ReactElement): this.type = set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def onIonTabsDidChange(value: /* event */ CustomEvent => Unit): this.type = set("onIonTabsDidChange", js.Any.fromFunction1(value))
    @scala.inline
    def onIonTabsWillChange(value: /* event */ CustomEvent => Unit): this.type = set("onIonTabsWillChange", js.Any.fromFunction1(value))
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: IonTabs.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

