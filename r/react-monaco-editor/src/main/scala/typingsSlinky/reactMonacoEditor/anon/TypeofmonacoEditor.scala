package typingsSlinky.reactMonacoEditor.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable3
import typingsSlinky.monacoEditor.mod.CancellationTokenSource
import typingsSlinky.monacoEditor.mod.Emitter
import typingsSlinky.monacoEditor.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofmonacoEditor extends js.Object {
  var CancellationTokenSource: Instantiable0[typingsSlinky.monacoEditor.mod.CancellationTokenSource] = js.native
  var Emitter: Instantiable0[typingsSlinky.monacoEditor.mod.Emitter[js.Object]] = js.native
  var KeyMod: TypeofKeyMod = js.native
  var Position: TypeofPosition = js.native
  var Range: TypeofRange = js.native
  var Selection: TypeofSelection = js.native
  var Token: Instantiable3[
    /* offset */ Double, 
    /* type */ String, 
    /* language */ String, 
    typingsSlinky.monacoEditor.mod.Token
  ] = js.native
  var Uri: TypeofUri = js.native
  val editor: Typeofeditor = js.native
  val languages: Typeoflanguages = js.native
  val worker: js.Any = js.native
}

object TypeofmonacoEditor {
  @scala.inline
  def apply(
    CancellationTokenSource: Instantiable0[CancellationTokenSource],
    Emitter: Instantiable0[Emitter[js.Object]],
    KeyMod: TypeofKeyMod,
    Position: TypeofPosition,
    Range: TypeofRange,
    Selection: TypeofSelection,
    Token: Instantiable3[/* offset */ Double, /* type */ String, /* language */ String, Token],
    Uri: TypeofUri,
    editor: Typeofeditor,
    languages: Typeoflanguages,
    worker: js.Any
  ): TypeofmonacoEditor = {
    val __obj = js.Dynamic.literal(CancellationTokenSource = CancellationTokenSource.asInstanceOf[js.Any], Emitter = Emitter.asInstanceOf[js.Any], KeyMod = KeyMod.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any], Selection = Selection.asInstanceOf[js.Any], Token = Token.asInstanceOf[js.Any], Uri = Uri.asInstanceOf[js.Any], editor = editor.asInstanceOf[js.Any], languages = languages.asInstanceOf[js.Any], worker = worker.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofmonacoEditor]
  }
  @scala.inline
  implicit class TypeofmonacoEditorOps[Self <: TypeofmonacoEditor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancellationTokenSource(value: Instantiable0[CancellationTokenSource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CancellationTokenSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmitter(value: Instantiable0[Emitter[js.Object]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Emitter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyMod(value: TypeofKeyMod): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyMod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: TypeofPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRange(value: TypeofRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelection(value: TypeofSelection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Selection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToken(value: Instantiable3[/* offset */ Double, /* type */ String, /* language */ String, Token]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUri(value: TypeofUri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEditor(value: Typeofeditor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanguages(value: Typeoflanguages): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorker(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("worker")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

