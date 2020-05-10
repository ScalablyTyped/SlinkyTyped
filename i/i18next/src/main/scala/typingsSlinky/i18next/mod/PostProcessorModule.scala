package typingsSlinky.i18next.mod

import typingsSlinky.i18next.i18nextStrings.postProcessor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Used to extend or manipulate the translated values before returning them in `t` function.
  * Need to be a singleton object.
  */
@js.native
trait PostProcessorModule extends Module {
  /** Unique name */
  var name: String = js.native
  @JSName("type")
  var type_PostProcessorModule: postProcessor = js.native
  def process(value: String, key: String, options: TOptions[StringMap], translator: js.Any): String = js.native
}

object PostProcessorModule {
  @scala.inline
  def apply(
    name: String,
    process: (String, String, TOptions[StringMap], js.Any) => String,
    `type`: postProcessor
  ): PostProcessorModule = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], process = js.Any.fromFunction4(process))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostProcessorModule]
  }
  @scala.inline
  implicit class PostProcessorModuleOps[Self <: PostProcessorModule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProcess(value: (String, String, TOptions[StringMap], js.Any) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("process")(js.Any.fromFunction4(value))
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

