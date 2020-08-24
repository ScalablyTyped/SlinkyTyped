package typingsSlinky.reactLoadableVisibility

import typingsSlinky.loadableComponent.anon.FnCall
import typingsSlinky.loadableComponent.mod.DefaultComponent
import typingsSlinky.loadableComponent.mod.LoadableComponent
import typingsSlinky.loadableComponent.mod.OptionsWithResolver
import typingsSlinky.loadableComponent.mod.OptionsWithoutResolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-loadable-visibility/loadable-components", JSImport.Namespace)
@js.native
object loadableComponentsMod extends js.Object {
  @js.native
  object default extends js.Object {
    var lib: FnCall = js.native
    def apply[Props](loadFn: js.Function1[/* props */ Props, js.Promise[DefaultComponent[Props]]]): LoadableComponent[Props] = js.native
    def apply[Props](
      loadFn: js.Function1[/* props */ Props, js.Promise[DefaultComponent[Props]]],
      options: OptionsWithoutResolver[Props]
    ): LoadableComponent[Props] = js.native
    def apply[Props, Module](
      loadFn: js.Function1[/* props */ Props, js.Promise[Module]],
      options: OptionsWithResolver[Props, Module]
    ): LoadableComponent[Props] = js.native
  }
  
}

