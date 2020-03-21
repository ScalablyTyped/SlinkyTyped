package typingsSlinky.reactFlex.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactFlex.mod.ItemProps
import typingsSlinky.reactFlex.reactFlexStrings.`fit-content`
import typingsSlinky.reactFlex.reactFlexStrings.`max-content`
import typingsSlinky.reactFlex.reactFlexStrings.`min-content`
import typingsSlinky.reactFlex.reactFlexStrings.auto
import typingsSlinky.reactFlex.reactFlexStrings.content
import typingsSlinky.reactFlex.reactFlexStrings.fit
import typingsSlinky.reactFlex.reactFlexStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Item
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactFlex.mod.Item] {
  @JSImport("react-flex", "Item")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    alignContent: String = null,
    alignItems: String = null,
    column: js.UndefOr[Boolean] = js.undefined,
    display: String = null,
    flex: Double | String | Boolean = null,
    flexBasis: Double | none | auto | content | `fit-content` | `min-content` | `max-content` | fit = null,
    flexGrow: Double | String | Boolean = null,
    flexShrink: Double | String = null,
    `inline`: js.UndefOr[Boolean] = js.undefined,
    justifyContent: String = null,
    reverse: js.UndefOr[Boolean] = js.undefined,
    row: js.UndefOr[Boolean] = js.undefined,
    style: js.Any = null,
    wrap: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactFlex.mod.Item] = {
    val __obj = js.Dynamic.literal()
    if (alignContent != null) __obj.updateDynamic("alignContent")(alignContent.asInstanceOf[js.Any])
    if (alignItems != null) __obj.updateDynamic("alignItems")(alignItems.asInstanceOf[js.Any])
    if (!js.isUndefined(column)) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (flex != null) __obj.updateDynamic("flex")(flex.asInstanceOf[js.Any])
    if (flexBasis != null) __obj.updateDynamic("flexBasis")(flexBasis.asInstanceOf[js.Any])
    if (flexGrow != null) __obj.updateDynamic("flexGrow")(flexGrow.asInstanceOf[js.Any])
    if (flexShrink != null) __obj.updateDynamic("flexShrink")(flexShrink.asInstanceOf[js.Any])
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    if (justifyContent != null) __obj.updateDynamic("justifyContent")(justifyContent.asInstanceOf[js.Any])
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse.asInstanceOf[js.Any])
    if (!js.isUndefined(row)) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(wrap)) __obj.updateDynamic("wrap")(wrap.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactFlex.mod.Item] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactFlex.mod.Item](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = ItemProps
}

