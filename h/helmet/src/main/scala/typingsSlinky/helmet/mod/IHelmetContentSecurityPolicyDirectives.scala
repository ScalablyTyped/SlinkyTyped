package typingsSlinky.helmet.mod

import typingsSlinky.express.mod.Request_
import typingsSlinky.express.mod.Response_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHelmetContentSecurityPolicyDirectives extends js.Object {
  var `base-uri`: js.UndefOr[js.Array[HelmetCspDirectiveValue]] = js.native
  var baseUri: js.UndefOr[js.Array[HelmetCspDirectiveValue]] = js.native
  var `block-all-mixed-content`: js.UndefOr[Boolean] = js.native
  var blockAllMixedContent: js.UndefOr[Boolean] = js.native
  var `child-src`: js.UndefOr[js.Array[HelmetCspDirectiveValue]] = js.native
  var childSrc: js.UndefOr[js.Array[HelmetCspDirectiveValue]] = js.native
  var `connect-src`: js.UndefOr[js.Array[HelmetCspDirectiveValue]] = js.native
  var connectSrc: js.UndefOr[js.Array[HelmetCspDirectiveValue]] = js.native
  var `default-src`: js.UndefOr[js.Array[HelmetCspDirectiveValue]] = js.native
  var defaultSrc: js.UndefOr[js.Array[HelmetCspDirectiveValue]] = js.native
  var `font-src`: js.UndefOr[js.Array[HelmetCspDirectiveValue]] = js.native
  var fontSrc: js.UndefOr[js.Array[HelmetCspDirectiveValue]] = js.native
  var `form-action`: js.UndefOr[js.Array[HelmetCspDirectiveValue]] = js.native
  var formAction: js.UndefOr[js.Array[HelmetCspDirectiveValue]] = js.native
  var `frame-ancestors`: js.UndefOr[js.Array[HelmetCspDirectiveValue]] = js.native
  var `frame-src`: js.UndefOr[js.Array[HelmetCspDirectiveValue]] = js.native
  var frameAncestors: js.UndefOr[js.Array[HelmetCspDirectiveValue]] = js.native
  var frameSrc: js.UndefOr[js.Array[HelmetCspDirectiveValue]] = js.native
  var `img-src`: js.UndefOr[js.Array[HelmetCspDirectiveValue]] = js.native
  var imgSrc: js.UndefOr[js.Array[HelmetCspDirectiveValue]] = js.native
  var `manifest-src`: js.UndefOr[js.Array[HelmetCspDirectiveValue]] = js.native
  var manifestSrc: js.UndefOr[js.Array[HelmetCspDirectiveValue]] = js.native
  var `media-src`: js.UndefOr[js.Array[HelmetCspDirectiveValue]] = js.native
  var mediaSrc: js.UndefOr[js.Array[HelmetCspDirectiveValue]] = js.native
  var `object-src`: js.UndefOr[js.Array[HelmetCspDirectiveValue]] = js.native
  var objectSrc: js.UndefOr[js.Array[HelmetCspDirectiveValue]] = js.native
  var `plugin-types`: js.UndefOr[js.Array[HelmetCspDirectiveValue]] = js.native
  var pluginTypes: js.UndefOr[js.Array[HelmetCspDirectiveValue]] = js.native
  var `prefetch-src`: js.UndefOr[js.Array[HelmetCspDirectiveValue]] = js.native
  var prefetchSrc: js.UndefOr[js.Array[HelmetCspDirectiveValue]] = js.native
  var `report-to`: js.UndefOr[HelmetCspDirectiveValue] = js.native
  var `report-uri`: js.UndefOr[HelmetCspDirectiveValue] = js.native
  var reportTo: js.UndefOr[HelmetCspDirectiveValue] = js.native
  var reportUri: js.UndefOr[HelmetCspDirectiveValue] = js.native
  var `require-sri-for`: js.UndefOr[js.Array[HelmetCspRequireSriForValue]] = js.native
  var requireSriFor: js.UndefOr[js.Array[HelmetCspRequireSriForValue]] = js.native
  var sandbox: js.UndefOr[js.Array[HelmetCspSandboxDirective]] = js.native
  var `script-src`: js.UndefOr[HelmetCspDirectiveValue] = js.native
  var scriptSrc: js.UndefOr[js.Array[HelmetCspDirectiveValue]] = js.native
  var `style-src`: js.UndefOr[HelmetCspDirectiveValue] = js.native
  var styleSrc: js.UndefOr[js.Array[HelmetCspDirectiveValue]] = js.native
  var `upgrade-insecure-requests`: js.UndefOr[Boolean] = js.native
  var upgradeInsecureRequests: js.UndefOr[Boolean] = js.native
  var `worker-src`: js.UndefOr[HelmetCspDirectiveValue] = js.native
  var workerSrc: js.UndefOr[js.Array[HelmetCspDirectiveValue]] = js.native
}

object IHelmetContentSecurityPolicyDirectives {
  @scala.inline
  def apply(): IHelmetContentSecurityPolicyDirectives = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHelmetContentSecurityPolicyDirectives]
  }
  @scala.inline
  implicit class IHelmetContentSecurityPolicyDirectivesOps[Self <: IHelmetContentSecurityPolicyDirectives] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withBase-uri`(value: js.Array[HelmetCspDirectiveValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base-uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBase-uri`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base-uri")(js.undefined)
        ret
    }
    @scala.inline
    def withBaseUri(value: js.Array[HelmetCspDirectiveValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseUri")(js.undefined)
        ret
    }
    @scala.inline
    def `withBlock-all-mixed-content`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("block-all-mixed-content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBlock-all-mixed-content`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("block-all-mixed-content")(js.undefined)
        ret
    }
    @scala.inline
    def withBlockAllMixedContent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockAllMixedContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlockAllMixedContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockAllMixedContent")(js.undefined)
        ret
    }
    @scala.inline
    def `withChild-src`(value: js.Array[HelmetCspDirectiveValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("child-src")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutChild-src`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("child-src")(js.undefined)
        ret
    }
    @scala.inline
    def withChildSrc(value: js.Array[HelmetCspDirectiveValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childSrc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildSrc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childSrc")(js.undefined)
        ret
    }
    @scala.inline
    def `withConnect-src`(value: js.Array[HelmetCspDirectiveValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connect-src")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutConnect-src`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connect-src")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectSrc(value: js.Array[HelmetCspDirectiveValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectSrc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectSrc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectSrc")(js.undefined)
        ret
    }
    @scala.inline
    def `withDefault-src`(value: js.Array[HelmetCspDirectiveValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default-src")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutDefault-src`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default-src")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultSrc(value: js.Array[HelmetCspDirectiveValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSrc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultSrc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSrc")(js.undefined)
        ret
    }
    @scala.inline
    def `withFont-src`(value: js.Array[HelmetCspDirectiveValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-src")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFont-src`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-src")(js.undefined)
        ret
    }
    @scala.inline
    def withFontSrc(value: js.Array[HelmetCspDirectiveValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSrc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontSrc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSrc")(js.undefined)
        ret
    }
    @scala.inline
    def `withForm-action`(value: js.Array[HelmetCspDirectiveValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("form-action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutForm-action`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("form-action")(js.undefined)
        ret
    }
    @scala.inline
    def withFormAction(value: js.Array[HelmetCspDirectiveValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formAction")(js.undefined)
        ret
    }
    @scala.inline
    def `withFrame-ancestors`(value: js.Array[HelmetCspDirectiveValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frame-ancestors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFrame-ancestors`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frame-ancestors")(js.undefined)
        ret
    }
    @scala.inline
    def `withFrame-src`(value: js.Array[HelmetCspDirectiveValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frame-src")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFrame-src`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frame-src")(js.undefined)
        ret
    }
    @scala.inline
    def withFrameAncestors(value: js.Array[HelmetCspDirectiveValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameAncestors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrameAncestors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameAncestors")(js.undefined)
        ret
    }
    @scala.inline
    def withFrameSrc(value: js.Array[HelmetCspDirectiveValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameSrc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrameSrc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameSrc")(js.undefined)
        ret
    }
    @scala.inline
    def `withImg-src`(value: js.Array[HelmetCspDirectiveValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("img-src")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutImg-src`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("img-src")(js.undefined)
        ret
    }
    @scala.inline
    def withImgSrc(value: js.Array[HelmetCspDirectiveValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imgSrc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImgSrc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imgSrc")(js.undefined)
        ret
    }
    @scala.inline
    def `withManifest-src`(value: js.Array[HelmetCspDirectiveValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manifest-src")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutManifest-src`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manifest-src")(js.undefined)
        ret
    }
    @scala.inline
    def withManifestSrc(value: js.Array[HelmetCspDirectiveValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manifestSrc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManifestSrc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manifestSrc")(js.undefined)
        ret
    }
    @scala.inline
    def `withMedia-src`(value: js.Array[HelmetCspDirectiveValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media-src")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMedia-src`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media-src")(js.undefined)
        ret
    }
    @scala.inline
    def withMediaSrc(value: js.Array[HelmetCspDirectiveValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaSrc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediaSrc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaSrc")(js.undefined)
        ret
    }
    @scala.inline
    def `withObject-src`(value: js.Array[HelmetCspDirectiveValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object-src")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutObject-src`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object-src")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectSrc(value: js.Array[HelmetCspDirectiveValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectSrc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectSrc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectSrc")(js.undefined)
        ret
    }
    @scala.inline
    def `withPlugin-types`(value: js.Array[HelmetCspDirectiveValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugin-types")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPlugin-types`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugin-types")(js.undefined)
        ret
    }
    @scala.inline
    def withPluginTypes(value: js.Array[HelmetCspDirectiveValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pluginTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPluginTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pluginTypes")(js.undefined)
        ret
    }
    @scala.inline
    def `withPrefetch-src`(value: js.Array[HelmetCspDirectiveValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefetch-src")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPrefetch-src`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefetch-src")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefetchSrc(value: js.Array[HelmetCspDirectiveValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefetchSrc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefetchSrc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefetchSrc")(js.undefined)
        ret
    }
    @scala.inline
    def `withReport-toFunction2`(
      value: (/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], /* res */ Response_[js.Any]) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("report-to")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def `withReport-to`(value: HelmetCspDirectiveValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("report-to")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutReport-to`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("report-to")(js.undefined)
        ret
    }
    @scala.inline
    def `withReport-uriFunction2`(
      value: (/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], /* res */ Response_[js.Any]) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("report-uri")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def `withReport-uri`(value: HelmetCspDirectiveValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("report-uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutReport-uri`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("report-uri")(js.undefined)
        ret
    }
    @scala.inline
    def withReportToFunction2(
      value: (/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], /* res */ Response_[js.Any]) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportTo")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withReportTo(value: HelmetCspDirectiveValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportTo")(js.undefined)
        ret
    }
    @scala.inline
    def withReportUriFunction2(
      value: (/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], /* res */ Response_[js.Any]) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportUri")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withReportUri(value: HelmetCspDirectiveValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportUri")(js.undefined)
        ret
    }
    @scala.inline
    def `withRequire-sri-for`(value: js.Array[HelmetCspRequireSriForValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("require-sri-for")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutRequire-sri-for`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("require-sri-for")(js.undefined)
        ret
    }
    @scala.inline
    def withRequireSriFor(value: js.Array[HelmetCspRequireSriForValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireSriFor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequireSriFor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireSriFor")(js.undefined)
        ret
    }
    @scala.inline
    def withSandbox(value: js.Array[HelmetCspSandboxDirective]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sandbox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSandbox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sandbox")(js.undefined)
        ret
    }
    @scala.inline
    def `withScript-srcFunction2`(
      value: (/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], /* res */ Response_[js.Any]) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("script-src")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def `withScript-src`(value: HelmetCspDirectiveValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("script-src")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutScript-src`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("script-src")(js.undefined)
        ret
    }
    @scala.inline
    def withScriptSrc(value: js.Array[HelmetCspDirectiveValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scriptSrc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScriptSrc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scriptSrc")(js.undefined)
        ret
    }
    @scala.inline
    def `withStyle-srcFunction2`(
      value: (/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], /* res */ Response_[js.Any]) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style-src")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def `withStyle-src`(value: HelmetCspDirectiveValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style-src")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutStyle-src`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style-src")(js.undefined)
        ret
    }
    @scala.inline
    def withStyleSrc(value: js.Array[HelmetCspDirectiveValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleSrc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyleSrc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleSrc")(js.undefined)
        ret
    }
    @scala.inline
    def `withUpgrade-insecure-requests`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upgrade-insecure-requests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutUpgrade-insecure-requests`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upgrade-insecure-requests")(js.undefined)
        ret
    }
    @scala.inline
    def withUpgradeInsecureRequests(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upgradeInsecureRequests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpgradeInsecureRequests: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upgradeInsecureRequests")(js.undefined)
        ret
    }
    @scala.inline
    def `withWorker-srcFunction2`(
      value: (/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], /* res */ Response_[js.Any]) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("worker-src")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def `withWorker-src`(value: HelmetCspDirectiveValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("worker-src")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutWorker-src`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("worker-src")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkerSrc(value: js.Array[HelmetCspDirectiveValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workerSrc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkerSrc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workerSrc")(js.undefined)
        ret
    }
  }
  
}

