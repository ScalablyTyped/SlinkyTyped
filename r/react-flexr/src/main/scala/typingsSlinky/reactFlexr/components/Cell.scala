package typingsSlinky.reactFlexr.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactFlexr.ReactFlexr.CellProps
import typingsSlinky.reactFlexr.reactFlexrStrings.bottom
import typingsSlinky.reactFlexr.reactFlexrStrings.center
import typingsSlinky.reactFlexr.reactFlexrStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Cell
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactFlexr.mod.Cell] {
  @JSImport("react-flexr", "Cell")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    align: top | center | bottom = null,
    desk: String | Double = null,
    flex: js.UndefOr[Boolean] = js.undefined,
    gutter: String = null,
    lap: String | Double = null,
    palm: String | Double = null,
    portable: String | Double = null,
    size: String | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactFlexr.mod.Cell] = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (desk != null) __obj.updateDynamic("desk")(desk.asInstanceOf[js.Any])
    if (!js.isUndefined(flex)) __obj.updateDynamic("flex")(flex.asInstanceOf[js.Any])
    if (gutter != null) __obj.updateDynamic("gutter")(gutter.asInstanceOf[js.Any])
    if (lap != null) __obj.updateDynamic("lap")(lap.asInstanceOf[js.Any])
    if (palm != null) __obj.updateDynamic("palm")(palm.asInstanceOf[js.Any])
    if (portable != null) __obj.updateDynamic("portable")(portable.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactFlexr.mod.Cell] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactFlexr.mod.Cell](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = CellProps
}

