package typingsSlinky.lusca.mod

import typingsSlinky.lusca.anon.Options
import typingsSlinky.lusca.luscaBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait csrfOptionsAngular extends csrfOptionsAngularOrNonAngular {
  var angular: `true` = js.native
  var cookie: js.UndefOr[String | Options] = js.native
}

object csrfOptionsAngular {
  @scala.inline
  def apply(angular: `true`): csrfOptionsAngular = {
    val __obj = js.Dynamic.literal(angular = angular.asInstanceOf[js.Any])
    __obj.asInstanceOf[csrfOptionsAngular]
  }
  @scala.inline
  implicit class csrfOptionsAngularOps[Self <: csrfOptionsAngular] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAngular(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angular")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCookie(value: String | Options): Self = {
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

