package typingsSlinky.activexShdocvw

import typingsSlinky.activexShdocvw.SHDocVw.InternetExplorer
import typingsSlinky.activexShdocvw.SHDocVw.ShellNameSpace
import typingsSlinky.activexShdocvw.SHDocVw.ShellUIHelper
import typingsSlinky.activexShdocvw.SHDocVw.WebBrowser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveXObjectNameMap extends js.Object {
  @JSName("InternetExplorer.Application")
  var InternetExplorerDotApplication: InternetExplorer = js.native
  @JSName("Shell.Explorer")
  var ShellDotExplorer: WebBrowser = js.native
  @JSName("Shell.UIHelper")
  var ShellDotUIHelper: ShellUIHelper = js.native
  @JSName("ShellNameSpace.ShellNameSpace")
  var ShellNameSpaceDotShellNameSpace: ShellNameSpace = js.native
}

object ActiveXObjectNameMap {
  @scala.inline
  def apply(
    InternetExplorerDotApplication: InternetExplorer,
    ShellDotExplorer: WebBrowser,
    ShellDotUIHelper: ShellUIHelper,
    ShellNameSpaceDotShellNameSpace: ShellNameSpace
  ): ActiveXObjectNameMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("InternetExplorer.Application")(InternetExplorerDotApplication.asInstanceOf[js.Any])
    __obj.updateDynamic("Shell.Explorer")(ShellDotExplorer.asInstanceOf[js.Any])
    __obj.updateDynamic("Shell.UIHelper")(ShellDotUIHelper.asInstanceOf[js.Any])
    __obj.updateDynamic("ShellNameSpace.ShellNameSpace")(ShellNameSpaceDotShellNameSpace.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveXObjectNameMap]
  }
  @scala.inline
  implicit class ActiveXObjectNameMapOps[Self <: ActiveXObjectNameMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInternetExplorerDotApplication(value: InternetExplorer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InternetExplorer.Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShellDotExplorer(value: WebBrowser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Shell.Explorer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShellDotUIHelper(value: ShellUIHelper): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Shell.UIHelper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShellNameSpaceDotShellNameSpace(value: ShellNameSpace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShellNameSpace.ShellNameSpace")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

