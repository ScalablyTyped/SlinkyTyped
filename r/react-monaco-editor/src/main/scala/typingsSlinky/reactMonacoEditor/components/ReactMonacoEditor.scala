package typingsSlinky.reactMonacoEditor.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.monacoEditor.mod.editor.IEditorConstructionOptions
import typingsSlinky.monacoEditor.mod.editor.IEditorOverrideServices
import typingsSlinky.monacoEditor.mod.editor.IModelContentChangedEvent
import typingsSlinky.monacoEditor.mod.editor.IStandaloneCodeEditor
import typingsSlinky.reactMonacoEditor.TypeofmonacoEditor
import typingsSlinky.reactMonacoEditor.mod.MonacoEditorProps
import typingsSlinky.reactMonacoEditor.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactMonacoEditor
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-monaco-editor", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    context: js.Any = null,
    defaultValue: String = null,
    editorDidMount: (/* editor */ IStandaloneCodeEditor, /* monaco */ TypeofmonacoEditor) => Unit = null,
    editorWillMount: /* monaco */ TypeofmonacoEditor => Unit | IEditorConstructionOptions = null,
    height: String | Double = null,
    language: String = null,
    onChange: (/* value */ String, /* event */ IModelContentChangedEvent) => Unit = null,
    options: IEditorConstructionOptions = null,
    overrideServices: IEditorOverrideServices = null,
    theme: String = null,
    value: String = null,
    width: String | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (editorDidMount != null) __obj.updateDynamic("editorDidMount")(js.Any.fromFunction2(editorDidMount))
    if (editorWillMount != null) __obj.updateDynamic("editorWillMount")(js.Any.fromFunction1(editorWillMount))
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (overrideServices != null) __obj.updateDynamic("overrideServices")(overrideServices.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactMonacoEditor.mod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = MonacoEditorProps
}

