package typingsSlinky.aureliaDependencyInjection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonInjectAny extends js.Object {
  var inject: js.UndefOr[js.Any] = js.native
}

object AnonInjectAny {
  @scala.inline
  def apply(): AnonInjectAny = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonInjectAny]
  }
  @scala.inline
  implicit class AnonInjectAnyOps[Self <: AnonInjectAny] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInject(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inject")(js.undefined)
        ret
    }
  }
  
}

