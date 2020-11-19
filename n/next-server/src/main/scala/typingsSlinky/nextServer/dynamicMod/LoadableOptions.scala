package typingsSlinky.nextServer.dynamicMod

import slinky.core.facade.ReactElement
import typingsSlinky.nextServer.anon.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined next-server.next-server/dist/lib/dynamic.LoadableBaseOptions<P> & {  render :(loader : any, props : any): react.react.<global>.JSX.Element | undefined} */
@js.native
trait LoadableOptions[P] extends js.Object {
  
  var loadableGenerated: js.UndefOr[LoadableGeneratedOptions] = js.native
  
  var loader: js.UndefOr[Loader[P] | LoaderMap] = js.native
  
  var loading: js.UndefOr[js.Function1[/* hasErrorIsLoadingPastDelay */ Error, ReactElement | Null]] = js.native
  
  var modules: js.UndefOr[js.Function0[LoaderMap]] = js.native
  
  var render: js.UndefOr[js.Function2[/* loader */ js.Any, /* props */ js.Any, ReactElement]] = js.native
  
  var ssr: js.UndefOr[Boolean] = js.native
  
  var webpack: js.UndefOr[js.Function0[_]] = js.native
}
object LoadableOptions {
  
  @scala.inline
  def apply[P](): LoadableOptions[P] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadableOptions[P]]
  }
  
  @scala.inline
  implicit class LoadableOptionsOps[Self <: LoadableOptions[_], P] (val x: Self with LoadableOptions[P]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLoadableGenerated(value: LoadableGeneratedOptions): Self = this.set("loadableGenerated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadableGenerated: Self = this.set("loadableGenerated", js.undefined)
    
    @scala.inline
    def setLoaderFunction0(value: () => LoaderComponent[P]): Self = this.set("loader", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLoader(value: Loader[P] | LoaderMap): Self = this.set("loader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoader: Self = this.set("loader", js.undefined)
    
    @scala.inline
    def setLoading(value: /* hasErrorIsLoadingPastDelay */ Error => ReactElement | Null): Self = this.set("loading", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteLoading: Self = this.set("loading", js.undefined)
    
    @scala.inline
    def setModules(value: () => LoaderMap): Self = this.set("modules", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteModules: Self = this.set("modules", js.undefined)
    
    @scala.inline
    def setRender(value: (/* loader */ js.Any, /* props */ js.Any) => ReactElement): Self = this.set("render", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
    
    @scala.inline
    def setSsr(value: Boolean): Self = this.set("ssr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSsr: Self = this.set("ssr", js.undefined)
    
    @scala.inline
    def setWebpack(value: () => _): Self = this.set("webpack", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteWebpack: Self = this.set("webpack", js.undefined)
  }
}
