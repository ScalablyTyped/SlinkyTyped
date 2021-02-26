package typingsSlinky.googleAppsScript.GoogleAppsScript.Events

import typingsSlinky.googleAppsScript.GoogleAppsScript.Base.User
import typingsSlinky.googleAppsScript.GoogleAppsScript.Forms.Form
import typingsSlinky.googleAppsScript.GoogleAppsScript.Script.AuthMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormsOnOpen extends AppsScriptEvent {
  
  var source: Form = js.native
}
object FormsOnOpen {
  
  @scala.inline
  def apply(authMode: AuthMode, source: Form, triggerUid: String, user: User): FormsOnOpen = {
    val __obj = js.Dynamic.literal(authMode = authMode.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], triggerUid = triggerUid.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormsOnOpen]
  }
  
  @scala.inline
  implicit class FormsOnOpenMutableBuilder[Self <: FormsOnOpen] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: Form): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
