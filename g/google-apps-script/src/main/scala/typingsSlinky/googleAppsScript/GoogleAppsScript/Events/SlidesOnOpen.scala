package typingsSlinky.googleAppsScript.GoogleAppsScript.Events

import typingsSlinky.googleAppsScript.GoogleAppsScript.Base.User
import typingsSlinky.googleAppsScript.GoogleAppsScript.Script.AuthMode
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Presentation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SlidesOnOpen extends AppsScriptEvent {
  
  var source: Presentation = js.native
}
object SlidesOnOpen {
  
  @scala.inline
  def apply(authMode: AuthMode, source: Presentation, triggerUid: String, user: User): SlidesOnOpen = {
    val __obj = js.Dynamic.literal(authMode = authMode.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], triggerUid = triggerUid.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlidesOnOpen]
  }
  
  @scala.inline
  implicit class SlidesOnOpenMutableBuilder[Self <: SlidesOnOpen] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: Presentation): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
