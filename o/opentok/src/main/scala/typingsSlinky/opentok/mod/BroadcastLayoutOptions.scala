package typingsSlinky.opentok.mod

import typingsSlinky.opentok.opentokStrings.bestFit
import typingsSlinky.opentok.opentokStrings.custom
import typingsSlinky.opentok.opentokStrings.horizontalPresentation
import typingsSlinky.opentok.opentokStrings.pip
import typingsSlinky.opentok.opentokStrings.verticalPresentation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BroadcastLayoutOptions extends StObject {
  
  var stylesheet: js.UndefOr[String] = js.native
  
  var `type`: bestFit | pip | verticalPresentation | horizontalPresentation | custom = js.native
}
object BroadcastLayoutOptions {
  
  @scala.inline
  def apply(`type`: bestFit | pip | verticalPresentation | horizontalPresentation | custom): BroadcastLayoutOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BroadcastLayoutOptions]
  }
  
  @scala.inline
  implicit class BroadcastLayoutOptionsMutableBuilder[Self <: BroadcastLayoutOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStylesheet(value: String): Self = StObject.set(x, "stylesheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesheetUndefined: Self = StObject.set(x, "stylesheet", js.undefined)
    
    @scala.inline
    def setType(value: bestFit | pip | verticalPresentation | horizontalPresentation | custom): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
