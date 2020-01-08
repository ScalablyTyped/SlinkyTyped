package typingsSlinky.primereact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.primereact.Anon_DeltaHtmlValue
import typingsSlinky.primereact.Anon_OldRange
import typingsSlinky.primereact.componentsEditorEditorMod.EditorProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Editor
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.primereact.editorMod.Editor] {
  @JSImport("primereact/editor", "Editor")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, id, placeholder */
  def apply(
    formats: js.Array[_] = null,
    headerTemplate: typingsSlinky.react.reactMod._Global_.JSX.Element = null,
    modules: js.Any = null,
    onSelectionChange: /* e */ Anon_OldRange => Unit = null,
    onTextChange: /* e */ Anon_DeltaHtmlValue => Unit = null,
    readonly: js.UndefOr[Boolean] = js.undefined,
    style: js.Object = null,
    theme: String = null,
    value: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.primereact.editorMod.Editor] = {
    val __obj = js.Dynamic.literal()
    if (formats != null) __obj.updateDynamic("formats")(formats.asInstanceOf[js.Any])
    if (headerTemplate != null) __obj.updateDynamic("headerTemplate")(headerTemplate.asInstanceOf[js.Any])
    if (modules != null) __obj.updateDynamic("modules")(modules.asInstanceOf[js.Any])
    if (onSelectionChange != null) __obj.updateDynamic("onSelectionChange")(js.Any.fromFunction1(onSelectionChange))
    if (onTextChange != null) __obj.updateDynamic("onTextChange")(js.Any.fromFunction1(onTextChange))
    if (!js.isUndefined(readonly)) __obj.updateDynamic("readonly")(readonly.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.primereact.editorMod.Editor] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.primereact.editorMod.Editor](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = EditorProps
}

