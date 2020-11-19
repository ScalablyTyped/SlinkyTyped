package typingsSlinky.reactRouterNavigation.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactRouterNavigation.mod.CardSubViewProps
import typingsSlinky.reactRouterNavigation.mod.NavigationComponentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Navigation {
  
  @JSImport("react-router-navigation", "Navigation")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactRouterNavigation.mod.Navigation] {
    
    @scala.inline
    def backButtonTintColor(value: String): this.type = set("backButtonTintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def backButtonTitle(value: String): this.type = set("backButtonTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def cardStyle(value: StyleProp[ViewStyle]): this.type = set("cardStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def cardStyleNull: this.type = set("cardStyle", null)
    
    @scala.inline
    def childrenVarargs(value: ReactElement*): this.type = set("children", js.Array(value :_*))
    
    @scala.inline
    def children(value: js.Array[ReactElement]): this.type = set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def configureTransition(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NavigationTransitionProps */ /* transitionProps */ js.Any, /* prevTransitionProps */ js.UndefOr[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NavigationTransitionProps */ js.Any
        ]) => /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NavigationTransitionSpec */ _
    ): this.type = set("configureTransition", js.Any.fromFunction2(value))
    
    @scala.inline
    def hideBackButton(value: Boolean): this.type = set("hideBackButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hideNavBar(value: Boolean): this.type = set("hideNavBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def navBarStyle(value: StyleProp[ViewStyle]): this.type = set("navBarStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def navBarStyleNull: this.type = set("navBarStyle", null)
    
    @scala.inline
    def onTransitionEnd(value: /* repeated */ js.Any => Unit): this.type = set("onTransitionEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTransitionStart(value: /* repeated */ js.Any => Unit): this.type = set("onTransitionStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def renderLeftButton(value: /* props */ CardSubViewProps => ReactElement): this.type = set("renderLeftButton", js.Any.fromFunction1(value))
    
    @scala.inline
    def renderNavBar(value: /* props */ CardSubViewProps => ReactElement): this.type = set("renderNavBar", js.Any.fromFunction1(value))
    
    @scala.inline
    def renderRightButton(value: /* props */ CardSubViewProps => ReactElement): this.type = set("renderRightButton", js.Any.fromFunction1(value))
    
    @scala.inline
    def renderTitle(value: /* props */ CardSubViewProps => ReactElement): this.type = set("renderTitle", js.Any.fromFunction1(value))
    
    @scala.inline
    def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def titleStyle(value: StyleProp[TextStyle]): this.type = set("titleStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def titleStyleNull: this.type = set("titleStyle", null)
  }
  
  def withProps(p: NavigationComponentProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Navigation.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
