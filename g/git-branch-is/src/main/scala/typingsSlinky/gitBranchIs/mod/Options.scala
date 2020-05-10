package typingsSlinky.gitBranchIs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for {@link gitBranchIs}.
  */
@js.native
trait Options extends js.Object {
  /**
    * Current working directory where the branch name is
    * tested
    */
  var cwd: js.UndefOr[String] = js.native
  /**
    * Extra arguments to pass to git
    */
  var gitArgs: js.UndefOr[js.Array[String]] = js.native
  /**
    * Path to the repository (i.e.
    * <code>--git-dir=</code> option to <code>git</code>).
    */
  var gitDir: js.UndefOr[String] = js.native
  /**
    * Git binary name or path to use (default:
    * <code>'git'</code>).
    */
  var gitPath: js.UndefOr[String] = js.native
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
    def withCwd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cwd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCwd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cwd")(js.undefined)
        ret
    }
    @scala.inline
    def withGitArgs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gitArgs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGitArgs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gitArgs")(js.undefined)
        ret
    }
    @scala.inline
    def withGitDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gitDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGitDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gitDir")(js.undefined)
        ret
    }
    @scala.inline
    def withGitPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gitPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGitPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gitPath")(js.undefined)
        ret
    }
  }
  
}

