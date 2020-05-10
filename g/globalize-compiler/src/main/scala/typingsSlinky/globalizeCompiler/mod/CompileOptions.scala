package typingsSlinky.globalizeCompiler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompileOptions extends js.Object {
  /**
    * A function that replaces the default template.
    */
  var template: js.UndefOr[js.Function1[/* options */ CompileTemplateOptions, String]] = js.native
}

object CompileOptions {
  @scala.inline
  def apply(): CompileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompileOptions]
  }
  @scala.inline
  implicit class CompileOptionsOps[Self <: CompileOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTemplate(value: /* options */ CompileTemplateOptions => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(js.undefined)
        ret
    }
  }
  
}

