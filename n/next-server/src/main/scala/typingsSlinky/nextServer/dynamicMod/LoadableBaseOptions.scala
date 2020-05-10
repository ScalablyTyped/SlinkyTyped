package typingsSlinky.nextServer.dynamicMod

import slinky.core.facade.ReactElement
import typingsSlinky.nextServer.AnonError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined next-server.next-server/dist/lib/dynamic.LoadableGeneratedOptions & {loading ? (hasErrorIsLoadingPastDelay : {  error ? :std.Error | null,   isLoading ? :boolean,   pastDelay ? :boolean,   timedOut ? :boolean}): react.react._Global_.JSX.Element | null,   loader ? :next-server.next-server/dist/lib/dynamic.Loader<P> | next-server.next-server/dist/lib/dynamic.LoaderMap,   loadableGenerated ? :next-server.next-server/dist/lib/dynamic.LoadableGeneratedOptions,   ssr ? :boolean} */
@js.native
trait LoadableBaseOptions[P] extends js.Object {
  var loadableGenerated: js.UndefOr[LoadableGeneratedOptions] = js.native
  var loader: js.UndefOr[Loader[P] | LoaderMap] = js.native
  var loading: js.UndefOr[js.Function1[/* hasErrorIsLoadingPastDelay */ AnonError, ReactElement | Null]] = js.native
  var modules: js.UndefOr[js.Function0[LoaderMap]] = js.native
  var ssr: js.UndefOr[Boolean] = js.native
  var webpack: js.UndefOr[js.Function0[_]] = js.native
}

object LoadableBaseOptions {
  @scala.inline
  def apply[P](): LoadableBaseOptions[P] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadableBaseOptions[P]]
  }
  @scala.inline
  implicit class LoadableBaseOptionsOps[Self[p] <: LoadableBaseOptions[p], P] (val x: Self[P]) extends AnyVal {
    @scala.inline
    def duplicate: Self[P] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[P]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[P] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[P] with Other]
    @scala.inline
    def withLoadableGenerated(value: LoadableGeneratedOptions): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadableGenerated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadableGenerated: Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadableGenerated")(js.undefined)
        ret
    }
    @scala.inline
    def withLoaderFunction0(value: () => LoaderComponent[P]): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loader")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLoader(value: Loader[P] | LoaderMap): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoader: Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loader")(js.undefined)
        ret
    }
    @scala.inline
    def withLoading(value: /* hasErrorIsLoadingPastDelay */ AnonError => ReactElement | Null): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loading")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLoading: Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loading")(js.undefined)
        ret
    }
    @scala.inline
    def withModules(value: () => LoaderMap): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modules")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutModules: Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modules")(js.undefined)
        ret
    }
    @scala.inline
    def withSsr(value: Boolean): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSsr: Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssr")(js.undefined)
        ret
    }
    @scala.inline
    def withWebpack(value: () => _): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webpack")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutWebpack: Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webpack")(js.undefined)
        ret
    }
  }
  
}

