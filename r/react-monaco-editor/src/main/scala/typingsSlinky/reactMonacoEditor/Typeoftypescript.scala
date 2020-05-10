package typingsSlinky.reactMonacoEditor

import typingsSlinky.monacoEditor.mod.languages.typescript.LanguageServiceDefaults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeoftypescript extends js.Object {
  var getJavaScriptWorker: js.Function0[js.Promise[_]] = js.native
  var getTypeScriptWorker: js.Function0[js.Promise[_]] = js.native
  var javascriptDefaults: LanguageServiceDefaults = js.native
  var typescriptDefaults: LanguageServiceDefaults = js.native
  var typescriptVersion: String = js.native
}

object Typeoftypescript {
  @scala.inline
  def apply(
    getJavaScriptWorker: () => js.Promise[_],
    getTypeScriptWorker: () => js.Promise[_],
    javascriptDefaults: LanguageServiceDefaults,
    typescriptDefaults: LanguageServiceDefaults,
    typescriptVersion: String
  ): Typeoftypescript = {
    val __obj = js.Dynamic.literal(getJavaScriptWorker = js.Any.fromFunction0(getJavaScriptWorker), getTypeScriptWorker = js.Any.fromFunction0(getTypeScriptWorker), javascriptDefaults = javascriptDefaults.asInstanceOf[js.Any], typescriptDefaults = typescriptDefaults.asInstanceOf[js.Any], typescriptVersion = typescriptVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeoftypescript]
  }
  @scala.inline
  implicit class TypeoftypescriptOps[Self <: Typeoftypescript] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetJavaScriptWorker(value: () => js.Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getJavaScriptWorker")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTypeScriptWorker(value: () => js.Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTypeScriptWorker")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withJavascriptDefaults(value: LanguageServiceDefaults): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("javascriptDefaults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypescriptDefaults(value: LanguageServiceDefaults): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typescriptDefaults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypescriptVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typescriptVersion")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

