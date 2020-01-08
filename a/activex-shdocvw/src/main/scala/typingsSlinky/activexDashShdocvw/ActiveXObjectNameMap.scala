package typingsSlinky.activexDashShdocvw

import typingsSlinky.activexDashShdocvw.SHDocVw.InternetExplorer
import typingsSlinky.activexDashShdocvw.SHDocVw.ShellNameSpace
import typingsSlinky.activexDashShdocvw.SHDocVw.ShellUIHelper
import typingsSlinky.activexDashShdocvw.SHDocVw.WebBrowser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActiveXObjectNameMap extends js.Object {
  @JSName("InternetExplorer.Application")
  var InternetExplorerDotApplication: InternetExplorer
  @JSName("Shell.Explorer")
  var ShellDotExplorer: WebBrowser
  @JSName("Shell.UIHelper")
  var ShellDotUIHelper: ShellUIHelper
  @JSName("ShellNameSpace.ShellNameSpace")
  var ShellNameSpaceDotShellNameSpace: ShellNameSpace
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
}

