package typingsSlinky.lusca.mod

import typingsSlinky.lusca.anon.Name
import typingsSlinky.lusca.luscaBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait csrfOptionsNonAngular extends csrfOptionsAngularOrNonAngular {
  var angular: js.UndefOr[`false`] = js.undefined
  var cookie: js.UndefOr[String | Name] = js.undefined
}

object csrfOptionsNonAngular {
  @scala.inline
  def apply(angular: `false` = null, cookie: String | Name = null): csrfOptionsNonAngular = {
    val __obj = js.Dynamic.literal()
    if (angular != null) __obj.updateDynamic("angular")(angular.asInstanceOf[js.Any])
    if (cookie != null) __obj.updateDynamic("cookie")(cookie.asInstanceOf[js.Any])
    __obj.asInstanceOf[csrfOptionsNonAngular]
  }
}

