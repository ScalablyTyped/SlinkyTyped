package typingsSlinky.reactRte.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.draftJs.mod.ContentBlock
import typingsSlinky.reactRte.mod.CustomControl
import typingsSlinky.reactRte.mod.EditorValue
import typingsSlinky.reactRte.mod.ToolbarConfig
import typingsSlinky.reactRte.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactRte
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-rte", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: autoFocus, className, disabled, placeholder, readOnly */
  def apply(
    value: EditorValue,
    blockStyleFn: /* block */ ContentBlock => js.UndefOr[String] = null,
    customControls: js.Array[CustomControl] = null,
    editorClassName: String = null,
    editorStyle: js.Object = null,
    handleReturn: /* event */ js.Object => Boolean = null,
    keyBindingFn: /* event */ js.Object => js.UndefOr[String] = null,
    onChange: /* value */ EditorValue => js.Any = null,
    rootStyle: js.Object = null,
    toolbarClassName: String = null,
    toolbarConfig: ToolbarConfig = null,
    toolbarStyle: js.Object = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (blockStyleFn != null) __obj.updateDynamic("blockStyleFn")(js.Any.fromFunction1(blockStyleFn))
    if (customControls != null) __obj.updateDynamic("customControls")(customControls.asInstanceOf[js.Any])
    if (editorClassName != null) __obj.updateDynamic("editorClassName")(editorClassName.asInstanceOf[js.Any])
    if (editorStyle != null) __obj.updateDynamic("editorStyle")(editorStyle.asInstanceOf[js.Any])
    if (handleReturn != null) __obj.updateDynamic("handleReturn")(js.Any.fromFunction1(handleReturn))
    if (keyBindingFn != null) __obj.updateDynamic("keyBindingFn")(js.Any.fromFunction1(keyBindingFn))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (rootStyle != null) __obj.updateDynamic("rootStyle")(rootStyle.asInstanceOf[js.Any])
    if (toolbarClassName != null) __obj.updateDynamic("toolbarClassName")(toolbarClassName.asInstanceOf[js.Any])
    if (toolbarConfig != null) __obj.updateDynamic("toolbarConfig")(toolbarConfig.asInstanceOf[js.Any])
    if (toolbarStyle != null) __obj.updateDynamic("toolbarStyle")(toolbarStyle.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = typingsSlinky.reactRte.mod.Props
}

