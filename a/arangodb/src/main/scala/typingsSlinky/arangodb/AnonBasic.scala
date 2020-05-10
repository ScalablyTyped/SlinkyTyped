package typingsSlinky.arangodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBasic extends js.Object {
  var basic: js.UndefOr[AnonPassword] = js.native
  var bearer: js.UndefOr[String] = js.native
}

object AnonBasic {
  @scala.inline
  def apply(): AnonBasic = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonBasic]
  }
  @scala.inline
  implicit class AnonBasicOps[Self <: AnonBasic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBasic(value: AnonPassword): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBasic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basic")(js.undefined)
        ret
    }
    @scala.inline
    def withBearer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bearer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBearer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bearer")(js.undefined)
        ret
    }
  }
  
}

