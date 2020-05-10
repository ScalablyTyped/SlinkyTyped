package typingsSlinky.globalizeCompiler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompileTemplateOptions extends js.Object {
  /**
    * the source of the compiled formatters and parsers.
    */
  var code: String = js.native
  /**
    * a list of globalize runtime modules that the compiled code depends on, e.g. globalize-runtime/number.
    */
  var dependencies: js.Array[String] = js.native
}

object CompileTemplateOptions {
  @scala.inline
  def apply(code: String, dependencies: js.Array[String]): CompileTemplateOptions = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], dependencies = dependencies.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompileTemplateOptions]
  }
  @scala.inline
  implicit class CompileTemplateOptionsOps[Self <: CompileTemplateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDependencies(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

