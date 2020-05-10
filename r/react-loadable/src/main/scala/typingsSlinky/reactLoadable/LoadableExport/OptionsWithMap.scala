package typingsSlinky.reactLoadable.LoadableExport

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import slinky.core.ReactComponentClass
import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsWithMap[Props, Exports /* <: StringDictionary[js.Any] */] extends CommonOptions {
  /**
    * An object containing functions which return promises, which resolve to an object to be passed to `render` on success.
    */
  var loader: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof Exports ]: (): std.Promise<Exports[P]>}
    */ typingsSlinky.reactLoadable.reactLoadableStrings.OptionsWithMap with TopLevel[Exports] = js.native
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

object OptionsWithMap {
  @scala.inline
  def apply[Props, Exports](
    loader: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof Exports ]: (): std.Promise<Exports[P]>}
    */ typingsSlinky.reactLoadable.reactLoadableStrings.OptionsWithMap with TopLevel[Exports],
    loading: ReactComponentClass[LoadingComponentProps],
    render: (Exports, Props) => TagMod[Any]
  ): OptionsWithMap[Props, Exports] = {
    val __obj = js.Dynamic.literal(loader = loader.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], render = js.Any.fromFunction2(render))
    __obj.asInstanceOf[OptionsWithMap[Props, Exports]]
  }
  @scala.inline
  implicit class OptionsWithMapOps[Self[props, exports] <: OptionsWithMap[props, exports], Props, Exports] (val x: Self[Props, Exports]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Props, Exports] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Props, Exports]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Props, Exports]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Props, Exports]) with Other]
    @scala.inline
    def withLoader(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof Exports ]: (): std.Promise<Exports[P]>}
      */ typingsSlinky.reactLoadable.reactLoadableStrings.OptionsWithMap with TopLevel[Exports]
    ): Self[Props, Exports] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loader")(value.asInstanceOf[js.Any])
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

