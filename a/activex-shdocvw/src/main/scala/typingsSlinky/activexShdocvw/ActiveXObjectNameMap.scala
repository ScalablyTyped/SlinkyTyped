package typingsSlinky.activexShdocvw

import typingsSlinky.activexShdocvw.SHDocVw.InternetExplorer
import typingsSlinky.activexShdocvw.SHDocVw.ShellNameSpace
import typingsSlinky.activexShdocvw.SHDocVw.ShellUIHelper
import typingsSlinky.activexShdocvw.SHDocVw.WebBrowser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActiveXObjectNameMap extends StObject {
  
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
  implicit class ActiveXObjectNameMapMutableBuilder[Self <: ActiveXObjectNameMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInternetExplorerDotApplication(value: InternetExplorer): Self = StObject.set(x, "InternetExplorer.Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShellDotExplorer(value: WebBrowser): Self = StObject.set(x, "Shell.Explorer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShellDotUIHelper(value: ShellUIHelper): Self = StObject.set(x, "Shell.UIHelper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShellNameSpaceDotShellNameSpace(value: ShellNameSpace): Self = StObject.set(x, "ShellNameSpace.ShellNameSpace", value.asInstanceOf[js.Any])
  }
}
