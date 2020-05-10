package typingsSlinky.cleanWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Removes files after every build (including watch mode) that match this pattern.
    * Used for files that are not created directly by Webpack.
    *
    * Use !negative patterns to exclude files
    *
    * default: []
    */
  var cleanAfterEveryBuildPatterns: js.UndefOr[js.Array[String]] = js.native
  /**
    * Removes files once prior to Webpack compilation
    *   Not included in rebuilds (watch mode)
    *
    * Use !negative patterns to exclude files
    *
    * default: ['**\/ *']
    */
  var cleanOnceBeforeBuildPatterns: js.UndefOr[js.Array[String]] = js.native
  /**
    * Automatically remove all unused webpack assets on rebuild
    *
    * default: true
    */
  var cleanStaleWebpackAssets: js.UndefOr[Boolean] = js.native
  /**
    * Allow clean patterns outside of process.cwd()
    *
    * requires dry option to be explicitly set
    *
    * default: false
    */
  var dangerouslyAllowCleanPatternsOutsideProject: js.UndefOr[Boolean] = js.native
  /**
    * Simulate the removal of files
    *
    * default: false
    */
  var dry: js.UndefOr[Boolean] = js.native
  /**
    * Do not allow removal of current webpack assets
    *
    * default: true
    */
  var protectWebpackAssets: js.UndefOr[Boolean] = js.native
  /**
    * Write Logs to Console
    * (Always enabled when dry is true)
    *
    * default: false
    */
  var verbose: js.UndefOr[Boolean] = js.native
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
    def withCleanAfterEveryBuildPatterns(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cleanAfterEveryBuildPatterns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCleanAfterEveryBuildPatterns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cleanAfterEveryBuildPatterns")(js.undefined)
        ret
    }
    @scala.inline
    def withCleanOnceBeforeBuildPatterns(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cleanOnceBeforeBuildPatterns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCleanOnceBeforeBuildPatterns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cleanOnceBeforeBuildPatterns")(js.undefined)
        ret
    }
    @scala.inline
    def withCleanStaleWebpackAssets(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cleanStaleWebpackAssets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCleanStaleWebpackAssets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cleanStaleWebpackAssets")(js.undefined)
        ret
    }
    @scala.inline
    def withDangerouslyAllowCleanPatternsOutsideProject(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dangerouslyAllowCleanPatternsOutsideProject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDangerouslyAllowCleanPatternsOutsideProject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dangerouslyAllowCleanPatternsOutsideProject")(js.undefined)
        ret
    }
    @scala.inline
    def withDry(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dry")(js.undefined)
        ret
    }
    @scala.inline
    def withProtectWebpackAssets(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protectWebpackAssets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtectWebpackAssets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protectWebpackAssets")(js.undefined)
        ret
    }
    @scala.inline
    def withVerbose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerbose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(js.undefined)
        ret
    }
  }
  
}

