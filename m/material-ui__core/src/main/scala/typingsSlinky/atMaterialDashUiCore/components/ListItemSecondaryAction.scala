package typingsSlinky.atMaterialDashUiCore.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.facade.ReactRef
import slinky.web.html.`*`.tag
import typingsSlinky.atMaterialDashUiCore.PartialClassNameMapListItemSecondaryActionClassKey
import typingsSlinky.atMaterialDashUiCore.listItemSecondaryActionListItemSecondaryActionMod.ListItemSecondaryActionProps
import typingsSlinky.atMaterialDashUiCore.listItemSecondaryActionMod.default
import typingsSlinky.react.reactMod.CSSProperties
import typingsSlinky.react.reactMod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ListItemSecondaryAction
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("@material-ui/core/ListItemSecondaryAction", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    classes: PartialClassNameMapListItemSecondaryActionClassKey = null,
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
  type Props = ListItemSecondaryActionProps
}

