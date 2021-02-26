package typingsSlinky.googleAppsScript.GoogleAppsScript.Events

import typingsSlinky.googleAppsScript.GoogleAppsScript.Base.User
import typingsSlinky.googleAppsScript.GoogleAppsScript.Document.Document
import typingsSlinky.googleAppsScript.GoogleAppsScript.Script.AuthMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocsOnOpen extends AppsScriptEvent {
  
  var source: Document = js.native
}
object DocsOnOpen {
  
  @scala.inline
  def apply(authMode: AuthMode, source: Document, triggerUid: String, user: User): DocsOnOpen = {
    val __obj = js.Dynamic.literal(authMode = authMode.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], triggerUid = triggerUid.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocsOnOpen]
  }
  
  @scala.inline
  implicit class DocsOnOpenMutableBuilder[Self <: DocsOnOpen] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: Document): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
