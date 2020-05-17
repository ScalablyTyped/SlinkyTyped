package typingsSlinky.figma.mod.global

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
  implicit def apply(value: ExportSettingsImage): ExportSettings = value.asInstanceOf[ExportSettings]
  @scala.inline
  implicit def apply(value: ExportSettingsPDF): ExportSettings = value.asInstanceOf[ExportSettings]
  @scala.inline
  implicit def apply(value: ExportSettingsSVG): ExportSettings = value.asInstanceOf[ExportSettings]
}

