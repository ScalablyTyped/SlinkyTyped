package typingsSlinky.lusca.mod

import typingsSlinky.lusca.anon.Name
import typingsSlinky.lusca.luscaBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait csrfOptionsNonAngular extends csrfOptionsAngularOrNonAngular {
  var angular: js.UndefOr[`false`] = js.native
  var cookie: js.UndefOr[String | Name] = js.native
}

object csrfOptionsNonAngular {
  @scala.inline
  def apply(): csrfOptionsNonAngular = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[csrfOptionsNonAngular]
  }
  @scala.inline
  implicit class csrfOptionsNonAngularOps[Self <: csrfOptionsNonAngular] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAngular(value: `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angular")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAngular: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angular")(js.undefined)
        ret
    }
    @scala.inline
    def withCookie(value: String | Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookie")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCookie: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookie")(js.undefined)
        ret
    }
  }
  
}

