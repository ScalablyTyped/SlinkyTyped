package typingsSlinky.reactEmailEditor.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactEmailEditor.mod.AppearanceConfig
import typingsSlinky.reactEmailEditor.mod.EmailEditorProps
import typingsSlinky.reactEmailEditor.mod.ToolsConfig
import typingsSlinky.reactEmailEditor.mod.UnlayerOptions
import typingsSlinky.reactEmailEditor.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactEmailEditor
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-email-editor", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: style */
  def apply(
    appearance: AppearanceConfig = null,
    minHeight: Int | Double = null,
    onLoad: () => Unit = null,
    options: UnlayerOptions = null,
    projectId: Int | Double = null,
    tools: ToolsConfig = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (appearance != null) __obj.updateDynamic("appearance")(appearance.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction0(onLoad))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    if (tools != null) __obj.updateDynamic("tools")(tools.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactEmailEditor.mod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = EmailEditorProps
}

