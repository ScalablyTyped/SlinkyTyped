package typingsSlinky.handlebars.anon

import typingsSlinky.handlebars.Handlebars.ResolvePartialOptions
import typingsSlinky.handlebars.HandlebarsTemplateDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofVM extends js.Object {
  def resolvePartial[T](
    partial: js.UndefOr[HandlebarsTemplateDelegate[T]],
    context: js.Any,
    options: ResolvePartialOptions
  ): HandlebarsTemplateDelegate[T] = js.native
}

object TypeofVM {
  @scala.inline
  def apply(
    resolvePartial: (js.UndefOr[HandlebarsTemplateDelegate[js.Any]], js.Any, ResolvePartialOptions) => HandlebarsTemplateDelegate[js.Any]
  ): TypeofVM = {
    val __obj = js.Dynamic.literal(resolvePartial = js.Any.fromFunction3(resolvePartial))
    __obj.asInstanceOf[TypeofVM]
  }
  @scala.inline
  implicit class TypeofVMOps[Self <: TypeofVM] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResolvePartial(
      value: (js.UndefOr[HandlebarsTemplateDelegate[js.Any]], js.Any, ResolvePartialOptions) => HandlebarsTemplateDelegate[js.Any]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolvePartial")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

