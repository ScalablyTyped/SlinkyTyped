package typingsSlinky.reactMonacoEditor.mod

import typingsSlinky.monacoEditor.mod.editor.IEditorConstructionOptions
import typingsSlinky.monacoEditor.mod.editor.IEditorOverrideServices
import typingsSlinky.monacoEditor.mod.editor.IModelContentChangedEvent
import typingsSlinky.monacoEditor.mod.editor.IStandaloneCodeEditor
import typingsSlinky.reactMonacoEditor.anon.TypeofmonacoEditor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MonacoEditorProps extends MonacoEditorBaseProps {
  /**
    * An event emitted when the editor has been mounted (similar to componentDidMount of React).
    */
  var editorDidMount: js.UndefOr[EditorDidMount] = js.native
  /**
    * An event emitted before the editor mounted (similar to componentWillMount of React).
    */
  var editorWillMount: js.UndefOr[EditorWillMount] = js.native
  /**
    * An event emitted when the content of the current model has changed.
    */
  var onChange: js.UndefOr[ChangeHandler] = js.native
  /**
    * Refer to Monaco interface {monaco.editor.IEditorConstructionOptions}.
    */
  var options: js.UndefOr[IEditorConstructionOptions] = js.native
  /**
    * Refer to Monaco interface {monaco.editor.IEditorOverrideServices}.
    */
  var overrideServices: js.UndefOr[IEditorOverrideServices] = js.native
  /**
    * Value of the auto created model in the editor.
    * If you specify `null` or `undefined` for this property, the component behaves in uncontrolled mode.
    * Otherwise, it behaves in controlled mode.
    */
  var value: js.UndefOr[String | Null] = js.native
}

object MonacoEditorProps {
  @scala.inline
  def apply(): MonacoEditorProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MonacoEditorProps]
  }
  @scala.inline
  implicit class MonacoEditorPropsOps[Self <: MonacoEditorProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEditorDidMount(value: (/* editor */ IStandaloneCodeEditor, /* monaco */ TypeofmonacoEditor) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editorDidMount")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutEditorDidMount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editorDidMount")(js.undefined)
        ret
    }
    @scala.inline
    def withEditorWillMount(value: /* monaco */ TypeofmonacoEditor => Unit | IEditorConstructionOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editorWillMount")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutEditorWillMount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editorWillMount")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: (/* value */ String, /* event */ IModelContentChangedEvent) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: IEditorConstructionOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withOverrideServices(value: IEditorOverrideServices): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideServices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverrideServices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideServices")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
    @scala.inline
    def withValueNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(null)
        ret
    }
  }
  
}

