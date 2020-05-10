package typingsSlinky.reactLoadable.LoadableExport

import slinky.core.ReactComponentClass
import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsWithRender[Props, Exports /* <: js.Object */]
  extends CommonOptions
     with Options[Props, Exports] {
  /**
    * Function returning a promise which returns an object to be passed to `render` on success.
    */
  def loader(): js.Promise[Exports] = js.native
  /**
    * If you want to customize what gets rendered from your loader you can also pass `render`.
    *
    * Note: If you want to load multiple resources at once, you can also use `Loadable.Map`.
    *
    * ```ts
    * Loadable({
    *     // ...
    *     render(loaded, props) {
    *         const Component = loaded.default;
    *         return <Component {...props} />
    *     }
    * });
    * ```
    */
  def render(loaded: Exports, props: Props): TagMod[Any] = js.native
}

object OptionsWithRender {
  @scala.inline
  def apply[Props, Exports](
    loader: () => js.Promise[Exports],
    loading: ReactComponentClass[LoadingComponentProps],
    render: (Exports, Props) => TagMod[Any]
  ): OptionsWithRender[Props, Exports] = {
    val __obj = js.Dynamic.literal(loader = js.Any.fromFunction0(loader), loading = loading.asInstanceOf[js.Any], render = js.Any.fromFunction2(render))
    __obj.asInstanceOf[OptionsWithRender[Props, Exports]]
  }
  @scala.inline
  implicit class OptionsWithRenderOps[Self[props, exports] <: OptionsWithRender[props, exports], Props, Exports] (val x: Self[Props, Exports]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Props, Exports] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Props, Exports]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Props, Exports]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Props, Exports]) with Other]
    @scala.inline
    def withLoader(value: () => js.Promise[Exports]): Self[Props, Exports] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loader")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRender(value: (Exports, Props) => TagMod[Any]): Self[Props, Exports] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

