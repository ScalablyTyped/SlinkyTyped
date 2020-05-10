package typingsSlinky.launchpad.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrowserPlatformDetails extends js.Object {
  var args: js.UndefOr[js.Array[String]] = js.native
  var command: js.UndefOr[String] = js.native
  var cwd: js.UndefOr[String] = js.native
  var defaultLocation: js.UndefOr[String] = js.native
  var getCommand: js.UndefOr[
    js.Function3[
      /* browser */ BrowserPlatformDetails, 
      /* url */ String, 
      /* args */ js.Array[String], 
      String
    ]
  ] = js.native
  var imageName: js.UndefOr[String] = js.native
  var multi: js.UndefOr[Boolean] = js.native
  var opensTab: js.UndefOr[Boolean] = js.native
  var pathQuery: js.UndefOr[String] = js.native
  var plistPath: js.UndefOr[String] = js.native
  var process: js.UndefOr[String] = js.native
  var versionKey: js.UndefOr[String] = js.native
}

object BrowserPlatformDetails {
  @scala.inline
  def apply(): BrowserPlatformDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrowserPlatformDetails]
  }
  @scala.inline
  implicit class BrowserPlatformDetailsOps[Self <: BrowserPlatformDetails] (val x: Self) extends AnyVal {
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
    def withCommand(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("command")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("command")(js.undefined)
        ret
    }
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
    def withDefaultLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withGetCommand(
      value: (/* browser */ BrowserPlatformDetails, /* url */ String, /* args */ js.Array[String]) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCommand")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutGetCommand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCommand")(js.undefined)
        ret
    }
    @scala.inline
    def withImageName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageName")(js.undefined)
        ret
    }
    @scala.inline
    def withMulti(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMulti: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multi")(js.undefined)
        ret
    }
    @scala.inline
    def withOpensTab(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opensTab")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpensTab: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opensTab")(js.undefined)
        ret
    }
    @scala.inline
    def withPathQuery(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPathQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathQuery")(js.undefined)
        ret
    }
    @scala.inline
    def withPlistPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plistPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlistPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plistPath")(js.undefined)
        ret
    }
    @scala.inline
    def withProcess(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("process")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("process")(js.undefined)
        ret
    }
    @scala.inline
    def withVersionKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersionKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionKey")(js.undefined)
        ret
    }
  }
  
}

