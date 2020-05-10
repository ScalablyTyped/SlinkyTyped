package typingsSlinky.nextServer.renderMod

import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import typingsSlinky.nextServer.AnonErrorError
import typingsSlinky.nextServer.getPageFilesMod.BuildManifest
import typingsSlinky.nextServer.libUtilsMod.AppType
import typingsSlinky.nextServer.libUtilsMod.DocumentType
import typingsSlinky.nextServer.libUtilsMod.NextPageContext
import typingsSlinky.nextServer.typesMod.PageConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderOpts extends js.Object {
  var App: AppType = js.native
  var Component: ReactComponentClass[js.Object] = js.native
  var Document: DocumentType = js.native
  var ErrorDebug: js.UndefOr[ReactComponentClass[AnonErrorError]] = js.native
  var ampBindInitData: Boolean = js.native
  var ampMode: js.UndefOr[js.Any] = js.native
  var ampPath: js.UndefOr[String] = js.native
  var ampValidator: js.UndefOr[js.Function2[/* html */ String, /* pathname */ String, js.Promise[Unit]]] = js.native
  var assetPrefix: js.UndefOr[String] = js.native
  var buildId: String = js.native
  var buildManifest: BuildManifest = js.native
  var canonicalBase: String = js.native
  var dangerousAsPath: String = js.native
  var dataOnly: js.UndefOr[Boolean] = js.native
  var dev: js.UndefOr[Boolean] = js.native
  var documentMiddlewareEnabled: Boolean = js.native
  var err: js.UndefOr[js.Error | Null] = js.native
  var hybridAmp: js.UndefOr[Boolean] = js.native
  var inAmpMode: js.UndefOr[Boolean] = js.native
  var nextExport: js.UndefOr[Boolean] = js.native
  var pageConfig: PageConfig = js.native
  var reactLoadableManifest: ReactLoadableManifest = js.native
  var runtimeConfig: js.UndefOr[StringDictionary[js.Any]] = js.native
  var skeleton: js.UndefOr[Boolean] = js.native
  var staticMarkup: Boolean = js.native
  def DocumentMiddleware(ctx: NextPageContext): Unit = js.native
}

object RenderOpts {
  @scala.inline
  def apply(
    App: AppType,
    Component: ReactComponentClass[js.Object],
    Document: DocumentType,
    DocumentMiddleware: NextPageContext => Unit,
    ampBindInitData: Boolean,
    buildId: String,
    buildManifest: BuildManifest,
    canonicalBase: String,
    dangerousAsPath: String,
    documentMiddlewareEnabled: Boolean,
    pageConfig: PageConfig,
    reactLoadableManifest: ReactLoadableManifest,
    staticMarkup: Boolean
  ): RenderOpts = {
    val __obj = js.Dynamic.literal(App = App.asInstanceOf[js.Any], Component = Component.asInstanceOf[js.Any], Document = Document.asInstanceOf[js.Any], DocumentMiddleware = js.Any.fromFunction1(DocumentMiddleware), ampBindInitData = ampBindInitData.asInstanceOf[js.Any], buildId = buildId.asInstanceOf[js.Any], buildManifest = buildManifest.asInstanceOf[js.Any], canonicalBase = canonicalBase.asInstanceOf[js.Any], dangerousAsPath = dangerousAsPath.asInstanceOf[js.Any], documentMiddlewareEnabled = documentMiddlewareEnabled.asInstanceOf[js.Any], pageConfig = pageConfig.asInstanceOf[js.Any], reactLoadableManifest = reactLoadableManifest.asInstanceOf[js.Any], staticMarkup = staticMarkup.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderOpts]
  }
  @scala.inline
  implicit class RenderOptsOps[Self <: RenderOpts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApp(value: AppType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("App")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponent(value: ReactComponentClass[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDocument(value: DocumentType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Document")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDocumentMiddleware(value: NextPageContext => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocumentMiddleware")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAmpBindInitData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ampBindInitData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBuildId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBuildManifest(value: BuildManifest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildManifest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanonicalBase(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canonicalBase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDangerousAsPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dangerousAsPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDocumentMiddlewareEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentMiddlewareEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageConfig(value: PageConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReactLoadableManifest(value: ReactLoadableManifest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reactLoadableManifest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStaticMarkup(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staticMarkup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorDebugFunctionComponent(value: ReactComponentClass[AnonErrorError]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorDebug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorDebugComponentClass(value: ReactComponentClass[AnonErrorError]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorDebug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorDebug(value: ReactComponentClass[AnonErrorError]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorDebug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorDebug")(js.undefined)
        ret
    }
    @scala.inline
    def withAmpMode(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ampMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmpMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ampMode")(js.undefined)
        ret
    }
    @scala.inline
    def withAmpPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ampPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmpPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ampPath")(js.undefined)
        ret
    }
    @scala.inline
    def withAmpValidator(value: (/* html */ String, /* pathname */ String) => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ampValidator")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAmpValidator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ampValidator")(js.undefined)
        ret
    }
    @scala.inline
    def withAssetPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assetPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssetPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assetPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withDataOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withDev(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dev")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDev: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dev")(js.undefined)
        ret
    }
    @scala.inline
    def withErr(value: js.Error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("err")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("err")(js.undefined)
        ret
    }
    @scala.inline
    def withErrNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("err")(null)
        ret
    }
    @scala.inline
    def withHybridAmp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hybridAmp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHybridAmp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hybridAmp")(js.undefined)
        ret
    }
    @scala.inline
    def withInAmpMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inAmpMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInAmpMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inAmpMode")(js.undefined)
        ret
    }
    @scala.inline
    def withNextExport(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextExport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextExport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextExport")(js.undefined)
        ret
    }
    @scala.inline
    def withRuntimeConfig(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runtimeConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuntimeConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runtimeConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withSkeleton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skeleton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkeleton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skeleton")(js.undefined)
        ret
    }
  }
  
}

