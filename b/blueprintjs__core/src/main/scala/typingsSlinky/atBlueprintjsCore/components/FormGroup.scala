package typingsSlinky.atBlueprintjsCore.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.atBlueprintjsCore.libEsmCommonIntentMod.Intent
import typingsSlinky.atBlueprintjsCore.libEsmComponentsFormsFormGroupMod.IFormGroupProps
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FormGroup
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.atBlueprintjsCore.libEsmComponentsMod.FormGroup] {
  @JSImport("@blueprintjs/core/lib/esm/components", "FormGroup")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, disabled */
  def apply(
    contentClassName: String = null,
    helperText: TagMod[Any] = null,
    `inline`: js.UndefOr[Boolean] = js.undefined,
    intent: Intent = null,
    label: TagMod[Any] = null,
    labelFor: String = null,
    labelInfo: TagMod[Any] = null,
    style: CSSProperties = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.atBlueprintjsCore.libEsmComponentsMod.FormGroup] = {
    val __obj = js.Dynamic.literal()
    if (contentClassName != null) __obj.updateDynamic("contentClassName")(contentClassName.asInstanceOf[js.Any])
    if (helperText != null) __obj.updateDynamic("helperText")(helperText.asInstanceOf[js.Any])
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    if (intent != null) __obj.updateDynamic("intent")(intent.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelFor != null) __obj.updateDynamic("labelFor")(labelFor.asInstanceOf[js.Any])
    if (labelInfo != null) __obj.updateDynamic("labelInfo")(labelInfo.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.atBlueprintjsCore.libEsmComponentsMod.FormGroup] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.atBlueprintjsCore.libEsmComponentsMod.FormGroup](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = IFormGroupProps
}

