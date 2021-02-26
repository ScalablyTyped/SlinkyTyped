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

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.opentok.mod.PredefinedArchiveLayoutOptions
  - typingsSlinky.opentok.mod.CustomArchiveLayoutOptions
*/
trait ArchiveLayoutOptions extends StObject
object ArchiveLayoutOptions {
  
  @scala.inline
  def CustomArchiveLayoutOptions(stylesheet: String, `type`: custom): typingsSlinky.opentok.mod.CustomArchiveLayoutOptions = {
    val __obj = js.Dynamic.literal(stylesheet = stylesheet.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.opentok.mod.CustomArchiveLayoutOptions]
  }
  
  @scala.inline
  def PredefinedArchiveLayoutOptions(`type`: bestFit | pip | verticalPresentation | horizontalPresentation): typingsSlinky.opentok.mod.PredefinedArchiveLayoutOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.opentok.mod.PredefinedArchiveLayoutOptions]
  }
}
