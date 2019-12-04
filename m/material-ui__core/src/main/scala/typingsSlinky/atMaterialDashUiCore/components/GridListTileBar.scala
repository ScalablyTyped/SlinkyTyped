package typingsSlinky.atMaterialDashUiCore.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.core.facade.ReactRef
import slinky.web.html.`*`.tag
import typingsSlinky.atMaterialDashUiCore.PartialClassNameMapGridListTileBarClassKey
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.bottom
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.left
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.right
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.top
import typingsSlinky.atMaterialDashUiCore.gridListTileBarGridListTileBarMod.GridListTileBarProps
import typingsSlinky.atMaterialDashUiCore.gridListTileBarMod.default
import typingsSlinky.react.reactMod.CSSProperties
import typingsSlinky.react.reactMod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object GridListTileBar
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("@material-ui/core/GridListTileBar", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    actionIcon: TagMod[Any] = null,
    actionPosition: left | right = null,
    classes: PartialClassNameMapGridListTileBarClassKey = null,
    innerRef: Ref[_] | ReactRef[_] = null,
    style: CSSProperties = null,
    subtitle: TagMod[Any] = null,
    title: TagMod[Any] = null,
    titlePosition: top | bottom = null,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (actionIcon != null) __obj.updateDynamic("actionIcon")(actionIcon.asInstanceOf[js.Any])
    if (actionPosition != null) __obj.updateDynamic("actionPosition")(actionPosition.asInstanceOf[js.Any])
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titlePosition != null) __obj.updateDynamic("titlePosition")(titlePosition.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = GridListTileBarProps
}

