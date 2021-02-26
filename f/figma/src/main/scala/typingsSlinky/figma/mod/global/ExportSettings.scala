package typingsSlinky.figma.mod.global

import typingsSlinky.figma.figmaStrings.JPG
import typingsSlinky.figma.figmaStrings.PDF
import typingsSlinky.figma.figmaStrings.PNG
import typingsSlinky.figma.figmaStrings.SVG
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.figma.mod.global.ExportSettingsImage
  - typingsSlinky.figma.mod.global.ExportSettingsSVG
  - typingsSlinky.figma.mod.global.ExportSettingsPDF
*/
trait ExportSettings extends StObject
object ExportSettings {
  
  @scala.inline
  def ExportSettingsImage(format: JPG | PNG): typingsSlinky.figma.mod.global.ExportSettingsImage = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.figma.mod.global.ExportSettingsImage]
  }
  
  @scala.inline
  def ExportSettingsPDF(format: PDF): typingsSlinky.figma.mod.global.ExportSettingsPDF = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.figma.mod.global.ExportSettingsPDF]
  }
  
  @scala.inline
  def ExportSettingsSVG(format: SVG): typingsSlinky.figma.mod.global.ExportSettingsSVG = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.figma.mod.global.ExportSettingsSVG]
  }
}
