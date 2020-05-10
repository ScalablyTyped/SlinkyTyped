package typingsSlinky.fluentReact.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Context extends js.Object {
  var l10n: ReactLocalization = js.native
  var parseMarkup: MarkupParser = js.native
}

object Context {
  @scala.inline
  def apply(l10n: ReactLocalization, parseMarkup: /* str */ String => js.Array[Node]): Context = {
    val __obj = js.Dynamic.literal(l10n = l10n.asInstanceOf[js.Any], parseMarkup = js.Any.fromFunction1(parseMarkup))
    __obj.asInstanceOf[Context]
  }
  @scala.inline
  implicit class ContextOps[Self <: Context] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withL10n(value: ReactLocalization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("l10n")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParseMarkup(value: /* str */ String => js.Array[Node]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseMarkup")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

