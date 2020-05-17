package typingsSlinky.arangodb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Basic extends js.Object {
  var basic: js.UndefOr[Username] = js.native
  var bearer: js.UndefOr[String] = js.native
}

object Basic {
  @scala.inline
  def apply(): Basic = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Basic]
  }
  @scala.inline
  implicit class BasicOps[Self <: Basic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBasic(value: Username): Self = {
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

