package typingsSlinky.activexOutlook.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationFolder extends StObject {
  
  val NavigationFolder: typingsSlinky.activexOutlook.Outlook.NavigationFolder = js.native
}
object NavigationFolder {
  
  @scala.inline
  def apply(NavigationFolder: typingsSlinky.activexOutlook.Outlook.NavigationFolder): NavigationFolder = {
    val __obj = js.Dynamic.literal(NavigationFolder = NavigationFolder.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationFolder]
  }
  
  @scala.inline
  implicit class NavigationFolderMutableBuilder[Self <: NavigationFolder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNavigationFolder(value: typingsSlinky.activexOutlook.Outlook.NavigationFolder): Self = StObject.set(x, "NavigationFolder", value.asInstanceOf[js.Any])
  }
}
