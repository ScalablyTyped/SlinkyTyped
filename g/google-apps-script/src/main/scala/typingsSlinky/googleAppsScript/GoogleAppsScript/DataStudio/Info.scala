package typingsSlinky.googleAppsScript.GoogleAppsScript.DataStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains info data for the config. Its properties determine how the info is displayed in Data
  * Studio.
  *
  *     var cc = DataStudioApp.createCommunityConnector();
  *     var config = cc.getConfig();
  *
  *     var info1 = config.newInfo()
  *       .setId("info1")
  *       .setText("This text gives some context on the configuration.");
  */
@js.native
trait Info extends StObject {
  
  def setId(id: String): Info = js.native
  
  def setText(text: String): Info = js.native
}
object Info {
  
  @scala.inline
  def apply(setId: String => Info, setText: String => Info): Info = {
    val __obj = js.Dynamic.literal(setId = js.Any.fromFunction1(setId), setText = js.Any.fromFunction1(setText))
    __obj.asInstanceOf[Info]
  }
  
  @scala.inline
  implicit class InfoMutableBuilder[Self <: Info] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSetId(value: String => Info): Self = StObject.set(x, "setId", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetText(value: String => Info): Self = StObject.set(x, "setText", js.Any.fromFunction1(value))
  }
}
