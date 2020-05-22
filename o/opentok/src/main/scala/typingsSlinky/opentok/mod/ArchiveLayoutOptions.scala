package typingsSlinky.opentok.mod

import typingsSlinky.opentok.opentokStrings.bestFit
import typingsSlinky.opentok.opentokStrings.custom
import typingsSlinky.opentok.opentokStrings.horizontalPresentation
import typingsSlinky.opentok.opentokStrings.pip
import typingsSlinky.opentok.opentokStrings.verticalPresentation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.opentok.mod.PredefinedArchiveLayoutOptions
  - typingsSlinky.opentok.mod.CustomArchiveLayoutOptions
*/
trait ArchiveLayoutOptions extends js.Object

object ArchiveLayoutOptions {
  @scala.inline
  def PredefinedArchiveLayoutOptions(`type`: bestFit | pip | verticalPresentation | horizontalPresentation): ArchiveLayoutOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArchiveLayoutOptions]
  }
  @scala.inline
  def CustomArchiveLayoutOptions(stylesheet: String, `type`: custom): ArchiveLayoutOptions = {
    val __obj = js.Dynamic.literal(stylesheet = stylesheet.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArchiveLayoutOptions]
  }
}

