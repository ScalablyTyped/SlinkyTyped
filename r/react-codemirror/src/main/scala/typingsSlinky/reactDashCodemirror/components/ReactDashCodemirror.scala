package typingsSlinky.reactDashCodemirror.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.codemirror.codemirrorMod.Editor
import typingsSlinky.codemirror.codemirrorMod.EditorChange
import typingsSlinky.codemirror.codemirrorMod.EditorConfiguration
import typingsSlinky.reactDashCodemirror.ReactCodeMirror.ReactCodeMirrorProps
import typingsSlinky.reactDashCodemirror.reactDashCodemirrorMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashCodemirror
  extends ExternalComponentWithAttributesWithRefType[tag.type, ^] {
  @JSImport("react-codemirror", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: autoFocus, className, name, onScroll */
  def apply(
    autoSave: js.UndefOr[Boolean] = js.undefined,
    codeMirrorInstance: (/* host */ js.Any, /* options */ js.UndefOr[EditorConfiguration]) => Editor = null,
    defaultValue: String = null,
    onChange: (/* newValue */ String, /* change */ EditorChange) => _ = null,
    onCursorActivity: /* codemirror */ Editor => _ = null,
    onFocusChange: /* focused */ Boolean => _ = null,
    options: EditorConfiguration = null,
    path: String = null,
    preserveScrollPosition: js.UndefOr[Boolean] = js.undefined,
    value: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ^] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoSave)) __obj.updateDynamic("autoSave")(autoSave.asInstanceOf[js.Any])
    if (codeMirrorInstance != null) __obj.updateDynamic("codeMirrorInstance")(js.Any.fromFunction2(codeMirrorInstance))
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onCursorActivity != null) __obj.updateDynamic("onCursorActivity")(js.Any.fromFunction1(onCursorActivity))
    if (onFocusChange != null) __obj.updateDynamic("onFocusChange")(js.Any.fromFunction1(onFocusChange))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveScrollPosition)) __obj.updateDynamic("preserveScrollPosition")(preserveScrollPosition.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ReactCodeMirrorProps
}

