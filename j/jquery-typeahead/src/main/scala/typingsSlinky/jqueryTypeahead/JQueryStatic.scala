package typingsSlinky.jqueryTypeahead

import typingsSlinky.jqueryTypeahead.RunningCoder.Typeahead.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryStatic extends js.Object {
  def typeahead(options: Options): JQuery = js.native
}

object JQueryStatic {
  @scala.inline
  def apply(typeahead: Options => JQuery): JQueryStatic = {
    val __obj = js.Dynamic.literal(typeahead = js.Any.fromFunction1(typeahead))
    __obj.asInstanceOf[JQueryStatic]
  }
  @scala.inline
  implicit class JQueryStaticOps[Self <: JQueryStatic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTypeahead(value: Options => JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeahead")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

