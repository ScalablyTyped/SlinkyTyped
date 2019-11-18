package typingsSlinky.atMaterialDashUiCore.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.facade.ReactRef
import slinky.web.html.`*`.tag
import typingsSlinky.atMaterialDashUiCore.PartialClassNameMapListItemAvatarClassKey
import typingsSlinky.atMaterialDashUiCore.listItemAvatarListItemAvatarMod.ListItemAvatarProps
import typingsSlinky.atMaterialDashUiCore.listItemAvatarMod.default
import typingsSlinky.react.reactMod.CSSProperties
import typingsSlinky.react.reactMod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: className */
object ListItemAvatar
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typingsSlinky.atMaterialDashUiCore.listItemAvatarMod.default].asInstanceOf[String | js.Object]
  def apply(
    classes: PartialClassNameMapListItemAvatarClassKey = null,
    innerRef: Ref[_] | ReactRef[_] = null,
    style: CSSProperties = null,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ListItemAvatarProps
}

