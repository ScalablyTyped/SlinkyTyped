package typingsSlinky.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkspaceSettings extends StObject {
  
  /**
    * When **true**, commenting on the documents in the workspace is allowed.
    */
  var commentsAllowed: js.UndefOr[String] = js.native
}
object WorkspaceSettings {
  
  @scala.inline
  def apply(): WorkspaceSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceSettings]
  }
  
  @scala.inline
  implicit class WorkspaceSettingsMutableBuilder[Self <: WorkspaceSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommentsAllowed(value: String): Self = StObject.set(x, "commentsAllowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsAllowedUndefined: Self = StObject.set(x, "commentsAllowed", js.undefined)
  }
}
