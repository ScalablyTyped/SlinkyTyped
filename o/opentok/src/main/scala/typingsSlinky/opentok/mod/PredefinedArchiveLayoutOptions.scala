package typingsSlinky.opentok.mod

import typingsSlinky.opentok.opentokStrings.bestFit
import typingsSlinky.opentok.opentokStrings.horizontalPresentation
import typingsSlinky.opentok.opentokStrings.pip
import typingsSlinky.opentok.opentokStrings.verticalPresentation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PredefinedArchiveLayoutOptions extends ArchiveLayoutOptions {
  
  var `type`: bestFit | pip | verticalPresentation | horizontalPresentation = js.native
}
object PredefinedArchiveLayoutOptions {
  
  @scala.inline
  def apply(`type`: bestFit | pip | verticalPresentation | horizontalPresentation): PredefinedArchiveLayoutOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PredefinedArchiveLayoutOptions]
  }
  
  @scala.inline
  implicit class PredefinedArchiveLayoutOptionsMutableBuilder[Self <: PredefinedArchiveLayoutOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: bestFit | pip | verticalPresentation | horizontalPresentation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
