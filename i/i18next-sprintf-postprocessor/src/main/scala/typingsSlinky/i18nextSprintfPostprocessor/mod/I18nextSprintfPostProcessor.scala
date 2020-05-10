package typingsSlinky.i18nextSprintfPostprocessor.mod

import typingsSlinky.i18next.mod.PostProcessorModule
import typingsSlinky.i18nextSprintfPostprocessor.AnonPostProcess
import typingsSlinky.i18nextSprintfPostprocessor.i18nextSprintfPostprocessorStrings.postProcessor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait I18nextSprintfPostProcessor extends PostProcessorModule {
  @JSName("type")
  var type_I18nextSprintfPostProcessor: postProcessor = js.native
  def overloadTranslationOptionHandler(args: js.Array[String]): AnonPostProcess = js.native
  def process(value: js.Any, key: String, options: js.Any): js.Any = js.native
}

object I18nextSprintfPostProcessor {
  @scala.inline
  def apply(
    name: String,
    overloadTranslationOptionHandler: js.Array[String] => AnonPostProcess,
    process: (js.Any, String, js.Any) => js.Any,
    `type`: postProcessor
  ): I18nextSprintfPostProcessor = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], overloadTranslationOptionHandler = js.Any.fromFunction1(overloadTranslationOptionHandler), process = js.Any.fromFunction3(process))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[I18nextSprintfPostProcessor]
  }
  @scala.inline
  implicit class I18nextSprintfPostProcessorOps[Self <: I18nextSprintfPostProcessor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOverloadTranslationOptionHandler(value: js.Array[String] => AnonPostProcess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overloadTranslationOptionHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withProcess(value: (js.Any, String, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("process")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withType(value: postProcessor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

