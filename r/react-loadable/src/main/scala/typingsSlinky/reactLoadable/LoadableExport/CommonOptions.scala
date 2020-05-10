package typingsSlinky.reactLoadable.LoadableExport

import slinky.core.ReactComponentClass
import typingsSlinky.reactLoadable.reactLoadableBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommonOptions extends js.Object {
  /**
    * Defaults to 200, in milliseconds.
    *
    * Only show the loading component if the loader() has taken this long to succeed or error.
    */
  var delay: js.UndefOr[Double | `false` | Null] = js.native
  /**
    * React component displayed after delay until loader() succeeds. Also responsible for displaying errors.
    *
    * If you don't want to render anything you can pass a function that returns null
    * (this is considered a valid React component).
    */
  var loading: ReactComponentClass[LoadingComponentProps] = js.native
  /**
    * Optional array of module paths that `Loadable.Capture`'s `report` function will be applied on during
    * server-side rendering. This helps the server know which modules were imported/used during SSR.
    * ```ts
    * Loadable({
    *   loader: () => import('./my-component'),
    *   modules: ['./my-component'],
    * });
    * ```
    */
  var modules: js.UndefOr[js.Array[String]] = js.native
  /**
    * Disabled by default.
    *
    * After the specified time in milliseconds passes, the component's `timedOut` prop will be set to true.
    */
  var timeout: js.UndefOr[Double | `false` | Null] = js.native
  /**
    * An optional function which returns an array of Webpack module ids which you can get
    * with require.resolveWeak. This is used by the client (inside `Loadable.preloadReady`) to
    * guarantee each webpack module is preloaded before the first client render.
    * ```ts
    * Loadable({
    *  loader: () => import('./Foo'),
    *  webpack: () => [require.resolveWeak('./Foo')],
    * });
    * ```
    */
  var webpack: js.UndefOr[js.Function0[js.Array[String | Double]]] = js.native
}

object CommonOptions {
  @scala.inline
  def apply(loading: ReactComponentClass[LoadingComponentProps]): CommonOptions = {
    val __obj = js.Dynamic.literal(loading = loading.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonOptions]
  }
  @scala.inline
  implicit class CommonOptionsOps[Self <: CommonOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLoading(value: ReactComponentClass[LoadingComponentProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelay(value: Double | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(js.undefined)
        ret
    }
    @scala.inline
    def withDelayNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(null)
        ret
    }
    @scala.inline
    def withModules(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modules")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeoutNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(null)
        ret
    }
    @scala.inline
    def withWebpack(value: () => js.Array[String | Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webpack")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutWebpack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webpack")(js.undefined)
        ret
    }
  }
  
}

