package typingsSlinky.reactLoadable.LoadableExport

import slinky.core.ReactComponentClass
import typingsSlinky.reactLoadable.AnonDefault
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsWithoutRender[Props]
  extends CommonOptions
     with Options[Props, js.Any] {
  /**
    * Function returning a promise which returns a React component displayed on success.
    *
    * Resulting React component receives all the props passed to the generated component.
    */
  def loader(): js.Promise[ReactComponentClass[Props] | AnonDefault[Props]] = js.native
}

object OptionsWithoutRender {
  @scala.inline
  def apply[Props](
    loader: () => js.Promise[ReactComponentClass[Props] | AnonDefault[Props]],
    loading: ReactComponentClass[LoadingComponentProps]
  ): OptionsWithoutRender[Props] = {
    val __obj = js.Dynamic.literal(loader = js.Any.fromFunction0(loader), loading = loading.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsWithoutRender[Props]]
  }
  @scala.inline
  implicit class OptionsWithoutRenderOps[Self[props] <: OptionsWithoutRender[props], Props] (val x: Self[Props]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Props] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Props]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Props] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Props] with Other]
    @scala.inline
    def withLoader(value: () => js.Promise[ReactComponentClass[Props] | AnonDefault[Props]]): Self[Props] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loader")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

