package typingsSlinky.reactMonacoEditor.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.monacoEditor.mod.editor.IDiffEditorConstructionOptions
import typingsSlinky.monacoEditor.mod.editor.IEditorOverrideServices
import typingsSlinky.monacoEditor.mod.editor.IModelContentChangedEvent
import typingsSlinky.monacoEditor.mod.editor.IStandaloneDiffEditor
import typingsSlinky.monacoEditor.mod.editor.IStandaloneEditorConstructionOptions
import typingsSlinky.reactMonacoEditor.anon.TypeofmonacoEditor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_MonacoDiffEditorProps_2135082855[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  
  @scala.inline
  def defaultValue(value: String): this.type = set("defaultValue", value.asInstanceOf[js.Any])
  
  @scala.inline
  def editorDidMount(value: (/* editor */ IStandaloneDiffEditor, /* monaco */ TypeofmonacoEditor) => Unit): this.type = set("editorDidMount", js.Any.fromFunction2(value))
  
  @scala.inline
  def editorWillMount(value: /* monaco */ TypeofmonacoEditor => Unit | IStandaloneEditorConstructionOptions): this.type = set("editorWillMount", js.Any.fromFunction1(value))
  
  @scala.inline
  def height(value: String | Double): this.type = set("height", value.asInstanceOf[js.Any])
  
  @scala.inline
  def language(value: String): this.type = set("language", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onChange(value: (/* value */ String, /* event */ IModelContentChangedEvent) => Unit): this.type = set("onChange", js.Any.fromFunction2(value))
  
  @scala.inline
  def options(value: IDiffEditorConstructionOptions): this.type = set("options", value.asInstanceOf[js.Any])
  
  @scala.inline
  def original(value: String): this.type = set("original", value.asInstanceOf[js.Any])
  
  @scala.inline
  def overrideServices(value: IEditorOverrideServices): this.type = set("overrideServices", value.asInstanceOf[js.Any])
  
  @scala.inline
  def theme(value: String): this.type = set("theme", value.asInstanceOf[js.Any])
  
  @scala.inline
  def themeNull: this.type = set("theme", null)
  
  @scala.inline
  def value(value: String): this.type = set("value", value.asInstanceOf[js.Any])
  
  @scala.inline
  def width(value: String | Double): this.type = set("width", value.asInstanceOf[js.Any])
}
