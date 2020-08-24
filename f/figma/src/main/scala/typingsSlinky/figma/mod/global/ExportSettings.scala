package typingsSlinky.figma.mod.global

import typingsSlinky.figma.figmaStrings.JPG
import typingsSlinky.figma.figmaStrings.PDF
import typingsSlinky.figma.figmaStrings.PNG
import typingsSlinky.figma.figmaStrings.SVG
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.figma.mod.global.ExportSettingsImage
  - typingsSlinky.figma.mod.global.ExportSettingsSVG
  - typingsSlinky.figma.mod.global.ExportSettingsPDF
*/
trait ExportSettings extends js.Object

object ExportSettings {
  @scala.inline
  def ExportSettingsImage(format: JPG | PNG): ExportSettings = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportSettings]
  }
  @scala.inline
  def ExportSettingsSVG(format: SVG): ExportSettings = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportSettings]
  }
  @scala.inline
  def ExportSettingsPDF(format: PDF): ExportSettings = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportSettings]
  }
}

