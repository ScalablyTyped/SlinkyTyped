package typingsSlinky.minecraftScriptingTypesClient

import typingsSlinky.minecraftScriptingTypesClient.anon.Absorbsinput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This event is used to show a UI screen to the specific player running the client script. This event will add the UI screen to the top of the UI screen stack. The screen will be shown immediately after the event is triggered. Only screens defined in a HTML file can be shown using this event.
  */
@js.native
trait ILoadUIParameters extends StObject {
  
  /**
    * You can define the following options for the screen by setting their value to true or false:
    */
  var options: js.UndefOr[Absorbsinput] = js.native
  
  /**
    * The file path to the screen's HTML file
    */
  var path: String = js.native
}
object ILoadUIParameters {
  
  @scala.inline
  def apply(path: String): ILoadUIParameters = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILoadUIParameters]
  }
  
  @scala.inline
  implicit class ILoadUIParametersMutableBuilder[Self <: ILoadUIParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: Absorbsinput): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
