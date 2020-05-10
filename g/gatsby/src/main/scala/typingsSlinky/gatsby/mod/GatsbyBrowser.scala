package typingsSlinky.gatsby.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GatsbyBrowser extends js.Object {
  var disableCorePrefetching: js.UndefOr[js.Function2[/* args */ BrowserPluginArgs, /* options */ PluginOptions, _]] = js.native
  var onClientEntry: js.UndefOr[js.Function2[/* args */ BrowserPluginArgs, /* options */ PluginOptions, _]] = js.native
  var onInitialClientRender: js.UndefOr[js.Function2[/* args */ BrowserPluginArgs, /* options */ PluginOptions, _]] = js.native
  var onPostPrefetchPathname: js.UndefOr[js.Function2[/* args */ PrefetchPathnameArgs, /* options */ PluginOptions, _]] = js.native
  var onPreRouteUpdate: js.UndefOr[js.Function2[/* args */ RouteUpdateArgs, /* options */ PluginOptions, _]] = js.native
  var onPrefetchPathname: js.UndefOr[js.Function2[/* args */ PrefetchPathnameArgs, /* options */ PluginOptions, _]] = js.native
  var onRouteUpdate: js.UndefOr[js.Function2[/* args */ RouteUpdateArgs, /* options */ PluginOptions, _]] = js.native
  var onRouteUpdateDelayed: js.UndefOr[js.Function2[/* args */ RouteUpdateDelayedArgs, /* options */ PluginOptions, _]] = js.native
  var onServiceWorkerActive: js.UndefOr[js.Function2[/* args */ ServiceWorkerArgs, /* options */ PluginOptions, _]] = js.native
  var onServiceWorkerInstalled: js.UndefOr[js.Function2[/* args */ ServiceWorkerArgs, /* options */ PluginOptions, _]] = js.native
  var onServiceWorkerRedundant: js.UndefOr[js.Function2[/* args */ ServiceWorkerArgs, /* options */ PluginOptions, _]] = js.native
  var onServiceWorkerUpdateFound: js.UndefOr[js.Function2[/* args */ ServiceWorkerArgs, /* options */ PluginOptions, _]] = js.native
  var onServiceWorkerUpdateReady: js.UndefOr[js.Function2[/* args */ ServiceWorkerArgs, /* options */ PluginOptions, _]] = js.native
  var registerServiceWorker: js.UndefOr[js.Function2[/* args */ BrowserPluginArgs, /* options */ PluginOptions, _]] = js.native
  var replaceComponentRenderer: js.UndefOr[
    js.Function2[/* args */ ReplaceComponentRendererArgs, /* options */ PluginOptions, _]
  ] = js.native
  var replaceHydrateFunction: js.UndefOr[js.Function2[/* args */ BrowserPluginArgs, /* options */ PluginOptions, _]] = js.native
  var shouldUpdateScroll: js.UndefOr[js.Function2[/* args */ ShouldUpdateScrollArgs, /* options */ PluginOptions, _]] = js.native
  var wrapPageElement: js.UndefOr[
    js.Function2[
      /* args */ WrapPageElementBrowserArgs[js.Object, js.Object], 
      /* options */ PluginOptions, 
      _
    ]
  ] = js.native
  var wrapRootElement: js.UndefOr[
    js.Function2[/* args */ WrapRootElementBrowserArgs, /* options */ PluginOptions, _]
  ] = js.native
}

object GatsbyBrowser {
  @scala.inline
  def apply(): GatsbyBrowser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GatsbyBrowser]
  }
  @scala.inline
  implicit class GatsbyBrowserOps[Self <: GatsbyBrowser] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisableCorePrefetching(value: (/* args */ BrowserPluginArgs, /* options */ PluginOptions) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableCorePrefetching")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDisableCorePrefetching: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableCorePrefetching")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClientEntry(value: (/* args */ BrowserPluginArgs, /* options */ PluginOptions) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClientEntry")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnClientEntry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClientEntry")(js.undefined)
        ret
    }
    @scala.inline
    def withOnInitialClientRender(value: (/* args */ BrowserPluginArgs, /* options */ PluginOptions) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInitialClientRender")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnInitialClientRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInitialClientRender")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPostPrefetchPathname(value: (/* args */ PrefetchPathnameArgs, /* options */ PluginOptions) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPostPrefetchPathname")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnPostPrefetchPathname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPostPrefetchPathname")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPreRouteUpdate(value: (/* args */ RouteUpdateArgs, /* options */ PluginOptions) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPreRouteUpdate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnPreRouteUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPreRouteUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPrefetchPathname(value: (/* args */ PrefetchPathnameArgs, /* options */ PluginOptions) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPrefetchPathname")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnPrefetchPathname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPrefetchPathname")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRouteUpdate(value: (/* args */ RouteUpdateArgs, /* options */ PluginOptions) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRouteUpdate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRouteUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRouteUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRouteUpdateDelayed(value: (/* args */ RouteUpdateDelayedArgs, /* options */ PluginOptions) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRouteUpdateDelayed")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRouteUpdateDelayed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRouteUpdateDelayed")(js.undefined)
        ret
    }
    @scala.inline
    def withOnServiceWorkerActive(value: (/* args */ ServiceWorkerArgs, /* options */ PluginOptions) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onServiceWorkerActive")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnServiceWorkerActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onServiceWorkerActive")(js.undefined)
        ret
    }
    @scala.inline
    def withOnServiceWorkerInstalled(value: (/* args */ ServiceWorkerArgs, /* options */ PluginOptions) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onServiceWorkerInstalled")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnServiceWorkerInstalled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onServiceWorkerInstalled")(js.undefined)
        ret
    }
    @scala.inline
    def withOnServiceWorkerRedundant(value: (/* args */ ServiceWorkerArgs, /* options */ PluginOptions) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onServiceWorkerRedundant")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnServiceWorkerRedundant: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onServiceWorkerRedundant")(js.undefined)
        ret
    }
    @scala.inline
    def withOnServiceWorkerUpdateFound(value: (/* args */ ServiceWorkerArgs, /* options */ PluginOptions) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onServiceWorkerUpdateFound")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnServiceWorkerUpdateFound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onServiceWorkerUpdateFound")(js.undefined)
        ret
    }
    @scala.inline
    def withOnServiceWorkerUpdateReady(value: (/* args */ ServiceWorkerArgs, /* options */ PluginOptions) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onServiceWorkerUpdateReady")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnServiceWorkerUpdateReady: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onServiceWorkerUpdateReady")(js.undefined)
        ret
    }
    @scala.inline
    def withRegisterServiceWorker(value: (/* args */ BrowserPluginArgs, /* options */ PluginOptions) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerServiceWorker")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRegisterServiceWorker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerServiceWorker")(js.undefined)
        ret
    }
    @scala.inline
    def withReplaceComponentRenderer(value: (/* args */ ReplaceComponentRendererArgs, /* options */ PluginOptions) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceComponentRenderer")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutReplaceComponentRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceComponentRenderer")(js.undefined)
        ret
    }
    @scala.inline
    def withReplaceHydrateFunction(value: (/* args */ BrowserPluginArgs, /* options */ PluginOptions) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceHydrateFunction")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutReplaceHydrateFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceHydrateFunction")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldUpdateScroll(value: (/* args */ ShouldUpdateScrollArgs, /* options */ PluginOptions) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldUpdateScroll")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutShouldUpdateScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldUpdateScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withWrapPageElement(
      value: (/* args */ WrapPageElementBrowserArgs[js.Object, js.Object], /* options */ PluginOptions) => _
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapPageElement")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutWrapPageElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapPageElement")(js.undefined)
        ret
    }
    @scala.inline
    def withWrapRootElement(value: (/* args */ WrapRootElementBrowserArgs, /* options */ PluginOptions) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapRootElement")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutWrapRootElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapRootElement")(js.undefined)
        ret
    }
  }
  
}

