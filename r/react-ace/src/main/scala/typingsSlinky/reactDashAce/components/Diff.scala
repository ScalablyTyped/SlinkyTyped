package typingsSlinky.reactDashAce.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashAce.libDiffMod.IDiffEditorProps
import typingsSlinky.reactDashAce.libDiffMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Diff
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-ace/lib/diff", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, name, onLoad, onPaste, onScroll, readOnly */
  def apply(
    cursorStart: Int | Double = null,
    editorProps: js.Object = null,
    enableBasicAutocompletion: Boolean | js.Array[String] = null,
    enableLiveAutocompletion: Boolean | js.Array[String] = null,
    focus: js.UndefOr[Boolean] = js.undefined,
    fontSize: Int | Double = null,
    height: String = null,
    highlightActiveLine: js.UndefOr[Boolean] = js.undefined,
    maxLines: Int | Double = null,
    minLines: Int | Double = null,
    mode: String = null,
    onChange: (/* value */ js.Array[String], /* event */ js.UndefOr[js.Any]) => Unit = null,
    orientation: String = null,
    scrollMargin: js.Array[Double] = null,
    setOptions: js.Object = null,
    showGutter: js.UndefOr[Boolean] = js.undefined,
    showPrintMargin: js.UndefOr[Boolean] = js.undefined,
    splits: Int | Double = null,
    style: js.Object = null,
    tabSize: Int | Double = null,
    theme: String = null,
    value: js.Array[String] = null,
    width: String = null,
    wrapEnabled: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (cursorStart != null) __obj.updateDynamic("cursorStart")(cursorStart.asInstanceOf[js.Any])
    if (editorProps != null) __obj.updateDynamic("editorProps")(editorProps.asInstanceOf[js.Any])
    if (enableBasicAutocompletion != null) __obj.updateDynamic("enableBasicAutocompletion")(enableBasicAutocompletion.asInstanceOf[js.Any])
    if (enableLiveAutocompletion != null) __obj.updateDynamic("enableLiveAutocompletion")(enableLiveAutocompletion.asInstanceOf[js.Any])
    if (!js.isUndefined(focus)) __obj.updateDynamic("focus")(focus.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(highlightActiveLine)) __obj.updateDynamic("highlightActiveLine")(highlightActiveLine.asInstanceOf[js.Any])
    if (maxLines != null) __obj.updateDynamic("maxLines")(maxLines.asInstanceOf[js.Any])
    if (minLines != null) __obj.updateDynamic("minLines")(minLines.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (scrollMargin != null) __obj.updateDynamic("scrollMargin")(scrollMargin.asInstanceOf[js.Any])
    if (setOptions != null) __obj.updateDynamic("setOptions")(setOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(showGutter)) __obj.updateDynamic("showGutter")(showGutter.asInstanceOf[js.Any])
    if (!js.isUndefined(showPrintMargin)) __obj.updateDynamic("showPrintMargin")(showPrintMargin.asInstanceOf[js.Any])
    if (splits != null) __obj.updateDynamic("splits")(splits.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tabSize != null) __obj.updateDynamic("tabSize")(tabSize.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapEnabled)) __obj.updateDynamic("wrapEnabled")(wrapEnabled.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactDashAce.libDiffMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = IDiffEditorProps
}

