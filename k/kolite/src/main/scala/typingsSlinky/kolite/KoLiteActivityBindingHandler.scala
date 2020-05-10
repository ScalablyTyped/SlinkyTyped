package typingsSlinky.kolite

import typingsSlinky.knockout.KnockoutBindingHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KoLiteActivityBindingHandler
  extends KnockoutBindingHandler[js.Any, js.Any, js.Any] {
  var defaultOptions: KoLiteActivityDefaultOptions = js.native
}

object KoLiteActivityBindingHandler {
  @scala.inline
  def apply(defaultOptions: KoLiteActivityDefaultOptions): KoLiteActivityBindingHandler = {
    val __obj = js.Dynamic.literal(defaultOptions = defaultOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[KoLiteActivityBindingHandler]
  }
  @scala.inline
  implicit class KoLiteActivityBindingHandlerOps[Self <: KoLiteActivityBindingHandler] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultOptions(value: KoLiteActivityDefaultOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultOptions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

