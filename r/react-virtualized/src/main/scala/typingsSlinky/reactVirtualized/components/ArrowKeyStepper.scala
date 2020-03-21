package typingsSlinky.reactVirtualized.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactVirtualized.esArrowKeyStepperMod.ArrowKeyStepperProps
import typingsSlinky.reactVirtualized.esArrowKeyStepperMod.ScrollIndices
import typingsSlinky.reactVirtualized.reactVirtualizedStrings.cells
import typingsSlinky.reactVirtualized.reactVirtualizedStrings.edges
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ArrowKeyStepper
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactVirtualized.mod.ArrowKeyStepper] {
  @JSImport("react-virtualized", "ArrowKeyStepper")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, disabled */
  def apply(
    columnCount: Double,
    rowCount: Double,
    isControlled: js.UndefOr[Boolean] = js.undefined,
    mode: edges | cells = null,
    onScrollToChange: /* params */ ScrollIndices => Unit = null,
    scrollToColumn: Int | Double = null,
    scrollToRow: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactVirtualized.mod.ArrowKeyStepper] = {
    val __obj = js.Dynamic.literal(columnCount = columnCount.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any])
    if (!js.isUndefined(isControlled)) __obj.updateDynamic("isControlled")(isControlled.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (onScrollToChange != null) __obj.updateDynamic("onScrollToChange")(js.Any.fromFunction1(onScrollToChange))
    if (scrollToColumn != null) __obj.updateDynamic("scrollToColumn")(scrollToColumn.asInstanceOf[js.Any])
    if (scrollToRow != null) __obj.updateDynamic("scrollToRow")(scrollToRow.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ArrowKeyStepperProps
}

