package typingsSlinky.nextServer

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAmpBindInitData extends js.Object {
  var ampBindInitData: Boolean = js.native
  var assetPrefix: js.UndefOr[String] = js.native
  var buildId: String = js.native
  var canonicalBase: String = js.native
  var dev: js.UndefOr[Boolean] = js.native
  var documentMiddlewareEnabled: Boolean = js.native
  var generateEtags: Boolean = js.native
  var poweredByHeader: Boolean = js.native
  var runtimeConfig: js.UndefOr[StringDictionary[js.Any]] = js.native
  var staticMarkup: Boolean = js.native
}

object AnonAmpBindInitData {
  @scala.inline
  def apply(
    ampBindInitData: Boolean,
    buildId: String,
    canonicalBase: String,
    documentMiddlewareEnabled: Boolean,
    generateEtags: Boolean,
    poweredByHeader: Boolean,
    staticMarkup: Boolean
  ): AnonAmpBindInitData = {
    val __obj = js.Dynamic.literal(ampBindInitData = ampBindInitData.asInstanceOf[js.Any], buildId = buildId.asInstanceOf[js.Any], canonicalBase = canonicalBase.asInstanceOf[js.Any], documentMiddlewareEnabled = documentMiddlewareEnabled.asInstanceOf[js.Any], generateEtags = generateEtags.asInstanceOf[js.Any], poweredByHeader = poweredByHeader.asInstanceOf[js.Any], staticMarkup = staticMarkup.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAmpBindInitData]
  }
  @scala.inline
  implicit class AnonAmpBindInitDataOps[Self <: AnonAmpBindInitData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withCanonicalBase(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canonicalBase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDocumentMiddlewareEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentMiddlewareEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGenerateEtags(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateEtags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPoweredByHeader(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poweredByHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStaticMarkup(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staticMarkup")(value.asInstanceOf[js.Any])
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
  }
  
}

