package typingsSlinky.atBlueprintjsTable.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.atBlueprintjsTable.libEsmCellFormatsTruncatedFormatMod.ITrucatedFormateMeasureByApproximateOptions
import typingsSlinky.atBlueprintjsTable.libEsmCellFormatsTruncatedFormatMod.ITruncatedFormatProps
import typingsSlinky.atBlueprintjsTable.libEsmCellFormatsTruncatedFormatMod.TruncatedPopoverMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TruncatedFormat
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.atBlueprintjsTable.atBlueprintjsTableMod.TruncatedFormat] {
  @JSImport("@blueprintjs/table", "TruncatedFormat")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    detectTruncation: js.UndefOr[Boolean] = js.undefined,
    measureByApproxOptions: ITrucatedFormateMeasureByApproximateOptions = null,
    parentCellHeight: Int | Double = null,
    parentCellWidth: Int | Double = null,
    preformatted: js.UndefOr[Boolean] = js.undefined,
    showPopover: TruncatedPopoverMode = null,
    truncateLength: Int | Double = null,
    truncationSuffix: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.atBlueprintjsTable.atBlueprintjsTableMod.TruncatedFormat] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(detectTruncation)) __obj.updateDynamic("detectTruncation")(detectTruncation.asInstanceOf[js.Any])
    if (measureByApproxOptions != null) __obj.updateDynamic("measureByApproxOptions")(measureByApproxOptions.asInstanceOf[js.Any])
    if (parentCellHeight != null) __obj.updateDynamic("parentCellHeight")(parentCellHeight.asInstanceOf[js.Any])
    if (parentCellWidth != null) __obj.updateDynamic("parentCellWidth")(parentCellWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(preformatted)) __obj.updateDynamic("preformatted")(preformatted.asInstanceOf[js.Any])
    if (showPopover != null) __obj.updateDynamic("showPopover")(showPopover.asInstanceOf[js.Any])
    if (truncateLength != null) __obj.updateDynamic("truncateLength")(truncateLength.asInstanceOf[js.Any])
    if (truncationSuffix != null) __obj.updateDynamic("truncationSuffix")(truncationSuffix.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.atBlueprintjsTable.atBlueprintjsTableMod.TruncatedFormat] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.atBlueprintjsTable.atBlueprintjsTableMod.TruncatedFormat](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = ITruncatedFormatProps
}

