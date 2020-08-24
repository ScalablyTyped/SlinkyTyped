package typingsSlinky.reactRouterNavigation.components

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactRouter.mod.RouterProps
import typingsSlinky.reactRouterNavigation.mod.CardProps
import typingsSlinky.reactRouterNavigation.mod.CardSubViewProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Card {
  @JSImport("react-router-navigation", "Card")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def backButtonTintColor(value: String): this.type = set("backButtonTintColor", value.asInstanceOf[js.Any])
    @scala.inline
    def backButtonTitle(value: String): this.type = set("backButtonTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def childrenReactElement(value: ReactElement): this.type = set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def childrenFunction1(value: /* props */ RouterProps => ReactElement): this.type = set("children", js.Any.fromFunction1(value))
    @scala.inline
    def children(value: (js.Function1[/* props */ RouterProps, ReactElement]) | ReactElement): this.type = set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def component(value: ReactComponentClass[RouterProps]): this.type = set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def exact(value: Boolean): this.type = set("exact", value.asInstanceOf[js.Any])
    @scala.inline
    def hideBackButton(value: Boolean): this.type = set("hideBackButton", value.asInstanceOf[js.Any])
    @scala.inline
    def hideNavBar(value: Boolean): this.type = set("hideNavBar", value.asInstanceOf[js.Any])
    @scala.inline
    def navBarStyle(value: StyleProp[ViewStyle]): this.type = set("navBarStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def navBarStyleNull: this.type = set("navBarStyle", null)
    @scala.inline
    def path(value: String): this.type = set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def render(value: /* props */ RouterProps => ReactElement): this.type = set("render", js.Any.fromFunction1(value))
    @scala.inline
    def renderLeftButton(value: /* props */ CardSubViewProps => ReactElement): this.type = set("renderLeftButton", js.Any.fromFunction1(value))
    @scala.inline
    def renderNavBar(value: /* props */ CardSubViewProps => ReactElement): this.type = set("renderNavBar", js.Any.fromFunction1(value))
    @scala.inline
    def renderRightButton(value: /* props */ CardSubViewProps => ReactElement): this.type = set("renderRightButton", js.Any.fromFunction1(value))
    @scala.inline
    def renderTitle(value: /* props */ CardSubViewProps => ReactElement): this.type = set("renderTitle", js.Any.fromFunction1(value))
    @scala.inline
    def strict(value: Boolean): this.type = set("strict", value.asInstanceOf[js.Any])
    @scala.inline
    def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def titleStyle(value: StyleProp[TextStyle]): this.type = set("titleStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def titleStyleNull: this.type = set("titleStyle", null)
  }
  
  def withProps(p: CardProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Card.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

