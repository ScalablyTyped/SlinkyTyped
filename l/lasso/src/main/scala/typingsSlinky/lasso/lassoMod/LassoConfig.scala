package typingsSlinky.lasso.lassoMod

import typingsSlinky.lasso.dependenciesMod.Bundle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LassoConfig extends js.Object {
  var baseDir: js.UndefOr[String] = js.native
  var bundles: js.UndefOr[js.Array[Bundle]] = js.native
  var bundlingEnabled: js.UndefOr[Boolean] = js.native
  var cspNonceProvider: js.UndefOr[js.Function1[/* out */ js.Any, String]] = js.native
  var fingerprintInlineCode: js.UndefOr[js.Function1[/* code */ js.Any, String]] = js.native
  var fingerprintsEnabled: js.UndefOr[Boolean] = js.native
  var includeSlotNames: js.UndefOr[Boolean] = js.native
  var minify: js.UndefOr[Boolean] = js.native
  var minifyCSS: js.UndefOr[Boolean] = js.native
  var minifyInlineCSSOnly: js.UndefOr[Boolean] = js.native
  var minifyInlineJSOnly: js.UndefOr[Boolean] = js.native
  var minifyInlineOnly: js.UndefOr[Boolean] = js.native
  var minifyJS: js.UndefOr[Boolean] = js.native
  var noConflict: js.UndefOr[String] = js.native
  var outputDir: js.UndefOr[String] = js.native
  var plugins: js.UndefOr[js.Array[CustomPlugin | String]] = js.native
  var relativeUrlsEnabled: js.UndefOr[Boolean] = js.native
  var require: js.UndefOr[js.Any] = js.native
  var resolveCssUrls: js.UndefOr[Boolean] = js.native
  var urlPrefix: js.UndefOr[String] = js.native
}

object LassoConfig {
  @scala.inline
  def apply(): LassoConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LassoConfig]
  }
  @scala.inline
  implicit class LassoConfigOps[Self <: LassoConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseDir")(js.undefined)
        ret
    }
    @scala.inline
    def withBundles(value: js.Array[Bundle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bundles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBundles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bundles")(js.undefined)
        ret
    }
    @scala.inline
    def withBundlingEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bundlingEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBundlingEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bundlingEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withCspNonceProvider(value: /* out */ js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cspNonceProvider")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCspNonceProvider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cspNonceProvider")(js.undefined)
        ret
    }
    @scala.inline
    def withFingerprintInlineCode(value: /* code */ js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fingerprintInlineCode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFingerprintInlineCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fingerprintInlineCode")(js.undefined)
        ret
    }
    @scala.inline
    def withFingerprintsEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fingerprintsEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFingerprintsEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fingerprintsEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeSlotNames(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeSlotNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeSlotNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeSlotNames")(js.undefined)
        ret
    }
    @scala.inline
    def withMinify(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minify")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinify: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minify")(js.undefined)
        ret
    }
    @scala.inline
    def withMinifyCSS(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minifyCSS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinifyCSS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minifyCSS")(js.undefined)
        ret
    }
    @scala.inline
    def withMinifyInlineCSSOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minifyInlineCSSOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinifyInlineCSSOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minifyInlineCSSOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withMinifyInlineJSOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minifyInlineJSOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinifyInlineJSOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minifyInlineJSOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withMinifyInlineOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minifyInlineOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinifyInlineOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minifyInlineOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withMinifyJS(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minifyJS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinifyJS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minifyJS")(js.undefined)
        ret
    }
    @scala.inline
    def withNoConflict(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noConflict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoConflict: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noConflict")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputDir")(js.undefined)
        ret
    }
    @scala.inline
    def withPlugins(value: js.Array[CustomPlugin | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlugins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(js.undefined)
        ret
    }
    @scala.inline
    def withRelativeUrlsEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativeUrlsEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelativeUrlsEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativeUrlsEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withRequire(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("require")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequire: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("require")(js.undefined)
        ret
    }
    @scala.inline
    def withResolveCssUrls(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveCssUrls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolveCssUrls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveCssUrls")(js.undefined)
        ret
    }
    @scala.inline
    def withUrlPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrlPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlPrefix")(js.undefined)
        ret
    }
  }
  
}

