package typingsSlinky.reactLoadable.LoadableExport

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.reactLoadable.anon.Default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactLoadable.LoadableExport.OptionsWithoutRender[Props]
  - typingsSlinky.reactLoadable.LoadableExport.OptionsWithRender[Props, Exports]
*/
trait Options[Props, Exports /* <: js.Object */] extends js.Object
object Options {
  
  @scala.inline
  def OptionsWithoutRender[Props, Exports /* <: js.Object */](
    loader: () => js.Promise[ReactComponentClass[Props] | Default[Props]],
    loading: ReactComponentClass[LoadingComponentProps]
  ): Options[Props, Exports] = {
    val __obj = js.Dynamic.literal(loader = js.Any.fromFunction0(loader), loading = loading.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options[Props, Exports]]
  }
  
  @scala.inline
  def OptionsWithRender[Props, Exports /* <: js.Object */](
    loader: () => js.Promise[Exports],
    loading: ReactComponentClass[LoadingComponentProps],
    render: (Exports, Props) => ReactElement
  ): Options[Props, Exports] = {
    val __obj = js.Dynamic.literal(loader = js.Any.fromFunction0(loader), loading = loading.asInstanceOf[js.Any], render = js.Any.fromFunction2(render))
    __obj.asInstanceOf[Options[Props, Exports]]
  }
}
