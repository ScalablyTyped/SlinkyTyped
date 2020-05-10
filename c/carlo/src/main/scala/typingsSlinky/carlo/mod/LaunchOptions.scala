package typingsSlinky.carlo.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchOptions extends WindowOptions {
  /**
    * Additional arguments to pass to the browser instance.
    */
  var args: js.UndefOr[js.Array[String]] = js.native
  /**
    * Browser to be used, defaults to ['stable']
    */
  var channel: js.UndefOr[js.Array[Channel]] = js.native
  /**
    * Path to a Chromium or Chrome executable to run instead of the automatically located Chrome.
    * If executablePath is a relative path, then it is resolved relative to current working directory.
    * Carlo is only guaranteed to work with the latest Chrome stable version.
    */
  var executablePath: js.UndefOr[String] = js.native
  /**
    * Application icon to be used in the system dock.
    * Either buffer containing PNG or a path to the PNG file on the file system.
    * This feature is only available in Chrome M72+.
    * One can use 'canary' channel to see it in action before M72 hits stable.
    */
  var icon: js.UndefOr[Buffer | String] = js.native
  /**
    * Optional parameters to share between Carlo instances.
    */
  var paramsForReuse: js.UndefOr[js.Any] = js.native
  /**
    * Application title
    */
  var title: js.UndefOr[String] = js.native
  /**
    *  Path to a User Data Directory. This folder is created upon the first app launch and contains user settings and Web storage data. Defaults to '.profile'.
    */
  var userDataDir: js.UndefOr[String] = js.native
}

object LaunchOptions {
  @scala.inline
  def apply(): LaunchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchOptions]
  }
  @scala.inline
  implicit class LaunchOptionsOps[Self <: LaunchOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArgs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(js.undefined)
        ret
    }
    @scala.inline
    def withChannel(value: js.Array[Channel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel")(js.undefined)
        ret
    }
    @scala.inline
    def withExecutablePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executablePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecutablePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executablePath")(js.undefined)
        ret
    }
    @scala.inline
    def withIcon(value: Buffer | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.undefined)
        ret
    }
    @scala.inline
    def withParamsForReuse(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paramsForReuse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParamsForReuse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paramsForReuse")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withUserDataDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userDataDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserDataDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userDataDir")(js.undefined)
        ret
    }
  }
  
}

