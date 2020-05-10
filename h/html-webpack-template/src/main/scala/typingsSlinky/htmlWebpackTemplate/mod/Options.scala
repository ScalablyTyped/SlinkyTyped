package typingsSlinky.htmlWebpackTemplate.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options
  extends typingsSlinky.htmlWebpackPlugin.mod.Options {
  /** The <div> element id on which you plan to mount a JavaScript app. */
  var appMountId: js.UndefOr[String] = js.native
  /** An array of application element ids. */
  var appMountIds: js.UndefOr[js.Array[String]] = js.native
  /**
  		 * Adjust the URL for relative URLs in the document (MDN).
  		 * https://developer.mozilla.org/en/docs/Web/HTML/Element/base
  		 */
  var baseHref: js.UndefOr[String] = js.native
  /** Insert the webpack-dev-server hot reload script at this host:port/path; e.g., http://localhost:3000. */
  var devServer: js.UndefOr[String] = js.native
  /** Track usage of your site via Google Analytics. */
  var googleAnalytics: js.UndefOr[GoogleAnalyticsOptions] = js.native
  /**
  		 * For use with inline-manifest-webpack-plugin.
  		 * https://github.com/szrenwei/inline-manifest-webpack-plugin
  		 */
  var inlineManifestWebpackName: js.UndefOr[String] = js.native
  /** Array of <link> elements. */
  var links: js.UndefOr[js.Array[Link]] = js.native
  /** Sets appropriate meta tag for page scaling. */
  var mobile: js.UndefOr[Boolean] = js.native
  /** Array of external script imports to include on page. */
  var scripts: js.UndefOr[js.Array[Script]] = js.native
  /** Object that defines data you need to bootstrap a JavaScript app. */
  var window: js.UndefOr[js.Object] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppMountId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appMountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppMountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appMountId")(js.undefined)
        ret
    }
    @scala.inline
    def withAppMountIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appMountIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppMountIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appMountIds")(js.undefined)
        ret
    }
    @scala.inline
    def withBaseHref(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseHref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseHref: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseHref")(js.undefined)
        ret
    }
    @scala.inline
    def withDevServer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devServer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDevServer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devServer")(js.undefined)
        ret
    }
    @scala.inline
    def withGoogleAnalytics(value: GoogleAnalyticsOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googleAnalytics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGoogleAnalytics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googleAnalytics")(js.undefined)
        ret
    }
    @scala.inline
    def withInlineManifestWebpackName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineManifestWebpackName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInlineManifestWebpackName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineManifestWebpackName")(js.undefined)
        ret
    }
    @scala.inline
    def withLinks(value: js.Array[Link]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("links")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("links")(js.undefined)
        ret
    }
    @scala.inline
    def withMobile(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMobile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobile")(js.undefined)
        ret
    }
    @scala.inline
    def withScripts(value: js.Array[Script]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scripts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScripts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scripts")(js.undefined)
        ret
    }
    @scala.inline
    def withWindow(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window")(js.undefined)
        ret
    }
  }
  
}

