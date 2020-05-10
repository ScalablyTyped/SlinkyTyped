package typingsSlinky.aureliaDependencyInjection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDecorates extends js.Object {
  var decorates: js.UndefOr[
    js.Function1[/* key */ js.Any, /* is aurelia-dependency-injection.AnonGet */ Boolean]
  ] = js.native
}

object AnonDecorates {
  @scala.inline
  def apply(): AnonDecorates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonDecorates]
  }
  @scala.inline
  implicit class AnonDecoratesOps[Self <: AnonDecorates] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDecorates(value: /* key */ js.Any => /* is aurelia-dependency-injection.AnonGet */ Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decorates")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDecorates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decorates")(js.undefined)
        ret
    }
  }
  
}

