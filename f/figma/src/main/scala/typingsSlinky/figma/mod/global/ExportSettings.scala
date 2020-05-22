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
  def ExportSettingsImage(
    format: JPG | PNG,
    constraint: ExportSettingsConstraints = null,
    contentsOnly: js.UndefOr[Boolean] = js.undefined,
    suffix: String = null
  ): ExportSettings = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    if (constraint != null) __obj.updateDynamic("constraint")(constraint.asInstanceOf[js.Any])
    if (!js.isUndefined(contentsOnly)) __obj.updateDynamic("contentsOnly")(contentsOnly.get.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportSettings]
  }
  @scala.inline
  def ExportSettingsSVG(
    format: SVG,
    contentsOnly: js.UndefOr[Boolean] = js.undefined,
    suffix: String = null,
    svgIdAttribute: js.UndefOr[Boolean] = js.undefined,
    svgOutlineText: js.UndefOr[Boolean] = js.undefined,
    svgSimplifyStroke: js.UndefOr[Boolean] = js.undefined
  ): ExportSettings = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    if (!js.isUndefined(contentsOnly)) __obj.updateDynamic("contentsOnly")(contentsOnly.get.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix.asInstanceOf[js.Any])
    if (!js.isUndefined(svgIdAttribute)) __obj.updateDynamic("svgIdAttribute")(svgIdAttribute.get.asInstanceOf[js.Any])
    if (!js.isUndefined(svgOutlineText)) __obj.updateDynamic("svgOutlineText")(svgOutlineText.get.asInstanceOf[js.Any])
    if (!js.isUndefined(svgSimplifyStroke)) __obj.updateDynamic("svgSimplifyStroke")(svgSimplifyStroke.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportSettings]
  }
  @scala.inline
  def ExportSettingsPDF(format: PDF, contentsOnly: js.UndefOr[Boolean] = js.undefined, suffix: String = null): ExportSettings = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    if (!js.isUndefined(contentsOnly)) __obj.updateDynamic("contentsOnly")(contentsOnly.get.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportSettings]
  }
}

