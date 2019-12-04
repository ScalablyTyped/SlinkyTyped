package typingsSlinky.reactDashNavigationDashStack

import typingsSlinky.react.reactMod.Component
import typingsSlinky.react.reactMod.ComponentProps
import typingsSlinky.react.reactMod.Context
import typingsSlinky.react.reactMod.ContextType
import typingsSlinky.reactDashNavigation.reactDashNavigationMod.SupportedThemes
import typingsSlinky.reactDashNavigationDashStack.libTypescriptViewsHeaderHeaderTitleMod.HeaderTitle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-navigation-stack/lib/typescript/views/Header/HeaderTitle", JSImport.Namespace)
@js.native
object libTypescriptViewsHeaderHeaderTitleMod extends js.Object {
  @js.native
  trait HeaderTitle
    extends Component[ComponentProps[js.Any], js.Object, js.Any] {
    @JSName("context")
    var context_HeaderTitle: ContextType[Context[SupportedThemes]] = js.native
  }
  
  @js.native
  class default () extends HeaderTitle
  
  /* static members */
  @js.native
  object default extends js.Object {
    var contextType: Context[SupportedThemes] = js.native
  }
  
}

