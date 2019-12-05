package typingsSlinky.reactDashEmailDashEditor.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.react.reactMod.CSSProperties
import typingsSlinky.reactDashEmailDashEditor.reactDashEmailDashEditorMod.AppearanceConfig
import typingsSlinky.reactDashEmailDashEditor.reactDashEmailDashEditorMod.EmailEditorProps
import typingsSlinky.reactDashEmailDashEditor.reactDashEmailDashEditorMod.ToolsConfig
import typingsSlinky.reactDashEmailDashEditor.reactDashEmailDashEditorMod.UnlayerOptions
import typingsSlinky.reactDashEmailDashEditor.reactDashEmailDashEditorMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashEmailDashEditor
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-email-editor", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    appearance: AppearanceConfig = null,
    minHeight: Int | Double = null,
    onLoad: () => Unit = null,
    options: UnlayerOptions = null,
    projectId: Int | Double = null,
    style: CSSProperties = null,
    tools: ToolsConfig = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (appearance != null) __obj.updateDynamic("appearance")(appearance.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction0(onLoad))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tools != null) __obj.updateDynamic("tools")(tools.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = EmailEditorProps
}

