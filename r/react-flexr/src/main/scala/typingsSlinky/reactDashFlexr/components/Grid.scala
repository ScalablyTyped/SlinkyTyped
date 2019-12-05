package typingsSlinky.reactDashFlexr.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashFlexr.__ReactFlexr.GridProps
import typingsSlinky.reactDashFlexr.reactDashFlexrStrings.bottom
import typingsSlinky.reactDashFlexr.reactDashFlexrStrings.center
import typingsSlinky.reactDashFlexr.reactDashFlexrStrings.left
import typingsSlinky.reactDashFlexr.reactDashFlexrStrings.right
import typingsSlinky.reactDashFlexr.reactDashFlexrStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Grid
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashFlexr.reactDashFlexrMod.Grid] {
  @JSImport("react-flexr", "Grid")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    align: top | center | bottom = null,
    flexCells: js.UndefOr[Boolean] = js.undefined,
    gutter: String = null,
    hAlign: left | center | right = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactDashFlexr.reactDashFlexrMod.Grid] = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(flexCells)) __obj.updateDynamic("flexCells")(flexCells.asInstanceOf[js.Any])
    if (gutter != null) __obj.updateDynamic("gutter")(gutter.asInstanceOf[js.Any])
    if (hAlign != null) __obj.updateDynamic("hAlign")(hAlign.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = GridProps
}

