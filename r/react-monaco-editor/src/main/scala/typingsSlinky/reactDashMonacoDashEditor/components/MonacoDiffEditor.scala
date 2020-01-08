package typingsSlinky.reactDashMonacoDashEditor.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.monacoDashEditor.monacoDashEditorMod.editor.IDiffEditorConstructionOptions
import typingsSlinky.monacoDashEditor.monacoDashEditorMod.editor.IEditorOverrideServices
import typingsSlinky.monacoDashEditor.monacoDashEditorMod.editor.IModelContentChangedEvent
import typingsSlinky.monacoDashEditor.monacoDashEditorMod.editor.IStandaloneDiffEditor
import typingsSlinky.reactDashMonacoDashEditor.TypeofmonacoEditor
import typingsSlinky.reactDashMonacoDashEditor.reactDashMonacoDashEditorMod.MonacoDiffEditorProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MonacoDiffEditor
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.reactDashMonacoDashEditor.reactDashMonacoDashEditorMod.MonacoDiffEditor
    ] {
  @JSImport("react-monaco-editor", "MonacoDiffEditor")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: height, width */
  def apply(
    context: js.Any = null,
    defaultValue: String = null,
    editorDidMount: (/* editor */ IStandaloneDiffEditor, /* monaco */ TypeofmonacoEditor) => Unit = null,
    editorWillMount: /* monaco */ TypeofmonacoEditor => Unit = null,
    language: String = null,
    onChange: (/* value */ String, /* event */ IModelContentChangedEvent) => Unit = null,
    options: IDiffEditorConstructionOptions = null,
    original: String = null,
    overrideServices: IEditorOverrideServices = null,
    theme: String = null,
    value: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashMonacoDashEditor.reactDashMonacoDashEditorMod.MonacoDiffEditor
  ] = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (editorDidMount != null) __obj.updateDynamic("editorDidMount")(js.Any.fromFunction2(editorDidMount))
    if (editorWillMount != null) __obj.updateDynamic("editorWillMount")(js.Any.fromFunction1(editorWillMount))
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (original != null) __obj.updateDynamic("original")(original.asInstanceOf[js.Any])
    if (overrideServices != null) __obj.updateDynamic("overrideServices")(overrideServices.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashMonacoDashEditor.reactDashMonacoDashEditorMod.MonacoDiffEditor
  ] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashMonacoDashEditor.reactDashMonacoDashEditorMod.MonacoDiffEditor](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = MonacoDiffEditorProps
}

