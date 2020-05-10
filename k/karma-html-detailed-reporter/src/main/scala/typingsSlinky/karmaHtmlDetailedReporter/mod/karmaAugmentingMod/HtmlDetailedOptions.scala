package typingsSlinky.karmaHtmlDetailedReporter.mod.karmaAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * see {@link https://github.com/a11smiles/karma-html-detailed-reporter#options}
  */
@js.native
trait HtmlDetailedOptions extends js.Object {
  /**
    * Enables/disables the refresh to start automatically
    * @default true
    */
  var autoReload: js.UndefOr[Boolean] = js.native
  /**
    * Sets the reports output base path
    * @default './_reports'
    */
  var dir: js.UndefOr[String] = js.native
  /**
    * Sets the refresh timeout (in milliseconds) for the page
    * @default 1000
    */
  var refreshTimeout: js.UndefOr[Double] = js.native
  /**
    * Determines whether the detailed results of the failed tests are default shown or hidden in the browser (you are able to toggle live in the browser)
    * @default true
    */
  var showFailed: js.UndefOr[Boolean] = js.native
  /**
    * Determines whether the detailed results of the skipped tests are default shown or hidden in the browser (you are able to toggle live in the browser)
    * @default true
    */
  var showSkipped: js.UndefOr[Boolean] = js.native
  /**
    * Determines whether the detailed results of the successfull tests are default shown or hidden in the browser (you are able to toggle live in the browser)
    * @default true
    */
  var showSuccess: js.UndefOr[Boolean] = js.native
  /**
    * Determines whether the results are split into a separate file for each browser
    * @default true
    */
  var splitResults: js.UndefOr[Boolean] = js.native
  /**
    * Determines whether to use the hosted versions of Boostrap and jQuery. If testing within a CI build (e.g. TFS, Jenkins, TeamCity),
    * setting this to true would allow you to see the reports while the builders do not maintain node modules.
    * @default false
    */
  var useHostedBootstrap: js.UndefOr[Boolean] = js.native
}

object HtmlDetailedOptions {
  @scala.inline
  def apply(): HtmlDetailedOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HtmlDetailedOptions]
  }
  @scala.inline
  implicit class HtmlDetailedOptionsOps[Self <: HtmlDetailedOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoReload(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoReload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoReload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoReload")(js.undefined)
        ret
    }
    @scala.inline
    def withDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dir")(js.undefined)
        ret
    }
    @scala.inline
    def withRefreshTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefreshTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withShowFailed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFailed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowFailed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFailed")(js.undefined)
        ret
    }
    @scala.inline
    def withShowSkipped(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSkipped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowSkipped: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSkipped")(js.undefined)
        ret
    }
    @scala.inline
    def withShowSuccess(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSuccess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSuccess")(js.undefined)
        ret
    }
    @scala.inline
    def withSplitResults(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSplitResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitResults")(js.undefined)
        ret
    }
    @scala.inline
    def withUseHostedBootstrap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useHostedBootstrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseHostedBootstrap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useHostedBootstrap")(js.undefined)
        ret
    }
  }
  
}

