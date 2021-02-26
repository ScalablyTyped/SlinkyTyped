package typingsSlinky.opentok.mod

import typingsSlinky.opentok.opentokStrings.custom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomArchiveLayoutOptions extends ArchiveLayoutOptions {
  
  var stylesheet: String = js.native
  
  var `type`: custom = js.native
}
object CustomArchiveLayoutOptions {
  
  @scala.inline
  def apply(stylesheet: String, `type`: custom): CustomArchiveLayoutOptions = {
    val __obj = js.Dynamic.literal(stylesheet = stylesheet.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomArchiveLayoutOptions]
  }
  
  @scala.inline
  implicit class CustomArchiveLayoutOptionsMutableBuilder[Self <: CustomArchiveLayoutOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStylesheet(value: String): Self = StObject.set(x, "stylesheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: custom): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
