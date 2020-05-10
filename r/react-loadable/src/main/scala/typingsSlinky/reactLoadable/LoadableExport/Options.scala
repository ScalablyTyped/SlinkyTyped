package typingsSlinky.reactLoadable.LoadableExport

import slinky.core.ReactComponentClass
import slinky.core.TagMod
import typingsSlinky.reactLoadable.AnonDefault
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactLoadable.LoadableExport.OptionsWithoutRender[Props]
  - typingsSlinky.reactLoadable.LoadableExport.OptionsWithRender[Props, Exports]
*/
trait Options[Props, Exports /* <: js.Object */] extends js.Object

object Options {
  @scala.inline
  def OptionsWithoutRender[Props, Exports](
    loader: () => js.Promise[ReactComponentClass[Props] | AnonDefault[Props]],
    loading: ReactComponentClass[LoadingComponentProps]
  ): Options[Props, Exports] = {
    val __obj = js.Dynamic.literal(loader = js.Any.fromFunction0(loader), loading = loading.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options[Props, Exports]]
  }
  @scala.inline
  def OptionsWithRender[Props, Exports](
    loader: () => js.Promise[Exports],
    loading: ReactComponentClass[LoadingComponentProps],
    render: (Exports, Props) => TagMod[Any]
  ): Options[Props, Exports] = {
    val __obj = js.Dynamic.literal(loader = js.Any.fromFunction0(loader), loading = loading.asInstanceOf[js.Any], render = js.Any.fromFunction2(render))
    __obj.asInstanceOf[Options[Props, Exports]]
  }
}

