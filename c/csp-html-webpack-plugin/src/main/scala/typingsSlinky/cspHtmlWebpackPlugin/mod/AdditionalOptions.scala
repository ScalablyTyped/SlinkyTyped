package typingsSlinky.cspHtmlWebpackPlugin.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.cspHtmlWebpackPlugin.cspHtmlWebpackPluginStrings.sha256
import typingsSlinky.cspHtmlWebpackPlugin.cspHtmlWebpackPluginStrings.sha384
import typingsSlinky.cspHtmlWebpackPlugin.cspHtmlWebpackPluginStrings.sha512
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Additional options. Defaults are:
  *
  * ```javascript
  * {
  *   enabled: true
  *   hashingMethod: 'sha256',
  *   hashEnabled: {
  *     'script-src': true,
  *     'style-src': true
  *   },
  *   nonceEnabled: {
  *     'script-src': true,
  *     'style-src': true
  *   }
  * }
  * ```
  */
@js.native
trait AdditionalOptions extends js.Object {
  /**
    * If false, or the function returns false, the empty CSP tag will be
    * stripped from the html output.
    *
    * * The `htmlPluginData` is passed into the function as its first
    *   param.
    * * If `enabled` is set the false, it will disable generating a CSP for
    *   all instances of HtmlWebpackPlugin in your webpack config.
    */
  var enabled: js.UndefOr[Boolean | (js.Function1[/* htmlPluginData */ HtmlPluginData, Boolean])] = js.native
  /**
    * A `<string, boolean>` entry for which policy rules are allowed to
    * include hashes.
    */
  var hashEnabled: js.UndefOr[StringDictionary[Boolean]] = js.native
  /**
    * The hashing method. Your node version must also accept this hashing
    * method.
    */
  var hashingMethod: js.UndefOr[sha256 | sha384 | sha512] = js.native
  /**
    * A `<string, boolean>` entry for which policy rules are allowed to
    * include nonces.
    */
  var nonceEnabled: js.UndefOr[StringDictionary[Boolean]] = js.native
}

object AdditionalOptions {
  @scala.inline
  def apply(): AdditionalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdditionalOptions]
  }
  @scala.inline
  implicit class AdditionalOptionsOps[Self <: AdditionalOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnabledFunction1(value: /* htmlPluginData */ HtmlPluginData => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean | (js.Function1[/* htmlPluginData */ HtmlPluginData, Boolean])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withHashEnabled(value: StringDictionary[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHashEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withHashingMethod(value: sha256 | sha384 | sha512): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashingMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHashingMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashingMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withNonceEnabled(value: StringDictionary[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonceEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNonceEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonceEnabled")(js.undefined)
        ret
    }
  }
  
}

