package typingsSlinky.objectKeysMapping.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Camelcase extends js.Object {
  var camelcase: js.UndefOr[Boolean] = js.native
}

object Camelcase {
  @scala.inline
  def apply(): Camelcase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Camelcase]
  }
  @scala.inline
  implicit class CamelcaseOps[Self <: Camelcase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCamelcase(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("camelcase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCamelcase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("camelcase")(js.undefined)
        ret
    }
  }
  
}

